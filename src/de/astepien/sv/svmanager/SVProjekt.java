/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.astepien.sv.svmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aleksander Stepien 
 * Copyright 2017
 */
public class SVProjekt extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button vermieten = new Button("Fach vermieten");
        Button bt1 = new Button("EMPTY");
        Button bt2 = new Button("EMPTY");
        Button bt3 = new Button("EMPTY");
        
        vermieten.setMinSize(200, 50);
        vermieten.setPrefSize(200, 50);
        vermieten.setMaxSize(200, 50);
        vermieten.setLayoutX(1000);
        vermieten.setLayoutY(223);
        
        bt1.setMinSize(200, 50);
        bt1.setPrefSize(200, 50);
        bt1.setMaxSize(200, 50);
        bt1.setLayoutX(1000);
        bt1.setLayoutY(297);
        
        bt2.setMinSize(200, 50);
        bt2.setPrefSize(200, 50);
        bt2.setMaxSize(200, 50);
        bt2.setLayoutX(1000);
        bt2.setLayoutY(372);
        
        bt3.setMinSize(200, 50);
        bt3.setPrefSize(200, 50);
        bt3.setMaxSize(200, 50);
        bt3.setLayoutX(1000);
        bt3.setLayoutY(457);
             
        ImageView iv1 = new ImageView(new Image("/de/astepien/sv/svmanager/src/svlogo2.png"));
        iv1.setPreserveRatio(true);
        iv1.setFitWidth(200);
        iv1.setLayoutX(1000);
        iv1.setLayoutY(50);
      
        BorderPane mahnungen = new BorderPane();
        
        Label offeneMahnungen = new Label("Offene Mahnungen");
        mahnungen.setTop(offeneMahnungen);
        
        
        MenuItem schliessen = new MenuItem("Rechnen");
        MenuItem schuelerListe = new MenuItem("Schülerliste");
        MenuItem ehemalige = new MenuItem("Ehemalige");
        MenuItem mieter = new MenuItem("Mieter");
        MenuItem vermahnte = new MenuItem("Vermahnte");

        Menu datei = new Menu("Datei");
        datei.getItems().add(schliessen);
        
        Menu schueler = new Menu("Schüler");
        schueler.getItems().addAll(schuelerListe,ehemalige,mieter,vermahnte);
        
        Menu faecher = new Menu("Schließfächer");
 
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(datei, schueler, faecher);
 
        Pane content = new Pane();
 
        
        content.getChildren().addAll(vermieten,bt1,bt2,bt3);
        content.getChildren().add(iv1);
        content.getChildren().add(mahnungen);
                
   
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setCenter(content);
        
        Scene scene = new Scene(root, 1280, 720);
        
        primaryStage.setTitle("SV-Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
