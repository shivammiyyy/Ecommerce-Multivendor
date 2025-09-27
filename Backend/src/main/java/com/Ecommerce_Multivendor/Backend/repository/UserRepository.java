package com.Ecommerce_Multivendor.Backend.repository;


import com.Ecommerce_Multivendor.Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
