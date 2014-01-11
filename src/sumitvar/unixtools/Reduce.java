package sumitvar.unixtools;

public class Reduce {
    public String reduce(String fileData) {
        fileData = fileData.replaceAll("[ ]+", " ");
        return fileData;
    }
}
