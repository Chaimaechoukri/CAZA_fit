package com.example.caza_fit;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class VentesController {
    @FXML
    private JFXButton addventebtn;

    @FXML
    private BorderPane mainPane;

    @FXML
    private JFXButton modifyventebtn;

    @FXML
    private JFXButton showventebtn;

    @FXML
    void addventes() {
        addventebtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Ajouter_ventes.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void modifyvente() {
        modifyventebtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Modifier_ventes.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void showvente() {
        showventebtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Afficher_ventes.fxml");
            mainPane.setCenter(view);});

    }

}

