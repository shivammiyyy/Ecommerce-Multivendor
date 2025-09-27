package com.Ecommerce_Multivendor.Backend.service.impl;

import com.Ecommerce_Multivendor.Backend.model.Seller;
import com.Ecommerce_Multivendor.Backend.model.SellerReport;
import com.Ecommerce_Multivendor.Backend.repository.SellerReportRepository;
import com.Ecommerce_Multivendor.Backend.service.SellerReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SellerReportServiceImpl implements SellerReportService {

    private final SellerReportRepository sellerReportRepository;


    @Override
    public SellerReport getSellerReport(Seller seller) {
        SellerReport report = sellerReportRepository.findBySellerId(seller.getId());
        if(report == null){
            SellerReport newReport = new SellerReport();
            newReport.setSeller(seller);
            return sellerReportRepository.save(newReport);
        }
        return report;
    }


    @Override
    public SellerReport updateSellerReport(SellerReport sellerReport) {

        return sellerReportRepository.save(sellerReport);
    }

}
