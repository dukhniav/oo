package cs345.orders;

import java.time.LocalDate;

/* A CorporateCustomer is one that has a credit limit and can buy products
 * on credit. That means that they can be billed later for purchases they
 * make.
 *
 * CorporateCustomer is a subclass of ExternalCustomer. The name and address
 * are inherited from ExternalCustomer.
 */
public class CorporateCustomer extends ExternalCustomer {

    private Money creditLimit;

    /* Constructor for CorporateCustomer.
     *
     * Note the super call in the first line. That calls the ExternalCustomer
     * constructor to initialize the ExternalCustomer part of
     * CorporateCustomer. For subclasses, the first line of the constructor
     * must be either super(...) or this(...). That is, you must either
     * construct the super class or refer to a different constructor for this
     * class that will initialize the superclass.
     */
    public CorporateCustomer(String name, String address, Money creditLimit) {
        super(name, address);
        this.creditLimit = creditLimit;
    }

    /* Getters and Setters */
    
    /* Note that the obligation to have a getCreditLimit method has been
     * indirectly inherited from Customer by way of ExternalCustomer. Since
     * ExternalCustomer did not implement this method, this class is obliged
     * to do so.
     */
    @Override
    public Money getCreditLimit() { return creditLimit; }

    /* Other methods for CorporateCustomer. */
    
    public void billForMonth(LocalDate date) { /* do billing */ }

    public void remind() {
        /* remind them that they owe us money */
    }
}