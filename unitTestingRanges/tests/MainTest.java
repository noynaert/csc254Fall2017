import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private final static String SPECIAL5 = ".,+-&";
    private final static String SPECIAL10 = SPECIAL5+ "@!$%*";

    @Test
    public void countSpecial() throws Exception {
        assertEquals(0, Main.countSpecial("abc", SPECIAL10));
        assertNotEquals(1, Main.countSpecial("abc?", SPECIAL10));
        assertEquals(1, Main.countSpecial("abc.", SPECIAL10));
        assertEquals(2, Main.countSpecial("abc@!", SPECIAL10));
        assertEquals(3, Main.countSpecial("abc.+$", SPECIAL10));
        assertEquals(5, Main.countSpecial("a@!.,+bc", SPECIAL10));
        assertEquals(1, Main.countSpecial("abc@@@@@@@@@@@", SPECIAL10));


    }

    @Test
    public void hasDigit() throws Exception {
        assertTrue(Main.hasDigit("abc123"));
        assertFalse(Main.hasDigit("abc"));
        assertTrue(Main.hasDigit("123"));
        assertTrue(Main.hasDigit("1"));
        assertTrue(Main.hasDigit("abc123"));
        assertTrue(Main.hasDigit("2"));
        assertTrue(Main.hasDigit("3"));
        assertTrue(Main.hasDigit("0"));
        assertTrue(Main.hasDigit("9"));
        assertFalse(Main.hasDigit("/"));
        assertFalse(Main.hasDigit(":"));
  }

}