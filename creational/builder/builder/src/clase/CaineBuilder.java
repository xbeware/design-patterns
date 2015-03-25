package clase;

import interfete.ICaineBuilder;

public class CaineBuilder  implements ICaineBuilder{

	
	public String nume;
	public int varsta;
	public int greutate;
	public String culoare;
	public int inaltime;
	
	public CaineBuilder Culoare(String _culoare){
	culoare=_culoare;
	return this;
		
	}
	
	public CaineBuilder Inaltime(int _inaltime){
    inaltime=_inaltime;
	return this;
		
	}
	
	public CaineBuilder Nume(String _nume){
	    nume=_nume;
		return this;
			
		}
	
	public CaineBuilder Varsta(int _varsta){
	    varsta=_varsta;
		return this;
			
		}
	
	public CaineBuilder Greutate(int _greutate){
	    greutate=_greutate;
		return this;
			
		}
	
	@Override
	public Caine build() {
		// TODO Auto-generated method stub
		return new Caine(nume,varsta,greutate,culoare,inaltime);
	}

}
