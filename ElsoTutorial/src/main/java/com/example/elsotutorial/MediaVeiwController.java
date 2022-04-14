package com.example.elsotutorial;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MediaVeiwController implements Initializable {
    @FXML
    private MediaVeiw mediaVeiw;

    @FXML
    private Button playButton,pauseButton,resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        file =new File("")
    }

    public void playMedia(){

    }
    public void pauseMedia(){

    }
    public void resetMedia(){

    }
}
