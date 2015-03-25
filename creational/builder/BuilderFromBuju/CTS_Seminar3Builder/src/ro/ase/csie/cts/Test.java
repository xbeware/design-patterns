package ro.ase.csie.cts;

import ro.ase.csie.cts.hero.HeroBuilder;
import ro.ase.csie.cts.hero.SuperHero;

public class Test {
	public static void main(String[] args) {
		SuperHero hero1 = new HeroBuilder("Super man", 100).setAge(23).setAbleToFly().build();
	}

}
