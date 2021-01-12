package exception;

public class PileBornee<T> extends Pile<T> implements IPileBornee<T> {
	
	
	private int Taillemax;
	
	
	
	/**
	 * 
	 */
	public PileBornee() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void setTailleMax(int tailleMax) throws TailleNegativeException {
		// TODO Auto-generated method stub
		if (tailleMax < 0) {
			throw new TailleNegativeException("taille ne peut pas etre négative");
		}
		else {
			this.Taillemax=tailleMax;
			assert Taillemax <= 10;
		}
	}



	@Override
	public void getTailleMax() throws TailleNegativeException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void empiler(T t) throws PileVideException, PilePleineException {
		// TODO Auto-generated method stub
		if (this.nbElements()>=Taillemax) {
			throw new PilePleineException("pile pleine; ne peut plus en contenir");
		}
		else{
			super.empiler(t);
			assert this.nbElements() <= Taillemax;}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
