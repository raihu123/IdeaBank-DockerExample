package com.example.ideabank.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity @Table(name="ideas")
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;

}
