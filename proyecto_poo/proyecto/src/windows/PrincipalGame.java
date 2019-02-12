package windows;

import res.Methods;
import res.Values;

import frutas.Fruits;
import granos.Granos;
import vegetal.Vegetales;

import classes.TableData;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class PrincipalGame extends Application{
	
	private AnchorPane root;
	private Label luser;
	
	private Label cluster;
	private Button complete_pedido;
	private int pedido;
	
	private Label loptions;
	
	private final List<TableData> list = Methods.getListValues();
	
	private final HBox frutas = Fruits.getFruits();
	private final HBox granos = Granos.getGranos();
	private final HBox vegetales = Vegetales.getVegetales();
	
	private ImageView background;
	
	public PrincipalGame(String user) {
		root = new AnchorPane();
		setPedido(1);
		
		complete_pedido = new Button("Completar Pedido");
		AnchorPane.setRightAnchor(complete_pedido, 10.0);
		AnchorPane.setBottomAnchor(complete_pedido, 10.0);
		
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
		
		create_table();
		create_pedido();
	}
	
	@Override
	public void start(Stage stage) {
		
		root.getChildren().addAll(luser, background, loptions, complete_pedido);
		
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
	
	@SuppressWarnings("unchecked")
	private void create_table() {
		try {
			TableView<TableData> tabla = new TableView<>();
			AnchorPane.setTopAnchor(tabla, 5.0);
			AnchorPane.setLeftAnchor(tabla, 630.0);
			
			tabla.setEditable(false);
			tabla.setPrefHeight(80.0);
			tabla.setPrefWidth(210.0);
			
			TableColumn<TableData, String> name = new TableColumn<>("Descripcion");
	        TableColumn<TableData, String> fecha = new TableColumn<>("Data");	     
	        
	        tabla.getColumns().addAll(name, fecha);
	        
	        name.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
	        fecha.setCellValueFactory(new PropertyValueFactory<>("data"));
	        
	        for(TableData data: list)
	        	tabla.getItems().add(data);
	        
	        root.getChildren().add(tabla);
		} catch(Exception e) {
			Logger.getLogger("Table").log(Level.SEVERE, null, e);
		}
	}
	
	private void create_pedido() {
		cluster = Methods.getPedido(String.valueOf(pedido));
		
		root.getChildren().add(cluster);
		AnchorPane.setLeftAnchor(cluster, 630.0);
		AnchorPane.setTopAnchor(cluster, 125.0);
	}
	
	private void setPedido(int pedido) {
		this.pedido = pedido;
	}
}
