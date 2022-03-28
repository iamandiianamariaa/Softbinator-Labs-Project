package com.example.charity_app.dtos;

import com.example.charity_app.models.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserDto {

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private Address address;
}
