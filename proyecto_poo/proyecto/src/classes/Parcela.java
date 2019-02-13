package classes;

public class Parcela {
	
	private boolean ocupado;
	private boolean avalible;
	private boolean cosechar;

	public Parcela() {
		this.ocupado = false;
		this.avalible = true;
	}
	
	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	public boolean isAvalible() {
		return avalible;
	}

	public void setAvalible(boolean avalible) {
		this.avalible = avalible;
	}
	
	public boolean isCosechar() {
		return cosechar;
	}

	public void setCosechar(boolean cosechar) {
		this.cosechar = cosechar;
	}
}
