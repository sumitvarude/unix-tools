package sumitvar.unixtools;

public class ReduceClient {
    public static void main(String[] args) {
        FileOperations fs = new FileOperations();
        Reduce rs = new Reduce();
        String fileData = fs.read(args[0]);
        String properFileData = rs.reduce(fileData);
        System.out.println(properFileData);
    }
}
