package com.Ecommerce_Multivendor.Backend.service;

import com.Ecommerce_Multivendor.Backend.model.User;

public interface UserService {
    User findUserByJwtToken(String jwt) throws Exception;
    User findUserByEmail(String email) throws Exception;
}
