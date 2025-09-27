package com.Ecommerce_Multivendor.Backend.controller;


import com.Ecommerce_Multivendor.Backend.service.CartItemService;
import com.Ecommerce_Multivendor.Backend.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

	private final CartItemService cartItemService;
	private final UserService userService;

	public CartItemController(CartItemService cartItemService, UserService userService) {
		this.cartItemService=cartItemService;
		this.userService=userService;
	}
	

}
