module com.alonsoleonard.gastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alonsoleonard.gastos to javafx.fxml;
    exports com.alonsoleonard.gastos;
}
