package clase;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Angajat a=new Angajat("Operator", 700);
		Originator o=new Originator();
		CareTaker ct=new CareTaker();
		ct.adaugaMemento(o.saveToMemento(a));
		System.out.println(a.toString());
		a.setFunctie("Ajutor Programator");
		ct.adaugaMemento(o.saveToMemento(a));
		a.setSalariu(4000);
		ct.adaugaMemento(o.saveToMemento(a));
		System.out.println(a.toString());
		Angajat altul=ct.getMemento(1).getAngajat();
		System.out.println(altul.toString());

		 altul=ct.getMemento(1).getAngajat();
		System.out.println(altul.toString());

		 altul=ct.getMemento(2).getAngajat();
		System.out.println(altul.toString());

	}

}
