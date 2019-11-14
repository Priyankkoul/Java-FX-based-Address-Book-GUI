module javaproj {
    requires java.xml;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.base;
    requires javafx.base;


    opens sample.datamodel;
    opens sample;
}