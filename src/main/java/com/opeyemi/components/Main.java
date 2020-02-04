package com.opeyemi.components;

import com.opeyemi.components.ui.GreetingCard;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GreetingCard greetingCard =  new GreetingCard();

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(greetingCard, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
