package sumitvar.unixtools;

public class WcClient{
    public static void main(String[] args) {
        String file = args[0];
        try {
            String fileData = ReadFile.read(file);
            Wc operation = new Wc();
            int noOfChars = operation.CountChar(fileData);
            int noOfLines = operation.CountLines(fileData);
            int noOfWords = operation.CountWord(fileData);
            System.out.println("	"+noOfLines+"	"+noOfWords+"	"+noOfChars+" "+file);
        } catch (Exception e) {
            System.out.println("file not found " + file);
        }
    }
}