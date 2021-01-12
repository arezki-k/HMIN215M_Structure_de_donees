package file_d_attente;

import genericite.Paire;

public class PaireEtiquetee<T, X, C> extends Paire<T, X> {
	private C etiquette;

	/**
	 * 
	 */
	public PaireEtiquetee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param f
	 * @param s
	 */
	public PaireEtiquetee(T f, X s, C c) {
		super(f, s);
		this.etiquette=c;
		// TODO Auto-generated constructor stub
	}

	public C getEtiquette() {
		return etiquette;
	}
	public void setEtiquette(C etiquette) {
		this.etiquette = etiquette;
	}
	@Override
	public T getFst() {
		// TODO Auto-generated method stub
		return super.getFst();
	}

	@Override
	public X getSnd() {
		// TODO Auto-generated method stub
		return super.getSnd();
	}

	@Override
	public void setFst(T a) {
		// TODO Auto-generated method stub
		super.setFst(a);
	}

	@Override
	public void setSnd(X b) {
		// TODO Auto-generated method stub
		super.setSnd(b);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Etiquette: "+this.etiquette;
	}

	@Override
	public <C> boolean memeFrst(Paire<T, X> p) {
		// TODO Auto-generated method stub
		return super.memeFrst(p);
	}

	
	

	
	

}
