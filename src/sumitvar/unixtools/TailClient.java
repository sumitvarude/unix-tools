package sumitvar.unixtools;

public class TailClient {
    public static void main(String[] args) {
        int count;
        String line,tailLines = "",filename = args[0],fileData = "",value = "10";
        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        count = Integer.parseInt(value);
        fileData = File.read(filename);
        String tailData = Tail.getTail(count,fileData);
        System.out.println(tailData);
    }
}
