package tp;

import java.util.ArrayList;

import base.GrapheBase;
import base.IGraphe;
import base.IGrapheAlgo;

public class GrapheBaseAlgo extends GrapheBase implements IGrapheAlgo{

	// ETAPE 1 : implémentez les algorithmes suivants en utilisant les fonctions de GrapheBase
	//
	//public void ajouterArc(int numeroSortant, int numeroEntrant)
	//	ajoute un arc depuis numeroSortant vers numeroEntrant
	//
	//public ArrayList<Integer> arcsSortants(int numeroSommet)
	//	retourne le numero des sommets de tous les acrs sortants du sommet donne en parametre
	//
	//public int nombreDeSommets()
	//	retourne le nombre total de sommets du graphe
	//
	//public void marquerSommet(int numeroSommet)
	//	place une marque sur le sommet
	//
	//public boolean testSommetMarque(int numeroSommet)
	//	test si vous avez place une marque sur le sommet
	//
	//public void effacerMarques()
	//	efface toutes les marques 
	
	public GrapheBaseAlgo(int nombreDeSommets) {
		super(nombreDeSommets);
	}

	//Algorithmes obligatoires
	//
	// implantez les deux algorithmes suivants :
	//	calculerDensite
	//	parcourEnLargeur
	
	//calculer la densité du graphe, c'est a dire le nombre d'arcs sur nombre maximum d'arcs possibles (pour connaître le nombre maximum d'arcs possible il faut se rappeler que tous les sommets peuvent être connectés a tous les sommets y compris soi-même, et que dans un graphe orienté l'arc a->b est diérent de l'arc b->a)
	public double calculerDensite()
	{
		return 0.0;
	}
	
	//parcours en largeur à partir d'un sommet (voir sujet de tp !)
	public ArrayList<Integer> parcourEnLargeur(int numeroSommet)
	{
		return null;
	}

	//Algorithmes bonus
	//
	// implantez au moins deux des algorithmes suivants :
	
	//calculer le nombre moyen de voisins 
	public double calculerNombreMoyenVoisins()
	{
		return 0.0;
	}
	
	//retourner l'ensemble des predecesseurs  d'un noeud (les origines des arcs entrants dans le noeud)
	public ArrayList<Integer> predecesseursDuNoeud(int numeroSommet)
	{
		return null;
	}
	
	//savoir si deux sommets sont reliés par un chemin orienté d'arcs
	public boolean existeChemin(int sommetDepart, int sommetArrive)
	{
		return false;
	}	
	
	//construire le plus petit graphe symetrique contenant ce graphe
	public IGraphe plusPetitGrapheSymetrique()
	{
		return null;
	}
	
	//construire le graphe complementaire de ce graphe
	public IGraphe grapheComplementaire()
	{
		return null;
	}

	//Algorithme difficile
	//// FACULTATIF

	//trouver le plus court chemin entre deux sommets
	public ArrayList<Integer> plusCourtChemin(int sommetDepart, int sommetArrive)
	{
		return null;
	}	
}


