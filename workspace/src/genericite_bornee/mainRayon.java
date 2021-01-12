package genericite_bornee;

import java.io.IOException;

public class mainRayon {
	public static void main(String[] args) throws IOException {
		
		Rayon<Produit, String> RayonProduit = new Rayon<>();
		Rayon<Livre, String> RayonLivre = new Rayon<>();
		
		Produit p1 = new Produit("cassette 9v shimano");
		Produit p2 = new Produit("freins shimano M500");
		Produit p3 = new Produit("roue 700 mavic Pro");
		RayonProduit.addProduit(p1);
		RayonProduit.addProduit(p2);
		RayonProduit.addProduit(p3);
		
		Livre l1 = new Livre("comment je vois le monde-Albert Einstein");
		Livre l2 = new Livre("Angular & nodeJs-Pierre Pompidor");
		Livre l3 = new Livre("Un appartement à Paris-Guillaume Mousso");
		RayonLivre.addProduit(l1);
		RayonLivre.addProduit(l2);
		RayonLivre.addProduit(l3);
		
		System.out.println(RayonProduit.listingContenu());
		System.out.println(RayonLivre.listingContenu());
	}

}
