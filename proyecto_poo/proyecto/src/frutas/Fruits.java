package frutas;

import javafx.scene.layout.HBox;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Fruits {
	
	private static final String[] paths= {"file:src/frutas/durazno.png", "file:src/frutas/manzana.png",
			"file:src/frutas/naranja.jpg", "file:src/frutas/pera.jpg"};
	
	public static HBox getFruits() {
		HBox hfruits = new HBox();
		hfruits.setSpacing(10.0);
		
		for (String path: paths) {
			switch(path) {
				case "file:src/frutas/durazno.png":
					ImageView imagedurazno = new ImageView(new Image(path));
					imagedurazno.setFitWidth(70.0);
					imagedurazno.setFitHeight(70.0);
					hfruits.getChildren().add(imagedurazno);
					break;
				case "file:src/frutas/manzana.png":
					ImageView imagemanzana = new ImageView(new Image(path));
					imagemanzana.setFitWidth(70.0);
					imagemanzana.setFitHeight(70.0);
					hfruits.getChildren().add(imagemanzana);
					break;
				case "file:src/frutas/naranja.jpg":
					ImageView imagenaranja = new ImageView(new Image(path));
					imagenaranja.setFitWidth(70.0);
					imagenaranja.setFitHeight(70.0);
					hfruits.getChildren().add(imagenaranja);
					break;
				case "file:src/frutas/pera.jpg":
					ImageView imagepera = new ImageView(new Image(path));
					imagepera.setFitWidth(70.0);
					imagepera.setFitHeight(70.0);
					hfruits.getChildren().add(imagepera);
					break;
				default:
					break;
			}
		}
		
		return hfruits;
	}
	
}
