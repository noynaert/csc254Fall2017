import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void closeEnough() throws Exception {
        assertTrue(Main.closeEnough(5.0, 5.0, Main.DELTA));
        assertFalse(Main.closeEnough(5+Main.DELTA, 5, Main.DELTA));
        assertTrue(Main.closeEnough(5 + Main.DELTA - .00000001, 5, Main.DELTA));

    }


    static double[] test1 = {3.14159, 3.0, -2, 88, 0.0};
    @Test
    public void contains() throws Exception {
        assertFalse(Main.contains(-7, test1, test1.length));
        assertTrue(Main.contains(0.0, test1, test1.length));
        assertTrue(Main.contains(-2.0, test1, test1.length));
        assertTrue(Main.contains(3.14160, test1, test1.length));
       // assertTrue(Main.contains(3.14159, test1, test1.length));

    }

}