module com.example.caza_fit {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;


    opens com.example.caza_fit to javafx.fxml;
    exports com.example.caza_fit;
}