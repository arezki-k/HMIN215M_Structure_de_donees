package exception;

public class MainException {
	public static void main (String[] args) throws PileVideException,
	PilePleineException, TailleNegativeException{
		
		
		
		Pile<String> pileTeste = new Pile<String>();
		
		pileTeste.empiler("djadja");
		pileTeste.empiler("saadi");
		pileTeste.empiler("arezki");
		Pile<String> pileVide = new Pile<String>();
		//pileVide.depiler();
		
		pileTeste.empiler("sasa");
		
		
		System.out.println(pileTeste);
		
		PileBornee<String> pileBornee = new PileBornee<String>();
		
		pileBornee.setTailleMax(2);
		try {
		pileBornee.empiler("giant");
		pileBornee.empiler("Btwin");
		pileBornee.empiler("Specialized");
		pileBornee.depiler();
		pileBornee.depiler();
		pileBornee.depiler();
		pileBornee.depiler();
		
		}catch (PilePleineException |PileVideException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
		//pileBornee.empiler("serious");
		System.out.println("bonjour"+pileBornee);
		
		//new Pile<String>() pil = new PileBornee<String>();
		
		
		
		
		
		
		
		
		
	}

}
