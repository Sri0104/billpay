package com.example.pay.controller;

import com.example.pay.dao.Bill;
import com.example.pay.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BillController {
    @Autowired
    private BillService billService;

    @GetMapping("/bills/all")
    public List<Bill> getBills() throws ParseException {
        System.out.println("inside bill controller");
        Map<String, String> map = new HashMap<>();
        map.put("test", "success");
        List<Bill> bills = billService.getBills();
        bills.forEach(System.out::println);
        System.out.println("returning the response");
        return bills; // This should map to src/main/resources/static/index.html
    }
}
