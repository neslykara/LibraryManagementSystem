package com.tpe.domain;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Enabled
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Adress {


    @Column(nullable = false)
    @NotBlank(message = "City can not be blank!")
    private String city;

    @Column(nullable = false)
    @NotBlank(message = "Street can not be blank!")
    private String street;

    @Column(nullable = false)
    @NotBlank(message = "No can not be blank!")
    private String no;

    @Column(nullable = false)
    @NotBlank(message = "Zip Code can not be blank!")
    private String zipCode;


}