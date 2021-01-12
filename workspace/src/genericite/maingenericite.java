package genericite;

import interfaces.Rectangle;

import java.io.IOException;
import java.util.*;

public class maingenericite {
	public static void main(String[] args) throws  IOException{
		List maliste = new ListeConcrete();
		Rectangle r1 = new Rectangle(5, 5);
		maliste.add(r1);
		//Rectangle r = maliste.get(0);
		
	/*la méthode get retourne un objet de type Object
	 * Object = super classe de toutes les classes java
	 * on peut creer un rectangle à partir d'un objet et pas l'inverse
	 * on peut utiliser le cast, mais ca reste une mauvaise solution, la vérification se fait très tardivement.
	 * liste héterogene: on peut mettre tout type d'object dednasic interface Liste <E>{
	 * void add (E o);
	 * E:type formel
	 * E get(int i);
	 * }
	 *  */
		
		if (maliste.get(0) instanceof Rectangle){
		Rectangle r = (Rectangle) maliste.get(0);
		System.out.println(r.aire());
		}
		Object o = new Rectangle();
		maliste.add(4);

		java.util.List<Rectangle> maliste2 = new ArrayList<Rectangle>();
		
		maliste2.add(r1);
		Rectangle r3 = maliste2.get(0);
		Paire<String, Rectangle> paire1 = new Paire<String, Rectangle>("rec1", r1);
		String s = paire1.getFst();
		System.out.println(paire1);
		
		
		Paire<Integer, Double> paire2 = new Paire<Integer, Double>(15, 30.5);
		System.out.println(paire2);
		Paire<String, Rectangle> paire3 = new Paire<String, Rectangle>("rec1", r1);
		System.out.println(paire3.memeFrst(paire1));
		
		

	}

}
