package com.backstreetbrogrammer.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TestLauncher extends Application {
    @Override
    public void start(final Stage stage) throws Exception {
        final Button button = new Button();
        button.setText("Say 'Hello World'");
        button.setOnAction(actionEvent -> System.out.println("Hello World!"));

        final StackPane root = new StackPane();
        root.getChildren().add(button);

        final Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(final String[] args) {
        launch(args);
    }
}
