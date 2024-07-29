package com.example.pay.dao;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    private int id;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private int zipCode;
}
