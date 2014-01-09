package sumitvar.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

public class Uniq {
    public static void main(String[] args) {
        String line,uniqLines = "",filename = args[0],fileData = "";
        fileData = ReadFile.read(filename);
        String lines[] = fileData.split("\n");
        uniqLines = lines[0]+"\n";
        for (int i = 1; i < lines.length; i++) {
            if(lines[i-1].equals(lines[i])== false)
                uniqLines += lines[i]+"\n";
        }
        System.out.println(uniqLines);
    }
}
