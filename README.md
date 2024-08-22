# Java Console-Based Quiz Application

## Overview

This is a simple Java console-based quiz application that allows users to test their general knowledge by answering multiple-choice questions. The quiz has ten questions, and the user receives a score at the end of it.

## Features

- **Multiple-choice questions**: The quiz consists of 10 questions, each with four possible answers. The user selects the correct answer by entering the corresponding number.
- **Real-time scoring**: The user's score is updated in real-time as they answer each question.
- **Final score display**: At the end of the quiz, the user's score is displayed along with their percentage.

## Code Structure

The project is divided into three main files:

1. **QuizApplication.java**
   - This is the entry point of the application. It creates an instance of the `Quiz` class and starts the quiz.

2. **Questions.java**
   - This class represents a single quiz question. It stores the question, possible answers, and the correct answer.
   - It includes methods to return the question, return the list of options, and check if the user's answer is correct.

3. **Quiz.java**
   - This is the core class that manages the quiz logic. It:
     - Stores a list of questions.
     - Displays questions to the user.
     - Captures the user's answers and checks their correctness.
     - Tracks the user's score and displays the final result at the end of the quiz.

## How to Run the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/quiz-application.git
   ```
   
2. **Compile the Java files**:
   ```bash
   javac -d bin src/com/quiz/quizapplication/QuizApplication.java
   ```
   
3. **Run the application**:
   ```bash
   java -cp bin com.quiz.quizapplication.QuizApplication
   ```

4. **Follow the prompts** to answer the quiz questions. The application will display your final score and percentage at the end.

## Example Questions

Some example questions from the quiz include:

- In what year did the Great October Socialist Take Place?
- Which river is the longest in the world?
- What does "Carpe Diem" mean in Latin?

## Future Enhancements

Potential future improvements to the application could include:

- Adding more questions and categories.
- Implementing a timer for each question.
- Implementing Java Swing for User Friendly Interface.
- Providing feedback on incorrect answers with explanations.
- Allowing users to review their answers at the end of the quiz.
