package com.example.caza_fit;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ProduitsController {
    @FXML
    private JFXButton addproductbtn;

    @FXML
    private BorderPane mainPane;

    @FXML
    private JFXButton modifyproductbtn;

    @FXML
    private JFXButton showproductbtn;

    @FXML
    void addproduct() {
        addproductbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Ajouter_produits.fxml");
            mainPane.setCenter(view);});
    }

    @FXML
    void modifyproduct() {
        modifyproductbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Modifier_produits.fxml");
            mainPane.setCenter(view);});

    }

    @FXML
    void showproduct() {
        showproductbtn.setOnMouseClicked(event -> {
            SceneLoader sceneLoader = new SceneLoader();
            Pane view = sceneLoader.getPage("Afficher_produits.fxml");
            mainPane.setCenter(view);});

    }
}