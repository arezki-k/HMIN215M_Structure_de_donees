package file_d_attente;

import interfaces.*;

import java.io.IOException;
import java.util.Date;

public class MainFileD_Attente {
	public static void main(String[] args) throws  IOException {
		
		
	Personne jacob = new Personne("jacob", "Smith", true);
	Personne adam = new Personne("adam", "bryan",true);
	Personne Ozzy = new Personne("Ozzy", "oseborne",true);
	Personne Kurt = new Personne("Kobein", "kurt",true);
	
	
	FileAttente<Personne> filePersonne = new FileAttente<Personne>();
	filePersonne.entre(jacob);
	filePersonne.entre(adam);
	filePersonne.entre(Ozzy);
	
	FileAttente<Personne> filePersonne2 = new FileAttente<Personne>();
	filePersonne2.entre(jacob);
	filePersonne2.entre(adam);
	filePersonne2.entre(Kurt);
	filePersonne2.entre(Ozzy);
	

	
	System.out.println(filePersonne);
	//FileAttente<Rectangle> fileRectangle = new FileAttente<Rectangle>();
	Rectangle r1 = new Rectangle(5, 6);
	Rectangle r2 = new Rectangle();
	Rectangle r3 = new Rectangle();
//	
//	fileRectangle.entre(r1);
//	fileRectangle.entre(r2);
//	fileRectangle.entre(r3);
//	
//	System.out.println(fileRectangle.estVide());
//	System.out.println(filePersonne.nbElements());
//	System.out.println(fileRectangle.nbElements());
	//System.out.println(fileRectangle.sort());
	System.out.println(filePersonne2.nbElements());
	System.out.println(filePersonne.MemeObjetNonStatic(filePersonne2));
	//System.out.println();
	System.out.println(FileAttente.MemeObjet(filePersonne, filePersonne));
	//System.out.println(filePersonne.MemeTaille(fileRectangle));

	FileAttente<Personne> filePersonne3 = new FileAttente<Personne>();
	filePersonne3.entre(Kurt);
	//FileAttente<Rectangle> fileRectangle2 = new FileAttente<Rectangle>();
	//fileRectangle2.entre(r1);
	System.out.println(FileAttente.getNbElementsEntreesTotal());
	
	PaireEtiquetee<String, FileAttente<Personne>, String> paire1 = new PaireEtiquetee<String, FileAttente<Personne>, String>("file1",filePersonne,"je veux savoir");
	PaireEtiquetee<Integer, FileAttente<Personne>,Integer> paire2 = new PaireEtiquetee<Integer, FileAttente<Personne>,Integer >(1,filePersonne,1);
	
	
	EntreeAgenda<Date, String> entree1 = new EntreeAgenda<Date, String>(new Date(), ("Slipknot"));
	System.out.println(entree1);

	
	PaireHomogene<FileAttente<Personne>> PH1 = new PaireHomogene<FileAttente<Personne>>(filePersonne,filePersonne2);

	PaireEtiquetee<String, FileAttente<Personne>, Date> paire4 = new PaireEtiquetee<String, FileAttente<Personne>, Date>
	("paire4",filePersonne2,new Date());
	System.out.println(paire1);
	
	PaireEtiquetee<Rectangle,Icarre,String> pairecarre = new PaireEtiquetee<Rectangle, Icarre, String>(r3, new Carre(5), "care et rectangle");
	
	
//	Question 4:
//	FileAttente<Personne> Fp = new FileAttente<Adulte>();
//	FileAttente<Adulte> fa = new FileAttente<Personne>()
	//
	
	//Quesiton 5:
	FileAttente<Enfant> f1 = new FileAttente<Enfant>();
	FileAttente<Adulte> f2 = new FileAttente<Adulte>();
	FileAttente<Personne> f3 = new FileAttente<Personne>();
	
	
	//question 7:
	Enfant enfant1 = new Enfant("michou", "vittel", true );
	Enfant enfant2 = new Enfant("jhonny", "montferrier", true);
	Enfant enfant3 = new Enfant("abranis", "swiis", false);
	
	f1.entre(enfant1);
	f1.entre(enfant2);
	f1.entre(enfant3);
	
	Adulte adulte1 = new Adulte("vava","loulou",true);
	Adulte adulte2 = new Adulte("saasi","Gogo",true);
	Adulte adulte3 = new Adulte("lilo","loy",false);
	
	f2.entre(adulte1);
	f2.entre(adulte2);
	f2.entre(adulte3);
	
	Personne personne1 = new Personne("chester", "bennington", true);
	Personne personne2 = new Personne("chester", "bennington", true);
	Personne personne3 = new Personne("chester", "bennington", true);
	f3.entre(personne1);
	f3.entre(personne2);
	f3.entre(personne3);
	

	
	
	
	

	
	
	
	
	
	
}
}
