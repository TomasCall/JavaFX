package com.example.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ResourceBundle;

public class QuizSceneController implements Initializable {
    @FXML
    private Label question;
    @FXML
    private RadioButton answer1,answer2,answer3,answer4;

    public void next(ActionEvent event){
        System.out.println("Next Clicked!");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        question.setText("Who is the Warden of the North?");
        answer1.setText("Starks");
        answer2.setText("Tyrells");
        answer3.setText("Baratheons");
        answer4.setText("Martells");

    }
}
