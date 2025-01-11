package com.tpe.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Setter(AccessLevel.NONE)
    private LocalDate loanDate;

    @Setter(AccessLevel.NONE)
    private LocalDate returnDate;

    private boolean returned = false;

    @ManyToOne
    private Book book;

    @ManyToOne
    private Member member;


}