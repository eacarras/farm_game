package classes;

public class F_V {
	
	private String name;
	private int time;
	private int pvp;
	
	public F_V(String name, int time, int pvp) {
		this.name = name;
		this.time = time;
		this.pvp = pvp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPvp() {
		return pvp;
	}

	public void setPvp(int pvp) {
		this.pvp = pvp;
	}
}
