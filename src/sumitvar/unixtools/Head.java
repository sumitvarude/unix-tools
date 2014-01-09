package sumitvar.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;


public class Head {
    public static void main(String[]args) {
        int count;
        String line,filename = args[0],fileData = "",value = "10";

        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        try{
            count = Integer.parseInt(value);
            BufferedReader br = new BufferedReader(new FileReader(filename));
            for (int i = 0; i < count; i++) {
                if((line = br.readLine())!= null)
                fileData += line + "\n";
            }
            System.out.println(fileData);
        }catch(Exception e){
            System.out.println("File not found");
        }
    }
}
