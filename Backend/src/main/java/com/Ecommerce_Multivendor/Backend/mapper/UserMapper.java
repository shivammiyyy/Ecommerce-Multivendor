package com.Ecommerce_Multivendor.Backend.mapper;


import com.Ecommerce_Multivendor.Backend.dto.UserDto;
import com.Ecommerce_Multivendor.Backend.model.User;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
