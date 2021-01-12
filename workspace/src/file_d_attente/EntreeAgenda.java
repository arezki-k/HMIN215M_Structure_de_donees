package file_d_attente;

import java.sql.Date;

import genericite.Paire;




public class EntreeAgenda <Date , String> extends Paire<Date, String> {

	/**
	 * 
	 */
	public EntreeAgenda() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param f
	 * @param s
	 */
	public EntreeAgenda(Date f, String s) {
		super(f, s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date getFst() {
		// TODO Auto-generated method stub
		return super.getFst();
	}

	@Override
	public String getSnd() {
		// TODO Auto-generated method stub
		return super.getSnd();
	}

	@Override
	public void setFst(Date a) {
		// TODO Auto-generated method stub
		super.setFst(a);
	}

	@Override
	public void setSnd(String b) {
		// TODO Auto-generated method stub
		super.setSnd(b);
	}

	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public <C> boolean memeFrst(Paire<Date, String> p) {
		// TODO Auto-generated method stub
		return super.memeFrst(p);
	}
	

}
