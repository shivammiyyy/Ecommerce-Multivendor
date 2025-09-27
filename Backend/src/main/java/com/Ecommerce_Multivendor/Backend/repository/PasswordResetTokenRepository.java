package com.Ecommerce_Multivendor.Backend.repository;

import com.Ecommerce_Multivendor.Backend.model.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
