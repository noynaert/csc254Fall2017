import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    static Person t1;
    static Person t2;
    static Person t3;
    static Person t4 = new Person("Paula Abdul",0.0);

    @Before
    public void beforeEach() throws Exception {
        t1 = new Person("Prince", 63.);
        t2 = new Person("Danny DeVito");
        t3 = new Person("Prince", 63.);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Prince",t1.getName());
        assertEquals("Danny DeVito", t2.getName());
        assertEquals("Prince", t3.getName());
        assertEquals("Paula Abdul",t4.getName());
    }

    @Test
    public void setName() throws Exception {
    }

    @Test
    public void getHeight() throws Exception {
        assertEquals(63, t1.getHeight(),0.1);
        assertEquals(Double.NaN,t2.getHeight(),0.0);
        assertEquals(63, t3.getHeight(),0.1);
        assertEquals(Double.NaN,t4.getHeight(),0.0);
    }

    @Test
    public void setHeight() throws Exception {
        t1.setHeight(65.);
        t2.setHeight(50.);
        t3.setHeight(0.0);
        t4.setHeight(0.0);

        assertEquals(65.0, t1.getHeight(),0.1);
        assertEquals(50.0, t2.getHeight(),0.1);
        assertEquals(Double.NaN, t3.getHeight(),0.1);
        assertEquals(Double.NaN, t4.getHeight(),0.1);
    }

    @Test
    public void hasHeight() throws Exception {
    }

    @Test
    public void testToString() throws Exception {
    }

    @Test
    public void compareTo() throws Exception {
            assertEquals(12,t1.compareTo(t2));
            assertEquals(-12,t2.compareTo(t1));
            assertTrue(t1.compareTo(t2) > 0);
            assertEquals(4, 4);  //valid but stupid test



    }

    @Test
    public void equals() throws Exception {
    }

    @Test
    public void testHashCode() throws Exception {
        assertEquals(98399757,t2.hashCode());
        assertTrue(t1.hashCode() == t3.hashCode());
        assertFalse(t1.hashCode() == t2.hashCode());
    }

}