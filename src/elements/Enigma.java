package elements;

import java.util.*;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class Enigma{
	
	private String enigma;
	private String solution;
	
	public Enigma(String enigma, String solution) {
		this.enigma = enigma;
		this.solution = solution;
	}
	
	public Enigma() {
		this("What's the color of the sky ?", "blue");
	}
	
	// Getters :
	
	public String getEnigma() {
		return enigma;
	}

	public String getSolution() {
		return solution;
	}
	
	// Setters :
	
	public void setEnigma(String enigma) {
		this.enigma = enigma;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	// Others :
	
	public boolean resolveEnigma() {
		System.out.print("Enigma : ");
		System.out.println(this.getEnigma());
		System.out.print("Answer : ");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		return str.equals(this.getSolution());
	}


}
