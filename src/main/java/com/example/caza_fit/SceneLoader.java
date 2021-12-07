package com.example.caza_fit;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.net.URL;

public class SceneLoader {
    private Pane view;
    public Pane getPage(String filename) {
        try {
            URL url = HelloApplication.class.getResource(filename);
            if (url == null) {
                throw new FileNotFoundException("File Path Error");
            }
            view = new FXMLLoader().load(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
}
