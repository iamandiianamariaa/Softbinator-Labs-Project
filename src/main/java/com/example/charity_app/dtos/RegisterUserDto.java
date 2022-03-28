package com.example.charity_app.dtos;

import com.example.charity_app.models.Address;
import com.example.charity_app.models.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserDto {

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private UserType userType;

    private Address address;
}
