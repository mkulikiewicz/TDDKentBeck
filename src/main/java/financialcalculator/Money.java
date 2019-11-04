package financialcalculator;

class Money implements Expression {
    int amount;
    String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            if (((Money) obj).currency.equals(this.currency))
                return ((Money) obj).amount == this.amount;
        }
        return false;
    }

    public Expression times(int multiplication) {
        return new Money(amount * multiplication, currency);
    }

    String currency() {
        return currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank,String to) {
        int rate = bank.rate(currency,to);
        return new Money(amount/rate, to);
    }

    @Override
    public String toString()
    {
        if(currency.equals("USD"))
        return amount + "$";
        if(currency.equals("CHF"))
            return amount+"₣";
        return amount + currency;
    }
}
