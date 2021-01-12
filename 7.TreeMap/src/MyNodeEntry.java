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
		
		// si la clef de la racine est supérieure à la clef cherchée
		// on appelle get sur le sous-arbre droite
		// ....
		
		return null;
	}
	
	public void keySet(Set<K> res) {
		// à écrire
	}
	
	public void keySetPrefixe(ArrayList<K> res) {
		// à écrire
	}

	public int nbFeuilles() {
		// à écrire
		return 0;
	}
}
