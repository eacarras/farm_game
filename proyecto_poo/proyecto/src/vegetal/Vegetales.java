package vegetal;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import classes.Parcela;

import javafx.scene.layout.HBox;

public class Vegetales {

	private static final String[] paths= {"file:src/vegetal/brocoli.png", "file:src/vegetal/lechuga.png",
			"file:src/vegetal/pimiento.png", "file:src/vegetal/tomate.jpeg"};
	
	private static ImageView imagebrocoli;
	private static ImageView imagelechuga;
	private static ImageView imagepimiento;
	private static ImageView imagetomate;
	
	private static Parcela parcela;
	
	public Vegetales(Parcela parcela_vegetal) {
		parcela = parcela_vegetal;
	}
	
	public static HBox getVegetales() {
		HBox hvegetales = new HBox();
		hvegetales.setSpacing(10.0);
		
		for (String path: paths) {
			switch(path) {
				case "file:src/vegetal/brocoli.png":
					imagebrocoli = new ImageView(new Image(path));
					imagebrocoli.setFitHeight(70.0);
					imagebrocoli.setFitWidth(70.0);
					hvegetales.getChildren().add(imagebrocoli);
					break;
				case "file:src/vegetal/lechuga.png":
					imagelechuga = new ImageView(new Image(path));
					imagelechuga.setFitHeight(70.0);
					imagelechuga.setFitWidth(70.0);
					hvegetales.getChildren().add(imagelechuga);
					break;
				case "file:src/vegetal/pimiento.png":
					imagepimiento = new ImageView(new Image(path));
					imagepimiento.setFitHeight(70.0);
					imagepimiento.setFitWidth(70.0);
					hvegetales.getChildren().add(imagepimiento);
					break;
				case "file:src/vegetal/tomate.jpeg":
					imagetomate = new ImageView(new Image(path));
					imagetomate.setFitHeight(70.0);
					imagetomate.setFitWidth(70.0);
					hvegetales.getChildren().add(imagetomate);
					break;
				default:
					break;
			}
		}
		
		setButtonActions();
		
		return hvegetales;
	}
	
	private static void setButtonActions() {
		imagebrocoli.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando brocoli");
			}else System.out.println("Parcela ocupada aun...");
		});
		
		imagelechuga.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando lechuga");
			}else System.out.println("Parcela ocupada aun...");
		});
		
		imagepimiento.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando pimiento");
			}else System.out.println("Parcela ocupada aun...");
		});
		
		imagetomate.setOnMouseClicked(e -> {
			if(!parcela.isOcupado() || !parcela.isAvalible()) {
				parcela.setOcupado(true);
				System.out.println("Ingresando tomate");
			}else System.out.println("Parcela ocupada aun...");
		});
	}
}
