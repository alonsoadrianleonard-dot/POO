package com.alonsoleonard.conteo;

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
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("conteo.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Conteo");
        stage.setScene(new Scene(root, 420, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
