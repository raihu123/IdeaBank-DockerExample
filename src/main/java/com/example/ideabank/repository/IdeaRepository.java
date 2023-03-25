package com.example.ideabank.repository;

import com.example.ideabank.model.Idea;
import org.springframework.data.repository.CrudRepository;

public interface IdeaRepository extends CrudRepository<Idea, Long> {
}
