package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.exception.ProductException;
import com.Ecommerce_Multivendor.Backend.model.Cart;
import com.Ecommerce_Multivendor.Backend.model.CartItem;
import com.Ecommerce_Multivendor.Backend.model.Product;
import com.Ecommerce_Multivendor.Backend.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
                                Product product,
                                String size,
                                int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
