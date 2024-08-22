package com.quiz.quizapplication;

import java.util.List;

public class Questions {
    String QuizQuestions;
    List<String> alloptions;
    String theAnswer;
    
    public Questions(String QuizQuestions, List<String> alloptions, String theAnswer){
        this.QuizQuestions =   QuizQuestions;
        this.alloptions = alloptions;
        this.theAnswer= theAnswer;
    }
    
    public String theQuizQuestions(){
        return QuizQuestions;
    }
    
    public List<String> theOptions(){
        return alloptions;
    }
    
    public boolean theCorrectAnswer(String answer){
        return theAnswer.equalsIgnoreCase(answer);
    }
}
