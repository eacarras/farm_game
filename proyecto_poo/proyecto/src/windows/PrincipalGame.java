package windows;

import res.Methods;
import res.Values;

import frutas.Fruits;
import granos.Granos;
import vegetal.Vegetales;

import classes.F_V;

import java.util.HashMap;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrincipalGame extends Application{
	
	private AnchorPane root;
	private Label luser;
	
	private Label loptions;
	
	private final HashMap<String, List<F_V>> map = Methods.getMap();
	
	private final HBox frutas = Fruits.getFruits();
	private final HBox granos = Granos.getGranos();
	private final HBox vegetales = Vegetales.getVegetales();
	
	private ImageView background;
	
	public PrincipalGame(String user) {
		root = new AnchorPane();
		
		luser = new Label(user);
		AnchorPane.setLeftAnchor(luser, 10.0);
		AnchorPane.setTopAnchor(luser, 10.0);
		
		loptions = new Label("Seleccione el cultivo que desee sembrar:");
		AnchorPane.setLeftAnchor(loptions, 10.0);
		AnchorPane.setTopAnchor(loptions, 495.0);
		
		addHBox(frutas);
		addHBox(granos);
		addHBox(vegetales);
		
		background = new ImageView(new Image("file:src/res/fondo_granja.jpg"));
	}
	
	@Override
	public void start(Stage stage) {
		
		root.getChildren().addAll(luser, background, loptions);
		
		Scene scene = new Scene(root, Values.WIDTH_GAME, Values.HEIGTH_GAME);
		stage.setScene(scene);
		stage.setTitle(Values.TITLE_GAME);
		stage.centerOnScreen();
		stage.show();
	}
	
	private void addHBox(HBox hbox) {
		AnchorPane.setLeftAnchor(hbox, 10.0);
		AnchorPane.setTopAnchor(hbox, 510.0);
		
		hbox.setVisible(false);
		root.getChildren().add(hbox);
	}

}