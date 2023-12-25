package com.abhi.myWords.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class History {

    @Id
    @GeneratedValue
    private int id;
    private String email;

    private LocalDateTime creationDate;
    private String story;
}
