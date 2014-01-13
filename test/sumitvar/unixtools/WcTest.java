package sumitvar.unixtools;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

public class WcTest {
    String text = "one\ntwo\nthree\n";
    @Test
    public void testCountChar() throws Exception {
        int expected = 14;
        int actual = new Wc().CountChar(text);
        assertEquals(expected,actual);
    }

    @Test
    public void testCountLines() throws Exception {
        int expected = 3;
        int actual = new Wc().CountLines(text);
        assertEquals(expected,actual);
    }

    @Test
    public void testCountWord() throws Exception {
        int expected = 3;
        int actual = new Wc().CountWord(text);
        assertEquals(expected,actual);
    }
}
