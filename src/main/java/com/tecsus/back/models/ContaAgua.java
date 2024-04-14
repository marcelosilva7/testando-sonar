package com.tecsus.back.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="conta_agua")
public class ContaAgua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "contadomes")
    private LocalDate contaMes;
}
