module com.alonsoleonard.desglose {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alonsoleonard.desglose to javafx.fxml;
    exports com.alonsoleonard.desglose;
}
