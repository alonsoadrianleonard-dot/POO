package com.alonsoleonard.desglose;

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
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("desglose.fxml"));
        Parent root = fxmlLoader.load();
        stage.setTitle("Desglose de dinero");
        stage.setScene(new Scene(root, 520, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
