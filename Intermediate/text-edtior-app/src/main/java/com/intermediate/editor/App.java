package com.intermediate.editor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    Label label = new Label("Hello, everyone");
    Scene scene = new Scene(label, 400, 200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("JavaFx App");
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
