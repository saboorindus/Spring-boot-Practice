package com.example.demo;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Table (name = "QuizQuestions")
@Data
public class PostingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String option_a;
    private String option_b;
    private String option_c;
    private String option_d;
    private char correct_option;
}
