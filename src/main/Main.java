package main;

import java.util.*;
import people.*;
import world.*;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class Main {

	public static void main(String[] args) {
		
            // World :     

            // B2 Floor 0
        World.addPlace("Hall B2", "Small tables on the right side of the room with over a coffee machine", "A cold room without nothing interesting", "Big table of glass on the right side of the room with a dispenser", "Tables are broken and there are a lot of glasses in the floor", false);
            World.getPlace("Hall B2").addExitFree("Delta amphi");
            World.getPlace("Hall B2").addExitFree("Corridor 1");
            World.getPlace("Hall B2").addExitFree("Stairs");
            World.getPlace("Hall B2").addExitFree("Outside 1");
        
        World.addPlace("Delta amphi", "Big amphitheater", "Amphitheater of wood", "An amazing amphitheater with inside a lot of technology", "Amphitheater covered in bloods on the walls", false);
            World.getPlace("Delta amphi").addExitFree("Hall B2");
        
        World.addPlace("Corridor 1", "Large corridor", "Large corridor", "Large corridor with neons", " Large corridor in the dark", false);
            World.getPlace("Corridor 1").addExitFree("Corridor 2");
            World.getPlace("Corridor 1").addExitFree("Hall B2");
            World.getPlace("Corridor 1").addExitFree("TD1's room");
            World.getPlace("Corridor 1").addExitFree("TD/cours");
            World.getPlace("Corridor 1").addExitFree("Secretaria's office");
            World.getPlace("Corridor 1").addExitFree("Annie's office");
            
        World.addPlace("TD1's room", "A room with many tables and chairs", "A room with many tables and chairs", "A room with a lot of digital tables and chairs", "A room with nothing interesting, everything was stolen", false);
            World.getPlace("TD1's room").addExitFree("Corridor 1");
           
        World.addPlace("Annie's office", "A desk with a Macbook pro 13', the best computer", "A desk with so much papers and pencils", "A digital desk by Apple", "The room is alright maybe the zombie like Apple", false);
            World.getPlace("Annie's office").addExitFree("Corridor 1");

        World.addPlace("Secretaria's office", "Big desks facing each other with many papers over desks", "There are only white paper", "Big machines are in the back of the room", "The wind blow inside the room, some windows are open", false);
            World.getPlace("Secretaria's office").addExitFree("Corridor 1");
        
        World.addPlace("TD/cours", "A room with a lot of tables and chairs", "A room with a lot of tables and chairs", "A room with a lot of digital tables and chairs", "A room with nothing interesting, everything was stolen", false);
            World.getPlace("TD/cours").addExitFree("Corridor 1");
          
        World.addPlace("Corridor 2", "Small corridor", "Small corridor", "Small corridor", "Small corridor", false);
            World.getPlace("Corridor 2").addExitFree("Corridor 1");
            World.getPlace("Corridor 2").addExitFree("Hall B2 bis");
            
        World.addPlace("Stairs 2", "Basic stairs", "Basic stairs", "Basic stairs", "Basic stairs", false);
            World.getPlace("Stairs 2").addExitFree("Hall B2 bis");
            World.getPlace("Stairs 2").addExitFree("Corridor 4");
            
         World.addPlace("Hall B2 bis", "Hall with posters on the walls of the events of the campus", "Hall with posters on the walls of the events of the campus", "Hall with screen on the walls of the events of the campus and his history", "Hall with broken screen on the walls", false);
            World.getPlace("Hall B2 bis").addExitFree("Corridor 2");
            World.getPlace("Hall B2 bis").addExitFree("Staires 2");
            World.getPlace("Hall B2 bis").addExitFree("Outside 3");

        // B2 Floor 1
            
        World.addPlace("Stairs", "plop", "plop", "plop", "plop", false);
            World.getPlace("Stairs").addExitFree("Hall B2");
            World.getPlace("Stairs").addExitFree("Corridor 3");
            
        World.addPlace("Corridor 3", "plop", "plop", "plop", "plop", false);
            World.getPlace("Corridor 3").addExitFree("Stairs");
            World.getPlace("Corridor 3").addExitFree("TP1");
            World.getPlace("Corridor 3").addExitFree("TP2");
            World.getPlace("Corridor 3").addExitFree("Cours");
            World.getPlace("Corridor 3").addExitFree("TD2");
            World.getPlace("Corridor 3").addExitFree("Corridor 4");
        
         World.addPlace("TP1", "plop", "plop", "plop", "plop", false);
            World.getPlace("TP1").addExitFree("Corridor 3");
         
         World.addPlace("TP2", "plop", "plop", "plop", "plop", false);
            World.getPlace("TP2").addExitFree("Corridor 3");
           
           
         World.addPlace("TD2", "plop", "plop", "plop", "plop", false);
            World.getPlace("TD2").addExitFree("Corridor 3");
             
         World.addPlace("Cours", "plop", "plop", "plop", "plop", false);
            World.getPlace("Cours").addExitFree("Corridor 3");
            
            
        World.addPlace("Corridor 4", "plop", "plop", "plop", "plop", false);
            World.getPlace("Corridor 4").addExitFree("Stairs 2");
            World.getPlace("Corridor 4").addExitFree("TD3");
            World.getPlace("Corridor 4").addExitFree("Info 1");
            World.getPlace("Corridor 4").addExitFree("Info 2");
            World.getPlace("Corridor 4").addExitFree("TP3");
            World.getPlace("Corridor 4").addExitFree("Corridor 3");
        
        World.addPlace("TP3", "plop", "plop", "plop", "plop", false);
            World.getPlace("TP3").addExitFree("Corridor 4");
         
         World.addPlace("Info 1", "plop", "plop", "plop", "plop", false);
            World.getPlace("Info 1").addExitFree("Corridor 4");
           
         World.addPlace("TP3", "plop", "plop", "plop", "plop", false);
            World.getPlace("TP3").addExitFree("Corridor 4");
                 
         World.addPlace("Info 2", "plop", "plop", "plop", "plop", false);
            World.getPlace("Info 2").addExitFree("Corridor 4");
             
        // B3  Floor 0       
       
        World.addPlace("Hall B3", "Hall with posters on the walls of the events of the campus", "Hall with posters on the walls", "Unknown", "Hall with posters of end of the world on walls", false);
            World.getPlace("Hall B3").addExitFree("Stairs B3");
            World.getPlace("Hall B3").addExitFree("Amphi I");
            World.getPlace("Hall B3").addExitFree("Amphi II");
            World.getPlace("Hall B3").addExitFree("Outside 3");
            
        World.addPlace("Amphi I", "Big amphitheater", "Big amphitheater", "Unknown", "Big amphitheater", false);
            World.getPlace("Amphi I").addExitFree("Hall B3");
            
        World.addPlace("Amphi II", "Big amphitheater", "Big amphitheater", "Unknown", "Big amphitheater", false);
            World.getPlace("Amphi II").addExitFree("Hall B3");
            
        World.addPlace("Stairs B3", "A corridor with a stair", "A corridor with a stair", "Unknown", "A corridor with a stair", false);
            World.getPlace("Stairs B3").addExitFree("Hall B3");
            World.getPlace("Stairs B3").addExitFree("Corridor B3");
            
        // B3 Floor 1
            
        World.addPlace("Corridor B3", "A basic corridor", "An anthic corridor", "Unknown", "A corridor with everywhere human blood", false);
            World.getPlace("Corridor B3").addExitFree("Secretaria's office B3");
            World.getPlace("Corridor B3").addExitFree("Organization I");
            World.getPlace("Corridor B3").addExitFree("Organization II");
            World.getPlace("Corridor B3").addExitFree("Organization III");
            World.getPlace("Corridor B3").addExitFree("Stairs B3");
            
        World.addPlace("Secretaria's office B3", "Posters on the walls of the events of the campus", "One engravings on walls : 3.1415926535897932384626433832795028841 9716939937510582097494459230781640 628620899862803482534211706798214808651 328230664709384460955058223172535", "Unknown", "Posters on the walls of the events of the campus", false);
            World.getPlace("Secretaria's office B3").addExitFree("Corridor B3");
            
        World.addPlace("Organization I", "A rest room with a mastermind's game", "Empty room", "Unknown", "A small room with zombie who having fun", false);
            World.getPlace("Organization I").addExitFree("Corridor B3");
            
        World.addPlace("Organization II", "A room who have sofas and a game of hung with furniture closed", "Empty room", "Unknown", "A room with zombie", false);
            World.getPlace("Organization II").addExitFree("Corridor B3");
            
        World.addPlace("Organization III", "A room with Billard, and a baby foot and a shi-fu-mi", "Empty room", "Unknown", "A room with decomposed bodies", false);
            World.getPlace("Organization III").addExitFree("Corridor B3");
  
        // B7        
       
        World.addPlace("Hall B7", "A hall with posters on the walls of the events of the campus", "Unknown", "A hall with dynamics's posters on the walls of the events of the campus", "A hall with posters torn on walls announcing the end of the world", false);
            World.getPlace("Hall B7").addExitFree("Corridor B7");
            World.getPlace("Hall B7").addExitFree("Amphi A");
            World.getPlace("Hall B7").addExitFree("Amphi B");
            
        World.addPlace("Amphi A", "Big amphitheater", "Unknown", "Big amphitheater, with a big digital screen", "Big amphitheater, half destroy ", false);
            World.getPlace("Amphi A").addExitFree("Hall B7");
            
        World.addPlace("Amphi B", "Big amphitheater with a no ordinary device and next to Mr RIMBERT", "Unknown", "Big amphitheater with devices can ordinary", "Big amphitheater with a broken device", false);
            World.getPlace("Amphi B").addExitFree("Hall B7");
            
        World.addPlace("Corridor B7", "Dark corridor", "Unknown", "Dark corridor", "Darkness corridor", false);
            World.getPlace("Corridor B7").addExitFree("Hall B7");
 
        // B5 

            
        World.addPlace("Hall B5", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Hall B5").addExitFree("Desk 1");
            World.getPlace("Hall B5").addExitFree("Corridor B5");
            World.getPlace("Hall B5").addExitFree("Outside 5");
           
        World.addPlace("Desk 1", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Desk 1").addExitFree("Hall B5");
         
        World.addPlace("Corridor B5", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Corridor B5").addExitFree("Desk 2");
            World.getPlace("Corridor B5").addExitFree("Desk 3");
            World.getPlace("Corridor B5").addExitFree("Desk 4");
            World.getPlace("Corridor B5").addExitFree("Desk 5");
            World.getPlace("Corridor B5").addExitFree("Desk 6");
            World.getPlace("Corridor B5").addExitFree("Hall B5");
        
        World.addPlace("Desk 2", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Desk 2").addExitFree("Corridor B5");
         
        World.addPlace("Desk 3", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Desk 3").addExitFree("Corridor B5");
              
        World.addPlace("Desk 4", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Desk 4").addExitFree("Corridor B5");
                 
        World.addPlace("Desk 5", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Desk 5").addExitFree("Corridor B5");
            
        World.addPlace("Desk 6", "plop", "Unknown", "plop", "Unknown", false);
            World.getPlace("Desk 6").addExitFree("Corridor B5");
 
        // Refectory

            
        World.addPlace("Hall Refectory", "Place with distributors of drink chill, a device of for the refill of MONEO", "Place empty with engravings on walls", "Place with distributors of drink chill", "Place with a broken door, opposite distributors of the papers of end of the world almost everywhere", false);
            World.getPlace("Hall Refectory").addExitFree("Stairs refectory");
            World.getPlace("Hall Refectory").addExitFree("Cafet");
            World.getPlace("Hall Refectory").addExitFree("Eatery 1");
            World.getPlace("Hall Refectory").addExitFree("Outsides 7");
           
        World.addPlace("Eatery 1", "A room with tables and chairs to eat, but the service is closed", "A room with tables and chairs to eat, but the service is closed", "A room with glass tables and chairs to eat, but the service is automated ", "Place with broken, opposite distributors of the papers of end of the world almost everywhere", false);
            World.getPlace("Eatery 1").addExitFree("Hall Refectory");
    
        World.addPlace("Cafet", "A room with a small bar of the tables of chairs", "A room with a small bar of the tables of chairs", "A room with a small automatic bar, tables of glass and chairs", " A room with a small bar with some blood on the counter, glazes them its broken", false);
            World.getPlace("Cafet").addExitFree("Hall Refectory");
            
        World.addPlace("Stairs refectory", "A simple stair", "A simple stair", "A simple automated stair", "A simple stair a can in ruin", false);
            World.getPlace("Stairs refectory").addExitFree("Hall Refectory");
            World.getPlace("Stairs refectory").addExitFree("Eatery 2");
    
        World.addPlace("Eatery 2", "Very big room of dining hall", "Very big room of dining hall", "A very big room of dining hall", "A very big room of dining hall, or all is knocked down", false);
            World.getPlace("Eatery 2").addExitFree("Stairs Refectory");
            World.getPlace("Eatery 2").addExitFree("Eatery 3");
            
        World.addPlace("Eatery 3", "Room of more quiet dining hall", "Room of more quiet dining hall", "A very big room of dining hall", "A room of dining hall with corpses in decomposition", false);
            World.getPlace("Eatery 3").addExitFree("Eatery 2");    

        /// Outside
            
        World.addPlace("Outside 1", "You are in front of B2 there is some bike and shrubs", "You are in front of B2 there are thick shrubs", "You are in front of B2 there is some bike in levitation ", "You are in front of B2 there is some bike all broken and shrubs on fire", true);
            World.getPlace("Outside 1").addExitFree("Hall B2");
            World.getPlace("Outside 1").addExitFree("Outside 2");
            World.getPlace("Outside 1").addExitFree("Outside 6");
            World.getPlace("Outside 1").addExitFree("Outside 5");
            
        World.addPlace("Outside 2", "A small ground of grass with a monument in the middle and shrubs to the tour", "A small ground of grass with a monument in the middle ", "A small ground with a modern monument in the middle", "A small ground with a monument destroys in the middle and shrubs on fire in the tour", true);
            World.getPlace("Outside 2").addExitFree("Outside 1");
            World.getPlace("Outside 2").addExitFree("Outside 4");
            World.getPlace("Outside 2").addExitFree("Outside 3");
            World.getPlace("Outside 2").addExitFree("Outside 5");
           
        World.addPlace("Outside 3", "You are in font o two buildings B3 and B2, it has some car parked on the side of the see", "You are in front of 2 buildings B3 and B2", "You are in front of 2 building B3 and B2 it has some flying car parked on the side", "You are in front of 2 building one can in refectoryin B3 and B2 it has some car on fire and destroyed on the side of the voice", true);
            World.getPlace("Outside 3").addExitFree("Outside 2");
            World.getPlace("Outside 3").addExitFree("Outside 4");
            World.getPlace("Outside 3").addExitFree("Hall B2 bis");
            World.getPlace("Outside 3").addExitFree("Hall B3");
            
        World.addPlace("Outside 4", "A road with parked cars, small way and the access has a building", "A way which direction and access has a building", "A road with parked stealing cars, path and the access to a building", "A road with destroyed cars, small path and the access has a building", true);
            World.getPlace("Outside 4").addExitFree("Outside 2");
            World.getPlace("Outside 4").addExitFree("Outside 9");
            World.getPlace("Outside 4").addExitFree("Outside 3");
            World.getPlace("Outside 4").addExitFree("Hall B7");
            
        World.addPlace("Outside 5", "Zone with works on the building B5 with a beautiful hall", "Zone with works ", "Zone with a glass building of several floors", "Zone with refectoryins in front of the building B5 ", true);
            World.getPlace("Outside 5").addExitFree("Outside 2");
            World.getPlace("Outside 5").addExitFree("Outside 1");
            World.getPlace("Outside 5").addExitFree("Outside 6");
            World.getPlace("Outside 5").addExitFree("Hall B5");
            
        World.addPlace("Outside 6", "A flat of lawns", "A flat of lawns", "Small greenery zone", "Flat one dry", true);
            World.getPlace("Outside 6").addExitFree("Outside 1");
            World.getPlace("Outside 6").addExitFree("Outside 5");
            World.getPlace("Outside 6").addExitFree("Outside 7");
            World.getPlace("Outside 6").addExitFree("Outside 10");
            
        World.addPlace("Outside 7", "A small square with some bench and some fir tree on the edge", "A girl glides and some fir tree over the edge", "A square with some bench and some robot that look of discussed", "A small chaotic square of newspapers stealing the destroyed lampposts and some tree on fire on the edge", true);
            World.getPlace("Outside 7").addExitFree("Outside 6");
            World.getPlace("Outside 7").addExitFree("Outside 8");
            World.getPlace("Outside 7").addExitFree("Hall Refectory");
            World.getPlace("Outside 7").addExitFree("Outside 10");
            
        World.addPlace("Outside 8", "Zone forested", "Zone very wooded", "A piece of waste ground", "Wooden zone dead as to dry out on the spot", true);
            World.getPlace("Outside 8").addExitFree("Outside 7");
            World.getPlace("Outside 8").addExitFree("Outside 9");
            
        World.addPlace("Outside 9", "A small way with assault courses on them quoted", "A small way difficult to access and very wooded", "A path with monuments of past on them quoted", "A small path with one with branches of Road you are sad to you moved ", true);
            World.getPlace("Outside 9").addExitFree("Outside 8");
            World.getPlace("Outside 9").addExitFree("Outside 4");
            
        World.addPlace("Outside 10", "A big parking with lot of cars", "A big piece of waste ground", "A big parking lot has several floors with flying cars", "A big parking lot with vehicles in all directions destroys", true);
            World.getPlace("Outside 10").addExitFree("Outside 7");
            World.getPlace("Outside 10").addExitFree("Outside 6");
        
        // Player :
            
    	Player.setName("pierre");
    	Player.setHealthPoint(10);
    	Player.setPlace(World.getPlace("Hall B2"));
    	Player.setWorld(0); // The default world is the modern world.
        
        // Modern people
        
       /* People Annie = new ModernPeople(new SimpleDialog("\nCoucou !\n"));
        Annie.talk();
        
        Item itemtest = new ItemSimple("lampe", "sa eclaire");
        
        People clarisse = new ModernPeople(new ComplexDialog("Couleur du ciel?", "rouge", "vert", "bleu", "bleu"),World.getPlace("Hall B2"));
	clarisse.setMyItem(itemtest);
        clarisse.talk();*/	
    	
    	// Keyboard listening :
    
                
    	while (true) {
			System.out.println(Player.getName() + " : " + Player.getPlace().getName());
			System.out.print("> ");

			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine().toLowerCase();
			
			String str_tab[] = new String[2];
			str_tab = str.split( " ", 2);
			
			if (str_tab[0].equals("look") && str_tab.length == 1) {
				str = "look place";
				str_tab = str.split( " ", 2);
			}
			
                        
			Command c;
			try {
				c = Command.getCommand(str_tab[0]);
				if(str_tab.length > 1) {
                                c.execute(new Object[]{str_tab[1]});
                            }
				else {
                                    c.help();             
                                }
                                
			} catch (IllegalArgumentException e) {
				System.out.println("Command not found");
			}
		
		}
	
	}

}
