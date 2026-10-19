module com.alonsoleonard.conteo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alonsoleonard.conteo to javafx.fxml;
    exports com.alonsoleonard.conteo;
}
