package exception;

import java.util.ArrayList;

public class Pile <T> implements IPile<T> {
	
	private ArrayList<T> elements;
	
	public Pile() {
		initialiser();
		
		//à la fin du constructeur, la condition "la pile est vide"
//		doit etre verifier
		assert elements.isEmpty();
	}
	
	public ArrayList<T> getElements() {
		return elements;
	}
	
	
	@Override
	public T depiler() throws PileVideException{
		
		int taille = elements.size();
		if (this.estVide()) {
			throw new PileVideException("en depilant");
		}
		
		T sommet = elements.get(elements.size()-1);
		elements.remove(sommet);
		assert taille == elements.size()-1;
		return sommet;
		
	}
	
	public void empiler(T t) throws PileVideException, PilePleineException {
		int taille = elements.size();
		elements.add(t);
		assert elements.size()==taille+1;
		assert this.sommet()==t : "dernier empile ="+this.sommet();
		
		
		}
	
	public boolean estVide() {return elements.isEmpty();}
	
	public void initialiser() {elements = new ArrayList<T>();}
	
	
	public T sommet() throws PileVideException{
	if (this.estVide())
		throw new PileVideException("en dépilant");
	return elements.get(elements.size()-1);
	}
	
	
	public int nbElements(){return elements.size();}
	
	
	public String toString(){return "Pile = "+ elements;}

	
	

}
