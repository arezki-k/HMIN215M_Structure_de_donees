package genericite_bornee;

public class Produit implements ObjetAvecEtiquette<String>{
	
	private String etiquette;
	
	
	public Produit(String etiquette) {
		this.etiquette=etiquette;
	}
	
	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}
	
	public String getEtiquette() {
		return etiquette;
	}
	
	

	

	@Override
	public String Etiquette() {
		// TODO Auto-generated method stub
		return "Etiquette: "+this.getEtiquette();
	}

}
