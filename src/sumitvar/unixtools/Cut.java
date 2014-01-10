package sumitvar.unixtools;

public class Cut {
    public static String column(int field_value,String delimitor,String fileData) {
        String result="";
        String lines[] = fileData.split("\n");
        String words_a_line[];
        for(int counter=0;counter<lines.length;counter++){
            words_a_line= lines[counter].split(delimitor);
            result = result + words_a_line[field_value-1] +"\n";
        }
        return result;
    }
}
