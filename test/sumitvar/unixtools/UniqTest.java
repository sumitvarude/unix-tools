package sumitvar.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqTest {

    @Test
    public void testGetUniqLines() throws Exception {
        String text = "ab\nab\ncd\ncd\n";
        String expected = "ab\ncd\n";
        String actual  = new Uniq().getUniqLines(text);
        assertEquals(expected,actual);
    }
    @Test
    public void testGetUniqLinesWith() throws Exception {
        String text = "ab\nab\nabcd\nabcd\nac\nad";
        String expected = "ab\nabcd\nac\nad\n";
        String actual  = new Uniq().getUniqLines(text);
        assertEquals(expected,actual);
    }
}
