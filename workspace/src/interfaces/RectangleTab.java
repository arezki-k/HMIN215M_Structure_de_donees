package interfaces;

public class RectangleTab implements Irectangle {
	private double t[] = new double [2];
	
	public RectangleTab() {
		// TODO Auto-generated constructor stub
	}
	public RectangleTab(double l, double h){
		this.setLargeur(l);
		this.setHauteur(h);
	}
	

	@Override
	public double getLargeur() {
		// TODO Auto-generated method stub
		return this.t[0];
	}

	@Override
	public void setLargeur(double l) {
		// TODO Auto-generated method stub
		if (l>0){
			this.t[0] = l;
		}
		else{
			System.err.println("valeur doit etre positive");
		}
		
	}

	@Override
	public double getHauteur() {
		// TODO Auto-generated method stub
		return this.t[1];
	}

	@Override
	public void setHauteur(double h) {
		// TODO Auto-generated method stub
		if(h>0){
			this.t[1]=h;
		}
		else{
			System.err.println("valeur doit etre positive");
		}
		
	}
	public String toString(){
		return "largeur:"+this.getLargeur()+"\nHauteur: "+this.getHauteur()+"\naire: "+this.aire()+"\nperimetre: "+this.perimetre();
	}
}
