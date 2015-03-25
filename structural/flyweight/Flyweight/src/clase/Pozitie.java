package clase;

public class Pozitie {
	private int pozitieX;
	private int pozitieY;
	private int pozitieZ;	
	public Pozitie(int pozitieX, int pozitieY, int pozitieZ) {
		this.pozitieX = pozitieX;
		this.pozitieY = pozitieY;
		this.pozitieZ = pozitieZ;
	}

	public Pozitie() {
		this.pozitieX = 10;
		this.pozitieY = 10;
		this.pozitieZ = 10;
	}
	public int getPozitieX() {
		return pozitieX;
	}
	public void setPozitieX(int pozitieX) {
		this.pozitieX = pozitieX;
	}
	public int getPozitieY() {
		return pozitieY;
	}
	public void setPozitieY(int pozitieY) {
		this.pozitieY = pozitieY;
	}
	public int getPozitieZ() {
		return pozitieZ;
	}
	public void setPozitieZ(int pozitieZ) {
		this.pozitieZ = pozitieZ;
	}
	
	
}
