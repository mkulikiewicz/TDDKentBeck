class Franc extends Many {

    Franc(int amount, String currency) {
        super(amount,currency);
    }

    Franc times(int multiplication) {
        return Many.franc(amount * multiplication);
    }
}
