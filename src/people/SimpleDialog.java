package people;

/**
 * @author COGNET
 * @author DUPUIS
 * @author FEY
 */

public class SimpleDialog implements Dialog {
    
    private String contents;
    
    public SimpleDialog (String contents){
        this.contents = contents;
    }
    
    @Override
    public void talk (){
        System.out.println(this.contents);
    }
}
