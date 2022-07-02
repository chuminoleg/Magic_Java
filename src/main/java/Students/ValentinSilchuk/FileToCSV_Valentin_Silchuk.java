package HomeTask;

import java.io.*;
/**
 * Есть исходный текстовый файл с данными,
 * необходимо считать данные и преобразовать к виду @.csv файл для дальнейшей обработки в Excel.
 * Что такое csv файл поищете в тырнете :) Задача из реальных будней программиста.
 * Программа должна обрабатывать любые файлы на входе и на выходе выдавать готовый файл в формате *.csv
 * CSV (от англ. Comma-Separated Values — значения, разделённые запятыми).
 */
public class FileToCSV_Valentin_Silchuk {
    public static void main(String[] args) throws IOException {
        String fileToReadPath = "C:\\Users\\Home PC\\IdeaProjects\\magic_java\\src\\main\\java\\HomeTask\\fileToProcess.txt";
        File file = new File(fileToReadPath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String stringLine = bufferedReader.readLine();
        stringLine = stringLine.replace(',', ';');
        String[] separateLines = stringLine.split("\\\\n");
        String outputFilePath = "C:\\Users\\Home PC\\IdeaProjects\\magic_java\\src\\main\\java\\HomeTask\\output.csv";
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
