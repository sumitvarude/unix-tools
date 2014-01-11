package sumitvar.unixtools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort extends FileOperations{
    public String sort(String fileData){
        FileOperations fs = new FileOperations();
        String lines[] = fileData.split("\n");
        Arrays.sort(lines);
        String combinedData = fs.getCombinedData(lines);
        return combinedData;
    }
}