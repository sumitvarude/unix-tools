package sumitvar.unixtools.client;

import sumitvar.unixtools.FileOperations;
import sumitvar.unixtools.Sort;

public class SortClient {
    public static void main(String[] args) {
        Sort sort = new Sort();
        FileOperations fs = new FileOperations();
        if(args.length == 0){
            System.out.println("please give file name");
            return;
        }
        String fileData = fs.read(args[0]);

        String sortedData = sort.sort(fileData);
        System.out.println("SortedData:\n" + sortedData);

        String reversedData = sort.reverse(fileData);
        System.out.println("ReversedData:\n" + reversedData);
    }
}
