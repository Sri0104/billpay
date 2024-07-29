package com.example.pay.dao;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Merchant {
    private String id;
    private String merchantName;
    private Address merchantAddress;
    private PaymentAccount paymentAccount;
}
