package com.example.triviagame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void choice1ButtonClick() {
        welcomeText.setText("You Selected Choice 1!");
    }
    @FXML
    protected void choice2ButtonClick() {
        welcomeText.setText("You Selected Choice 2!");
    }
    @FXML
    protected void choice3ButtonClick() {
        welcomeText.setText("You Selected Choice 3!");
    }
    @FXML
    protected void choice4ButtonClick() {
        welcomeText.setText("You Selected Choice 4!");
    }
    @FXML
    protected void GenerateReportButtonClick() {
        welcomeText.setText("Report Generated!");
    }
}