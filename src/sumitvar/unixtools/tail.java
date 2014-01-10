package sumitvar.unixtools;

public class Tail {
    public static String getTail(int count,String fileData) {
        String tailLines = "";
        String lines[] = fileData.split("\n");
        int noOfLines = lines.length - count;
        for (int i = noOfLines; i < lines.length; i++) {
            tailLines += lines[i]+"\n";
        }
        return tailLines;
    }
}
