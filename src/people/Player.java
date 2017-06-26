package people;

import java.util.*;
import elements.*;
import world.*;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class Player {
    
    private static String name;
    private static int healthPoint;
    private static Place myPlace;
    private static int world;
    private static ArrayList<Item> listItems = new ArrayList<Item>();

    // Getters :
    
    public static String getName () {
        return Player.name;
    }

    public static int getHealthPoint() {
	return Player.healthPoint;
    }
	
    public static Place getPlace() {
    	return Player.myPlace;
    }
    
    public static int getWorld () {
        return Player.world;
    }
    
    public static Item getItem (String item_name) {
    	for (Item i : Player.listItems) {
            if (i.getName().equals(item_name)) {
                return i;
            }
        }
        return null;
    }

    //Setters :

    public static void setName (String name) {
        Player.name = name.toLowerCase();
    }
    
	public static void setHealthPoint(int healthPoint) {
		Player.healthPoint = healthPoint;
	}
	
	public static void setPlace(Place myPlace) {
		Player.myPlace = myPlace;
	}

    public static void setWorld (int world) {
        Player.world = world;
    }
    
    public static void addItem (Item myItem) {
    	Player.listItems.add(myItem);
    }
    
    public static void delItem (Item myItem) {
    	for (Item i : Player.listItems) {
            if (i == myItem) {
            	Player.listItems.remove(Player.listItems.indexOf(i));
            	break;
            }
        }
    }
    
    // Commands :
    
    public static void go(String place_name) {
    	Place p = World.getPlace(place_name);
    	if (p != null) {
    		if (World.getExit(Player.myPlace.getName(), place_name).toGetOver())
    			Player.setPlace(World.getPlace(place_name));
    		else
        		System.out.println("The exit is still closed.");
    	}
    	else {
    		System.out.println("This place does not exist");
    	}
    }
    
    public static void look(String str) {
    	if (str.equals("place")) {
    		System.out.println(Player.getPlace().getDescription());
    		System.out.println("You can go to : " + Player.getPlace().getOthersPlaces());	
    	}
    	else {
    		System.out.print(Player.getItem(str).getName());
    		System.out.println("\t: "+Player.getItem(str).getDescription());
    	}
		
    }
    
    public static void search() {
    	if (!Player.getPlace().getListItems().equals(""))
    		System.out.println(Player.getPlace().getListItems());
		else
			System.out.println("There is no item in this place.");   
    }
    
    public static void take(String item_name) {
    	Item i = World.getItem(item_name); 
    	if (i != null) {
			Player.addItem(i);
    		World.delItem(i);
    	}
		else
    		System.out.println("This item does not exist.");
    }
    
    public static void drop(String item_name) {
    	for (Item i : Player.listItems) {
            if (i.getName().equals(item_name)) {
                Player.delItem(i);
                World.addItem(i);
            }
        }
    }
    
    public static void bag() {
    	String s = "";
    	for (Item i : listItems) {
            s += i.getName() + "; ";
        }
		System.out.println(s);
    }
    
    public static void use(String item_name) {
    	for (Item i : Player.listItems) {
            if (i.getName().equals(item_name)) {
            	if (i.useItem()) {
            		System.out.println("Bravo !");
            		Player.world = 0;
            	}
            	else {
            		System.out.println("Wrong answer...");
            		Random randomGenerator = new Random();
            		for (int k=0;k<10;k++) {
            			int randomInt = randomGenerator.nextInt(3);
            			Player.world = randomInt+1;
            			System.out.println(Player.world);
            		}
            	}	
            }
        }
    }

}