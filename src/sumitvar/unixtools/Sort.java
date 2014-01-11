package sumitvar.unixtools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort extends FileOperations {
    public String sort(String fileData) {
        FileOperations fs = new FileOperations();

        String lines[] = fileData.split("\n");
        Arrays.sort(lines);
        String combinedData = fs.getCombinedData(lines);
        return combinedData;
    }

    public String reverse(String fileData) {
        FileOperations fs = new FileOperations();

        String sortedData = sort(fileData);
        String lines[] = fs.getLines(sortedData);
        List<String> strList = Arrays.asList(lines);
        Collections.reverse(strList);
        lines = strList.toArray(new String[strList.size()]);
        return fs.getCombinedData(lines);
    }
}