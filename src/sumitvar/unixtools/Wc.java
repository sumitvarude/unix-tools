package sumitvar.unixtools;

class Wc {
    public int CountChar(String fileData) {
        return fileData.split("").length;
    }

    public int CountLines(String fileData) {
        return fileData.split("\n").length;
    }

    public int CountWord(String fileData) {
        String lines[] = fileData.split("\n");
        int noOfWords = 0;
        for (int i = 0; i < lines.length; i++) {
            String words[] = lines[i].split(" ");
            noOfWords += words.length;
        }
        return noOfWords;
    }
}
