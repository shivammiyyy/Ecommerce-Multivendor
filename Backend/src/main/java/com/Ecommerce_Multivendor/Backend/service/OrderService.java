package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.domain.OrderStatus;
import com.Ecommerce_Multivendor.Backend.exception.OrderException;
import com.Ecommerce_Multivendor.Backend.model.*;

import java.util.List;
import java.util.Set;

public interface OrderService {
	
	public Set<Order> createOrder(User user, Address shippingAddress, Cart cart);
	
	public Order findOrderById(Long orderId) throws Exception;
	
	public List<Order> usersOrderHistory(Long userId);
	
	public List<Order> getShopsOrders(Long sellerId);

    List<Order> sellersOrder(Long sellerId);

    public Order updateOrderStatus(Long orderId,
                                   OrderStatus orderStatus)
            throws Exception;
	
	public void deleteOrder(Long orderId) throws OrderException;

	Order cancelOrder(Long orderId,User user) throws Exception;

    OrderItem getOrderItemById(Long id) throws Exception;
}
