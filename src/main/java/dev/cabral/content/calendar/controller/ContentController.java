package dev.cabral.content.calendar.controller;

import dev.cabral.content.calendar.model.Content;
import dev.cabral.content.calendar.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Content> findAlL(){
        return repository.findAll();
    }
}

