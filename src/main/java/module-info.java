module com.mycompany.assignment02_fall {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.assignment02_fall to javafx.fxml;
    exports com.mycompany.assignment02_fall;
}
