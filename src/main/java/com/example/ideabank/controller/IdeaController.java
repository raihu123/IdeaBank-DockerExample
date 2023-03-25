package com.example.ideabank.controller;

import com.example.ideabank.model.Idea;
import com.example.ideabank.service.IdeaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ideas/")
public class IdeaController {

    final IdeaService ideaService;

    public IdeaController(IdeaService ideaService) {
        this.ideaService = ideaService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Idea> findAll() {
        return ideaService.findAll();
//        TODO: Need to add pagination here
    }

    @GetMapping(value = "/hi")
    @ResponseStatus(HttpStatus.OK)
    public String getVal() {
        return "His";
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Idea findOne(@PathVariable("id") Long id) throws Exception {
        return ideaService.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Idea create(@RequestBody Idea idea) {
        return ideaService.create(idea);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Idea update(@PathVariable("id") Long id, @RequestBody Idea idea) throws Exception {
        return ideaService.udpate(id, idea);
    }

//    TODO: Need to add Patch here

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") Long id) {
        ideaService.delete(id);
    }


}
