package ro.ase.csie.cts.hero;

public class HeroBuilder {
	private SuperHero hero = null;

	public HeroBuilder(String name, double lifes) {
		this.hero = new SuperHero(name, lifes);
	}

	public HeroBuilder setAbleToFly() {
		this.hero.canFly = true;
		return this;
	}

	public HeroBuilder hasRockets() {
		this.hero.hasRockets = true;
		return this;
	}

	public HeroBuilder setAge(int age) {
		this.hero.age = age;
		return this;
	}
	
	public HeroBuilder setSpecialPower(SpecialPowers power) {
		this.hero.powers = power;
		return this;
	}
	
	public SuperHero build() {
		return this.hero;
	}
}
