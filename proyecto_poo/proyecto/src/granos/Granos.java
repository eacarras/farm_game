package granos;

import javafx.scene.layout.HBox;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Granos {
	
	private static final String[] paths= {"file:src/granos/trigo.png"};
	
	public static HBox getGranos() {
		HBox hgranos = new HBox();
		hgranos.setSpacing(10.0);
		
		for (String path: paths) {
			switch(path) {
				case "file:src/granos/trigo.png":
					ImageView imagetrigo = new ImageView(new Image(path));
					imagetrigo.setFitHeight(70.0);
					imagetrigo.setFitWidth(70.0);
					hgranos.getChildren().add(imagetrigo);
					break;
				default:
					break;
			}
		}
		
		return hgranos;
	}
}
