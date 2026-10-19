package com.alonsoleonard.gastos;

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
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("gastos.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Control de Gastos Semanales");
        stage.setScene(new Scene(root, 480, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
