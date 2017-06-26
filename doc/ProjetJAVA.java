/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java;

import java.util.*;

/**
 *
 * @author emmanuelcognet
 */
public class ProjetJAVA {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        
        
        // B2 RDZ
        World.addPlace("B2 hall", "Small tables in the right side with a coffee machine", false);
            World.getPlace("B2 hall").addExit("Delta amphi");
            World.getPlace("B2 hall").addExit("Corridor_1");
            World.getPlace("B2 hall").addExit("Stairs");
            World.getPlace("B2 hall").addExit("Outside_1");
        
        World.addPlace("Delta amphi", "Big amphitheater", false);
            World.getPlace("Delta amphi").addExit("B2 hall");
        
        World.addPlace("Corridor_1", " ", false);
            World.getPlace("Corridor_1").addExit("Corridor_2");
            World.getPlace("Corridor_1").addExit("B2 hall");
            World.getPlace("Corridor_1").addExit("TD1 room");
            World.getPlace("Corridor_1").addExit("TD/cours");
            World.getPlace("Corridor_1").addExit("secretaria office");
            World.getPlace("Corridor_1").addExit("annie desk");
            
        World.addPlace("TD1 room", "room  of cours", false);
            World.getPlace("TD1 room").addExit("Corridor_1");
           
        World.addPlace("annie desk", "desk prof", false);
            World.getPlace("annie desk").addExit("Corridor_1");
        
        World.addPlace("secretaria office", " ", false);
            World.getPlace("secretaria office").addExit("Corridor_1");
               
       // World.addPlace("clarise desk", " ", false);
       //     World.getPlace("clarise desk").addExit("Corridor_1");
        
        World.addPlace("DT/cours", " ", false);
            World.getPlace("DT/cours").addExit("Corridor_1");
          
        World.addPlace("Corridor_2", " ", false);
            World.getPlace("Corridor_2").addExit("Corridor_1");
            World.getPlace("Corridor_2").addExit("hall b2 bis");
            World.getPlace("Corridor_2").addExit("Stairs_2");
            
        World.addPlace("Stairs_2", " ", false);
            World.getPlace("Stairs_2").addExit("Corridor_2");
            World.getPlace("Stairs_2").addExit("Corridor_4");
            
         World.addPlace("hall b2 bis", " ", false);
            World.getPlace("hall b2 bis").addExit("Corridor_2");
            World.getPlace("hall b2 bis").addExit("Staires_2");
            World.getPlace("hall b2 bis").addExit("Outside_3");
            
      //////////////////////////////////////////////////////////////////////////  
        // B2 etage
        World.addPlace("Stairs", " tableau (enigm possilbe)", false);
            World.getPlace("Stairs").addExit("Corridor_1");
            World.getPlace("Stairs").addExit("Corridor_3");
            
        World.addPlace("Corridor_3", " ", false);
            World.getPlace("Corridor_3").addExit("Stairs");
            World.getPlace("Corridor_3").addExit("TP1");
            World.getPlace("Corridor_3").addExit("TP2");
            World.getPlace("Corridor_3").addExit("cours");
            World.getPlace("Corridor_3").addExit("TD2");
            World.getPlace("Corridor_3").addExit("Corridor_4");
        
         World.addPlace("TP1", " ", false);
            World.getPlace("TP1").addExit("Corridor_3");
         
         World.addPlace("TP2", " ", false);
            World.getPlace("TP2").addExit("Corridor_3");
           
           
         World.addPlace("TD2", " ", false);
            World.getPlace("TD2").addExit("Corridor_3");
             
         World.addPlace("cours", " ", false);
            World.getPlace("cours").addExit("Corridor_3");
            
            
        World.addPlace("Corridor_4", " ", false);
            World.getPlace("Corridor_4").addExit("Stairs_2");
            World.getPlace("Corridor_4").addExit("TD3");
            World.getPlace("Corridor_4").addExit("info 1");
            World.getPlace("Corridor_4").addExit("info 2");
            World.getPlace("Corridor_4").addExit("TP3");
            World.getPlace("Corridor_4").addExit("Corridor_3");
        
        World.addPlace("TP3", " ", false);
            World.getPlace("TP3").addExit("Corridor_4");
         
         World.addPlace("info 1", " ", false);
            World.getPlace("info 1").addExit("Corridor_4");
           
           
         World.addPlace("TP3", " ", false);
            World.getPlace("TP3").addExit("Corridor_4");
                 
         World.addPlace("info 2", " ", false);
            World.getPlace("info 2").addExit("Corridor_4");
            
      //////////////////////////////////////////////////////////////////////////  
      // B3        
       
        World.addPlace("Hall B3", " ", false);
            World.getPlace("Hall B3").addExit("Stairs_B3");
            World.getPlace("Hall B3").addExit("Amphi I");
            World.getPlace("Hall B3").addExit("Amphi II");
            World.getPlace("Hall B3").addExit("Outside_3");
            
        World.addPlace("Amphi I", " ", false);
            World.getPlace("Amphi I").addExit("Hall B3");
            
        World.addPlace("Amphi II", " ", false);
            World.getPlace("Amphi II").addExit("Hall B3");
            
        World.addPlace("Stairs_B3", " ", false);
            World.getPlace("Stairs_B3").addExit("Hall B3");
            World.getPlace("Stairs_B3").addExit("Corridor B3");
            
        // B3 etage
        World.addPlace("Corridor B3", " ", false);
            World.getPlace("Corridor B3").addExit("Secretarie office_B3");
            World.getPlace("Corridor B3").addExit("Asso I");
            World.getPlace("Corridor B3").addExit("Asso II");
            World.getPlace("Corridor B3").addExit("Asso III");
            World.getPlace("Corridor B3").addExit("Stairs_B3");
            
        World.addPlace("Secretarie office_B3", " ", false);
            World.getPlace("Secretarie office_B3").addExit("Stairs B3");
            
        World.addPlace("Asso I", " ", false);
            World.getPlace("Asso I").addExit("Stairs B3");
            
        World.addPlace("Asso II", " ", false);
            World.getPlace("Asso II").addExit("Stairs B3");
            
          World.addPlace("Asso III", " ", false);
            World.getPlace("Asso III").addExit("Stairs B3");
      
            
            
      //////////////////////////////////////////////////////////////////////////  
      // B7        
       
        World.addPlace("Hall B7", " ", false);
            World.getPlace("Hall B7").addExit("Stairs_B7");
            World.getPlace("Hall B7").addExit("Amphi A");
            World.getPlace("Hall B7").addExit("Amphi B");
            
        World.addPlace("Amphi A", " ", false);
            World.getPlace("Amphi A").addExit("Hall B7");
            
        World.addPlace("Amphi B", " ", false);
            World.getPlace("Amphi B").addExit("Hall B7");
            
        World.addPlace("Stairs_B3", " ", false);
            World.getPlace("Stairs_B3").addExit("Hall B7");
            
       // B7 etage condanné
       
            
            
            
     //////////////////////////////////////////////////////////////////////////  
     // B5 

            
        World.addPlace("Hall B5", " ", false);
            World.getPlace("Hall B5").addExit("Desk_1");
            World.getPlace("Hall B5").addExit("corrindor_B5");
            World.getPlace("Hall B5").addExit("outsides_5");
           
        World.addPlace("Desk_1", " ", false);
            World.getPlace("Desk_1").addExit("Hall B5");
         
        World.addPlace("Corridor_B5", " ", false);
            World.getPlace("Corridor_B5").addExit("Desk_2");
            World.getPlace("Corridor_B5").addExit("Desk_3");
            World.getPlace("Corridor_B5").addExit("Desk_4");
            World.getPlace("Corridor_B5").addExit("Desk_5");
            World.getPlace("Corridor_B5").addExit("Desk_6");
            World.getPlace("Corridor_B5").addExit("Hall B5");
        
        World.addPlace("Desk_2", " ", false);
            World.getPlace("Desk_2").addExit("Corridor_B5");
         
        World.addPlace("Desk_3", " ", false);
            World.getPlace("Desk_3").addExit("Corridor_B5");
              
        World.addPlace("Desk_4", " ", false);
            World.getPlace("Desk_4").addExit("Corridor_B5");
                 
        World.addPlace("Desk_5", " ", false);
            World.getPlace("Desk_5").addExit("Corridor_B5");
            
        World.addPlace("Desk_6", " ", false);
            World.getPlace("Desk_6").addExit("Corridor_B5");
 
    
    //////////////////////////////////////////////////////////////////////////  
     // B5 

            
        World.addPlace("Hall RU", " ", false);
            World.getPlace("Hall RU").addExit("stairs_ru");
            World.getPlace("Hall RU").addExit("cafet");
            World.getPlace("Hall RU").addExit("Restot_1");
            World.getPlace("Hall RU").addExit("outsides_7");
           
        World.addPlace("Restot_1", " ", false);
            World.getPlace("Restot_1").addExit("Hall RU");
    
        World.addPlace("cafet", " ", false);
            World.getPlace("cafet").addExit("Hall RU");
            
        World.addPlace("stairs_ru", " ", false);
            World.getPlace("stairs_ru").addExit("Hall RU");
            World.getPlace("stairs_ru").addExit("restot_2");
    
        World.addPlace("restot_2", " ", false);
            World.getPlace("restot_2").addExit("stairs_RU");
            World.getPlace("restot_2").addExit("restot_3");
            
        World.addPlace("restot_3", " ", false);
            World.getPlace("restot_3").addExit("restot_2");    
            
    /////////////////////////////////////////////////////////////////////
    /// les liens exterieurs
            
        World.addPlace("Outside_1", " ", false);
            World.getPlace("Outside_1").addExit("Hall_B2");
            World.getPlace("Outside_1").addExit("Outside_2");
            World.getPlace("Outside_1").addExit("Outside_6");
            World.getPlace("Outside_1").addExit("Outside_5");
            
        World.addPlace("Outside_2", " ", false);
            World.getPlace("Outside_2").addExit("Outside_1");
            World.getPlace("Outside_2").addExit("Outside_4");
            World.getPlace("Outside_2").addExit("Outside_3");
            World.getPlace("Outside_2").addExit("Outside_5");
           
        World.addPlace("Outside_3", " ", false);
            World.getPlace("Outside_3").addExit("Outside_2");
            World.getPlace("Outside_3").addExit("Outside_4");
            World.getPlace("Outside_3").addExit("Hall_B2_bis");
            World.getPlace("Outside_3").addExit("hall_B3");
            
        World.addPlace("Outside_4", " ", false);
            World.getPlace("Outside_4").addExit("Outside_2");
            World.getPlace("Outside_4").addExit("Outside_9");
            World.getPlace("Outside_4").addExit("Outside_3");
            World.getPlace("Outside_4").addExit("Hall_B7");
            
        World.addPlace("Outside_5", " ", false);
            World.getPlace("Outside_5").addExit("Outside_2");
            World.getPlace("Outside_5").addExit("Outside_1");
            World.getPlace("Outside_5").addExit("Outside_6");
            World.getPlace("Outside_5").addExit("Hall_B5");
            
        World.addPlace("Outside_6", " ", false);
            World.getPlace("Outside_6").addExit("Outside_1");
            World.getPlace("Outside_6").addExit("Outside_5");
            World.getPlace("Outside_6").addExit("Outside_7");
            World.getPlace("Outside_6").addExit("Outside_10");
            
        World.addPlace("Outside_7", " ", false);
            World.getPlace("Outside_7").addExit("Outside_6");
            World.getPlace("Outside_7").addExit("Outside_8");
            World.getPlace("Outside_7").addExit("Hall_RU");
            World.getPlace("Outside_7").addExit("Outside_10");
            
        World.addPlace("Outside_8", " ", false);
            World.getPlace("Outside_8").addExit("Outside_7");
            World.getPlace("Outside_8").addExit("Outside_9");
            
        World.addPlace("Outside_9", " ", false);
            World.getPlace("Outside_9").addExit("Outside_8");
            World.getPlace("Outside_9").addExit("Outside_4");
            
        World.addPlace("Outside_10", " ", false);
            World.getPlace("Outside_10").addExit("Outside_7");
            World.getPlace("Outside_10").addExit("Outside_6");
          
    }
}
