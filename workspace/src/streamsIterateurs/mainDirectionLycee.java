package streamsIterateurs;

public class mainDirectionLycee {
	public static void main(String[] args) {
		
	//EmployeLycee(nom,prenom,anneeRecrutement,categorie,corps,grade,echelon)
		
		EmployeLycee jeanne = 
				new EmployeLycee("Laforet","jeanne",40,2010,Categorie.A,
								"personnel de direction","classe normale",4);
		EmployeLycee amine = 
				new EmployeLycee("Sahraoui","Amine",50,1999,Categorie.A,
								"personnel de direction","hors classe",6);
		EmployeLycee max = 
				new EmployeLycee("Johnson","Max",37,2015,Categorie.B,
								"professeur","classe ordinaire",3);
		EmployeLycee luigi = 
				new EmployeLycee("Santiago","luigi",29,2018,Categorie.B,
								"agent administratif","classe ordinaire",2);
		EmployeLycee josette = 
				new EmployeLycee("Duchateau","Josette",55,2000,Categorie.A,
								"cadre administratif","classe exceptionelle",7);
		
		
		DirectionLycee directionLyceeSimoneVeil= new DirectionLycee();
		directionLyceeSimoneVeil.setProviseur(jeanne);
		directionLyceeSimoneVeil.setProviseurAdjoint(amine);
		directionLyceeSimoneVeil.setConseillerPrincipaldEducation(luigi);
		directionLyceeSimoneVeil.setGestionnaire(josette);
		directionLyceeSimoneVeil.setChefDeTravaux(max);
		
		System.out.println(directionLyceeSimoneVeil);
		
		System.out.println("age moyen ="+directionLyceeSimoneVeil.ageMoyen());
		
		System.out.println("recrutes apres 2010"+directionLyceeSimoneVeil.recruteApres(2010));		
		

		//System.out.println("noms des membres de la direction : ");
		//directionLyceeSimoneVeil.afficheNoms();		

		//System.out.println("noms des membres de la direction recrutes apres 2010 : ");
		//directionLyceeSimoneVeil.afficheNomsRecrutesApres(2010);
		
		

		
		// appeler les methodes ecrites avec l'iterateur
		System.out.println("**********************iterateurs****************************");
		System.out.println("age moyen avec iterator 1");
		System.out.println("age moyen ="+directionLyceeSimoneVeil.ageMoyenIterator());
		System.out.println("age moyen avec iterator 2");
		System.out.println("age moyen ="+directionLyceeSimoneVeil.ageMoyenIterator2());
		System.out.println("liste des employés recrutés après 2010 avec iterator");
		System.out.println("recrutes apres 2010"+directionLyceeSimoneVeil.recruteApresIterator(2010));	
		
		// appeler les methodes ecrites avec des streams
		System.out.println("**********************Streams****************************");
		System.out.println("age moyen ="+directionLyceeSimoneVeil.ageMoyenStream());
	
		System.out.println("recrutes apres 2010"+directionLyceeSimoneVeil.recruteApresStream(2010));
		System.out.println("liste des noms:");
		directionLyceeSimoneVeil.afficheNomsStream();	
		System.out.println("**************liste des noms:****************");
		directionLyceeSimoneVeil.afficheNomsRecrutesApres(2010);
		
		
		
		// appeler les méthodes de synthèse
	}
}
