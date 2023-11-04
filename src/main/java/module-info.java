module ch.iet_gibb.heatcreatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.iet_gibb.heatcreatorfx to javafx.fxml;
    exports ch.iet_gibb.heatcreatorfx;
}