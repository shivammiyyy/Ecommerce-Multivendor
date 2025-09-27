package com.Ecommerce_Multivendor.Backend.service;


import com.Ecommerce_Multivendor.Backend.model.Cart;
import com.Ecommerce_Multivendor.Backend.model.Coupon;
import com.Ecommerce_Multivendor.Backend.model.User;

import java.util.List;

public interface CouponService {
    Cart applyCoupon(String code, double orderValue, User user) throws Exception;
    Cart removeCoupon(String code, User user) throws Exception;
    Coupon createCoupon(Coupon coupon);
    void deleteCoupon(Long couponId);
    List<Coupon> getAllCoupons();
    
    Coupon getCouponById(Long couponId);
}
