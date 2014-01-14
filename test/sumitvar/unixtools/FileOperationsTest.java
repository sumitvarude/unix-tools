package sumitvar.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by udaykant on 1/14/14.
 */
public class FileOperationsTest {
    @Test
    public void testGetCombinedData() throws Exception {
        FileOperations fs = new FileOperations();
        String[] lines = {"sumit","varude","ankit","vikash"};
        String expected = "sumit\nvarude\nankit\nvikash\n";
        String actual = fs.getCombinedData(lines);
        assertEquals(expected,actual);
    }

    @Test
    public void testGetLines() throws Exception {
        FileOperations fs = new FileOperations();
        String text = "sumit\nvarude\nankit\nvikash\n";
        String[] expected = {"sumit","varude","ankit","vikash"};
        String[] actual = fs.getLines(text);
        for (int i = 0; i < actual.length ; i++) {
            assertEquals(expected[i],actual[i]);
        }
    }
}
