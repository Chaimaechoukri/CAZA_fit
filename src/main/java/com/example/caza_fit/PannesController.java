package com.example.caza_fit;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PannesController {
    @FXML
    private JFXButton addpannebtn;

    @FXML
    private BorderPane mainPane;

    @FXML
    private JFXButton modifypannebtn;

    @FXML
    private JFXButton showpannebtn;

    @FXML
    void addpanne() {
        addpannebtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Ajouter_pannes.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void modifypanne() {
        modifypannebtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Modifier_pannes.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void showpanne( ) {
        showpannebtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Afficher_pannes.fxml");
            mainPane.setCenter(view);});

    }

}
