package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.CurrentUser;
import models.DBConnect;

import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../views/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        try {
            if(DBConnect.login("Brea", "pass"))
            {
                System.out.println("LOGIN SUCCESSFUL");
                System.out.println("User ID: "+CurrentUser.getUser_id());
                System.out.println("Username: "+ CurrentUser.getUsername());
                System.out.println("Is Admin: "+CurrentUser.isAdmin());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        launch(args);
    }
}
