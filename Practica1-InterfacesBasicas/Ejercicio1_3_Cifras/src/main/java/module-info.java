module com.alonsoleonard.cifras {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alonsoleonard.cifras to javafx.fxml;
    exports com.alonsoleonard.cifras;
}
