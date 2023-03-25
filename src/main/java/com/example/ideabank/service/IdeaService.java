package com.example.ideabank.service;

import com.example.ideabank.model.Idea;

import java.util.List;

public interface IdeaService {
    List<Idea> findAll();
    Idea findOne(Long id) throws Exception;
    Idea udpate(Long id, Idea idea) throws Exception;
    Idea create(Idea idea);
    void delete(Long idea);
}
