package com.Ecommerce_Multivendor.Backend.service;

import com.Ecommerce_Multivendor.Backend.domain.USER_ROLE;
import com.Ecommerce_Multivendor.Backend.request.LoginRequest;
import com.Ecommerce_Multivendor.Backend.response.AuthResponse;
import com.Ecommerce_Multivendor.Backend.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email, USER_ROLE role) throws Exception;
    String createUser(SignupRequest req ) throws Exception;
    AuthResponse signing(LoginRequest req ) throws Exception;

}
