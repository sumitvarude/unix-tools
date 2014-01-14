package sumitvar.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutTest {
    @Test
    public void test_gives_column_no_3() throws Exception {
        Cut cut = new Cut();
        String text = "sumit hanmant varude\nsuraj maruti babar\n";
        String expected = "varude\nbabar\n";
        String actual = cut.column(3," ",text);
        assertEquals(expected,actual);
    }
    @Test
    public void test_gives_column_no_1() throws Exception {
        Cut cut = new Cut();
        String text = "sumit hanmant varude\nsuraj maruti babar\n";
        String expected = "sumit\nsuraj\n";
        String actual = cut.column(1," ",text);
        assertEquals(expected,actual);
    }

}
