package elements;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class ItemEnigma extends Item{
    
	private Enigma myEnigma;
	
	// Constructors :
	
	public ItemEnigma(String name, String description, Enigma myEnigma) {
		super(name, description);
		this.myEnigma = myEnigma;
	}
	
	public ItemEnigma(String name, String description) {
		this(name, description, new Enigma());
	}	
	
	public ItemEnigma() {
		super();
		this.myEnigma = new Enigma();
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
	public boolean useItem() {
		System.out.println("This is an enigma item !");
		return myEnigma.resolveEnigma();
	}
}
