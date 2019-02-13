package vegetal;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.HBox;

public class Vegetales {

	private static final String[] paths= {"file:src/vegetal/brocoli.png", "file:src/vegetal/lechuga.png",
			"file:src/vegetal/pimiento.png", "file:src/vegetal/tomate.jpeg"};
	
	public static HBox getVegetales() {
		HBox hvegetales = new HBox();
		hvegetales.setSpacing(10.0);
		
		for (String path: paths) {
			switch(path) {
				case "file:src/vegetal/brocoli.png":
					ImageView imagebrocoli = new ImageView(new Image(path));
					imagebrocoli.setFitHeight(70.0);
					imagebrocoli.setFitWidth(70.0);
					hvegetales.getChildren().add(imagebrocoli);
					break;
				case "file:src/vegetal/lechuga.png":
					ImageView imagelechuga = new ImageView(new Image(path));
					imagelechuga.setFitHeight(70.0);
					imagelechuga.setFitWidth(70.0);
					hvegetales.getChildren().add(imagelechuga);
					break;
				case "file:src/vegetal/pimiento.png":
					ImageView imagepimiento = new ImageView(new Image(path));
					imagepimiento.setFitHeight(70.0);
					imagepimiento.setFitWidth(70.0);
					hvegetales.getChildren().add(imagepimiento);
					break;
				case "file:src/vegetal/tomate.jpeg":
					ImageView imagetomate = new ImageView(new Image(path));
					imagetomate.setFitHeight(70.0);
					imagetomate.setFitWidth(70.0);
					hvegetales.getChildren().add(imagetomate);
					break;
				default:
					break;
			}
		}
		
		return hvegetales;
	}
}
