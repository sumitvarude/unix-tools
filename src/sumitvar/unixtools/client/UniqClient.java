package sumitvar.unixtools.client;

import sumitvar.unixtools.FileOperations;
import sumitvar.unixtools.Uniq;

public class UniqClient {
    public static void main(String[] args) {
        String line, uniqLines = "", filename = args[0], fileData = "";
        Uniq uniq = new Uniq();
        if(args.length == 0){
            System.out.println("please give file name");
            return;
        }
        FileOperations fs = new FileOperations();

        fileData = fs.read(filename);
        uniqLines = uniq.getUniqLines(fileData);
        System.out.println(uniqLines);
    }
}
