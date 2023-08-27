package com.example.demo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@jakarta.persistence.Entity
@Table (name = "QuizQuestions")
@Data
public class Entity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;
    private String option_a;
    private String option_b;
    private String option_c;
    private String option_d;
    private char correct_option;



}
