package com.example.caza_fit;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class TrainerController {
    @FXML
    private JFXButton addtrainerbtn;

    @FXML
    private JFXButton deletetrainerbtn;

    @FXML
    private JFXButton identitytrainerbtn;

    @FXML
    private BorderPane mainPane;

    @FXML
    private JFXButton modifytrainerbtn;

    @FXML
    private JFXButton reclamertrainerbtn;

    @FXML
    private JFXButton showtrainerbtn;

    @FXML
    void addtrainer() {
        addtrainerbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Ajouter_trainer.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void deleteclient() {
        deletetrainerbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Supprimer_trainer.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void identitytrainer() {
        identitytrainerbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Identite_trainer.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void modifytrainer() {
        modifytrainerbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Modifier_trainer.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void reclamertrainer() {
        reclamertrainerbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Reclamer_trainer.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void showtrainer() {
        showtrainerbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Afficher_trainer.fxml");
            mainPane.setCenter(view);});

    }

}
