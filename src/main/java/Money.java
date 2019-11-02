class Money {
    int amount;
    protected  String currency;
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount,"CHF");
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Money)
        {
            if(((Money) obj).currency.equals(this.currency))
            return ((Money) obj).amount == this.amount;
        }
        return false;
    }

    Money times(int multiplication) {
        return new Money(amount * multiplication,currency);
    }

    String  currency(){
        return currency;
    }
}
