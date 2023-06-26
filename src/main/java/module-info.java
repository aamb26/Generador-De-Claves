module com.example.generadordeclaves {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.generadordeclaves to javafx.fxml;
    exports com.example.generadordeclaves;
}