package fr.insa.monprojet.test4javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



/**
 * JavaFX TestFX
 */
public class TestFX extends Application {

    @Override
public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("TREILLIS");
    Scene scene = new Scene(new HBoxExemple());
  
    primaryStage.setScene(scene);   
    primaryStage.show();
}

    public static void main(String[] args) {
        launch();
    }

}