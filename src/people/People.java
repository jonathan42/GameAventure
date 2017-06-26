package people;

import elements.Item;
import world.Place;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public abstract class People {
    
    private Attack myAttack = new Pacifist ();
    private Dialog myDialog = new NoDialog ();
    private Item myItem;
    private Place myPlace;
    
    public People (Attack myAttack, Dialog myDialog, Item item, Place myPlace){
        this.myAttack = myAttack;
        this.myDialog = myDialog;
        this.myItem = item;
        this.myPlace = myPlace;
    }
    
    public People (Attack myAttack, Dialog myDialog){
        this.myAttack = myAttack;
        this.myDialog = myDialog;
    }
    
    public People (Attack myAttack) {
        this.myAttack = myAttack;
    }
    
    public People (Dialog myDialog) {
        this.myDialog = myDialog;
    } 
    
    public People (Dialog myDialog, Place myPlace) {
        this.myDialog = myDialog;
        this.myPlace = myPlace;
    } 
    
    public People (){}

    public Attack getMyAttack() {
        return myAttack;
    }

    public Dialog getMyDialog() {
        return myDialog;
    }

    public Item getMyItem() {
        return myItem;
    }

    public Place getMyPlace() {
        return myPlace;
    }

    public void setMyAttack(Attack myAttack) {
        this.myAttack = myAttack;
    }

    public void setMyDialog(Dialog myDialog) {
        this.myDialog = myDialog;
    }

    public void setMyItem(Item myItem) {
        this.myItem = myItem;
    }

    public void setMyPlace(Place myPlace) {
        this.myPlace = myPlace;
    }
    
    public void attack () {
        myAttack.attack();
    }
    
    public void talk () {
       myDialog.talk(); 
       if (myDialog instanceof ComplexDialog && ((ComplexDialog)myDialog).isCorrect()) {
           this.dropItem ();
       }
    }
    
    public void dropItem () {
        this.myPlace.addItem(myItem);
        this.myItem = null;
    }
}