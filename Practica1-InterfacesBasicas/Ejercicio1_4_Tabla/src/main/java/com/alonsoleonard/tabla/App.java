package com.alonsoleonard.tabla;

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
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("tabla.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Tabla de multiplicar");
        stage.setScene(new Scene(root, 320, 420));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
