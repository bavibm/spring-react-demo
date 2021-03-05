package com.ibm.quiz.repository;

import com.ibm.quiz.models.Question;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface QuizRepository extends CrudRepository<Question, Long>{ 

    Question findById(int id);
    List<Question> findAll();
}
