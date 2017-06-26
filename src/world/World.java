package world;

import java.util.*;
import people.*;
import elements.*;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class World {

    //private static ArrayList<People> listPeople = new ArrayList<People>();
    private static ArrayList<Place> listPlace = new ArrayList<Place>();
    
    // Getters :
    
    public static Place getPlace (String place_name) {
        for (Place p : listPlace) {
            if (p.getName().toLowerCase().equals(place_name.toLowerCase())) {
                return p;
            }
        }
        return null;
    }
    
    public static Place getPlace(int i) {
        return listPlace.get(i);
    }
    
    // Setters :
    
    public static void addPlace (String name, String desc_modern, String desc_past, String desc_future, String desc_postApoc, boolean outside) {
        Place p = new Place(name, desc_modern, desc_past, desc_future, desc_postApoc, outside);
        listPlace.add(p);
    }
    
    // Others :
    
    public static Exit getExit (String currentPlace, String futurPlace) {
    	return World.getPlace(currentPlace).getExit(futurPlace);
    }
    
    public static Item getItem (String item_name) {
    	return Player.getPlace().getItem(item_name);
    }
    
    public static void addItem (Item myItem) {
    	Player.getPlace().addItem(myItem);
    }
    
    public static void delItem (Item myItem) {
    	Player.getPlace().delItem(myItem);
    }
    
    /*public static void addPeople (int healthPoint, String dialog) {
        People p = new People(healthPoint, dialog);
        listPeople.add(p);
    } 
    
    public static void addPeople (People p) {
    	listPeople.add(p);
    }*/

    /**
     *
     * @param name
     * @param place_name
     * @return
     */
   
    public static Object getExit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addPlace(String b2_hall, String small_tables_in_the_right_side_with_a_cof, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addPeople(int i, String coucou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}