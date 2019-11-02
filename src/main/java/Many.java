abstract class Many {
    int amount;

    Many(int amount) {
        this.amount = amount;
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
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
}
