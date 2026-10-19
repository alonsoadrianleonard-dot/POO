package com.alonsoleonard.edad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 * @author Alonso Leonard
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("edad.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Edad de una persona");
        stage.setScene(new Scene(root, 420, 260));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
