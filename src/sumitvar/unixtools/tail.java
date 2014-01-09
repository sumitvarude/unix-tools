package sumitvar.unixtools;

public class Tail {
    public static void main(String[] args) {
        int count;
        String line,tailLines = "",filename = args[0],fileData = "",value = "10";
        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        count = Integer.parseInt(value);
        fileData = ReadFile.read(filename);
        String lines[] = fileData.split("\n");
        int noOfLines = lines.length - count;
        for (int i = noOfLines; i < lines.length; i++) {
            tailLines += lines[i]+"\n";
        }
        System.out.println(tailLines);
    }
}
