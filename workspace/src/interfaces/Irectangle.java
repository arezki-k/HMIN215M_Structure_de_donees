package interfaces;

public interface Irectangle extends Iquadrilatere {
	double  angle = 90;
	double getLargeur();
	void setLargeur(double l);
	double getHauteur();
	void setHauteur(double h);
	
	default double perimetre(){
		return this.getLargeur()*2+this.getHauteur()*2;
		
	}
	default double aire(){
		return this.getHauteur()*this.getLargeur();
	}
	
	//egalité entre rectangle:
	default boolean egalite(Irectangle a){
		boolean egalite=false;
		if (this.getLargeur()==a.getLargeur() && this.getHauteur()==a.getHauteur())
		{
			egalite=true;
		}
		return egalite;
		//return (this.getLargeur()==a.getLargeur() && this.getHauteur()==a.getHauteur())
		// plus efficace
	}
	
	//exemple de méthode statique:
	static boolean egal(Irectangle a, Irectangle b){
		return a.egalite(b);
	}

	

}
