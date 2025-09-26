package com.Ecommerce_Multivendor.Backend.request;

import com.Ecommerce_Multivendor.Backend.domain.USER_ROLE;
import lombok.Data;

@Data
public class LoginOtpRequest {
    private String email;
    private String otp;
    private USER_ROLE role;
}
