import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Section14Ex1 extends Application{

    public void start(Stage primaryStage){

        GridPane pane = new GridPane();
        pane.setGridLinesVisible(true);

        Image moon1 = new Image("img/47707597-moon.jpg");
        Image moon2 = new Image("img/images.jpg");
        Image moon3 = new Image("img/moon-101-nasa_640x360_808580163611.jpg");
        Image moon4 = new Image("img/moon-1109746_960_720.jpg");

        ImageView image1 = new ImageView(moon1);
        image1.setFitHeight(300);
        image1.setFitWidth(300);
        ImageView image2 = new ImageView(moon2);
        image2.setFitHeight(300);
        image2.setFitWidth(300);
        ImageView image3 = new ImageView(moon3);
        image3.setFitHeight(300);
        image3.setFitWidth(300);
        ImageView image4 = new ImageView(moon4);
        image4.setFitHeight(300);
        image4.setFitWidth(300);
        //pane.getChildren().addAll(image1, image2,image3,image4);

        pane.getColumnConstraints().add(new ColumnConstraints(300));
        pane.getRowConstraints().add(new RowConstraints(300));
        pane.setHgap(50);
        pane.setVgap(50);


        pane.add(image1,0,0);
        pane.add(image2,1,0);
        pane.add(image3,0,1);
        pane.add(image4,1,1);

        Scene scene = new Scene(pane);


        primaryStage.setTitle("Exercise 14.01");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args){
        Application.launch(args);
    }

}
