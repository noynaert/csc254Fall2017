import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private final static double DELTA = 0.0001;


    @Test
    public void testSquareRoot() throws Exception {
        assertEquals(5., Main.squareRoot(25.), DELTA);
        assertEquals(1.4142, Main.squareRoot(2.), DELTA);
        assertEquals(0.,Main.squareRoot(0.),DELTA);
        assertEquals(1. ,Main.squareRoot(1.),DELTA);
        assertEquals(Double.NaN ,Main.squareRoot(-5),DELTA);
        assertEquals(9.135097153287424 ,Main.squareRoot(83.45),DELTA);
//        assertEquals( ,Main.squareRoot(),DELTA);
//        assertEquals( ,Main.squareRoot(),DELTA);

    }

    @Test
    public void testSquare() throws Exception {
        assertEquals(4, Main.square(2));
        assertEquals(1, Main.square(1));
        assertEquals(0, Main.square(0));
        assertEquals(25, Main.square(-5));
        assertEquals(625, Main.square(25));
        assertEquals(625, Main.square(-25));
        assertEquals(0, Main.square(-0));
        assertEquals(289, Main.square(17));

    }




}