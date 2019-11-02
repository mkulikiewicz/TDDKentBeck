import org.testng.annotations.*;

import static org.testng.Assert.*;

public class DollarTest {


    @Test
    public void testMultiplication()
    {
        Many five = Many.dollar(5);
        assertEquals(Many.dollar(10),five.times(2));
        assertEquals(Many.dollar(15),five.times(3));
    }

    @Test
    public void testEquality()
    {
        assertTrue(Many.dollar(5).equals(Many.dollar(5)));
        assertFalse(Many.dollar(5).equals(Many.dollar(6)));
    }
}
