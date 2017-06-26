package elements;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public abstract class Item {
	public String name;
	public String description;
	
	// Constructors :
	
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Item() {
		this("unknown", "unknown");
	}
	
	// Getters :
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	// Setters :
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	// Others :
	
	public boolean useItem() {
		System.out.println("Nothing happens.");
		return false;
	}
    
}