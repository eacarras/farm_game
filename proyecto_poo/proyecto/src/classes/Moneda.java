package classes;

public class Moneda {
	
	private int valor_total;
	
	public Moneda(int valor) {
		this.valor_total = valor;
	}

	public int getValor_total() {
		return valor_total;
	}

	public void setValor_total(int valor_total) {
		this.valor_total = valor_total;
	}
	
	public void increase_value(int value) {
		this.valor_total = this.valor_total + value;
	}
}
