package sumitvar.unixtools;

public class Uniq {
    public static String getUniqLines(String fileData) {
        String lines[] = fileData.split("\n");
        StringBuilder uniqLines = new StringBuilder();
        uniqLines.append(lines[0]);
        uniqLines.append("\n");
        for (int i = 1; i < lines.length; i++) {
            if (lines[i - 1].equals(lines[i]) == false){
                uniqLines.append(lines[i]);
                uniqLines.append("\n");
            }
        }
        return uniqLines.toString();
    }
}
