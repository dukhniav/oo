package cs345.orders;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/*
 * This class defines an Order for a purchasing system.
 * Orders consist of multiple OrderLines and an associated
 * Customer. Orders also contain other information regarding the
 * Order.
 */
 public class Order {

    /* Attributes. All attributes are private. Getters and setters are
     * used to provide access to attributes.
     */
    private Customer customer; // The customer for the order
    private Instant dateReceived; // The date and time of the order
    private boolean prepaid; // Whether the order is prepaid or needs to be billed
    private String orderNumber; // The order number, unique for each order
    private Money price = Currency.USD.zero(); // The price of the order
    
    /* Here are the order lines for this Order. */
    private List<OrderLine> lineItems;

    {
        /* This is an initializer. This code will be executed each time a new
         * instance is created after the individual attribute initializers
         * and before the constructor. */
         
        /* This example mostly shows how to "do something". Overall, this is
         * probably bad style. */
         
        customer = Customer.UNKNOWN_CUSTOMER;
        orderNumber = "*** No Order Number ***";
        prepaid = false;
        lineItems = new ArrayList<>();
    }

    /* nextOrderNumber is a static attribute. That means that there is only one
     * nextOrderNumber that is shared by all Orders. Ordinary attributes, like
     * those above, have one per object.
     *
     * The idea here is that when an Order is created, it gets the next
     * order number and updates this attribute. In this way all Orders are
     * assigned order numbers from a single sequence.
     */
    private static String nextOrderNumber; 

    static {
        /* This is a static intializer. Code here will be executed when the
         * class is initialized. This happens before any instance of the class
         * is created.
         *
         * The purpose of this initializer is to initialize the nextOrderNumber
         * field from an external source, like a database.
         */
    }

    /* Return the next available order number. */
    public static String nextOrderNumber() {
        String result = nextOrderNumber;
        /* Update nextOrderNumber */
        return result;
    }

    /* Constructors */
    
    /* Here is an "default" constructor. It takes no parameters and sets the
     * attributes to default values. Note that the initializer block sets the
     * value of the other attributes.
     */
    public Order() {
        orderNumber = nextOrderNumber();
        dateReceived = Instant.now();
    }

    /* This constructor initializes all attributes of an Order. Note that the
     * dateReceived, orderNumber, and lineItems are set to standard values.
     */
    public Order(Customer customer, boolean prepaid) {
        this();
        this.customer = customer;
        this.prepaid = prepaid;
    }

    /* Here is another constructor that doesn't require the prepaid parameter.
     *
     * Note that this constructor doesn't duplicate the code from the previous
     * constructor but simply calls this to invoke that constructor. The call
     * to "this", if present, must be the first line of the constuctor.
     */
    public Order(Customer customer) {
        this(customer, false);
    }
    
    /* Getters and setters */
    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }

    public Instant getDateReceived() { return dateReceived; }

    public void setDateReceived(Instant time) { dateReceived = time; }

    public boolean isPrepaid() { return prepaid; }

    public void setPrepaid(boolean prepaid) { this.prepaid = prepaid; }

    public String getOrderNumber() { return orderNumber; }

    public Money getPrice() { return price; }

    /* Other methods */

    void dispatch() { /* Send order to customer */ }

    void close() { /* Change order status to closed */ }

    /* Add an OrderLine to lineItems for this Order. */
    void addLineItem(OrderLine line) { lineItems.add(line); }
}
