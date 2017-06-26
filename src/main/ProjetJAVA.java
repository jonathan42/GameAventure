package main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import world.*;
import people.*;
import java.util.*;

/**
 *
 * @author emmanuelcognet
 */
public class ProjetJAVA {
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        
        boolean correct = false;
        
        World myWorld = new World();
        
        myWorld.addPlace("B2 hall", "Small tables in the right side with a coffee machine", false);
            myWorld.getPlace("B2 hall").addExit("Delta amphi");
            myWorld.getPlace("B2 hall").addExit("Corridor");
            myWorld.getPlace("B2 hall").addExit("Stairs");
            myWorld.getPlace("B2 hall").addExit("Outside");
        
        myWorld.addPlace("Delta amphi", "Big amphitheater", false);
            myWorld.getPlace("Delta amphi").addExit("B2 hall"); 
            
        myWorld.addPeople(10, "coucou");
		
	do {
            System.out.print("> ");

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String str_tab[] = new String[2];
            str_tab = str.split(" ", 2);
			
            Command c = Command.getCommand(str_tab[0]);
			
            if (c != null) {
                correct = true;
                System.out.println("Command found !");
            }
            else {
                System.out.println("Command not found !");
            }
	} while (correct == false);	
    }*/
}
