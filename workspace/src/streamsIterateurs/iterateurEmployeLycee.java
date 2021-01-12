package streamsIterateurs;

import java.util.Iterator;

public class iterateurEmployeLycee implements Iterator<EmployeLycee> {
	private DirectionLycee directionAParcourir;
	private int nombreDejaRetourne = 0;
	
	public iterateurEmployeLycee(DirectionLycee direction) {
		this.directionAParcourir=direction;

	}
	
	

	@Override
	public boolean hasNext() {
				return nombreDejaRetourne < 5;
	}

	@Override
	public EmployeLycee next() {
		EmployeLycee e = null;
	switch (nombreDejaRetourne) {
	case 0:
		e=directionAParcourir.getProviseur();
		
		break;
	case 1:
		e=directionAParcourir.getProviseurAdjoint();
		
		break;
	case 2:
		e=directionAParcourir.getConseillerPrincipaldEducation();
		
		break;
	case 3:
		e=directionAParcourir.getGestionnaire();
		
		break;
	case 4:
		e=directionAParcourir.getChefDeTravaux();
		break;

	}

	nombreDejaRetourne++;
		return e;
	}


}
