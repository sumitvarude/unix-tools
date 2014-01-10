package sumitvar.unixtools;

public class UniqClient {
    public static void main(String[] args){
        String line,uniqLines = "",filename = args[0],fileData = "";
        Uniq uniq = new Uniq();
        FileOperations fs = new FileOperations();
        fileData = fs.read(filename);
        uniqLines = uniq.getUniqLines(fileData);
        System.out.println(uniqLines);
    }
}
