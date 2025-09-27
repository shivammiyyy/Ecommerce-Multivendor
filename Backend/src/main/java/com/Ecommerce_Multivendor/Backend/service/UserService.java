package com.Ecommerce_Multivendor.Backend.service;

import com.Ecommerce_Multivendor.Backend.exception.UserException;
import com.Ecommerce_Multivendor.Backend.model.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws UserException;

    public User findUserByEmail(String email) throws UserException;


}
