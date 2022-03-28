package com.example.elsotutorial;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Group root = new Group();
        //Scene scene = new Scene(root,600,600,Color.SKYBLUE);

        //Window title
        //stage.setTitle("Demo program");

        //Window width and height
        //stage.setWidth(420);
        //stage.setHeight(420);
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
        /*
        //Draving
        //Text
        Text text = new Text();
        text.setText("WHOOA!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.LIMEGREEN);

        //Line
        Line line  = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        //Rectangles
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        //Polygon
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.YELLOW);

        //Circle
        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        //Image

        Image image = new Image("./999506.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);


        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        //root.getChildren().add(imageView);

        //stage.setScene(scene);
        //stage.show();
        //primaryStage.setScene(scene);
        //primaryStage.show();

        */

        try{
            //Event Handling
            /*
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root); //300, 275);
            primaryStage.setTitle("FXML Welcome");
            primaryStage.setScene(scene);
            primaryStage.show();
             */
            //CSS
            /*
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root); //300, 275);
            //scene.getStylesheets().add(String.valueOf(getClass().getResource("application.css")));
            //With more scenes
            String css = this.getClass().getResource("application.css").toExternalForm();
            scene.getStylesheets().add(css);
            primaryStage.setScene(scene);
            primaryStage.show();
            */
            //Switch Scenes
            /*
            Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
             */
            //Communication between controllers
            /*
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
             */
            //Logout
            /*
            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();

            primaryStage.setOnCloseRequest(windowEvent -> {
                windowEvent.consume();
                logout(primaryStage);
            });
             */
            //ImageView
            /*
            Parent root = FXMLLoader.load(getClass().getResource("SceneImageView.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
             */
            //Input verification
            /*
            Parent root = FXMLLoader.load(getClass().getResource("SceneInputVerification.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
             */
            Parent root = FXMLLoader.load(getClass().getResource("SceneCheckbox.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
    public void logout(Stage stage){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You are about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");

        if (alert.showAndWait().get()== ButtonType.OK){
            //stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }

}