import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZombieTest {
    static Zombie a;
    static Zombie b;
    static Zombie c;
    static Zombie d;

    @Before
    public void beforeEach() throws Exception {
        a = new Zombie("Ted", 55.0);
        b = new Zombie("Sam");
        c = new Zombie("Ted", 55.0);
        d = new Zombie("bOb", 55.0);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Ted",a.getName());
    }

    @Test
    public void setName() throws Exception {
    }

    @Test
    public void getHealth() throws Exception {
    }

    @Test
    public void setHealth() throws Exception {
    }

    @Test
    public void testToString() throws Exception {

    }

    @Test
    public void compareTo() throws Exception {


        assertEquals(0, a.compareTo(c));
        assertEquals(1, a.compareTo(b));
        assertEquals(-1, b.compareTo(c));
        assertTrue(b.compareTo(c) < 0);
        assertFalse(b.compareTo(c) > 0);


    }

}