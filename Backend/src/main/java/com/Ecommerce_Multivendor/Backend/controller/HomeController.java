package com.Ecommerce_Multivendor.Backend.controller;

import com.Ecommerce_Multivendor.Backend.response.ApiResponse;
import com.Ecommerce_Multivendor.Backend.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping
    public ResponseEntity<ApiResponse> home(){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Ecommerce multi vendor system");
        return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
    }




}
