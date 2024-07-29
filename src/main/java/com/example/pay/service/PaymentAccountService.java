package com.example.pay.service;

import com.example.pay.dao.PaymentAccount;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PaymentAccountService {
    public List<PaymentAccount> getAccounts();
    public List<PaymentAccount> addBankAccount(PaymentAccount paymentAccount);
}
