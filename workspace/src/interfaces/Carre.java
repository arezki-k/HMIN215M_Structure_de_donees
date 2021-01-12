package interfaces;

public class Carre implements Icarre{
	private double cote;
	
	public Carre(){
		
	}
	
	public Carre(double cote){
		this.setCote(cote);
		this.setAngle(angle);
	}

	@Override
	public double getLargeur() {
		// TODO Auto-generated method stubd
		return this.getCote();
	}

	@Override
	public void setLargeur(double l) {
		// TODO Auto-generated method stub
		this.setCote(l);
		
	}

	@Override
	public double getHauteur() {
		// TODO Auto-generated method stub
		return this.getCote();
	}

	@Override
	public void setHauteur(double h) {
		// TODO Auto-generated method stub
		this.setCote(h);
	}

	@Override
	public double getCote() {
		// TODO Auto-generated method stub
		return this.cote;
	}

	@Override
	public void setCote(double c) {
		// TODO Auto-generated method stub
		if(c>0){
			this.cote=c;
		}
		else{
			System.err.println("valeur négative");
		}
		
	}

	@Override
	public double getAngle() {
		// TODO Auto-generated method stub
		return angle;
	}
	@Override
	public void setAngle(double a) {
		// TODO Auto-generated method stub
		if (a == angle){
			
		}
		else{
		System.err.println("valeur unique de 90°, ne peut pas etre changé");
		}
		
	}


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cote = "+this.getCote()+"\nperimetre = "+this.perimetre()+"\naire = "+this.aire();
	}

	

	
}

	