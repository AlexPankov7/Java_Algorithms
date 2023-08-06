module com.example.javaalgorithms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaalgorithms to javafx.fxml;
    exports com.example.javaalgorithms;
}