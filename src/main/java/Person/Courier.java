/*
 * Author: Lynn
 * Lecture: Bennard Humm
 */
package Person;

/**
 *
 * @author Lynn_Ngx
 */
public abstract class Courier implements IPerson {
    
    public int CourierId = 0 ;
    
    public int setCourierId(int CourierId){
        this.CourierId = CourierId ++ ;
        return CourierId ;
    }
    
    
}
