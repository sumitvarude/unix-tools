package sumitvar.unixtools.client;

import sumitvar.unixtools.FileOperations;
import sumitvar.unixtools.Head;

public class HeadClient {
    public static void main(String[] args) {
        int count;
        if(args.length == 0){
            System.out.println("please give file name");
            return;
        }
        FileOperations fs = new FileOperations();
        Head head = new Head();
        String line, filename = args[0], fileData = "", value = "10";

        if (args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        count = Integer.parseInt(value);
        fileData = fs.read(filename);

        String headData = head.getHead(count, fileData);
        System.out.println(headData);
    }
}
