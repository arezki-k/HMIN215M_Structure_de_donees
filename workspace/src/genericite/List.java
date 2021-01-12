package genericite;

public interface List<E> {
	//void add (Object o);
	//Object get(int i);
	//2 problème à écrire ce code général
	//on recoursà la création de classes génériques
	void add (E o);
	E get(int i);
	int size();
	

}
