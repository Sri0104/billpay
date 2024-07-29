package com.example.pay.service;

import com.example.pay.dao.AccountHolder;
import com.example.pay.dao.PaymentAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentAccountServiceImpl implements PaymentAccountService {

    @Override
    public List<PaymentAccount> getAccounts() {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setId(123);
        accountHolder.setFirstName("Nikitha");
        accountHolder.setLastName("Koganti");
        accountHolder.setEmail("test@gmail.com");
        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.setId(100);
        paymentAccount.setAccountNumber("1234567");
        paymentAccount.setBankName("Chase");
        paymentAccount.setAccountType("Savings");
        paymentAccount.setAccountHolder(accountHolder);
        PaymentAccount paymentAccount2 = new PaymentAccount();
        paymentAccount2.setId(103);
        paymentAccount2.setAccountNumber("987B579");
        paymentAccount2.setBankName("BOFA");
        paymentAccount2.setAccountType("Checkings");
        paymentAccount2.setAccountHolder(accountHolder);
        List<PaymentAccount> list = new ArrayList<>();
        list.add(paymentAccount);
        list.add(paymentAccount2);
        return list;
    }

    @Override
    public List<PaymentAccount> addBankAccount(PaymentAccount paymentAccount) {
        List<PaymentAccount> list = getAccounts();
        list.add(paymentAccount);
        return list;
    }
}
