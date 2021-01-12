package streamsIterateurs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DirectionLycee implements Iterable<EmployeLycee>{
	private EmployeLycee proviseur,
						proviseurAdjoint,
						conseillerPrincipaldEducation,
						gestionnaire,
						chefDeTravaux;

	public DirectionLycee() {
	}

	public EmployeLycee getProviseur() {
		return proviseur;
	}

	public void setProviseur(EmployeLycee proviseur) {
		this.proviseur = proviseur;
	}

	public EmployeLycee getProviseurAdjoint() {
		return proviseurAdjoint;
	}

	public void setProviseurAdjoint(EmployeLycee proviseurAdjoint) {
		this.proviseurAdjoint = proviseurAdjoint;
	}

	public EmployeLycee getConseillerPrincipaldEducation() {
		return conseillerPrincipaldEducation;
	}

	public void setConseillerPrincipaldEducation(EmployeLycee conseillerPrincipaldEducation) {
		this.conseillerPrincipaldEducation = conseillerPrincipaldEducation;
	}

	public EmployeLycee getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(EmployeLycee gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public EmployeLycee getChefDeTravaux() {
		return chefDeTravaux;
	}

	public void setChefDeTravaux(EmployeLycee chefDeTravaux) {
		this.chefDeTravaux = chefDeTravaux;
	}
	
	public String toString() {
		String res ="Direction du lycee "
				+"\nproviseur "+this.getProviseur()
				+"\nproviseur adjoint "+this.getProviseurAdjoint()	
				+"\ngestionnaire "+this.getGestionnaire()		
				+"\nCPE "+this.getConseillerPrincipaldEducation()	
				+"\nChef de travaux "+this.getChefDeTravaux();
		return res;
	}
	
	public int ageMoyen() {
		 return (this.getProviseur().getAge()+
				this.getProviseurAdjoint().getAge()+
				this.getConseillerPrincipaldEducation().getAge()+
				this.getGestionnaire().getAge()+
				this.getChefDeTravaux().getAge())/5;
		 
		 
		 
	}
	
	public ArrayList<EmployeLycee> recruteApres(int annee) {
		ArrayList<EmployeLycee> res = new ArrayList<>();
		 if (this.getProviseur().getAnneeRecrutement()>=annee)
			 res.add(this.getProviseur());
		 if (this.getProviseurAdjoint().getAnneeRecrutement()>=annee)
			 res.add(this.getProviseurAdjoint());
		 if (this.getConseillerPrincipaldEducation().getAnneeRecrutement()>=annee)
			 res.add(this.getConseillerPrincipaldEducation());		 
		 if (this.getGestionnaire().getAnneeRecrutement()>=annee)
			 res.add(this.getGestionnaire());
		 if (this.getChefDeTravaux().getAnneeRecrutement()>=annee)
			 res.add(this.getChefDeTravaux());
		return res;
	}
	
	public void afficheNoms() {
		System.out.println(
				"\n"+this.getProviseur().getNom()+" "
				+"\n"+this.getProviseurAdjoint().getNom()+" "
				+"\n"+this.getGestionnaire().getNom()+" "		
				+"\n"+this.getConseillerPrincipaldEducation().getNom()+" "	
				+"\n"+this.getChefDeTravaux().getNom()+" ");
	}
	
	public void afficheNomsRecrutesApres(int annee) {
		ArrayList<EmployeLycee> recrues = this.recruteApres(annee);
		for (EmployeLycee e : recrues)
				System.out.println(e.getNom()+" ");
	}

	@Override
	public Iterator<EmployeLycee> iterator() {
		// TODO Auto-generated method stub
		return new iterateurEmployeLycee(this);
	}
	
	//********* ITERATEUR ******************
	
	// Ecrire ageMoyen avec l'itérateur et for
	public int ageMoyenIterator() {
		int sommeAge = 0;
	for(EmployeLycee d:this) {
		sommeAge += d.getAge();
	}		
		return sommeAge/5;
	}
	public int ageMoyenIterator2() {
		int sommeAge = 0;
	Iterator<EmployeLycee> ite = this.iterator();
	while (ite.hasNext()) {
		sommeAge+= ite.next().getAge();
		
	}
	return sommeAge/5;
	
	
	}
	
	
	// Ecrire recruteApres avec for (quand l'iterateur existe)
	
	public ArrayList<EmployeLycee> recruteApresIterator(int annee){
		ArrayList<EmployeLycee> employeRectruteApres = new ArrayList<EmployeLycee>();
		for (EmployeLycee e:this) {
			
			if(e.getAnneeRecrutement()>=annee) {
				employeRectruteApres.add(e);
			}
		}
		
		return employeRectruteApres;
	}
//	public ArrayList<EmployeLycee> recruteApresIterator2(int annee){
//		ArrayList<EmployeLycee> employeRectruteApres = new ArrayList<EmployeLycee>();
//		Iterator<EmployeLycee> ite = this.iterator();
//		while(ite.hasNext()) {
//			if( ite.next().getAnneeRecrutement()>=annee){
//				EmployeLycee e = ite.
//				employeRectruteApres.add(e);
//				
//				
//			}
//					
//		}
//		return employeRectruteApres;
//		
//	}
//	
	
	
	// Ecrire afficheNoms avec for (quand l'iterateur existe)
//	public String afficheNomIterator() {
//		String res = "";
//		Iterator<EmployeLycee> 
//		while()
//		
//		return res;
//	}
	
	// Ecrire afficheNomsRecrutesApres avec for (quand l'iterateur existe)
	
	//********* STREAM ******************
	
	// Ecrire une methode retournant une liste contenant les membres de la direction
	public ArrayList<EmployeLycee> membres(){
		ArrayList<EmployeLycee> res = new ArrayList<EmployeLycee>();
		for(EmployeLycee e:this) {
			res.add(e);
		}
		return res;
	}
	
	// Cette liste est un support pour les exercices sur les streams
	
	// Ecrire ageMoyen avec un stream sur la liste precedente
	public double ageMoyenStream() {
	
		return this.membres()
				.stream()
				.mapToDouble(m -> m.getAge())
				.average()
				.getAsDouble();
	}
	
	// Ecrire recruteApres avec un stream
	public List<EmployeLycee> recruteApresStream(int annee){
		
		return this.membres()
				.stream()
				.filter(m -> m.getAnneeRecrutement()>=annee)
				.collect(Collectors.toList());
	}
	
	// Ecrire afficheNoms avec un stream
	public void afficheNomsStream() {
		this.membres()
		.stream()
		.map(m->m.getNom())
		.forEach(nom -> System.out.println(nom));
	}
	
	// Ecrire afficheNomsRecrutesApres avec un stream
	public void afficheNomREcrutesApresStream(int annee) {
		this.membres()
		.stream()
		.filter(m->m.getAnneeRecrutement()>=annee)
		.map(m->m.getNom())
		.forEach(nom->System.out.println(nom));
	}
	
	//********* SYNTHESE ******************
	
	// Ecrire une methode retournant l'age moyen 
	// des membres d'une certaine categorie recrutes
	// avant une certaine annee
	
	// version 1 : sans considerer l'iterateur (pas de for)
	// version 2 : en considérant l'iterateur (avec for)
	// version 3 : avec un stream
	
	//*********  ******************
	
	// Ecrire une methode retournant l'annee de recrutement
	// la plus ancienne pour les employes 
	// d'un certain corps
	
	// version 1 : sans considerer l'iterateur (pas de for)
	// version 2 : en considérant l'iterateur (avec for)
	// version 3 : avec un stream
	
}
