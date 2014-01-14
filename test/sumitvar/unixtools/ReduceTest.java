package sumitvar.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ReduceTest {
    @Test
    public void test_reduces_extra_spaces_from_data_in_single_line() throws Exception {
        Reduce reduceSpaces = new Reduce();
        String text = "sumit      varude\n";
        String expected = "sumit varude\n";
        String actual = reduceSpaces.reduce(text);
        assertEquals(expected,actual);
    }
    @Test
    public void test_reduces_extra_spaces_from_data_in_multiple_lines() throws Exception {
        Reduce reduceSpaces = new Reduce();
        String text = "sumit      varude\nsuraj     babar\n";
        String expected = "sumit varude\nsuraj babar\n";
        String actual = reduceSpaces.reduce(text);
        assertEquals(expected,actual);
    }
}
