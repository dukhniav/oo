package cs345.orders;

/* This class represents an internal customer. That is, a customer
 * within the same organization. Internal customers don't have
 * Names and Address but something that is derived from the
 * other information about internal customers.
 *
 * Note that the class says that it implements Customer. That
 * means that instances of this class can be used where a
 * Customer is asked for. Because this class implements
 * Customer, it is required to implement all the methods in
 * the Customer interface.
 */
public class InternalCustomer implements Customer {
    private String org;
    private String authorizedBy;

    /* Constructor for internal Customers. */
    public InternalCustomer(String org, String authorizedBy) {
        this.org = org;
        this.authorizedBy = authorizedBy;
    }

    /* Below are the three methods that implement the methods
     * required by the Customer interface.
     *
     * Note that these are all annotated with @Override. This
     * is in an indication to the compiler that these methods
     * override methods that are inherited from a superclass or
     * interface. If any of these methods is not, in fact,
     * overriding, the compiler will produce an error message.
     */
    @Override
    public String getName() {
        return org + " Authorized by: " + authorizedBy;
    }

    @Override
    public String getAddress() {
        return "<<Internal" + org+ ">>";
    }

    @Override
    public Money getCreditLimit() {
        return Currency.USD.zero();
    }
}
