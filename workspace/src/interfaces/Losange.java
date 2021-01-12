package interfaces;

public class Losange implements Ilosange {

	private double cote;
	private double angle;
	
	
	public Losange(double cote, double angle){
		this.setCote(cote);
		this.setAngle(angle);	
	}

	@Override
	public double getCote() {
		// TODO Auto-generated method stub
		return this.cote;
	}

	@Override
	public void setCote(double cote) {
		// TODO Auto-generated method stub
		this.cote=cote;
		
	}

	@Override
	public double getAngle() {
		// TODO Auto-generated method stub
		return this.angle;
	}

	@Override
	public void setAngle(double a) {
		// TODO Auto-generated method stub
		this.angle=a;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cote = "+this.getCote()+"\nangle = "+this.getAngle()+"\naire=  "+this.aire()+"\nperimetre = "+this.perimetre();
	}
	

}
