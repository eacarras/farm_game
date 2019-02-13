package classes;

public class Parcela {
	
	private boolean ocupado;
	
	public Parcela() {
		this.ocupado = false;
	}
	
	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
