package com.example.elsotutorial;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InputVerificationController {

    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField;
    @FXML
    private Button myButton;

    int age;

    public void submit(ActionEvent event){
        try {
            System.out.println("Clicked on submit!");
            age = Integer.parseInt(myTextField.getText());
            System.out.println("age: "+age);
            if (age >= 18){
                System.out.println("User is an adult!");
                myLabel.setText("Signed up!");
            }else {
                System.out.println("User is underage!");
                myLabel.setText("You must be 18 or older!");
            }
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException happened");
            myLabel.setText("Enter only numbers please");
        }
        catch (Exception e){
            System.out.println("Exception happened!");
            System.out.println(e);
        }

    }
}
