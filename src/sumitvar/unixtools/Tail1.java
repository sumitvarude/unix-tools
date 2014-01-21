package sumitvar.unixtools;

public class Tail1 {
    public static String getTail(int count, String fileData) {
        StringBuilder tailLines = new StringBuilder();
        String lines[] = fileData.split("\n");
        int noOfLines = lines.length - count;
        for (int i = noOfLines; i < lines.length; i++) {
            tailLines.append(lines[i]);
            tailLines.append("\n");
        }
        return tailLines.toString();
    }
}
