package cs345.orders;

/* Currency enumeration.
 *
 * Currency is an enumeration. There will be exactly nine Currency objects.
 * The constants CAD, ... USD are those nine objects. Note that enumerations
 * are first-class objects. So the methods zero and conversion rate exist
 * for Currency objects.
 */
public enum Currency {
    CAD, CHF, CNY, EUR, GBP, JPY, NOK, RUB, USD;

    private Money zeroValue;

    Currency() {
        zeroValue = new MoneyCurrency(this, 0.0);
    }

    /* Return a zero money amount in this currency. */
    public Money zero() {
        return zeroValue;
    }

    /* Return the conversion rate from this currency to other. */
    public double conversionRate(Currency other) {
        /* Needs an implementation. Probably references the data from some
         * conversion server. */
        return 0.0; /* This keeps the compiler from complaining. */
    }
}
