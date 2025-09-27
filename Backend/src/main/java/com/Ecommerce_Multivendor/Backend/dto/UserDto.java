package com.Ecommerce_Multivendor.Backend.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String fullName;
    private String email;
    private String profilePicture;
}
