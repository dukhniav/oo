package cs345.orders;

/* A PersonalCustomer is an ExternalCustomer that is also a Person. A
 * personal customer must supply a credit card for payment.
 *
 * Note that this class extends ExternalCustomer and implements Person.
 * This class also implements the Customer interface. That is inherited
 * from ExternalCustomer.
 *
 * No implementation for the getName method of Person is provided since
 * the getName method supplied by ExternalCustomer is used.
 */
public class PersonalCustomer extends ExternalCustomer implements Person {

    private String creditCardNumber;
    
    /* See CorporateCustomer for an explanation of super. */
    public PersonalCustomer(String name, String address, String creditCardNumber) {
        super(name, address);
        this.creditCardNumber = creditCardNumber;
    }

    /* This is the implementation of getCreditLimit that is required by
     * the Customer interface. */
    @Override
    public Money getCreditLimit() {
        return Currency.USD.zero();
    }
}
