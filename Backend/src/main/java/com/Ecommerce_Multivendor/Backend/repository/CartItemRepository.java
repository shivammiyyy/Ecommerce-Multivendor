package com.Ecommerce_Multivendor.Backend.repository;

import com.Ecommerce_Multivendor.Backend.model.Cart;
import com.Ecommerce_Multivendor.Backend.model.CartItem;
import com.Ecommerce_Multivendor.Backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
