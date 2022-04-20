package com.example.quiz;



public class Question {
    private String[] answers;
    private String question;
    private String answer;

    public Question(String[] answers,String question,String answer){
        this.answer = answer;
        this.question = question;
        this.answers = answers;
    }
}
