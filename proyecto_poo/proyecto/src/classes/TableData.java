package classes;

public class TableData {
	
	private String descripcion;
	private String data;
	
	public TableData(String descripcion, String data) {
		this.descripcion = descripcion;
		this.data = data;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
