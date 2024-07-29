package com.example.pay.dao;

//import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Entity
//@Table
public class Bill {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String merchantName;
    private String dueDate;
    private String paymentDate;
    private BigDecimal amount;
//    @ManyToOne
//    @JoinColumn(name = "id", nullable = false)
    private PaymentAccount paymentAccount;
    private boolean pay;
    private String status;
}
