package com.Ecommerce_Multivendor.Backend.model;


import com.Ecommerce_Multivendor.Backend.domain.PaymentStatus;
import lombok.Data;

@Data
public class PaymentDetails {
    private String paymentId;
    private String razorpayPaymentLinkId;
    private String razorpayPayLinkReferenceId;
    private String razorpayPayLinkStatus;
    private String razorpayPayIdZWSP;
    private PaymentStatus status;

}