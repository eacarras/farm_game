package granos;

import javafx.scene.layout.HBox;

import classes.Parcela;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Granos {
	
	private static final String[] paths= {"file:src/granos/trigo.png"};
	
	private static ImageView imagetrigo;
	
	private static Parcela parcela;
	
	public Granos(Parcela parcela_grano) {
		parcela = parcela_grano;
	}
	
	public static HBox getGranos() {
		HBox hgranos = new HBox();
		hgranos.setSpacing(10.0);
		
		for (String path: paths) {
			switch(path) {
				case "file:src/granos/trigo.png":
					imagetrigo = new ImageView(new Image(path));
					imagetrigo.setFitHeight(70.0);
					imagetrigo.setFitWidth(70.0);
					hgranos.getChildren().add(imagetrigo);
					break;
				default:
					break;
			}
		}
		
		setButtonActions();
		
		return hgranos;
	}
	
	private static void setButtonActions() {
		imagetrigo.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando trigo");
			}else System.out.println("Parcela ocupada aun...");
		});
	}
}
