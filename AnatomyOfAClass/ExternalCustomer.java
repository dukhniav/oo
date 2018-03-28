package cs345.orders;

/* An ExternalCustomer is someone (or some organization) who is external
 * to the company. ExternalCustomers have names and adresses.
 *
 * This is an abstract class. It is designed to be a superclass of one
 * or more subclasses. This class provides getName and getAddress
 * methods that are inherited from Customer.
 *
 * Note that the getCreditLimit method from Customer is not implemented
 * here. That's because (1) that method depends on knowledge of exactly
 * what kind of customer it is, and (2) since this class is abstract,
 * there is no obligation to override the getCreditLimit method. That
 * obligation is passed to the children of this class.
 */
public abstract class ExternalCustomer implements Customer {
    private String name;
    private String address;

    protected ExternalCustomer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getAddress() { return address; }
}
