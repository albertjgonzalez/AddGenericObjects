package com.example.triviagame.controller;

import com.example.triviagame.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import java.io.IOException;

public class WelcomeController {
    @FXML
    private TextField nameField;

    @FXML
    protected void handleStartGame(ActionEvent event) throws IOException {
        String userName = nameField.getText();
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        Main.loadMainView(userName, stage);
    }
}
