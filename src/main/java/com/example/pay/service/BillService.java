package com.example.pay.service;

import com.example.pay.dao.Bill;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.List;

@Component
public interface BillService {
    public List<Bill> getBills() throws ParseException;
}
