package sumitvar.unixtools.client;

import sumitvar.unixtools.FileOperations;
import sumitvar.unixtools.Tail;

import java.io.FileReader;
import java.util.Properties;

public class TailClient {
    public static void main(String[] args) {
        int count;
        if(args.length == 0){
            System.out.println("please give file name & noOfLines");
            return;
        }
        FileOperations fs = new FileOperations();
        Tail tail = new Tail();
        String line, tailLines = "", filename = args[0], fileData = "", value = "10";
        if (args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        try  {
            FileReader reader = new FileReader("config.properties");
            Properties properties = new Properties();
            properties.load(reader);
            value = (properties.getProperty("tail.defaultNoOfLines"));
        } catch (Exception e) {
            value = "10";
        }
        count = Integer.parseInt(value);
        fileData = fs.read(filename);
        String tailData = tail.getTail(count, fileData);
        System.out.println(tailData);
    }
}
