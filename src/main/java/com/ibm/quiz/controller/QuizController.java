package com.ibm.quiz.controller;

import com.ibm.quiz.models.Question;
import com.ibm.quiz.service.QuizService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class QuizController{

    @Autowired
    private QuizService quizService;

    @RequestMapping(path="/")
    public String ping(){
        return "Hello World";
    }

    @RequestMapping(path="/questions")
    public List<Question> getAllQuestions(){
        return quizService.getAllQuestions();
    }

    @RequestMapping(path="/get-question")
    public Question getQuestion(@RequestParam int id){
        return quizService.getQuestion(id);
    }

    @PostMapping(path="/add-question")
    public Question saveQuestion(@RequestBody Question q){
        return quizService.saveQuestion(q);
    }

}

