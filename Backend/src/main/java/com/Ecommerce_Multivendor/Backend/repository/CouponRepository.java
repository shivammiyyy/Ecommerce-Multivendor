package com.Ecommerce_Multivendor.Backend.repository;


import com.Ecommerce_Multivendor.Backend.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findByCode(String code);

}
