package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.exception.SellerException;
import com.Ecommerce_Multivendor.Backend.exception.UserException;
import com.Ecommerce_Multivendor.Backend.request.LoginRequest;
import com.Ecommerce_Multivendor.Backend.response.AuthResponse;
import com.Ecommerce_Multivendor.Backend.response.SignupRequest;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
