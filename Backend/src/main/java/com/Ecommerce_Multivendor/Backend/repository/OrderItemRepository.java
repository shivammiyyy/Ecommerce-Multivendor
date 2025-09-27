package com.Ecommerce_Multivendor.Backend.repository;

import com.Ecommerce_Multivendor.Backend.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
