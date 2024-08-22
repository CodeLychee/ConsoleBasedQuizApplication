package com.quiz.quizapplication;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    
    int theQuestions = 0;
    int userScore = 0;
    float percentage;
    int listOption;
    List <Questions> questions;
    
    public void Quiz(){
        questions = new ArrayList<>();
        welcomeMessage();
        allQuestions();
        QuizStart();
    }
    public void welcomeMessage(){
        System.out.println("*****Welcome to this Quiz Application*****");
        System.out.println("*****There are 10 questions in total*****");
        System.out.println("*****Select your Answers carefully...*****");
    }
    public void allQuestions(){
    questions.add(new Questions("Q.1 In What Year did the Great October Socialist Take Place?",List.of("1.1917","2.1923","3.1914","4.1920"),"1"));
    questions.add(new Questions("Q.2 Which River is the longest in the World?",List.of("1.Amazon","2.Mississippi","3.Nile","4.Yangtze"),"3"));
    questions.add(new Questions("Q.3 What does Carpe Diem mean in Latin?",List.of("1.Enjoy the Moment","2.Have no fear","3.Sorry I blew it","4.Hello"),"1"));
    questions.add(new Questions("Q.4 Which one of the following countries is not in Africa?",List.of("1.Morocco","2.Yemen","3.Sudan","4.Algeria"),"2"));
    questions.add(new Questions("Q.5 Who wrote the 'Great Gatsby' novel?",List.of("1.Leo Tolstoy","2.Hemingway","3.Stepean King","4.F.Scott Fitzgerald"),"4"));
    questions.add(new Questions("Q.6 Which Chemical element makes up most of the atmosphere of Mars?",List.of("1.Methane","2.Carbon dioxide","3.Hydrogen","4.Oxygen"),"1"));
    questions.add(new Questions("Q.7 What Ocean lies between North America and Eurasia?",List.of("1.Quiet","2.Atlantic","3.India","4.Artic"),"2"));
    questions.add(new Questions("Q.8 What is the study of the science that studies the past of life on Earth?",List.of("1.Astronomy","2.Geology","3.Anthropolgy","4.Palaeontology"),"4"));
    questions.add(new Questions("Q.9 Which organ in the human body is responsible for secreting insulin?",List.of("1.Liver","2.Kidneys","3.Pancreas","4.Stomach"),"3"));
    questions.add(new Questions("Q.10 Which one of the following is not a JAVA feature?",List.of("1.Object-oriented","2.Use of pointers","3.Portable","4.Dynamic and Extensible"),"2"));
    
    }  
       
    private Questions getTheQuestions(){
        return questions.get(theQuestions);
    }
    
    private void nextQuestions(){
        theQuestions++;
    }
    
    private void resultDisplay(){
        percentage = (userScore*100/questions.size());
        System.out.println("Quiz is finished!");
        System.out.println("You've Scored: "+userScore+"/"+questions.size()+" i.e. "+percentage+"%");
    }

    private void displayQuestions(Questions theQuestions) {
    System.out.println(theQuestions.theQuizQuestions());
    List<String> options = theQuestions.theOptions();
    for (String listOption : options) {
        System.out.println(listOption);
    	}
    }


    private int getuserAnswer() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please Select Your Answer: ");
    int theAnswer = scanner.nextInt();
    return theAnswer;
    }

   private void checkTheAnswer(Questions theQuestions, int useranswer) {
    String correctAnswer = theQuestions.theOptions().get(useranswer - 1).substring(0, 1);
    if (theQuestions.theCorrectAnswer(correctAnswer)) {
        userScore++;
        }
    }
     
    public void QuizStart(){
        if(theQuestions < questions.size()){
            Questions theQuestions = getTheQuestions();
            displayQuestions(theQuestions);
            int userAnswer = getuserAnswer();
            checkTheAnswer(theQuestions, userAnswer);
            nextQuestions();
            QuizStart();
        }
        else{
            resultDisplay();
        }
    }
}
