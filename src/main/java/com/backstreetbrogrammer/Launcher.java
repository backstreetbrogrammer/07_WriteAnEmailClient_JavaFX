package com.backstreetbrogrammer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class Launcher extends Application {
    @Override
    public void start(final Stage stage) throws Exception {
//        final URL resource = getClass().getClassLoader().getResource("LoginWindow.fxml");
        final URL resource = getClass().getClassLoader().getResource("MainWindow.fxml");

        final Parent parent = FXMLLoader.load(Objects.requireNonNull(resource));

        final Scene scene = new Scene(parent, 950, 800);
        stage.setScene(scene);
        stage.show();
    }

    public void startWithoutFxml(final Stage stage) throws Exception {
        // 1. create a component like a button
        final Button button = new Button("Click!");
        button.setOnAction(e -> System.out.println("Button Clicked!"));

        // 2. create a pane to add the components
        final StackPane pane = new StackPane();
        pane.getChildren().add(button);

        // 3. create a scene to add the pane
        final Scene scene = new Scene(pane, 300, 250);

        // 4. set the scene to stage and show stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(final String[] args) {
        launch(args);
    }
}
