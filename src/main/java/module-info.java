module com.example.dashboard_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dashboard_fx to javafx.fxml;
    exports com.example.dashboard_fx;
}