package cs345.orders;

/* This is the start of an interface or class fora Product. There is
 * certainly more that is required of a Product object.
 */
public interface Product {

    String getName();

    Money getPrice(int quantity);
}
