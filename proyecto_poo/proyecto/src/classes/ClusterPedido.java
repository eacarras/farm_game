package classes;

import java.util.List;

import javafx.scene.control.Label;

public class ClusterPedido {
	 
	private String numero_pedido;
	private List<String> pedidos;
	private String recompensa;
	
	public ClusterPedido(String numero_pedido, List<String> pedidos, String recompensa) {
		this.numero_pedido = numero_pedido;
		this.pedidos = pedidos;
		this.recompensa = recompensa;
	}
	
	public Label getCluster() {
		Label label = new Label();
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido numero: " + numero_pedido + "\n");
		for(String value: pedidos) {
			String[] split = value.split("/");
			int numero = (int) (Math.random() * 10);
			if(numero <= 5) numero = 5;
			else numero = 10;
			sb.append(String.valueOf(numero) + " " + split[1] + "\n");
			
		}
			
		sb.append("Recompensa: " + recompensa + "\n");
		
		label.setText(sb.toString());
		return label;
	}
}
