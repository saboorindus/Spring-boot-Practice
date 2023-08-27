package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@RestController
@Controller
public class Controller1 {

    @Autowired
    private final Service service;

    public Controller1(Service service){
        this.service=service;
    }

    @GetMapping("allquestions")
    public List<Entity> getAllQuestions(){
        return service.getQuestions();
    }

    @PostMapping("post")
    public PostingEntity postQuestion(@RequestBody PostingEntity postingEntity){
        return service.PostQuestion(postingEntity);
    }


    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "hello";
    }




}
