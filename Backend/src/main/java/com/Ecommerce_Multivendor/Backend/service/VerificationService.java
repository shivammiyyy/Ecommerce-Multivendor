package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.model.VerificationCode;

public interface VerificationService {

    VerificationCode createVerificationCode(String otp, String email);
}
