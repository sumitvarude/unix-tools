package sumitvar.unixtools.client;

import sumitvar.unixtools.FileOperations;
import sumitvar.unixtools.Tail1;

public class TailClient {
    public static void main(String[] args) {
        int count;
        if(args.length == 0){
            System.out.println("please give file name & noOfLines");
            return;
        }
        FileOperations fs = new FileOperations();
        Tail1 tail = new Tail1();
        String line, tailLines = "", filename = args[0], fileData = "", value = "10";
        if (args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        count = Integer.parseInt(value);
        fileData = fs.read(filename);
        String tailData = tail.getTail(count, fileData);
        System.out.println(tailData);
    }
}
