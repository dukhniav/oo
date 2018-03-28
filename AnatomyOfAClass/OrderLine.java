package cs345.orders;

/* This class represents an OrderLine in an Order. */
public class OrderLine {

    /* Attributes */
    private int quantity;
    private Product product;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    /* Getters and Setters */
    public Product getProduct() { return product; }

    public int getQuantity() { return quantity; }
    
    /* Change the quantity and recompute the price. */
    public void setQuantity(int value) {
        this.quantity = quantity;
    }
    
    public Money getPrice() { return product.getPrice(quantity); }
}
