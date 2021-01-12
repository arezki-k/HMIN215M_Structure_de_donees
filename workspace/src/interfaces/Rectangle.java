package interfaces;

public class Rectangle implements Irectangle {
	double largeur;
	double hauteur;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double largeur, double hauteur) {
		this.setLargeur(largeur);
		this.setHauteur(hauteur);
	}



	@Override
	public double getLargeur() {
		// TODO Auto-generated method stub
		return this.largeur;
	}

	@Override
	public void setLargeur(double l) {
		// TODO Auto-generated method stub
		if(l>0){
			this.largeur=l;
		}
		else{
			System.err.println("valeur doit etre positive");
		}
		
	}

	@Override
	public double getHauteur() {
		// TODO Auto-generated method stub
		return this.hauteur;
	}

	@Override
	public void setHauteur(double h) {
		// TODO Auto-generated method stub
		if (h>0){
		this.hauteur=h;}
		else{
			System.err.println("valeur doit etre positive");
		}
		
	}
	public String toString(){
		return "largeur:"+this.getLargeur()+"\nHauteur: "+this.getHauteur()+"\naire: "+this.aire()+"\nperimetre: "+this.perimetre();
	}

}
