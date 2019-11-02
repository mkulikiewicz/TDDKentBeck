class Dollar extends Many {

    Dollar(int amount, String currency) {
        super(amount,currency);
    }

    Dollar times(int multiplication) {
        return Many.dollar(amount * multiplication);
    }
}
