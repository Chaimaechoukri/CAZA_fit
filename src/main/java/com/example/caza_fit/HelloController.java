package com.example.caza_fit;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML
    private JFXButton clientbtn;

    @FXML
    private JFXButton dashboardbtn;

    @FXML
    private JFXButton employeebtn;

    @FXML
    private BorderPane mainPane;

    @FXML
    private JFXButton offbtn;

    @FXML
    private JFXButton pannesbtn;

    @FXML
    private JFXButton produitsbtn;

    @FXML
    private JFXButton trainerbtn;

    @FXML
    private JFXButton ventesbtn;

    @FXML
    void exitprog() {
        Platform.exit();
    }

    @FXML
    void openClients() {
        clientbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Clients.fxml");
            mainPane.setCenter(view);});
    }

    @FXML
    void openDashboard() {
    }

    @FXML
    void openEmployee() {
        employeebtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("employee.fxml");
            mainPane.setCenter(view);});
    }
    @FXML
    void openPannes() {
        pannesbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Pannes.fxml");
            mainPane.setCenter(view);});
    }

    @FXML
    void openProduits() {
        produitsbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Produits.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void openTrainer() {
        trainerbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Trainer.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void openVentes() {
        ventesbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Ventes.fxml");
            mainPane.setCenter(view);});
    }

}
