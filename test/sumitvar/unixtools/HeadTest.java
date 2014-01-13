package sumitvar.unixtools;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HeadTest {
    String text = "one\ntwo\nthree\nfour\nfive\nsix\n";
    @Test
    public void testGetHead() throws Exception {
        String expected = "one\ntwo\nthree\nfour\nfive\n";
        String actual = Head.getHead(5,text);
        assertEquals(expected,actual);
    }
    @Test
    public void testGetHeadWillExecuteWithout() throws Exception {
        String expected = "one\ntwo\nthree\n";
        String actual = Head.getHead(3,text);
        assertEquals(expected,actual);
    }
}
