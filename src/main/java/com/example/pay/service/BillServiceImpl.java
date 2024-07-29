package com.example.pay.service;

import com.example.pay.dao.AccountHolder;
import com.example.pay.dao.Bill;
import com.example.pay.dao.PaymentAccount;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl implements BillService{
    @Override
    public List<Bill> getBills() throws ParseException {
        return getBillDetails();
    }

    private List<Bill> getBillDetails() throws ParseException {
        List<Bill> bills = new ArrayList<>();
        Bill bill1 = new Bill();
        bill1.setId(1);
        bill1.setAmount(BigDecimal.valueOf(100.0));
        bill1.setMerchantName("Delmarva");

        String PATTERN="MMM-dd-yyyy";
        SimpleDateFormat dateFormat=new SimpleDateFormat();
        dateFormat.applyPattern(PATTERN);
        String date1=dateFormat.format(Calendar.getInstance().getTime());

        bill1.setPaymentDate(date1);

        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.setId(100);
        paymentAccount.setAccountNumber("1234567");
        paymentAccount.setBankName("Chase");
        paymentAccount.setAccountType("Savings");
        paymentAccount.setAccountHolder(getAccountHolder());
        bill1.setPaymentAccount(paymentAccount);
        bills.add(bill1);

        Bill bill3 = new Bill();
        bill3.setId(5);
        bill3.setAmount(BigDecimal.valueOf(78));
        bill3.setMerchantName("Verizon");



        bill3.setPaymentDate(date1);
        bills.add(bill3);
        PaymentAccount paymentAccount3 = new PaymentAccount();
        paymentAccount3.setId(100);
        paymentAccount3.setAccountNumber("1234567");
        paymentAccount3.setBankName("Chase");
        paymentAccount3.setAccountType("Savings");
        paymentAccount3.setAccountHolder(getAccountHolder());
        bill3.setPaymentAccount(paymentAccount);

        Bill bill2 = new Bill();
        bill2.setId(2);
        bill2.setAmount(BigDecimal.valueOf(80.0));
        bill2.setMerchantName("Artesian");
        String newstr = "08/16/2011";
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat format = new SimpleDateFormat("MMM-dd-yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(format1.parse(newstr));
        String date = format.format(c.getTime());
        System.out.println(date);
        bill2.setPaymentDate(date);
        PaymentAccount paymentAccount2 = new PaymentAccount();
        paymentAccount2.setId(100);
        paymentAccount2.setAccountNumber("1234567");
        paymentAccount2.setBankName("Chase");
        paymentAccount2.setAccountType("Savings");
        paymentAccount2.setAccountHolder(getAccountHolder());
        bill2.setPaymentAccount(paymentAccount);
        bill2.setStatus("completed");
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        bills.add(bill2);
        return bills;
    }

    private String formattedDate(){
        LocalDate d = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        String formattedDate = d.format(formatter);
        return formattedDate;
    }

    private AccountHolder getAccountHolder() {
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.setId(123);
        accountHolder.setFirstName("Nikitha");
        accountHolder.setLastName("Koganti");
        accountHolder.setEmail("test@gmail.com");
        return accountHolder;
    }
}
