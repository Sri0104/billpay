package com.example.pay.service;

import com.example.pay.dao.AccountHolder;
import com.example.pay.dao.Address;
import com.example.pay.dao.Merchant;
import com.example.pay.dao.PaymentAccount;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService{
    @Override
    public List<Merchant> getMerchants() throws ParseException {
        return getMerchantsList();
    }

    public List<Merchant> getMerchantsList() {
        List<Merchant> merchants = new ArrayList<>();
        Merchant merchant1 = new Merchant();
        merchant1.setMerchantName("Delmarva");
        Address address1 = new Address();
        address1.setId(1);
        address1.setAddress1("100 Merchant 1");
        address1.setCity("Dover");
        address1.setState("Delaware");
        address1.setZipCode(19000);
        merchant1.setMerchantAddress(address1);
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
        merchant1.setPaymentAccount(paymentAccount);


        Merchant merchant2 = new Merchant();
        merchant2.setMerchantName("EZPass");
        Address address2 = new Address();
        address1.setId(1);
        address2.setAddress1("123 Main Street");
        address2.setCity("Phildelphia");
        address2.setState("Pennsylvania");
        address2.setZipCode(34567);
        merchant2.setMerchantAddress(address2);
        AccountHolder accountHolder2 = new AccountHolder();
        accountHolder2.setId(653432);
        accountHolder2.setFirstName("Nikitha");
        accountHolder2.setLastName("Koganti");
        accountHolder2.setEmail("test@gmail.com");
        PaymentAccount paymentAccount2 = new PaymentAccount();
        paymentAccount2.setId(103);
        paymentAccount2.setAccountNumber("987B579");
        paymentAccount2.setBankName("BOFA");
        paymentAccount2.setAccountType("Checkings");
        paymentAccount2.setAccountHolder(accountHolder);
        merchant2.setPaymentAccount(paymentAccount2);

        merchants.add(merchant1);
        merchants.add(merchant2);
        return merchants;
    }
}
