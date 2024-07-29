package com.example.pay.controller;

import com.example.pay.dao.Bill;
import com.example.pay.dao.PaymentAccount;
import com.example.pay.service.BillService;
import com.example.pay.service.PaymentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccountController {

    @Autowired
    private PaymentAccountService paymentAccountService;

    @GetMapping("/paymentAccounts")
    public List<PaymentAccount> getBills() {
        System.out.println("inside account controller");
        Map<String, String> map = new HashMap<>();
        map.put("test", "success");
        List<PaymentAccount> accounts = paymentAccountService.getAccounts();
        accounts.forEach(System.out::println);
        System.out.println("returning the response");
        return accounts; // This should map to src/main/resources/static/index.html
    }

    @PostMapping("/addBankAccount")
    public List<PaymentAccount> addBankAccount(@RequestBody PaymentAccount paymentAccount) {
        System.out.println("Adding a bank account");
        return paymentAccountService.addBankAccount(paymentAccount);
    }
}
