package file_d_attente;

import java.util.*;

public class FileAttente <T extends estInvite>{
	private String nomFile;
	private static int nbElementsEntreesTotal = 0;
	private ArrayList<T> contenu;
	
	public String getNomFile() {
		return nomFile;
	}

	public void setNomFile(String nomFile) {
		this.nomFile = nomFile;
	}
	
	public static int getNbElementsEntreesTotal() {
		return nbElementsEntreesTotal;
	}
	
	public FileAttente(){
		contenu=new ArrayList<T>();
		}
	
	public void entre(T p){
		if(p.isInvite() && !contenu.contains(p)) {
		contenu.add(p);
		nbElementsEntreesTotal++;}
		else {
			System.err.println("Non Invité");
		}
	}
	
	public T sort(){
		T p=null;
		if (!contenu.isEmpty()){
			p=contenu.get(0);
			contenu.remove(0);
		}
		return p;
	}
	
	public Integer nbElements(){
		return contenu.size();
	}
	
	public boolean estVide(){
		return contenu.isEmpty();
	}
	
	public String toString(){
		return ""+descriptionContenu();
	}
	
	private String descriptionContenu(){
		
		String Resultat = "";
		for (T p:contenu){
			Resultat+= p + " ";
		}
		return Resultat;
		}
	
	public static <X extends estInvite> boolean MemeObjet(FileAttente<X> file1, FileAttente<X> file2){
		return file1.contenu.equals(file2.contenu);
			
	}
	
	public boolean MemeObjetNonStatic(FileAttente<T> file1){
		return this.contenu.equals(file1.contenu);
	}
	
	public <X extends estInvite> boolean MemeTaille(FileAttente<X> file){
		return this.nbElements().equals(file.nbElements());
		
	}
	
	public void deplacerInviteInstance(FileAttente<? extends T> f2) {
		if (!this.estVide() && f2.estVide()) {
			T p = null;
			p = this.sort();
			System.out.println(p);
			
		}
		
	}
	
	

	public <X extends estInvite> void deplacerInvite(FileAttente<X> f1, FileAttente<X> f2) {
		if (!f1.estVide() && ! f2.estVide()) {
			X p =null;
			p=f1.sort();
			f2.entre(p);
			
		}
	}

	
	
	
	
}
