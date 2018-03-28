package cs345.orders;

/* This is an example of an interface.
 *
 * There are no objects with class Money. However, objects that implement the
 * Money interface can be used when a Money is required.
 *
 * XXX Note that we are assuming that Money consists of an amount of some
 * currency. This is probably a bad assumption since it doesn't allow for
 * combinations of multiple different currencies.
 */
public interface Money {

    /* These two methods return the amount and kind of currency for this
     * money object.
     */

    /* Return a new Money object with the same value as this money object
     *
     * Note that there is no body for this methods. The body will be
     * provided as part of the implementation of classes that implement
     * the interface.
     */
    MoneyCurrency convertTo(Currency currency);

    /* Return the value of this money object in the given currency.
     *
     * Note that this method has a default body that is used if none
     * is supplied by the implementing class. This body refers to the
     * convertTo method that we know must exist.
     */
    default double getAmount(Currency currency) {
        return convertTo(currency).getAmount();
    }
}
