package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class LoginController {
	
	@FXML private Button btn_close;
	@FXML private Button btn_minimize;
	
    @FXML void close(ActionEvent event) {
    	System.exit(0);
    }
    
    @FXML void minimize(ActionEvent event) {
    	Stage stage = (Stage)btn_minimize.getScene().getWindow();
    	stage.setIconified(true);
    }
    
}
