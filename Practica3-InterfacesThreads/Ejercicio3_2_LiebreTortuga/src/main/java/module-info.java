module com.alonsoleonard.carrera {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alonsoleonard.carrera to javafx.fxml;
    exports com.alonsoleonard.carrera;
}
