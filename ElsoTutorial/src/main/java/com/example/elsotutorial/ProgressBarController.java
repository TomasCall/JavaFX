package com.example.elsotutorial;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class ProgressBarController implements Initializable {

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

    double progress;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myProgressBar.setStyle("-fx-accent: green;");

    }

    public void increaseProgress(){
        if (progress<1){
            progress +=0.1;
            System.out.println(progress);
            myProgressBar.setProgress(progress);
            myLabel.setText(Integer.toString((int)Math.round(progress*100))+" %");
        }

    }
}
