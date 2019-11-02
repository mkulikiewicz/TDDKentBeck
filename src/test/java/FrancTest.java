import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrancTest {


    @Test
    public void testMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testDifferentClassEquality() {
        assertEquals(new Money(5, "USD"), new Dollar(5, "USD"));
        assertEquals(new Money(5, "CHF"), new Franc(5, "CHF"));
    }
}
