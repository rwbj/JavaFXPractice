/**
*Robert w b jones
*12-30-17
*practice for learning javaFX
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXPractice extends Application {//implements EventHandler<ActionEvent>{//ActionEvent is a mouse click

    public static void main(String[] args){
        launch(args);//this method calls the start method bellow
    }
    
    Button bttn;

    @Override
    public void start(Stage primeStage) throws Exception{
        primeStage.setTitle("Rob's FX window");
        bttn = new Button();
        bttn.setText("I'm a button");
        bttn.setOnAction(e -> System.out.print("hey, look at me!"));
        
        StackPane layout = new StackPane();
        layout.getChildren().add(bttn);

        Scene scn = new Scene(layout, 300, 200);
        primeStage.setScene(scn);
        primeStage.show();

    }

}
/*
"stage" = the whole window
"scene" = the main body of the window (the inside/contence)
*/