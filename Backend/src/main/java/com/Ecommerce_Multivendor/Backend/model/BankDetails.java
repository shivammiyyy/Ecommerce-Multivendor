package com.Ecommerce_Multivendor.Backend.model;

import lombok.Data;

@Data
public class BankDetails {
    private String accountNumber;
    private String accountHolderName;
//    private String bankName;
    private String ifscCode;

}