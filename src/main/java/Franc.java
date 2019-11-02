class Franc extends Many {

    Franc(int amount) {
        super(amount);
    }

    Franc times(int multiplication) {
        return new Franc(amount * multiplication);
    }
}
