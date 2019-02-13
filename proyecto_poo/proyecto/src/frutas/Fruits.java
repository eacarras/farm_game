package frutas;
// servicio
import javafx.scene.layout.HBox;

import classes.Parcela;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Fruits {
	
	private static final String[] paths= {"file:src/frutas/durazno.png", "file:src/frutas/manzana.png",
			"file:src/frutas/naranja.jpg", "file:src/frutas/pera.png"};
	
	private static ImageView imagedurazno;
	private static ImageView imagemanzana;
	private static ImageView imagenaranja;
	private static ImageView imagepera;
	
	private static Parcela parcela;
	
	public Fruits(Parcela parcela_fruta) {
		parcela = parcela_fruta;
	}
	
	public static HBox getFruits() {
		HBox hfruits = new HBox();
		hfruits.setSpacing(10.0);
		
		for (String path: paths) {
			switch(path) {
				case "file:src/frutas/durazno.png":
					imagedurazno = new ImageView(new Image(path));
					imagedurazno.setFitWidth(70.0);
					imagedurazno.setFitHeight(70.0);
					hfruits.getChildren().add(imagedurazno);
					break;
				case "file:src/frutas/manzana.png":
					imagemanzana = new ImageView(new Image(path));
					imagemanzana.setFitWidth(70.0);
					imagemanzana.setFitHeight(70.0);
					hfruits.getChildren().add(imagemanzana);
					break;
				case "file:src/frutas/naranja.jpg":
					imagenaranja = new ImageView(new Image(path));
					imagenaranja.setFitWidth(70.0);
					imagenaranja.setFitHeight(70.0);
					hfruits.getChildren().add(imagenaranja);
					break;
				case "file:src/frutas/pera.png":
					imagepera = new ImageView(new Image(path));
					imagepera.setFitWidth(70.0);
					imagepera.setFitHeight(70.0);
					hfruits.getChildren().add(imagepera);
					break;
				default:
					break;
			}
		}
		
		setButtonAction();
		
		return hfruits;
	}
	
	private static void setButtonAction() {
		imagedurazno.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando durazno");
			}else System.out.println("Parcela ocupada aun...");
		});
		
		imagemanzana.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando manzana");
			}else System.out.println("Parcela ocupada aun...");
		});
		
		imagenaranja.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando naranja");
			}else System.out.println("Parcela ocupada aun...");
		});
		
		imagepera.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando pera");
			}else System.out.println("Parcela ocupada aun...");
		});
	}
}
