package application;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoginController {
	
	@FXML
	protected Button btnLogin;
	@FXML
	protected Button btnTrial;
	@FXML
	protected JFXPasswordField txtPassword;
	@FXML
	protected JFXTextField txtUserName;

    @FXML
    void Login(ActionEvent event) {
    	if(event.getSource()==btnLogin) {
    		if(txtUserName.getText()=="Omer"){
    			if(txtPassword.getText()=="1234") {
    				
    			}else {
    				System.out.println(txtPassword.getText());
    			}
    			try {
        			Stage login = (Stage) btnLogin.getScene().getWindow();
        			login.hide();
        			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        			Parent root1 = (Parent) fxmlLoader.load();
        			Stage main = new Stage();
        			main.setScene(new Scene(root1));
        			main.show();
        		} catch (Exception e) {
        			e.printStackTrace();
        		}
    		}else {
    			System.out.println(txtUserName.getText());
    		}
    		
    	
    		
    	}else if(event.getSource()==btnTrial) {
    		try {
    			Stage login = (Stage) btnTrial.getScene().getWindow();
    			login.hide();
    			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
    			Parent root1 = (Parent) fxmlLoader.load();
    			Stage main = new Stage();
    			main.setScene(new Scene(root1));
    			main.show();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    }

}