package com.example.elsotutorial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLUE);

        //Window title
        stage.setTitle("Demo program");

        //Window width and height
        stage.setWidth(420);
        stage.setHeight(420);
        //Set windows position
        //stage.setX(50);
        //stage.setY(50);

        //Fullscreen
        //FullscreenWindow t or f
        //stage.setFullScreen(true);
        //Fulllscreen exit hint
        //stage.setFullScreenExitHint("You tarped inside here :)");
        //Fullscreen exit button
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();

    }
}