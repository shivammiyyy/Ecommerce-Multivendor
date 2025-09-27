package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.exception.WishlistNotFoundException;
import com.Ecommerce_Multivendor.Backend.model.Product;
import com.Ecommerce_Multivendor.Backend.model.User;
import com.Ecommerce_Multivendor.Backend.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

