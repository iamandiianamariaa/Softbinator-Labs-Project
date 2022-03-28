package com.example.charity_app.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Getter
@Setter
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "City name must not be null")
    private String city;

    @NotBlank(message = "Country name must not be null")
    private String country;

    @NotBlank(message = "Street name must not be null")
    private String street;

    @Column(name = "postal_code")
    @NotBlank(message = "Postal code must not be null")
    private String postalCode;

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    private User user;
}
