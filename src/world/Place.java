package world;

import java.util.*;
import java.util.Map.*;
import people.*;
import elements.*;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class Place {
    
    private String name;
    private String[] description;
    private boolean outside; // True if the place is outside.
    private HashMap<String,Exit> listExit;
    private ArrayList<Item> listItems;// = new ArrayList<Items>();

    // Constructors :
    
    public Place (String name, String desc_modern, String desc_past, String desc_future, String desc_postApoc, boolean outside) {
        this.name = name.toLowerCase();
        this.description = new String[4];
        this.description[0] = desc_modern.toLowerCase();
        this.description[1] = desc_past.toLowerCase();
        this.description[2] = desc_future.toLowerCase();
        this.description[3] = desc_postApoc.toLowerCase();
        this.outside = outside;
        this.listExit = new HashMap<String, Exit>();
        this.listItems = new ArrayList<Item>();
    }
    
    public Place () {
        this("unknown", "unknown", "unknown", "unknown", "unknown", true);
    }
    
    // Getters :
    
    public String getName() {
        return this.name;
    }
    
    public String getDescription () {
        return this.description[Player.getWorld()];
    }
    
    public boolean isOutside() {
    	return this.outside;
    }
    
    public Exit getExit (String name) {
        return listExit.get(name);
    }

    public Item getItem (String item_name) {
    	for (Item i : listItems) {
            if (i.getName().equals(item_name)) {
                return i;
            }
        }
        return null;
    }
 
    // Setters :
    
    public void setName(String name) {
    	this.name = name.toLowerCase();
    }
    
    public void setDescription (String desc_modern, String desc_past, String desc_future, String desc_postApoc) {
        this.description[0] = desc_modern.toLowerCase();
        this.description[1] = desc_past.toLowerCase();
        this.description[2] = desc_future.toLowerCase();
        this.description[3] = desc_postApoc.toLowerCase();
    }
    
    public void setOutside(boolean outside) {
    	this.outside = outside;
    }

    public void addExitFree (String name) {
        Exit e = new ExitFree();
        listExit.put(name.toLowerCase(), e);
    }
    
    public void addExitEnigma (String name) {
        Exit e = new ExitEnigma();
        listExit.put(name.toLowerCase(), e);
    }
    
    public void addItem (Item myItem) {
        this.listItems.add(myItem);
    }
    
    public void delItem (Item myItem) {
    	for (Item i : this.listItems) {
            if (i == myItem) {
            	this.listItems.remove(this.listItems.indexOf(i));
            	break;
            }
        }
    }
    
    // Others :
    
    public String getOthersPlaces() {
    	// [!] Control information : There is at least one exit for a place.
    	String s = "";
    	for(Entry<String, Exit> entry : listExit.entrySet()) {
    	    s += entry.getKey();
    	    s += "; ";
    	}
    	return s;
    }
    
    public String getListItems() {
    	String s = "";
        for (Item i : listItems) {
        	s += i.getName() + "; ";
        }
        return s;   	
    }

    /**
     *
     
    public void getOthersPlaces() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public void addExit(String delta_amphi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}