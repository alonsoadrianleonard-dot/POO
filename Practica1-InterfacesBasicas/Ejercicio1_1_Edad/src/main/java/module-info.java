module com.alonsoleonard.edad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alonsoleonard.edad to javafx.fxml;
    exports com.alonsoleonard.edad;
}
