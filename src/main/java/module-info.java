module main.sisgesemp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens main.sisgesemp to javafx.fxml;
    exports main.sisgesemp;
}