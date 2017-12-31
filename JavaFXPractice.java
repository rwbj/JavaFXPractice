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

public class JavaFXPractice extends Application implements EventHandler<ActionEvent>{//ActionEvent is a mouse click

    public static void main(String[] args){
        launch(args);//this method calls the start method bellow
    }
    
    Button bttn;

    @Override
    public void start(Stage primeStage) throws Exception{
        primeStage.setTitle("Rob's FX window");
        bttn = new Button();
        bttn.setText("I'm a button");
        bttn.setOnAction(this);//this calls the handle method found in the class given as an arg. use another class (that implements EventHandler) as the arg to use an external event handler class

        StackPane layout = new StackPane();
        layout.getChildren().add(bttn);

        Scene scn = new Scene(layout, 300, 200);
        primeStage.setScene(scn);
        primeStage.show();

    }

    @Override
    public void handle(ActionEvent event){
        if(event.getSource()==bttn){//this will select event only from the bttn
            System.out.println("this guy is an ass");
        }
    }

}
/*
"stage" = the whole window
"scene" = the main body of the window (the inside/contence)
*/