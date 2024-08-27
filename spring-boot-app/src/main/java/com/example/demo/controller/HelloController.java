package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
@RestController
public class HelloController {

    @Autowired
    private MessageRepository messageRepository;
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/hello")
    public Message saveMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/hello")
    public List<Message> getMessages() {
        return messageRepository.findAll();
    }


}

