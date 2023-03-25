package com.example.ideabank.service;

import com.example.ideabank.model.Idea;
import com.example.ideabank.repository.IdeaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaServiceImpl implements IdeaService{
    final IdeaRepository ideaRepository;

    public IdeaServiceImpl(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    @Override
    public List<Idea> findAll() {
        return (List<Idea>) ideaRepository.findAll();
    }

    @Override
    public Idea findOne(Long id) throws Exception {
        return ideaRepository.findById(id).orElseThrow(()->new Exception("Not Found"));
    }

    @Override
    public Idea udpate(Long id, Idea idea) throws Exception {
        Idea existingIdea = ideaRepository.findById(id).orElseThrow(() -> new Exception("Not Found"));
        existingIdea.setTitle(idea.getTitle());
        existingIdea.setCompleted(idea.isCompleted());
        existingIdea.setDescription(idea.getDescription());
        return ideaRepository.save(existingIdea);
    }

    @Override
    public Idea create(Idea idea) {
        return ideaRepository.save(idea);
    }

    @Override
    public void delete(Long id) {
        ideaRepository.deleteById(id);
    }
}
