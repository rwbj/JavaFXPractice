/**
*Robert w b jones
*12-30-17
*practice for learning javaFX
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.*;

public class JavaFXPractice{//extends Application{

    public static void main(String[] args){

        String s;
        if(args.length!=0){
            s = "";
            for(String a:args){
                s = s+" "+a;
            }
        }
        else{
            s="nothing";
        }
        System.out.println("you entered: " + s);
    }

}