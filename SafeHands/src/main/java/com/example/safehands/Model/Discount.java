package com.example.safehands.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(20) not null unique")
    private String code; // The discount code
    @Column(columnDefinition = "double not null")
    private Double amount;// The discount amount (percentage or flat value)
    @Column(nullable = false)
    private LocalDateTime expirationDate;// Expiration date of the discount code
}
