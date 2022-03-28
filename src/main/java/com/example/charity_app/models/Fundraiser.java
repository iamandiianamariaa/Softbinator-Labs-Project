package com.example.charity_app.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fundraisers")
public class Fundraiser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Double target;

    private Double amountRaised;
    private LocalDate creationDate;

    @ManyToMany
    @JoinTable(name = "fundraiser_categories",
            joinColumns = @JoinColumn(name = "fundraiser_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;
}
