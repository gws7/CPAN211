/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab4_gabriel_sosin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author socia
 */
public class Lab4_Gabriel_Sosin extends Application {
    
    private TextField tfNumber = new TextField();
    private TextField tfName = new TextField();
    private TextField tfPrice = new TextField();
    private Button btQuit = new Button("Quit");
    private Button btSave = new Button("Save");
    
    @Override
    public void start(Stage primaryStage) {
        //Setting up the labels and texts
        //and where they go on the grid
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(15);
        gridPane.add(new Label("Number:"), 0, 0);
        gridPane.add(tfNumber, 1, 0);
        gridPane.add(new Label("Name:"), 0, 1);
        gridPane.add(tfName, 1, 1);
        gridPane.add(new Label("Price:"), 0, 2);
        gridPane.add(tfPrice, 1, 2);
        
        //Properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfNumber.setAlignment(Pos.BOTTOM_RIGHT);
        tfName.setAlignment(Pos.BOTTOM_RIGHT);
        tfPrice.setAlignment(Pos.BOTTOM_RIGHT);

        //Hbox for the buttons
        HBox btBox = new HBox(15);
        btBox.getChildren().addAll(btQuit, btSave);
        btBox.setAlignment(Pos.CENTER);
        gridPane.add(btBox, 1, 3);
    
        //Event triggers for the two buttons
        btQuit.setOnAction(e -> quitProgram());
        btSave.setOnAction(e -> saveItem());
        
        //Sets the scene and builds it
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Inventory Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void quitProgram() {
        //Exits the program
        Platform.exit();
    }

    private void saveItem() {
        //Using bufferedWriter and fileReader to write the inputted tings inside the file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Products.txt", true))){
            String name = tfName.getText();
            String number = tfNumber.getText();
            String price = tfPrice.getText();
            
            writer.write(name + ", " + number + ", " + "$" + price);
            writer.newLine();
            System.out.println("Saved:" + name + " " + number + " " + price);
            
            tfName.clear();
            tfNumber.clear();
            tfPrice.clear();
        } catch (IOException ex) {
            Logger.getLogger(Lab4_Gabriel_Sosin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
