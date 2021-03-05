package com.ibm.quiz.service;

import com.ibm.quiz.models.Question;
import com.ibm.quiz.repository.QuizRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Service
public class QuizService {
 
    @Autowired
    private QuizRepository quizRepo;

    public List<Question> getAllQuestions(){
        return quizRepo.findAll();
    }

    public Question getQuestion(int id){
        return quizRepo.findById(id);
    }

    public Question saveQuestion(Question q){
        return quizRepo.save(q);
    }
}
