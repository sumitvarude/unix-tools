package sumitvar.unixtools;

public class TailClient {
    public static void main(String[] args) {
        int count;
        FileOperations fs = new FileOperations();
        Tail tail = new Tail();
        String line,tailLines = "",filename = args[0],fileData = "",value = "10";
        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        count = Integer.parseInt(value);
        fileData = fs.read(filename);
        String tailData = tail.getTail(count,fileData);
        System.out.println(tailData);
    }
}
