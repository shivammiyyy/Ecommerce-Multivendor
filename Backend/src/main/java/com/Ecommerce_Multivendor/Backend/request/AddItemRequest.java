package com.Ecommerce_Multivendor.Backend.request;

import lombok.Data;

@Data
public class AddItemRequest {


    private String size;
    private int quantity;
    private Long productId;
}
