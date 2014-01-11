package sumitvar.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileOperations {
    public static String read(String fileName) {
        String line, fileData = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                fileData += line + "\n";
            }
        } catch (Exception e) {
            System.out.println("file not found");
        }
        return fileData;
    }

    public String getCombinedData(String[] lines) {
        StringBuilder combinedData = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            combinedData.append(lines[i]);
            combinedData.append("\n");
        }
        return combinedData.toString();
    }

    public String[] getLines(String fileData) {
        String lines[] = fileData.split("\n");
        return lines;
    }
}