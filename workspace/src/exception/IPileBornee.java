package exception;

public interface IPileBornee <T> extends IPile<T> {
	
	
	void setTailleMax(int tailleMax) throws TailleNegativeException;
	void getTailleMax() throws TailleNegativeException;
	
	
	
	@Override
	default void empiler(T t) throws PileVideException, PilePleineException {
		// TODO Auto-generated method stub
		
	}

	
	

}
