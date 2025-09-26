package com.Ecommerce_Multivendor.Backend.response;

import lombok.Data;

@Data
public class SignupRequest {

    private String email;
    private String fullName;
    private String otp;



}