package sumitvar.unixtools;

public class Wc {
    int CountChar(String fileData) {
        return fileData.length();
    }

    int CountLines(String fileData) {
        return fileData.split("\n").length;
    }

    int CountWord(String fileData) {
        String lines[] = fileData.split("\n");
        int noOfWords = 0;
        for (int i = 0; i < lines.length; i++) {
            String words[] = lines[i].split(" ");
            noOfWords += words.length;
        }
        return noOfWords;
    }
}
