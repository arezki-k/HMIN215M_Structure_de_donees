package genericite_bornee;

import java.util.ArrayList;

public class Rayon <A extends ObjetAvecEtiquette<E>, E> {
	
private ArrayList<A> contenu = new ArrayList<A>();

public Rayon() {
	
	// TODO Auto-generated constructor stub
}
public void addProduit(A a) {
	if (this.contenu.contains(a)){
		System.err.println("Deja contenu");}
	else {
		this.contenu.add(a);
	}
	
}

public String listingContenu() {
	String listing="";
	for (A c:contenu) {
		listing+= c.Etiquette()+"\n";
	}
	return "Liste des elements contenues: \n"+listing;
}

}
