package tree_maps;

import java.util.*;

public class MyNodeEntry<K extends Comparable<K>,V> extends MyEntry<K,V> {
	MyNodeEntry<K,V> left = null;
	MyNodeEntry<K,V> right = null;
	MyNodeEntry<K,V> parent;
	
	public MyNodeEntry(K key, V value, MyNodeEntry<K,V> parent) {
		super(key,value);
		this.parent=parent;
	}
	
	// écriture récursive de la méthode auxiliaire
	// appelée dans toString() de MyTreeMap
	
	public String toStringRec(String decalage) {
		String res = decalage+this.key.toString()+"\n";
		if (this.left != null)
				res += this.left.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		if (this.right != null)
				res += this.right.toStringRec(decalage+"  ");
		else res+= decalage+"  "+"."+"\n";
		return res;
		
	
	}
	
	// méthodes demandées
	
	// écriture récursive de la méthode auxiliaire appelée 
	// par V get(K key) de MyTreeMap
	// de recherche d'une clef afin de retourner la valeur associée
	
	public V get(K key) {
		// si la clef est égale à key
		// retourner la valeur associée
		// ....
		// si la clef de la racine est supérieure à la clef cherchée
		// on appelle get sur le sous-arbre gauche
		// ....
		if(this==null) return null;
		if(left != null && this.key.compareTo(key)>0) return left.get(key);
		
		// si la clef de la racine est supérieure à la clef cherchée
		// on appelle get sur le sous-arbre droite
		// ....
		
		else if(right !=null && this.key.compareTo(key)<0) return right.get(key);
		
		else if( this.key.compareTo(key)==0) return this.value;

		return null;
		/*
		La méthode de recherche itérative.
		
		int temp;
		MyNodeEntry<K,V> courant;
		temp = key.compareTo(this.key);
		if (temp < 0)
		  	courant = left;
		else if (temp > 0)
			 courant = right;
		else {
			  return value;
		}
		while(courant!=null) {			  // j'ai essayé cette methode: j'ai eu une erreur que je n'arrive pas à couriger
			  temp = key.compareTo(key);
			  if (temp < 0)
			  	courant = courant.left;
			  else if (temp > 0)
				 courant = courant.right;
			  else {
				  return courant.value;
			  }
		}
		return null;
		*/
	}
	
	public void keySet(Set<K> res) {
		res.add(key);
		if(left != null) left.keySet(res);
		if(right != null) right.keySet(res);
	}
	
	public void keySetPrefixe(ArrayList<K> res) {
		// à écrire
		if(left != null) left.keySetPrefixe(res);
		res.add(key);
		if(right != null) right.keySetPrefixe(res);
	}

	public int nbFeuilles() {
		if(left != null && right != null) return left.nbFeuilles()+right.nbFeuilles(); //l'addition entre les feuilles des deux sous-arbres.
		if(left == null && right != null) return right.nbFeuilles(); //c'est le sous arbre droit qui les contient.
		if(right == null && left!= null) return left.nbFeuilles(); //c'est le sous arbre gauche qui contient les feuilles.
		if(estFeuille()) return 1; //si c'est une feuille, donc 1. """La récursivité"".
		
		return 0;
	}
	
	public boolean estFeuille() {
		if(left == null && right == null) return true;
		return false;
	}
}
