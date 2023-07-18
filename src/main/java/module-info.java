module com.example.triviagame {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.triviagame to javafx.fxml;
    exports com.example.triviagame;
}