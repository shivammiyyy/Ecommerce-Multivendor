package com.Ecommerce_Multivendor.Backend.controller;


import com.Ecommerce_Multivendor.Backend.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public ApiResponse HomeControllerHandler() {
        ApiResponse apiResponse = new ApiResponse();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        apiResponse.setMessage("Hello Welcome to ecommerce multi vendor");
        System.out.println("Chal raha hai--------------------------------");
        return apiResponse;
    }
}
