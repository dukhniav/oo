package cs345.orders;

/* An amount of money is a single currency */
final class MoneyCurrency implements Money {
    
    /* Note that the attributes are final. These values cannot
     * be changed after an instance is constructed.
     *
     * MoneyCurrency is a "value type".
     */
    private final Currency currency;
    private final double amount;

    public MoneyCurrency(Currency currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    /* getters */
    public Currency getCurrency() { return currency; }
    
    public double getAmount() { return amount; }
    
    /* See Money.convertTo */
    @Override
    public MoneyCurrency convertTo(Currency currency) {
        if (currency == this.currency) {
            /* Note: We're not worried about doing this since the
             * receiver can't modify this. */
            return this;
        } else {
            return new MoneyCurrency(currency, getAmount(currency));
        }
    }

    /* See Money.getAmount */
    @Override
    public double getAmount(Currency currency) {
        if (currency == this.currency) {
            return this.amount;
        } else {
            return this.currency.conversionRate(currency) * this.amount;
        }
    }
}