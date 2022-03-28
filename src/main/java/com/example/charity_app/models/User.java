package com.example.charity_app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Email must not be blank")
    private String email;

    @Column(name = "first_name")
    @NotBlank(message = "First name must not be blank")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "Last name must not be blank")
    private String lastName;

    @Column(name = "phone_number")
    @NotBlank(message = "Phone number must not be blank")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_address", referencedColumnName = "id")
    private Address address;
}
