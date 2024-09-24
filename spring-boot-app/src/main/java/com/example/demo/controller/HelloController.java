package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepository;
 @CrossOrigin(origins = "http://localhost:5173")
@RestController
public class HelloController {

    @Autowired
    private NoteRepository noteRepository;
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/hello")
    public Note saveMessage(@RequestBody Note note) {
        return noteRepository.save(note);
    }
   @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/hello")
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }


}

