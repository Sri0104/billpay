package com.example.pay.controller;

import com.example.pay.dao.Merchant;
import com.example.pay.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @GetMapping("/merchants/all")
    public List<Merchant> getMerchants() throws ParseException {
        System.out.println("inside merchant controller");
        Map<String, String> map = new HashMap<>();
        map.put("test", "success");
        List<Merchant> merchants = merchantService.getMerchants();
        merchants.forEach(System.out::println);
        System.out.println("returning the response");
        return merchants; // This should map to src/main/resources/static/index.html
    }
}
