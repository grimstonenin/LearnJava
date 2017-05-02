import javafx.application.Application;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.*;

import javafx.scene.paint.Color.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Section14Ex4 extends Application{

    public void start(Stage primaryStage){
        primaryStage.setTitle("Section14 Ex 4");

        Font newFont = Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,22);

        Text text1 = new Text("JAVA 1");
        Text text2 = new Text("JAVA 2");
        Text text3 = new Text("JAVA 3");

        text1.setFont(newFont);
        text2.setFont(newFont);
        text3.setFont(newFont);

        text1.setRotate(90);
        text2.setRotate(90);
        text3.setRotate(90);

        text1.setOpacity(Math.random());
        text2.setOpacity(Math.random());
        text3.setOpacity(Math.random());

        text1.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        text2.setFill(Color.color(Math.random(),Math.random(),Math.random()));
        text3.setFill(Color.color(Math.random(),Math.random(),Math.random()));

        FlowPane pane = new FlowPane();

        pane.setHgap(20);

        pane.getChildren().addAll(new Group(text1), new Group(text2), new Group(text3));

        Scene scene = new Scene(pane,300,200);



        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}
