package com.example.triviagame.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label userNameLabel;
    @FXML
    private Label userNameValue;
    @FXML
    private Label totalPointsLabel;
    @FXML
    private Label totalPointsValue;
    @FXML
    private Label countdownLabel;
    @FXML
    private Label countdownValue;
    @FXML
    private Label firstObjectLabel;
    @FXML
    private Label secondObjectLabel;
    @FXML
    private Label timestampLabel;
    @FXML
    private Button answerButton1;
    @FXML
    private Button answerButton2;
    @FXML
    private Button answerButton3;
    @FXML
    private Button answerButton4;

    @FXML
    protected void choice1ButtonClick() {
        userNameValue.setText("You Selected Choice 1!");
    }

    @FXML
    protected void choice2ButtonClick() {
        userNameValue.setText("You Selected Choice 2!");
    }

    @FXML
    protected void choice3ButtonClick() {
        userNameValue.setText("You Selected Choice 3!");
    }

    @FXML
    protected void choice4ButtonClick() {
        userNameValue.setText("You Selected Choice 4!");
    }

    @FXML
    protected void GenerateReportButtonClick() {
        userNameValue.setText("Report Generated!");
    }
}
