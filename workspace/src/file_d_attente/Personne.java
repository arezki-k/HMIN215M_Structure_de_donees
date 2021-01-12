package file_d_attente;

public class Personne implements estInvite{
	private String nom;
	private String prenom;
	private boolean invite = false;
	
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nom
	 * @param prenom
	 */
	
	public Personne(String nom, String prenom, Boolean invite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.invite = invite;
	}
	public void setInvite(boolean invite) {
		this.invite = invite;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

	@Override
	public boolean isInvite() {
		return invite;
		// TODO Auto-generated method stub
		
	}
	
	

}
