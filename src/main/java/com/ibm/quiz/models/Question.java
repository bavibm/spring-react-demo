package com.ibm.quiz.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "questions" )
public class Question {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="question")
    private String question;
    @Column(name="correctanswer")
    private String correctAnswer;
    @Column(name="incorrectanswer1")
    private String incorrectAnswer1;
    @Column(name="incorrectanswer2")
    private String incorrectAnswer2;
    @Column(name="incorrectanswer3")
    private String incorrectAnswer3;
    
    public int getId(){ 
        return id;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public String getQuestion(){
        return question;
    }

    public void setQuestion(String newQuestion){
        this.question = newQuestion;
    }

    public String getCorrectAnswer(){
        return correctAnswer;
    }

    public void setCorrectAnswer(String newCorrectAnswer){
        this.correctAnswer = newCorrectAnswer;
    }

    public String getIncorrectAnswer1(){
        return incorrectAnswer1;
    }

    public void setIncorrectAnswer1(String newIncorrectAnswer1){
        this.incorrectAnswer1 = newIncorrectAnswer1;
    }

    public String getIncorrectAnswer2(){
        return incorrectAnswer2;
    }

    public void setIncorrectAnswer2(String newIncorrectAnswer2){
        this.incorrectAnswer2 = newIncorrectAnswer2;
    }

    public String getIncorrectAnswer3(){
        return incorrectAnswer3;
    }

    public void setIncorrectAnswer3(String newIncorrectAnswer3){
        this.incorrectAnswer3 = newIncorrectAnswer3;
    }

}
