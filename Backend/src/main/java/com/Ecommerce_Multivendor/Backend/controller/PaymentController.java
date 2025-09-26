package com.Ecommerce_Multivendor.Backend.controller;


import com.Ecommerce_Multivendor.Backend.model.*;
import com.Ecommerce_Multivendor.Backend.response.ApiResponse;
import com.Ecommerce_Multivendor.Backend.response.PaymentLinkResponse;
import com.Ecommerce_Multivendor.Backend.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService paymentService;
    private final UserService userService;
    private final SellerService sellerService;
    // private final OrderService orderService;
    private final SellerReportService sellerReportService;
    private final TransactionService transactionService;


    @GetMapping("/{paymentId}")
    public ResponseEntity<ApiResponse> paymentSuccessHandler(
            @PathVariable String paymentId,
            @RequestParam String paymentLinkId,
            @RequestHeader("Authorization") String jwt) throws Exception{

    User user = userService.findUserByJwtToken(jwt);
    PaymentLinkResponse paymentLinkResponse;
    PaymentOrder paymentOrder = paymentService.getPaymentOrderByPaymentId(paymentLinkId);

    boolean paymentSuccess = paymentService.ProceedPaymentOrder(paymentOrder, paymentId, paymentLinkId);

    if (paymentSuccess) {
        for(Order order:paymentOrder.getOrders()){
            transactionService.createTransaction(order);
            Seller seller = sellerService.getSellerById(order.getSellerId());
            SellerReport report = sellerReportService.getSellerReport(seller);
            report.setTotalOrders(report.getTotalOrders());
            report.setTotalEarnings(report.getTotalEarnings()+order.getTotalSellingPrice());
            report.setTotalSales(report.getTotalSales()+order.getOrderItems().size());
            sellerReportService.updaSellerReport(report);
        }
    }

    ApiResponse res = new ApiResponse();
    res.setMessage("Payment Successfull");

     return new ResponseEntity<>(res, HttpStatus.CREATED);

    }
}
