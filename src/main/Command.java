package main;

import java.lang.reflect.*;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public enum Command {
    
	HELP("help", "show the commands description", "main.Command"),
    GO("go", "change the place", "people.Player"),
    LOOK("look", "get a simple description of the place and a list of neighboring places", "people.Player"),
    SEARCH("search", "get a better description of the place", "people.Player"),
    WATCH("watch", "get the description of an object", "people.Player"),
    TAKE("take", "take an object", "people.Player"),
    DROP("drop", "drop an object", "people.Player"),
    BAG("bag", "look inside your bag", "people.Player"),
    QUIT("quit", "quit the game", "main.Command"),
    USE("use", "use an object", "people.Player")//,
//    TALK("talk", "talk to another person", ""),
//    HIDE("hide", "hide the player", "");
    ;
    
    private String name;
    private String description;
    private Method myMethod;
    
    private Command (String name, String description, String path) {
        this.name = name;
        this.description = description;
        
        Class<?> myClass = null;
        
        try {
            myClass = Class.forName(path);
            Method[] myMethods = myClass.getMethods();
            
            for(int i=0; i< myMethods.length; i++) {
                if(myMethods[i].getName().equals(name)) {
                    myMethod = myMethods[i];
                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("[!] Error : "+ name +" command association failed.");
        }
    }

    @Override
    public String toString () {
        return this.name;
    }

    public static Command getCommand (String name) {
        for (Command c : Command.values()) {
            if(name.equals(c.toString())) {
                return c;
            }
        }
        return null;
    }
    
    public void execute(Object[] parameters) {
		Class<?> myClass = null;
		
		try {
			myClass = myMethod.getDeclaringClass();
		}
		catch (Exception e) {
			System.out.println("[!] Error: could not retrieve class from method " + myMethod.getName());
		}
		
		try {
			if((parameters == null || (parameters.length == 1 && parameters[0] == null))) 
				myMethod.invoke(myClass);
			else 
				myMethod.invoke(myClass, parameters);
		}
		catch (IllegalArgumentException e1) {
			System.out.println("[!] Error: illegal argument");			
		}
		catch (IllegalAccessException e2) {
			System.out.println("[!] Error: illegal access");
		}
		catch (InvocationTargetException e3) {
			System.out.println("[!] Error: invocation target failed");
		}
	}
	
    // Commands
    
	public static void help() {
		for(Command c : Command.values()) 
			System.out.println(c.name+"\t: "+c.description);
	}
	
	public static void quit() {
		System.exit(1);
	}
}