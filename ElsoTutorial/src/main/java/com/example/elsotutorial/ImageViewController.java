package com.example.elsotutorial;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViewController {
    @FXML
    ImageView myImageView;
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("Shrek2.jpg"));

    public void displayImage(){
        myImageView.setImage(myImage);
    }
}
