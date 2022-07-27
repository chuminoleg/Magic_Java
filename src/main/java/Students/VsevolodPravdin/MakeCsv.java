package Students.VsevolodPravdin;

import java.io.*;

public class MakeCsv {
    public static void main(String[] args) throws IOException {
        String fileToReadPath = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Lessons\\Tasks\\fileToProcess.txt";
        File file = new File(fileToReadPath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        str = str.replace(',', ';');
        String[] strArray = str.split("\\\\n");
        String outputFilePath = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Students\\VsevolodPravdin\\res.csv";
        File outputcsv = new File(outputFilePath);
        FileOutputStream fos = new FileOutputStream(outputcsv);
        PrintWriter printWriter = new PrintWriter(fos);
        for (String s : strArray) {
            printWriter.println(str);
        }
        printWriter.close();
        fileReader.close();
        System.out.println("process completed");
    }
}
