package com.example.triviagame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

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

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/example/triviagame/fxml/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);

        // Set minimum and maximum dimensions for the stage
        stage.setMinWidth(500);
        stage.setMinHeight(600);
        stage.setMaxWidth(600);
        stage.setMaxHeight(600);

        stage.setScene(scene);
    }
}
