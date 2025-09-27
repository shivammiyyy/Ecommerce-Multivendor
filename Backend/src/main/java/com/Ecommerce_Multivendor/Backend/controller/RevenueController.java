package com.Ecommerce_Multivendor.Backend.controller;


import com.Ecommerce_Multivendor.Backend.dto.RevenueChart;
import com.Ecommerce_Multivendor.Backend.exception.SellerException;
import com.Ecommerce_Multivendor.Backend.model.Seller;
import com.Ecommerce_Multivendor.Backend.service.RevenueService;
import com.Ecommerce_Multivendor.Backend.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seller/revenue/chart")
public class RevenueController {
    private final RevenueService revenueService;
    private final SellerService sellerService;

    @GetMapping()
    public ResponseEntity<List<RevenueChart>> getRevenueChart(
            @RequestParam(defaultValue = "today") String type,
            @RequestHeader("Authorization") String jwt) throws SellerException {
        Seller seller = sellerService.getSellerProfile(jwt);
        List<RevenueChart> revenue = revenueService
                .getRevenueChartByType(type, seller.getId());
        return ResponseEntity.ok(revenue);
    }

}
