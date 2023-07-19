package com.example.triviagame.controller;

import com.example.triviagame.model.Question;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.util.Duration;

import java.util.List;

public class MainController {

    @FXML
    private Label userNameValue, totalPointsValue, countdownValue, firstObjectLabel, secondObjectLabel, timestampLabel;
    @FXML
    private Button answerButton1, answerButton2, answerButton3, answerButton4;

    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private Timeline countdown;
    private int countdownTime;

    public void initialize() {
        // Initialization code if needed.
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
        displayQuestion();
        startCountdown();
    }

    private void displayQuestion() {
        Question currentQuestion = questions.get(currentQuestionIndex);
        firstObjectLabel.setText(currentQuestion.getObject1().toString());
        secondObjectLabel.setText(currentQuestion.getObject2().toString());
        List<Object> choices = currentQuestion.getChoices();
        answerButton1.setText(choices.get(0).toString());
        answerButton2.setText(choices.get(1).toString());
        answerButton3.setText(choices.get(2).toString());
        answerButton4.setText(choices.get(3).toString());
    }

    private void startCountdown() {
        // Your countdown logic
        countdownTime = 5; // example value
        countdownValue.setText(String.valueOf(countdownTime));

        countdown = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            countdownTime--;
            countdownValue.setText(String.valueOf(countdownTime));
            if (countdownTime <= 0) {
                // logic to handle when the countdown reaches 0
                nextQuestion();
            }
        }));
        countdown.setCycleCount(5);
        countdown.play();
    }

    @FXML
    private void handleChoiceSelection(ActionEvent event) {
        // Logic to handle the choice selection, evaluate the answer, update score, etc.
    }

    @FXML
    private void GenerateReportButtonClick(ActionEvent event) {
        // Logic to generate the report
    }

    private void nextQuestion() {
        // Logic to proceed to the next question
        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
            displayQuestion();
            startCountdown();
        } else {
            // Game over logic
        }
    }
}
