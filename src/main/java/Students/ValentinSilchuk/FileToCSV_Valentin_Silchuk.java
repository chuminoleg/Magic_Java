package HomeTask;

import java.io.*;
import java.util.Arrays;

/**
 * Есть исходный текстовый файл с данными,
 * необходимо считать данные и преобразовать к виду @.csv файл для дальнейшей обработки в Excel.
 * Что такое csv файл поищете в тырнете :) Задача из реальных будней программиста.
 * Программа должна обрабатывать любые файлы на входе и на выходе выдавать готовый файл в формате *.csv
 * CSV (от англ. Comma-Separated Values — значения, разделённые запятыми).
 */
public class FileToCSV_Valentin_Silchuk {
    public static void main(String[] args) throws IOException {
        String fileToReadPath = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Lessons" +
                "\\Tasks\\fileToProcess.txt";
        File file = new File(fileToReadPath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String stringLine = bufferedReader.readLine();
        stringLine = stringLine.replace(',', ';');
        String[] separateLines = stringLine.split("\\\\n");
//        System.out.println(Arrays.toString(separateLines));
        String outputFilePath = "C:\\Users\\Oleg_Chumin\\IdeaProjects\\Magic_Java\\src\\main\\java\\Students" +
                "\\ValentinSilchuk\\output.csv";
        File outputcsv = new File(outputFilePath);
        FileOutputStream fos = new FileOutputStream(outputcsv);
        PrintWriter printWriter = new PrintWriter(fos);
        for (String str : separateLines
        ) {
            printWriter.println(str);
        }
        printWriter.close();
        fileReader.close();
        System.out.println("Файл успешно преобразован.\n" + "Путь к файлу: " + outputFilePath);
    }
}
