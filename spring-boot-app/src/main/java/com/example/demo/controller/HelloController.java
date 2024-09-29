package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Note;
import com.example.demo.repository.NoteRepository;
 @CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("http://loca;host:5173")
public class HelloController {

    @Autowired
    private NoteRepository noteRepository;
    @CrossOrigin
    @PostMapping("/hello")
    public Note saveMessage(@RequestBody Note note) {
        return noteRepository.save(note);
    }
   @CrossOrigin
    @GetMapping("/hello")
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }


}

