package interfaces;

import java.io.IOException;

public class Programmequadrilatere {
	public static void main(String[] args) throws  IOException{
		Irectangle rectangleattr = new Rectangle(2,3);
		//System.out.println(rectangle1+"aire: "+rectangle1.aire()+" perimetre: "+rectangle1.perimetre());
		System.out.println(rectangleattr);
		Irectangle rectangletab = new RectangleTab(2,3);
		System.out.println(rectangletab);
		Ilosange losange = new Losange(4, 40);
		System.out.println(losange);
		Ilosange carre = new Carre(5);
		System.out.println(carre);
		
	}

}
