package financialcalculator;

class Pair {
    private String from;
    private String to;

    Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pair)
            return from.equals(((Pair) obj).from) && to.equals(((Pair) obj).to);
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
