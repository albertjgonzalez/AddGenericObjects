package com.example.triviagame.model;

import java.util.List;

public class Question {
    private Object object1; // First object in the question
    private Object object2; // Second object in the question
    private List<Object> choices; // List of possible answer choices
    private Object correctAnswer; // Correct answer after adding the two objects

    // Constructor to initialize all properties
    public Question(Object object1, Object object2, List<Object> choices, Object correctAnswer) {
        this.object1 = object1;
        this.object2 = object2;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    public Question(String trim, String trim1, String[] choices) {
    }

    // Getter for the first object
    public Object getObject1() {
        return object1;
    }

    // Setter for the first object (if modification is required)
    public void setObject1(Object object1) {
        this.object1 = object1;
    }

    // Getter for the second object
    public Object getObject2() {
        return object2;
    }

    // Setter for the second object (if modification is required)
    public void setObject2(Object object2) {
        this.object2 = object2;
    }

    // Getter for the list of answer choices
    public List<Object> getChoices() {
        return choices;
    }

    // Setter for the list of answer choices (if modification is required)
    public void setChoices(List<Object> choices) {
        this.choices = choices;
    }

    // Getter for the correct answer
    public Object getCorrectAnswer() {
        return correctAnswer;
    }

    // Setter for the correct answer (if modification is required)
    public void setCorrectAnswer(Object correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    // You can add more methods if required, like toString() for debugging, etc.
    @Override
    public String toString() {
        return object1 + " + " + object2 + " = " + correctAnswer + ", Choices: " + choices;
    }
}
