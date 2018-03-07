package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

	@FXML
	protected JFXButton btnQM;
	@FXML
	protected JFXButton btnOR;
	@FXML
	protected JFXButton btnDO;
	@FXML
	protected JFXButton btnTU;

	@FXML
	protected JFXTextField txtDO;
	@FXML
	protected JFXTextField txtQM;
	@FXML
	protected JFXTextField txtOR;
	@FXML
	protected JFXTextField txtTU;

	protected Stage qmaker = new Stage();
	protected Stage oreader = new Stage();
	protected Stage ttutorial = new Stage();
	protected Stage ddonate = new Stage();

	@FXML
	private void SceneChangerQM(ActionEvent event) {
		try {
			Stage main = (Stage) btnQM.getScene().getWindow();
			main.hide();
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("QM.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage qmaker = new Stage();
			qmaker.setScene(new Scene(root1));
			qmaker.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void SceneChangerOR(ActionEvent event) {
		try {
			Stage main = (Stage) btnQM.getScene().getWindow();
			main.hide();
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OR.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			oreader.setScene(new Scene(root1));
			oreader.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void SceneChangerTU(ActionEvent event) {
		try {
			Stage main = (Stage) btnQM.getScene().getWindow();
			main.hide();
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HU.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			ttutorial.setScene(new Scene(root1));
			ttutorial.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void SceneChangerDO(ActionEvent event) {
		try {
			Stage main = (Stage) btnQM.getScene().getWindow();
			main.hide();
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SU.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			ddonate.setScene(new Scene(root1));
			ddonate.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
