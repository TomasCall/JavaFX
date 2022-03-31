package com.example.elsotutorial;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceBoxController implements Initializable {
    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] foods = {"pizza","sushi","ramen"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(foods);
        myChoiceBox.setOnAction(this::getFood);

    }

    public void getFood(ActionEvent event){
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood);
    }
}
