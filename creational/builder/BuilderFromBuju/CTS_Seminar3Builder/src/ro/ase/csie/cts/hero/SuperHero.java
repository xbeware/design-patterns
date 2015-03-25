package ro.ase.csie.cts.hero;

public class SuperHero {
	String name;
	Double noLifes;

	boolean hasRockets;
	boolean canFly;
	SpecialPowers powers;
	int age;

	public SuperHero(String name, double lifes) {
		this.name = name;
		this.noLifes = lifes;
	}

	public String getName() {
		return name;
	}

	public Double getNoLifes() {
		return noLifes;
	}

	public boolean isHasRockets() {
		return hasRockets;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public SpecialPowers getPowers() {
		return powers;
	}

	public int getAge() {
		return age;
	}
}

enum SpecialPowers {
	WEB, LASER, SPEED
}