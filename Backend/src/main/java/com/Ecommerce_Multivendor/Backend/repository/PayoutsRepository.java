package com.Ecommerce_Multivendor.Backend.repository;

import com.Ecommerce_Multivendor.Backend.domain.PayoutsStatus;
import com.Ecommerce_Multivendor.Backend.model.Payouts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayoutsRepository extends JpaRepository<Payouts,Long> {

    List<Payouts> findPayoutsBySellerId(Long sellerId);
    List<Payouts> findAllByStatus(PayoutsStatus status);
}
