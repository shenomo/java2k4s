package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.controllers.AbstractController;

import java.io.IOException;

/**
 * Created by zamkovoyilya on 27/05/16.
 */
public class Client extends Application{
    private Stage currentStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        currentStage = primaryStage;
        primaryStage.setTitle("CMS Client");
        primaryStage.setResizable(false);
        showPage("enter");
    }

    public void showPage(String path)  {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scenes/" + path + ".fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AbstractController controller = loader.getController();
        controller.setApp(this);

        currentStage.setScene(new Scene(root));
        currentStage.show();
    }
}
