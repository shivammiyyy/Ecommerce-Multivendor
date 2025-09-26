package com.Ecommerce_Multivendor.Backend.service;

import com.Ecommerce_Multivendor.Backend.model.Seller;
import com.Ecommerce_Multivendor.Backend.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updaSellerReport(SellerReport sellerReport);
}
