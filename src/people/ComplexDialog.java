package people;

import java.util.Scanner;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class ComplexDialog implements Dialog {
    
    private String contents;
    private String answer1;
    private String answer2;
    private String answer3;
    private String solution;
    private boolean correct;

    public ComplexDialog(String contents, String answer1, String answer2, String answer3, String solution) {
        this.contents = contents;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.solution = solution;
        this.correct = false;
    }
    
    public boolean isCorrect () {
        return this.correct;
    }
   
    @Override
    public void talk (){
        System.out.println(contents);
        System.out.println("\t- " + answer1);
        System.out.println("\t- " + answer2);
        System.out.println("\t- " + answer3);
        
        System.out.print("Answer : ");
		
        Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
		
	this.correct = str.equals(this.solution);
    }
}
