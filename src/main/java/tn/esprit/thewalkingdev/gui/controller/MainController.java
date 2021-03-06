package tn.esprit.thewalkingdev.gui.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainController implements ControlledScreen {
	ScreensController ctrl;
	@FXML
	private AnchorPane pane;
	@FXML
	private Button viewLog;
	@FXML
	private Button viewLogEvent;
	public static String DisplayEquipmentScreen = "/tn/esprit/thewalkingdev/gui/view/afficheEquipment.FXML";
	public static String DisplayEquipment = "Add Equipment";
	public static String DisplayEventScreen = "/tn/esprit/thewalkingdev/gui/view/AddEvent.fxml";
	public static String DisplayEquipement = "Add Event";

	// Event Listener on Button[#viewLog].onAction
	@FXML
	public void viewLogistics(ActionEvent event) throws IOException {
		pane.getChildren().clear();
		Node node;
		node = (Node) FXMLLoader.load(getClass().getResource(
				DisplayEquipmentScreen));
		pane.getChildren().add(node);
	}

	// Event Listener on Button[#viewEvent].onAction
	@FXML
	public void viewEvent(ActionEvent event) throws IOException{
		pane.getChildren().clear();
		Node node;
		node = (Node) FXMLLoader.load(getClass().getResource(
				DisplayEventScreen));
		pane.getChildren().add(node);
	}
	@Override
	public void setScreenParent(ScreensController screenPage) {
		ctrl = screenPage;
	}
}
