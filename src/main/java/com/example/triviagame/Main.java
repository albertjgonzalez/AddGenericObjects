package com.example.triviagame;

import com.example.triviagame.controller.MainController;
import com.example.triviagame.model.Question;
import com.example.triviagame.util.QuestionParser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class Main extends Application {
    public static String userName;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/triviagame/fxml/welcome-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Trivia Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void loadMainView(String userName, Stage stage) throws IOException {
        Main.userName = userName;

        // Fetch the questions for the game using the QuestionParser
        List<Question> questions = QuestionParser.parseQuestions("/com/example/triviagame/input.txt");

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/triviagame/fxml/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);

        MainController mainController = fxmlLoader.getController();
        mainController.setQuestions(questions); // this method will set the questions for the MainController

        // Set minimum and maximum dimensions for the stage
        stage.setMinWidth(500);
        stage.setMinHeight(600);
        stage.setMaxWidth(600);
        stage.setMaxHeight(600);

        stage.setScene(scene);
    }
}
