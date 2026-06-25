module com.example.foodgodelivery {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.foodgodelivery to javafx.fxml;
    exports com.example.foodgodelivery;
}