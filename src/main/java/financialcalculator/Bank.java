package financialcalculator;

import java.util.Hashtable;

class Bank {
    private Hashtable ratest = new Hashtable();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if (from.equals(to))
            return 1;
        return (int) ratest.get(new Pair(from, to));
    }

    void addRate(String from, String to, int rate) {
        ratest.put(new Pair(from, to), rate);
    }
}
