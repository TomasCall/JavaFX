module com.example.elsotutorial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.elsotutorial to javafx.fxml;
    exports com.example.elsotutorial;
}