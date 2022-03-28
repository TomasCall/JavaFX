package com.example.elsotutorial;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CheckboxController {
    @FXML
    private CheckBox myCheckbox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImageView;

    Image myImage1 = new Image(getClass().getResourceAsStream("Shrek1.jpg"));
    Image myImage2 = new Image(getClass().getResourceAsStream("Shrek2.jpg"));

    public void change(ActionEvent event){
        if (myCheckbox.isSelected()){
            myLabel.setText("ON");
            System.out.println("ON");
            myImageView.setImage(myImage2);
        }
        else {
            myLabel.setText("OFF");
            System.out.println("OFF");
            myImageView.setImage(myImage1);
        }
    }
}
