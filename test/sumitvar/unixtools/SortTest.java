package sumitvar.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SortTest {
    String text = "b\nc\na\nd\ne";
    @Test
    public void test_checks_weather_sort_method_sorts_data_properly() throws Exception {
        Sort sortdata = new Sort();
        String expected = "a\nb\nc\nd\ne\n";
        String actual = sortdata.sort(text);
        assertEquals(expected,actual);
    }

    @Test
    public void test_checks_weather_reverse_method_sorts_data_reversely() throws Exception {
        Sort sortdata = new Sort();
        String expected = "e\nd\nc\nb\na\n";
        String actual = sortdata.reverse(text);
        assertEquals(expected,actual);
    }
}
