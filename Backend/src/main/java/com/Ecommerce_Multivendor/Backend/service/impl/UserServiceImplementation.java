package com.Ecommerce_Multivendor.Backend.service.impl;


import com.Ecommerce_Multivendor.Backend.configuration.JwtProvider;
import com.Ecommerce_Multivendor.Backend.exception.UserException;
import com.Ecommerce_Multivendor.Backend.model.User;
import com.Ecommerce_Multivendor.Backend.repository.UserRepository;
import com.Ecommerce_Multivendor.Backend.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplementation implements UserService {


    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;


    public UserServiceImplementation(
            UserRepository userRepository,
            JwtProvider jwtProvider) {

        this.userRepository=userRepository;
        this.jwtProvider=jwtProvider;

    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        String email=jwtProvider.getEmailFromJwtToken(jwt);


        User user = userRepository.findByEmail(email);

        if(user==null) {
            throw new UserException("user not exist with email "+email);
        }
        return user;
    }




    @Override
    public User findUserByEmail(String username) throws UserException {

        User user=userRepository.findByEmail(username);

        if(user ==null) {

            throw new UserException("user not exist with username "+username);
        }

        return user;
    }



}
