module com.example.evolution {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.example.evolution to javafx.fxml;
    exports com.example.evolution;
}