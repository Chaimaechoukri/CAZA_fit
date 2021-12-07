package com.example.caza_fit;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ClientsController {
    @FXML
    private JFXButton addclbtn;

    @FXML
    private JFXButton deleteclbtn;

    @FXML
    private JFXButton identityclbtn;

    @FXML
    private BorderPane mainPane;

    @FXML
    private JFXButton modifyclbtn;

    @FXML
    private JFXButton reclamerclbtn;

    @FXML
    private JFXButton showclbtn;

    @FXML
    void addclient() {
        addclbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Ajouter_clients.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void deleteclient() {
        deleteclbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Supprimer_clients.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void identityclient() {
        identityclbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("identité_clients.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void modifyclient() {
        modifyclbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Modifier_clients.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void reclamerclient() {
        reclamerclbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Reclamer_client.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void showclient() {
        showclbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Afficher_client.fxml");
            mainPane.setCenter(view);});

    }

}