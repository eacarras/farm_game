package windows;

import res.Values;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.paint.Color;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HomeActivity extends Application{
	
	private AnchorPane root;
	private Label ltitle;
	private ImageView background;
	
	private HBox hbuttons;
	private Button bnew;
	private Button bexit;
	
	private HBox huser;
	private Label luser;
	private TextField user;
	
	private Label lerror;
	
	private void Home() {
		root = new AnchorPane();
		
		background = new ImageView(new Image("file:src/res/fondo_login.jpeg"));
		root.getChildren().add(background);
		
		ltitle = new Label(Values.PRINCIPAL_TITLE);
		AnchorPane.setRightAnchor(ltitle, 10.0);
		AnchorPane.setTopAnchor(ltitle, 10.0);
		
		huser = new HBox();
		luser = new Label("Ingrese su nombre:");
		user = new TextField();
		
		lerror = new Label(Values.MESSAGE_ERROR_LOGIN);
		lerror.setTextFill(Color.RED);
		lerror.setVisible(false);
		AnchorPane.setRightAnchor(lerror, 20.0);
		AnchorPane.setTopAnchor(lerror, 80.0);
		
		hbuttons = new HBox();
		bnew = new Button("Nuevo Juego");
		bexit = new Button("Salir");
		manage_hbox();
	}
	
	private void configure_buttons(Stage stage) {
		bnew.setOnAction(e -> validate_game(stage));
		
		bexit.setOnAction(e -> stage.close());
	}
	
	@Override
	public void start(Stage stage) {
		Home();
		configure_buttons(stage);
		
		root.getChildren().addAll(lerror, ltitle);
		
		Scene scene = new Scene(root, Values.WIDTH_LOGIN, Values.HEIGTH_LOGIN);
		stage.setScene(scene);
		stage.setTitle(Values.TITLE_LOGIN);
		stage.setResizable(false);
		stage.centerOnScreen();
		stage.show();
	}
	
	private void manage_hbox() {
		hbuttons.getChildren().addAll(bnew, bexit);
		hbuttons.setSpacing(Values.SPACING_BUTTON_LOGIN);
		
		huser.getChildren().addAll(luser, user);
		huser.setSpacing(Values.SPACING_INFO_LOGIN);
		
		root.getChildren().addAll(hbuttons, huser);
		AnchorPane.setRightAnchor(hbuttons, 40.0);
		AnchorPane.setBottomAnchor(hbuttons, 40.0);
		
		AnchorPane.setRightAnchor(huser, 30.0);
		AnchorPane.setTopAnchor(huser, 40.0);
	}
	
	private void validate_game(Stage stage) {
		if(user.getText().isEmpty()) lerror.setVisible(true);
		else {
			PrincipalGame game = new PrincipalGame(user.getText());
			game.start(stage);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
