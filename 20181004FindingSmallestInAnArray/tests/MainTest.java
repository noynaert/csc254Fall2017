import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private static final double[] empty = {};
    private static final double DELTA= 0.001;
    private static final double[] DBL_LIST1 = {3.14159, 0.0, -3, 1.41459, 88., -3.14159, -2.7};
    private static final double[] DBL_LIST2 = {3.14159, 0.0, -3, 1.41459, 88., -3.14159};
    private static final double[] DBL_LIST3 = {3.14159, 0.0, -3, 1.41459, 88.};
    private static final double[] DBL_LIST4 = {-4.0, 3.14159, 0.0, -3, 1.41459, 88., -3.14159, -2.7};
    private static final double[] DBL_LIST5 = {3.14159};
    private static final String STR1[] = {"blue", "red", "green", "orange", "pink"};
    private static final String STR2[] = {"blue", "red", "green", "orange", "aquamarine","pink"};
    private static final String STR3[] = {"red", "green", "orange", "pink"};
    private static final String STR4[] = {"blue", "red", "green", "12","orange", "pink"};
    private static final String STR5[] = {"green"};
    private static final String STR6[] = {};
    private static final String STR7[] = {"green", "grey"};
    private static final String STR8[] = {"green", "gray", "grey"};
    private static final String STR9[] = {"green", "gree", "gr"};






    @Test
    public void testFindMinimum() throws Exception {
        assertEquals(Double.MAX_VALUE, Main.findMinimum(empty, 0), 0.0);
        assertEquals(-3.14159, Main.findMinimum(DBL_LIST1, DBL_LIST1.length), 0.001);
        assertEquals(-3.14159, Main.findMinimum(DBL_LIST2, DBL_LIST2.length), DELTA);
        assertEquals(-3., Main.findMinimum(DBL_LIST3, DBL_LIST3.length), DELTA);
        assertEquals(-4., Main.findMinimum(DBL_LIST4, DBL_LIST4.length), DELTA);
        assertEquals(3.1416, Main.findMinimum(DBL_LIST5, DBL_LIST5.length), DELTA);
    }
    @Test
    public void testMinimumString() throws Exception{
        assertEquals("blue", Main.findMinimum(STR1,STR1.length));
        assertEquals("aquamarine", Main.findMinimum(STR2,STR2.length));
        assertEquals("green", Main.findMinimum(STR3,STR3.length));
        assertEquals("12", Main.findMinimum(STR4,STR4.length));
        assertEquals("green", Main.findMinimum(STR5,STR5.length));
        assertEquals("~~~~~~~~", Main.findMinimum(STR6,STR6.length));
        assertEquals("green", Main.findMinimum(STR7,STR7.length));
        assertEquals("gray", Main.findMinimum(STR8,STR8.length));
        assertEquals("gr", Main.findMinimum(STR9,STR9.length));


    }

}