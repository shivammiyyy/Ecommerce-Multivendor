package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.model.OrderItem;

public interface OrderItemService {

	OrderItem getOrderItemById(Long id) throws Exception;
	


}
