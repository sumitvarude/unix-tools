package sumitvar.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

public class WcClient{
    public static void main(String[] args) {
        String file = args[0];
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String fileData = "",line;
            Wc operation = new Wc();
            while ((line = br.readLine())!= null)
                fileData += line + "\n";

            System.out.println("file data:\n"+fileData);
            int noOfChars = operation.CountChar(fileData);
            int noOfLines = operation.CountLines(fileData);
            int noOfWords = operation.CountWord(fileData);
            System.out.println("	"+noOfLines+"	"+noOfWords+"	"+noOfChars+" "+file);
        } catch (Exception e) {
            System.out.println("file not found " + file);
        }
    }
}