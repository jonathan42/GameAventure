package people;

import world.Place;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class ModernPeople extends People {
    
    private String nom;
    private final int WORLD = 0;

    public ModernPeople (Attack a, Dialog d){
        super(a,d);
    }
    
    public ModernPeople () {
        super();
    }
    
    public ModernPeople (Dialog d){
        super(d);
    }
    
    public ModernPeople (Dialog d, Place p){
        super(d,p);
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void parler (){
        
    }
}