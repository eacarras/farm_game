package res;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.List;

import java.io.File;

import classes.F_V;
import classes.TableData;

public class Methods {
	
	private static final String path = "src/res/cultivos.txt";
	
	private static final String[] descripciones = {"Monedas", "Pedidos completados"};
	
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
	
	public static List<TableData> getListValues() {
		List<TableData> array = new ArrayList<>();
		for(String value: descripciones)
			array.add(new TableData(value, "0"));
		return array;
	}
}
