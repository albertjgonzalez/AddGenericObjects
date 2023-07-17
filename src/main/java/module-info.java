module com.example.triviagame {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.triviagame to javafx.fxml;
    exports com.example.triviagame;
}