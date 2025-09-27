package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.exception.CartItemException;
import com.Ecommerce_Multivendor.Backend.exception.UserException;
import com.Ecommerce_Multivendor.Backend.model.CartItem;

public interface CartItemService {
	
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws Exception;
	
	public void removeCartItem(Long userId,Long cartItemId) throws Exception;
	
	public CartItem findCartItemById(Long cartItemId) throws Exception;
	
}
