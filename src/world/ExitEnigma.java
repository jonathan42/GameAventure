package world;

import elements.*;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class ExitEnigma implements Exit{
	
	private Enigma myEnigma;
	
	// Constructors :
	
	public ExitEnigma(Enigma myEnigma) {
		this.myEnigma = myEnigma;
	}
	
	public ExitEnigma() {
		this(new Enigma());
	}

	// Getters :
	
	public Enigma getEnigma() {
		return this.myEnigma;
	}
	
	// Setters :
	
	public void setEnigma(Enigma myEnigma) {
		this.myEnigma = myEnigma;
	}

	// Others :
	
	@Override
	public boolean toGetOver() {
		return this.myEnigma.resolveEnigma();
	}

}
