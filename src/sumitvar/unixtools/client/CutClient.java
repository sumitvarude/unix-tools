package sumitvar.unixtools.client;

import sumitvar.unixtools.Cut;
import sumitvar.unixtools.FileOperations;

public class CutClient {
    public static void main(String[] args) {
        CutClient cutclient = new CutClient();
        if(args.length == 0){
            System.out.println("please give file name,fieldNo");
            return;
        }
        FileOperations fs = new FileOperations();
        Cut cut = new Cut();

        String properArgv[] = cutclient.getProperArgv(args);
        int fieldValue = Integer.parseInt(properArgv[0].substring(2));
        String delimitor = properArgv[1].substring(2);
        String fileData = fs.read(properArgv[2]);
        String columnData = cut.column(fieldValue, delimitor, fileData);
        System.out.println(columnData);
    }

    String[] getProperArgv(String[] arg) {
        String options[] = new String[3];
        for (int i = 0; i < arg.length; i++) {
            if (CutClient.isfieldValue(arg[i]))
                options[0] = arg[i];
            if (CutClient.isDelimitor(arg[i]))
                options[1] = arg[i];
            if (!CutClient.isFileName(arg[i]))
                options[2] = arg[i];
        }
        return options;
    }

    static boolean isDelimitor(String arg) {
        return arg.matches("-d.*");
    }

    static boolean isfieldValue(String arg) {
        return arg.matches("-f.*");
    }

    static boolean isFileName(String arg) {
        return arg.matches("-.*");
    }
}

