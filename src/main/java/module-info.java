module com.example.triviagame {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.triviagame to javafx.fxml;
    exports com.example.triviagame;
    exports com.example.triviagame.controller;
    opens com.example.triviagame.controller to javafx.fxml;
    exports com.example.triviagame.database;
    opens com.example.triviagame.database to javafx.fxml;
    exports com.example.triviagame.model;
    opens com.example.triviagame.model to javafx.fxml;
}