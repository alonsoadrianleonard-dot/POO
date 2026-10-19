module com.alonsoleonard.tabla {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alonsoleonard.tabla to javafx.fxml;
    exports com.alonsoleonard.tabla;
}
