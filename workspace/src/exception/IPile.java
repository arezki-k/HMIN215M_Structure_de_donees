package exception;

public interface IPile<T> {
	
	void initialiser();
	void empiler(T t) throws PileVideException, PilePleineException;
	T depiler() throws PileVideException;
	T sommet() throws PileVideException;
	boolean estVide();

}
