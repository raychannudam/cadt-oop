module com.example.udamjavafxwithintellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.udamjavafxwithintellij to javafx.fxml;
    exports com.example.udamjavafxwithintellij;
}