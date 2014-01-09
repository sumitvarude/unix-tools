package sumitvar.unixtools;

public class ReduceSpaces {
    public static void main(String[] args) {
        String fileData = File.read(args[0]);
        fileData = fileData.replaceAll("[ ]+", " ");
        System.out.println(fileData);
    }
}
