package com.Ecommerce_Multivendor.Backend.response;

import com.Ecommerce_Multivendor.Backend.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}
