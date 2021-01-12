package dictionnaire;

public class Dico<K,V> implements Idico<K,V>{
	private Object[] keys; // null
	private Object[] values;// null
	private int entries = 0;
	private int storageSize = 10;

/*
FONCTIONEMENT D'UNE HASHMAP : 

key   ---- > value

0 : "toto" ----> 2.3
1 : null ------> null
2 : "tata" ----> 1.2


ajout d'un couple : "titi" , 1.8

makehashcode("titi") = 5 

key   ---- > value

0 : "toto" ----> 2.3
1 : null ------> null
2 : "tata" ----> 1.2
3 : null ------> null
4 : null ------> null
5 : "titi" ----> 1.8

et si le tableau ne fait que 4 cases ? 
et si la case est déja occupé ? (vois collision dans le tp)

*/



// Définissez les constructeurs. storageSize = 10 par défault
	public Dico()
	{
    keys= new Object[storageSize];
    values= new Object[storageSize];
	}

	public Dico(int initSize) 
	{
    storageSize=initSize;
    keys= new Object[storageSize];
    values= new Object[storageSize];
	}


// Définissez la méthode publique isEmpty() et size().
	public boolean isEmpty(){
		return entries==0;
	}

	public int size(){
		return entries;	
	}

// Définissez une méthode protégée indexOf(K c), qui rend l’index auquel est rangé la clé c dans le tableau des clés ou -1 si la clé n’y est pas. Cette méthode doit utiliser la fonction de hachage (protected int makeHashCode(Object o)) pour trouver la clé.
	protected int indexOf(K key) // bien (si tu veux etre tordu , il peut revenir au début du tableau si il trouve pas de place i<storageSize. t'enbéte pas pour l'instrant ^^)
	{
    if (mustGrow()){
      grow();
    }
    int index=makeHashCode(key)%storageSize;
    //int i=0;
    for (int i=0;i<storageSize;i++){
      //System.out.println(index);
      if(keys[(i+index)%storageSize]==key){
        return (i+index)%storageSize;
      }
      i+=1;
    }
    return -1;

	}

// Définissez la méthode publique containsKey(K c).
	public boolean containsKey(K key){

		return indexOf(key)!=-1;	
	}

// Définissez la méthode publique get(K c).
	public V get(K key){
    if (containsKey(key)){
      return (V)values[indexOf(key)];
    }
    return null;
		 // tu sais ce que c'est un cast ? oui
	}

//  Définissez une méthode protégée newIndexOf(K c), qui rend l’index auquel pourra être insérée la clé c dans le tableau des clés, mais n’effectue pas l’insertion. Pour cette première version on suppose que les tableaux sont moins que 3/4 pleins.
	protected int newIndexOf(K key) /// tu vas pas t'en tirer comme ça :) si c'est plein a la fin , il y a peur etre de la place au début ?
	{
    int index=makeHashCode(key)%storageSize;
    int i=0;
    while (true){
      if(keys[(i+index)%storageSize]==null){
        return (i+index)%storageSize;
      }
      i+=1;
    }
    //return -1;
  }

// haha elle est pas mal celle la ... dis moi si tu vois il réussit a faire la ligne     keys[newIndexOf(key)]=key; mais pas     values[newIndexOf(key)]=value;

// Définissez la méthode publique put(K c, V v). Pour cette première version on suppose que les tableaux sont moins que 3/4 pleins.
	public V put(K key, V value){ //  = a -1 ?
    int index = newIndexOf(key); //oui
    keys[index]=key;
    values[index]=value;
    entries+=1;
    /*if (mustGrow()){
      System.out.println(storageSize);
      grow();
    }*/
		return value;
	}

// Trouvez des données qui provoquent un conflit de hachage. Testez que get fonctionne toujours.
// Définissez la méthode toString() pour afficher le contenu de votre dictionaire
	public String toString(){
		String ret = "";
    for (int i=0;i<storageSize;i++){
      if (keys[i]==null){
        continue;
      }
      ret+="Key: "+keys[i]+"\n"+"Value :"+values[i]+"\n";
    }
		return ret;	
	}

// Pour la version finale : Définissez une méthode protégée mustGrow() qui dit si le tableau des clés est plus que 3/4 plein. Définissez une méthode protégée grow() qui fait grossir les tableaux de 10\% (en fait remplace les anciens par des nouveaux plus grands de 10\%). Réécrivez la méthode newIndexOf() pour qu’elle traite le cas complet, sans limite sur le nombre de couples dans le dictionnaire. Quand il faut agrandir le tableau, comme l’algorithme dépend de la taille du tableau, il faut bien sûr redistribuer les associations existantes dans le nouveau tableau.	
	protected boolean mustGrow()
	{
    if(entries>storageSize*0.75){
      return true;
    }
		return false;
	}
//oui
// mais la ton grow est pas bon : quelles sont les informations qui te permettent de calculer l'index ? storageSize et key
	protected void grow()
	{
    int old_storageSize=storageSize;
    storageSize = (int) Math.ceil((double)this.storageSize * 1.1); // tu fais quoi ici ? 
    Object[] new_keys= new Object[storageSize];
    Object[] new_values= new Object[storageSize];
    for (int i=0;i<old_storageSize;i++){
      if (keys[i]!=null){
        int index=makeHashCode(keys[i])%storageSize;
        for(int j=0;j<storageSize;j++){
          if(new_keys[(j+index)%storageSize]==null){
            new_keys[(j+index)%storageSize]=keys[i];
            new_values[(j+index)%storageSize]=values[i];
          }
        j+=1;
        }
      }

    //System.out.println("there");
    keys=new_keys;
    values=new_values;
    }
	}
	
	protected int makeHashCode(Object o)
	{
		int hash = o.hashCode();
		if(hash < 0)
			return -hash;
		return hash;
	}
}
