package people;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class LowAttack implements Attack {
    
    @Override
    public void attack (){
       Player.setHealthPoint(Player.getHealthPoint()-1); 
    }
}
