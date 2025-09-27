package com.Ecommerce_Multivendor.Backend.repository;

import java.time.LocalDateTime;

import java.util.List;

import com.Ecommerce_Multivendor.Backend.model.Order;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order>findByUserId(Long userId);
    List<Order> findBySellerIdOrderByOrderDateDesc(Long sellerId);
    List<Order> findBySellerIdAndOrderDateBetween(Long sellerId,LocalDateTime startDate, LocalDateTime endDate);

    List<Order> findBySellerId(Long sellerId);

    List<Order> findBySellerIdOrderByOrderDateDesc(Long sellerId, Pageable pageable);
}
