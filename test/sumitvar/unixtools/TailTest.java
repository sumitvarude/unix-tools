package sumitvar.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TailTest {
    String text = "one\ntwo\nthree\nfour\nfive\nsix\n";
    @Test
    public void testGetTail() throws Exception {
        String expected = "two\nthree\nfour\nfive\nsix\n";
        String actual = new Tail().getTail(5,text);
        assertEquals(expected,actual);
    }
    @Test
    public void testGetTailWorksWithDifferentNoOfLines() throws Exception {
        String expected = "four\nfive\nsix\n";
        String actual = new Tail().getTail(3,text);
        assertEquals(expected,actual);
    }
}
