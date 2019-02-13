package res;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.List;

import java.io.File;

import javafx.scene.control.Label;

import classes.F_V;
import classes.TableData;
import classes.ClusterPedido;

public class Methods {
	
	private static final HashMap<String, HashMap<String, String>> map = getMapWithPvp();
	
	private static final String path = "src/res/cultivos.txt";
	
	private static final String[] descripciones = {"Monedas", "Pedidos completados"};
	
	private static final String[] fruits_vegetal_cereal = {"frutas", "vegetales", "granos"};
	private static final String[] fruits = {"durazno","manzana","naranja", "pera"};
	private static final String[] vegetal = {"brocoli", "lechuga", "pimiento", "tomate"};
	
	public static HashMap<String, List<F_V>> getMap() {
		HashMap<String, List<F_V>> map = new HashMap<>();
		List<F_V> frutas = new ArrayList<>();
		List<F_V> vegetales = new ArrayList<>();
		List<F_V> grano = new ArrayList<>();
		
		File file = new File(path);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				String[] sp = scanner.nextLine().split("/");
				if(sp[0].equals("fruta")) frutas.add(new F_V(sp[1], Integer.parseInt(sp[2]),
						Integer.parseInt(sp[3])));
				else if(sp[0].equals("vegetal")) vegetales.add(new F_V(sp[1], Integer.parseInt(sp[2]),
						Integer.parseInt(sp[3])));
				else grano.add(new F_V(sp[1], Integer.parseInt(sp[2]),
						Integer.parseInt(sp[3])));
            }
			
			map.put("frutas", frutas);
			map.put("vegetales", vegetales);
			map.put("granos", grano);
		} catch(Exception e) {
			Logger.getLogger("Methods").log(Level.SEVERE, null, e);
		}
		
		return map;
	}
	
	public static HashMap<String, HashMap<String, String>> getMapWithPvp() {
		HashMap<String, HashMap<String, String>> map = new HashMap<>();
		HashMap<String, String> frutas = new HashMap<>();
		HashMap<String, String> vegetales = new HashMap<>();
		HashMap<String, String> grano = new HashMap<>();
		
		File file = new File(path);
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				String[] sp = scanner.nextLine().split("/");
				if(sp[0].equals("fruta")) frutas.put(sp[1], sp[3]);
				else if(sp[0].equals("vegetal")) vegetales.put(sp[1], sp[3]);
				else grano.put(sp[1], sp[3]);
            }
			
			map.put("frutas", frutas);
			map.put("vegetales", vegetales);
			map.put("granos", grano);
		} catch(Exception e) {
			Logger.getLogger("Methods").log(Level.SEVERE, null, e);
		}
		
		return map;
	}
	
	public static List<TableData> getListValues() {
		List<TableData> array = new ArrayList<>();
		for(String value: descripciones)
			if(value.equals("Monedas")) array.add(new TableData(value, "50"));
			else array.add(new TableData(value, "0"));
		return array;
	}
	
	public static List<Label> getPedido(String numero_pedido) {
		int numero_fruta;
		int specific_number;
		int recompensa_total = 0;
		List<String> list = new ArrayList<>();
		
		List<Label> labels = new ArrayList<>();

		for(int i = 0; i < Values.MAX_LENGTH; i ++) {
			numero_fruta = (int) (Math.random() * 2);
			switch(fruits_vegetal_cereal[numero_fruta]) {
				case "frutas":
					specific_number = (int) (Math.random() * 3);
					recompensa_total = recompensa_total + Integer.valueOf(map.get("frutas").get(fruits[specific_number]));
					list.add(fruits_vegetal_cereal[numero_fruta] + "/" + fruits[specific_number]);
					break;
				case "vegetales":
					specific_number = (int) (Math.random() * 3);
					recompensa_total = recompensa_total + Integer.valueOf(map.get("vegetales").get(vegetal[specific_number]));
					list.add(fruits_vegetal_cereal[numero_fruta] + "/" + vegetal[specific_number]);
					break;
				case "granos":
					list.add(fruits_vegetal_cereal[numero_fruta] + "/" + "trigo");
					break;
			}
		}
		
		ClusterPedido cluster = new ClusterPedido(numero_pedido, list, String.valueOf(recompensa_total));
		labels.add(cluster.getCluster());
		labels.add(new Label(String.valueOf(recompensa_total)));
		
		return labels;
	}
}
