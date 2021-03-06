package exempluTemplate;

public abstract class Testare {
	
	//pasii din template
	public abstract void definesteUnitateTestare();
	public abstract void definesteDateIntrare();
	public abstract void definesteRezultate();
	public abstract void ruleazaUnitate();
	public abstract void afisareRezultatTest();
	
	//functie template
	public void testeaza(){
		definesteUnitateTestare();
		definesteDateIntrare();
		definesteRezultate();
		ruleazaUnitate();
		afisareRezultatTest();
	}
}
