package com.Ecommerce_Multivendor.Backend.repository;


import com.Ecommerce_Multivendor.Backend.model.SellerReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerReportRepository extends JpaRepository<SellerReport, Long> {
    SellerReport findBySellerId(Long sellerId);
}
