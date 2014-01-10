package sumitvar.unixtools;

public class ReduceClient {
    public static void main(String[] args) {
        FileOperations fs = new FileOperations();
        ReduceSpaces rs = new ReduceSpaces();
        String fileData = fs.read(args[0]);
        String properFileData = rs.reduce(fileData);
        System.out.println(properFileData);
    }
}
