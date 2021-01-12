package interfaces;

public interface Icarre extends Irectangle, Ilosange{
	
	default double perimetre(){
		return Ilosange.super.perimetre();
	}
	default double aire(){
		return Math.pow(this.getCote(), 2);
	}
}
