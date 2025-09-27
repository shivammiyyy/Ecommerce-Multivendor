package com.Ecommerce_Multivendor.Backend.response;


import com.Ecommerce_Multivendor.Backend.dto.OrderHistory;
import com.Ecommerce_Multivendor.Backend.model.Cart;
import com.Ecommerce_Multivendor.Backend.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
