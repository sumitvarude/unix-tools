package sumitvar.unixtools;

public class HeadClient {
    public static void main(String[] args) {
        int count;
        String line,filename = args[0],fileData = "",value = "10";

        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        count = Integer.parseInt(value);
        fileData = File.read(filename);
        String headData = Head.getHead(count,fileData);
        System.out.println(headData);
    }
}
