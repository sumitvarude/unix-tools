package sumitvar.unixtools;

public class Uniq {
    public static String getUniqLines(String fileData) {
        String lines[] = fileData.split("\n");
        String uniqLines = lines[0]+"\n";
        for (int i = 1; i < lines.length; i++) {
            if(lines[i-1].equals(lines[i])== false)
                uniqLines += lines[i]+"\n";
        }
        return uniqLines;
    }
}
