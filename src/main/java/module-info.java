module com.spsmb.picek.znamky {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spsmb.picek.znamky to javafx.fxml;
    exports com.spsmb.picek.znamky;
}