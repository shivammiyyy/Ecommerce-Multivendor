package com.Ecommerce_Multivendor.Backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class SellerReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Seller seller;

    private Long totalEarnings = 0L;

    private Long totalSales= 0L;

    private Long totalRefunds= 0L;

    private Long totalTax = 0L;

    private Long netEarnings = 0L;

    private Integer totalOrders= 0;

    private Integer canceledOrders=0;

    private Integer totalTransactions=0;


}
