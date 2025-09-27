package com.Ecommerce_Multivendor.Backend.service.impl;

import com.Ecommerce_Multivendor.Backend.exception.OrderException;
import com.Ecommerce_Multivendor.Backend.model.OrderItem;
import com.Ecommerce_Multivendor.Backend.repository.OrderItemRepository;
import com.Ecommerce_Multivendor.Backend.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderItemServiceImpl implements OrderItemService {


    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }


    @Override
    public OrderItem getOrderItemById(Long id) throws Exception {

        System.out.println("------- "+id);
        Optional<OrderItem> orderItem = orderItemRepository.findById(id);
        if(orderItem.isPresent()){
            return orderItem.get();
        }
        throw new OrderException("Order item not found");
    }
}
