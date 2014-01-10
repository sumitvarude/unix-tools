package sumitvar.unixtools;

public class Head {
    public static String getHead(int count,String fileData) {
        String headData = "";
        String lines[] = fileData.split("\n");
        for (int i = 0; i < count; i++)
            headData += lines[i]+"\n";
        return headData;
    }
}
