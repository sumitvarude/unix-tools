package sumitvar.unixtools;

public class ReduceSpaces {
    public String reduce(String fileData) {
        fileData = fileData.replaceAll("[ ]+", " ");
        return fileData;
    }
}
