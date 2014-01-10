package sumitvar.unixtools;

public class UniqClient {
    public static void main(String[] args){
        String line,uniqLines = "",filename = args[0],fileData = "";
        fileData = File.read(filename);
        Uniq uniq = new Uniq();
        uniqLines = uniq.getUniqLines(fileData);
        System.out.println(uniqLines);
    }
}
