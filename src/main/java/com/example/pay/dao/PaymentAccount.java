package com.example.pay.dao;

//import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Entity
//@Table
public class PaymentAccount {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String bankName;
    private String accountNumber;
    private String accountType;
//    @ManyToOne
//    @JoinColumn(name = "id", nullable = false)
    private AccountHolder accountHolder;
    private boolean isActive;
}
