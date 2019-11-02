abstract class Many {
    int amount;
    protected  String currency;
    Many(int amount, String currency) {
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
        if(obj instanceof  Many)
        {
            if(obj.getClass().equals(this.getClass()))
            return ((Many) obj).amount == this.amount;
        }
        return false;
    }

    abstract Many times(int amount);

    String  currency(){
        return currency;
    }
}
