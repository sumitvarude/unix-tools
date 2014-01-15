package sumitvar.unixtools;

public class Head {
    public static String getHead(int count, String fileData) {
        StringBuilder headData = new StringBuilder();
        String lines[] = fileData.split("\n");
        for (int i = 0; i < count&&i<lines.length; i++){
            headData.append(lines[i]);
            headData.append("\n");
        }
        return headData.toString();
    }
}
