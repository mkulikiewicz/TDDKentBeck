class Dollar extends Many {

    Dollar(int amount) {
        super(amount);
    }

    Dollar times(int multiplication) {
        return new Dollar(amount * multiplication);
    }
}
