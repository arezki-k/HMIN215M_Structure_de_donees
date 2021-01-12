package file_d_attente;

public class BouteilleEtiquetee <T> extends Bouteille {
	private int degreeAlccol;
	private String nomProducteur;
	private String Adresse;
	private String Descriptif;
	private int quantite;
	private T etiquette;
	/**
	 * @param degreeAlccol
	 * @param nomProducteur
	 * @param adresse
	 * @param descriptif
	 * @param quantite
	 * @param etiquette
	 */
	private BouteilleEtiquetee(int degreeAlccol, String nomProducteur,
			String adresse, String descriptif, int quantite, T etiquette) {
		super();
		this.degreeAlccol = degreeAlccol;
		this.nomProducteur = nomProducteur;
		Adresse = adresse;
		Descriptif = descriptif;
		this.quantite = quantite;
		this.etiquette = etiquette;
	}
	
	

	
	
	
	
	

}
