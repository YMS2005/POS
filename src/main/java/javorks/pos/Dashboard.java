package javorks.pos;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class Dashboard extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        // setting the nodes for the scene
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            // setting the scene and stage
            //Group root = new Group();
            Scene sc = new Scene(root);
            String CSS = this.getClass().getResource("Project.css").toExternalForm();
            sc.getStylesheets().add(CSS);


            primaryStage.setScene(sc);
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
