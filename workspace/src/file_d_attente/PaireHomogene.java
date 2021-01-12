package file_d_attente;

import genericite.Paire;

public class PaireHomogene<A> extends Paire<A, A>{
	
	/**
	 * 
	 */
	public PaireHomogene() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param f
	 * @param s
	 */
	public PaireHomogene(A f, A s) {
		super(f, s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public A getFst() {
		// TODO Auto-generated method stub
		return super.getFst();
	}

	@Override
	public A getSnd() {
		// TODO Auto-generated method stub
		return super.getSnd();
	}

	@Override
	public void setFst(A a) {
		// TODO Auto-generated method stub
		super.setFst(a);
	}

	@Override
	public void setSnd(A b) {
		// TODO Auto-generated method stub
		super.setSnd(b);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public <C> boolean memeFrst(Paire<A, A> p) {
		// TODO Auto-generated method stub
		return super.memeFrst(p);
	}

	
	

}
