package cs345.orders;

/* A Customer. There are a number of different Customer classes. They all
 * implement this interface.
 *
 * The methods in this interface represent the minimal that is expected from a 
 * Customer--a Name and Address and credit limit information.
 *
 * Classes that implement this interface are free to provide this information
 * in any appropriate manner.
 */
public interface Customer {
    
    static Customer UNKNOWN_CUSTOMER = null;
    
    String getName();
    String getAddress();
    Money getCreditLimit();
}
