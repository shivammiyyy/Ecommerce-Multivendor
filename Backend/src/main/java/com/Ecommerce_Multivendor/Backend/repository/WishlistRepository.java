package com.Ecommerce_Multivendor.Backend.repository;

import com.Ecommerce_Multivendor.Backend.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {
    Wishlist findByUserId(Long userId);
}
