package com.tpe.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NotBlank(message = "Title can not be blank!")
    @Size(min = 2, max = 100, message = "Title must be between 2 & 100!")
    @Column(nullable = false)
    private String title;


    @DecimalMin(value = "0.0", inclusive = false, message = "Pages must be greater than 0")
    @Column(nullable = false)
    private Integer pages;

    @ManyToOne
    private Author author;

    @OneToMany
    private Loan loan;

    @Embedded//bu alanın bir başka entity sınıfından olduğunu belirtir
    private Adress adress;



}