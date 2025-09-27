package com.Ecommerce_Multivendor.Backend.ai.services;


import com.Ecommerce_Multivendor.Backend.exception.ProductException;
import com.Ecommerce_Multivendor.Backend.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt, Long productId, Long userId) throws ProductException;
}
