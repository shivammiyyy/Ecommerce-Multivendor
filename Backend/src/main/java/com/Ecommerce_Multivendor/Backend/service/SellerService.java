package com.Ecommerce_Multivendor.Backend.service;

import com.Ecommerce_Multivendor.Backend.domain.AccountStatus;
import com.Ecommerce_Multivendor.Backend.exception.SellerException;
import com.Ecommerce_Multivendor.Backend.model.Seller;

import java.util.List;

public interface SellerService {
    Seller getSellerProfile(String jwt) throws Exception;
    Seller createSeller(Seller seller) throws Exception;
    Seller getSellerById(Long id) throws SellerException;
    Seller getSellerByEmail(String email) throws Exception;
    List<Seller> getAllSellers(AccountStatus status);
    Seller updatedSeller(Long id, Seller seller) throws Exception;
    void deleteSeller(Long id) throws Exception;
    Seller VerifyEmail(String email, String otp) throws Exception;
    Seller updatSellerAccountStatus(Long sellerId, AccountStatus status) throws Exception;
}
