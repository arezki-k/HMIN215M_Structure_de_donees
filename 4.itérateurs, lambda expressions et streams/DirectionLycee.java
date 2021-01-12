package arezki;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
	
	//avec for:
	public int ageMoyenIterator() {
		int sommeAge = 0;
	for(EmployeLycee d:this) {
		sommeAge += d.getAge();
	}		
		return sommeAge/5;
	}
	
	//avec it�rateur:
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

	
	
	// Ecrire afficheNoms avec for (quand l'iterateur existe)
	public void afficheNomIterator() {
		String res = "";
		for (EmployeLycee e:this) {
			res+="\n"+e.getNom();
			
		}
		System.out.println(res);
	}
	
	// Ecrire afficheNomsRecrutesApres avec for (quand l'iterateur existe)
	public void afficheNomsRecrutesApresFor(int annee){
		String res = "";
		for(EmployeLycee e :this) {
			if(e.getAnneeRecrutement()>=annee) {
				res += "\n"+e.getNom();
			}
		}
		System.out.println(res);
	}
	
	
	
	//********* STREAM ******************
	
	// Ecrire une methode retournant une liste contenant les membres de la direction
	// Cette liste est un support pour les exercices sur les streams
	public ArrayList<EmployeLycee> membres(){
		ArrayList<EmployeLycee> res = new ArrayList<EmployeLycee>();
		for(EmployeLycee e:this) {
			res.add(e);
		}
		return res;
	}
	
	
	
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
	
	//MH j'aime bien la solution avec le filtre, c'est une très bonne idée
	//mais par contre on peut faire les tests plus simplement (voir plus bas)
	
	public double ageMoyenCategorieRecruteAvant(Categorie cat, int annee) {
		double age=0;
		ArrayList<EmployeLycee> filtre = new ArrayList<EmployeLycee>();
		if(Categorie.A == cat) {
			if (this.getProviseur().getAnneeRecrutement()<=annee && this.getProviseur().getCategorie()==Categorie.A) {
				filtre.add(this.getProviseur());
			}
			if (this.getProviseurAdjoint().getAnneeRecrutement()<=annee && this.getProviseurAdjoint().getCategorie()==Categorie.A) {
				filtre.add(this.getProviseurAdjoint());	
			}
			if (this.getGestionnaire().getAnneeRecrutement()<=annee && this.getGestionnaire().getCategorie()==Categorie.A) {
				filtre.add(this.getGestionnaire());
				
			}
			if(this.getConseillerPrincipaldEducation().getAnneeRecrutement()<=annee && this.getConseillerPrincipaldEducation().getCategorie()==Categorie.A) {
				filtre.add(this.getConseillerPrincipaldEducation());
			}
			if (this.getChefDeTravaux().getAnneeRecrutement()<=annee && this.getChefDeTravaux().getCategorie()==Categorie.A) {
				filtre.add(this.getChefDeTravaux());
			}
			for (EmployeLycee e:filtre) {
				age+=e.getAge();
			}
			return age/filtre.size();
			
		}
		else if (cat == Categorie.B) {
			if (this.getProviseur().getAnneeRecrutement()<=annee && this.getProviseur().getCategorie()==Categorie.B) {
				filtre.add(this.getProviseur());
			}
			if (this.getProviseurAdjoint().getAnneeRecrutement()<=annee && this.getProviseurAdjoint().getCategorie()==Categorie.B) {
				filtre.add(this.getProviseurAdjoint());	
			}
			if (this.getGestionnaire().getAnneeRecrutement()<=annee && this.getGestionnaire().getCategorie()==Categorie.B) {
				filtre.add(this.getGestionnaire());
				
			}
			if(this.getConseillerPrincipaldEducation().getAnneeRecrutement()<=annee && this.getConseillerPrincipaldEducation().getCategorie()==Categorie.B) {
				filtre.add(this.getConseillerPrincipaldEducation());
			}
			if (this.getChefDeTravaux().getAnneeRecrutement()<=annee && this.getChefDeTravaux().getCategorie()==Categorie.B) {
				filtre.add(this.getChefDeTravaux());
			}
			for (EmployeLycee e:filtre) {
				age+=e.getAge();
			}
			return age/filtre.size();
		}
		else {
			if (this.getProviseur().getAnneeRecrutement()<=annee && this.getProviseur().getCategorie()==Categorie.C) {
				filtre.add(this.getProviseur());
			}
			if (this.getProviseurAdjoint().getAnneeRecrutement()<=annee && this.getProviseurAdjoint().getCategorie()==Categorie.C) {
				filtre.add(this.getProviseurAdjoint());	
			}
			if (this.getGestionnaire().getAnneeRecrutement()<=annee && this.getGestionnaire().getCategorie()==Categorie.C) {
				filtre.add(this.getGestionnaire());
				
			}
			if(this.getConseillerPrincipaldEducation().getAnneeRecrutement()<=annee && this.getConseillerPrincipaldEducation().getCategorie()==Categorie.C) {
				filtre.add(this.getConseillerPrincipaldEducation());
			}
			if (this.getChefDeTravaux().getAnneeRecrutement()<=annee && this.getChefDeTravaux().getCategorie()==Categorie.C) {
				filtre.add(this.getChefDeTravaux());
			}
			for (EmployeLycee e:filtre) {
				age+=e.getAge();
			}
			return age/filtre.size();
		}
	}
	
	//MH autre exemple de solution (empruntée à Saadi)
	
	public int ageMoyenCategorieAnnee1(Categorie c, int annee) {
		int age=0, compteur=0;
		if(this.getProviseur().getCategorie().equals(c) && this.getProviseur().getAnneeRecrutement()<=annee) {
			age += this.getProviseur().getAge();
			compteur++;
		}
		if(this.getProviseurAdjoint().getCategorie().equals(c) && this.getProviseurAdjoint().getAnneeRecrutement()<=annee) {
			age += this.getProviseurAdjoint().getAge();
			compteur++;
		}
		if(this.getConseillerPrincipaldEducation().getCategorie().equals(c) && this.getConseillerPrincipaldEducation().getAnneeRecrutement()<=annee) {
			age += this.getConseillerPrincipaldEducation().getAge();
			compteur++;
		}
		if(this.getGestionnaire().getCategorie().equals(c) && this.getGestionnaire().getAnneeRecrutement()<=annee) {
			age += this.getGestionnaire().getAge();
			compteur++;
		}
		if(this.getChefDeTravaux().getCategorie().equals(c) && this.getChefDeTravaux().getAnneeRecrutement()<=annee) {
			age += this.getChefDeTravaux().getAge();
			compteur++;
		}
		
		if(compteur != 0)
			return age/compteur;
		else return -1;	
	}
	
	// version 2 : en considérant l'iterateur (avec for)
	public double ageMoyenCategorieRecruteAvantFor(Categorie cat, int annee) {
		double age = 0;
		ArrayList<EmployeLycee>res = new ArrayList<EmployeLycee>();
		for (EmployeLycee e : this) {
			if(e.getAnneeRecrutement()<=annee && e.getCategorie()==cat) {
				res.add(e);
			}
		}
		for (EmployeLycee e :res) {
			age+=e.getAge();
		}

		return age/res.size(); // attention à la division possible par zéro si res est vide
	}
	
	//MH vous pouvez le faire en une seule itération, par exemple :
	
	public double ageMoyenCategorieIte(Categorie cat, int annee)
	{
		int sommeAge = 0; int nb =0;
		for (EmployeLycee e : this)
			if (e.getAnneeRecrutement() <= annee 
					&& e.getCategorie().equals(cat)) 
				// nota : pour les enum on peut utiliser == ou equals
				{sommeAge += e.getAge();nb++;}
		if (nb > 0)
			return sommeAge/nb;
		else return 0;
	}
	
	// version 3 : avec un stream
	public double ageMoyenCategorieRecruteAvantStream(Categorie cat, int annee) {
		return membres()
				.stream()
				// on pourrait faire un seule filtre
				// avec une condition complexe mais votre solution est très bien
				.filter(m->m.getAnneeRecrutement()<annee) //MH <= plutôt ?
				.filter(m->m.getCategorie()==cat)
				.mapToDouble(m->m.getAge())
				.average()
				.getAsDouble();
	}
	//*********  ******************
	
	// Ecrire une methode retournant l'annee de recrutement
	// la plus ancienne pour les employes 
	// d'un certain corps
	
	// version 1 : sans considerer l'iterateur (pas de for)
	public double PlusAncienneAnneeCorps(String corps) {
		double annee = 0;
		ArrayList<EmployeLycee> res = new ArrayList<EmployeLycee>();
		ArrayList<EmployeLycee> filtre = new ArrayList<EmployeLycee>();
		// MH bonne idée de se ramener à une liste
		// puisque finalement, c'est ce que permettra l'itérateur
		res.add(this.getProviseur());
		res.add(this.getProviseurAdjoint());
		res.add(this.getGestionnaire());
		res.add(this.getConseillerPrincipaldEducation());
		res.add(this.getChefDeTravaux());
		for (EmployeLycee e : res) {
			if (e.getCorps()==corps) { //MH Attention !!!! .equals pour les String
				filtre.add(e);	
				annee = e.getAnneeRecrutement();
				for (EmployeLycee employe : filtre) { 
					//MH ok mais on peut faire en une seule itération
					if (employe.getAnneeRecrutement()<annee){
						annee = employe.getAnneeRecrutement();
					}
				}
			}
			
		}
		
		return annee;
	}
	
	// MH autre solution avec une seule itération (voir plus bas avec l'itérateur)
	
	
	// version 2 : en considérant l'iterateur (avec for)
	public double PlusAncienneAnneeCorpsFor(String corps) {
		double annee = 0;
		ArrayList<EmployeLycee> res = new ArrayList<EmployeLycee>();
		for (EmployeLycee e : this) {
			if (e.getCorps()==corps) { // MH .equals()
				res.add(e);	
				annee = e.getAnneeRecrutement();
				for (EmployeLycee etu : res) { // meme remarque on peut faire un seul for
					// voir plus bas
					if (etu.getAnneeRecrutement()<annee){
						annee = etu.getAnneeRecrutement();
					}
				}
			}
			
		}
		return annee;
	}
	
	//MH variante proposée
		public int anneeRecrutementPlusAnciennePourCorpsIterateur(String corps)
		{
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			int dateMin = calendar.get(Calendar.YEAR);
			for (EmployeLycee e : this)
			{
				 if (e.getCorps().equals(corps) && (e.getAnneeRecrutement() < dateMin))
					 dateMin=e.getAnneeRecrutement();
			}
			return dateMin;
		}
		
	
	// version 3 : avec un stream
	public double PlusAncienneAnneeCorpsStream(String corps) {
		return membres()
				.stream()
				.filter(m->m.getCorps()==corps)
				.mapToDouble(m->m.getAnneeRecrutement())
				.min().getAsDouble();			
	}
}
