package com.example.pay.service;

import com.example.pay.dao.Merchant;

import java.text.ParseException;
import java.util.List;

public interface MerchantService {
    public List<Merchant> getMerchants() throws ParseException;
}
