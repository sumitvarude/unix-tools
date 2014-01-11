package sumitvar.unixtools;

public class SortClient {
    public static void main(String[] args) {
        Sort sort = new Sort();
        FileOperations fs = new FileOperations();
        String fileData = fs.read(args[0]);

        String SortedData = sort.sort(fileData);
        System.out.println(SortedData);
    }
}
