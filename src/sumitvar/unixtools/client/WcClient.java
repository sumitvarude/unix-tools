package sumitvar.unixtools.client;

import sumitvar.unixtools.FileOperations;
import sumitvar.unixtools.Reduce;
import sumitvar.unixtools.Wc;

public class WcClient {
    public static void main(String[] args) {
        String file = args[0];
        Reduce rs = new Reduce();
        if(args.length == 0){
            System.out.println("please give file name");
            return;
        }
        FileOperations fs = new FileOperations();

        String fileData = fs.read(file);
        String filedataForWord = rs.reduce(fileData);
        Wc wcOperation = new Wc();
        int noOfChars = wcOperation.CountChar(fileData);
        int noOfLines = wcOperation.CountLines(fileData);
        int noOfWords = wcOperation.CountWord(filedataForWord);
        System.out.println("	" + noOfLines + "	" + noOfWords + "	" + noOfChars + " " + file);
    }
}