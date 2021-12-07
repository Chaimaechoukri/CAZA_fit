package com.example.caza_fit;

import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class EmployeeController {
    @FXML
    private JFXButton addempbtn;

    @FXML
    private JFXButton deleteempbtn;

    @FXML
    private JFXButton identityempbtn;

    @FXML
    private BorderPane mainPane;

    @FXML
    private JFXButton modifyempbtn;

    @FXML
    private JFXButton reclamerempbtn;

    @FXML
    private JFXButton showempbtn;

    @FXML
    void addemployee() {
        addempbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Ajouter_employee.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void deleteemployee() {
        deleteempbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Supprimer_employee.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void identityemployee() {
        identityempbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Identite_employee.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void modifyemployee() {
        modifyempbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Modifier_employee.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void reclameremployee() {
        reclamerempbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Reclamer_employee.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void showemployee() {
        showempbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Afficher_employee.fxml");
            mainPane.setCenter(view);});

    }

}