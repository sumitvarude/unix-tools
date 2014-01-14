package sumitvar.unixtools.client;

import sumitvar.unixtools.FileOperations;
import sumitvar.unixtools.Reduce;

public class ReduceClient {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("please give file name");
            return;
        }
        FileOperations fs = new FileOperations();
        Reduce rs = new Reduce();
        String fileData = fs.read(args[0]);
        String properFileData = rs.reduce(fileData);
        System.out.println(properFileData);
    }
}
