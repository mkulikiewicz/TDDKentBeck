import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FrancTest {


    @Test
    public void testMultiplication()
    {
        Many five = Many.franc(5);
        assertEquals(Many.franc(10),five.times(2));
        assertEquals(Many.franc(15),five.times(3));
    }

    @Test
    public void testEquality()
    {
        assertTrue(Many.franc(5).equals(Many.franc(5)));
        assertFalse(Many.franc(5).equals(Many.franc(6)));
        assertFalse(Many.franc(5).equals(Many.dollar(5)));
    }
}
