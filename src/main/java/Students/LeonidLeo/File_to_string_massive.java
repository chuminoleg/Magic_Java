package Students.LeonidLeo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// я пробую собрать в единый процесс несколько уроков, работа с файлом, циклом  и массивом.

public class File_to_string_massive {
//  допустим я получил какойто файл

    public static void main(String[] args) throws FileNotFoundException { // пробросил исключение как ты учил
        File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\Magic_Java1\\src\\main\\java\\Imported.txt");
        String[] str = new  String[5];        // тут я  делаю массив для того что бы строки этого файла туда положить
        Scanner scanner = new Scanner(file); // смотрю, а что же там мне прислали в нем
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine()); // ага, посмотрел, вроде строки, если я хочу их посортировать
                                                    //   запихаю ка я их в массив
        }
        for (int i = 0; i < str.length; i++)
            str[i] = scanner.nextLine();            // и вот тут чтото пошло не так, хотя ничего не подчеркивает
    }                                               /* я предполагаю, что это изза того что после END  у меня  идет пустая строка
                                                       раз уж он мне говорит что "No line found", но ведь я сказал ему
                                                       "дойди до конца массива и остановись!" не понятно... */

}





