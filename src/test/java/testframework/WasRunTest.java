package testframework;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WasRunTest {

    @Test
    public void testMethodInWasRunClass()
    {
        WasRun test = new WasRun(true);
        test.run();
        assertTrue(test.wasRun);
    }

    @Test
    public void testTestCase()
    {
        WasRun test = new WasRun(false);
        assertFalse(test.wasRun);
        test.run();
        assertTrue(test.wasRun);
    }


}