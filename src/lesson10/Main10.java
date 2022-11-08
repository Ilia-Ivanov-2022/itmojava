package lesson10;

import java.io.*;

public class Main10 {
    public static void main(String[] args) {

        File file = new File("fileStorage/text.txt");
        File fileOutput = new File("fileStorage/fileOutput.txt");

        FunWithFiles fwf = new FunWithFiles();

        // Exercise 1.
        System.out.println(fwf.fileToString(file));

        // Exercise 2.
        String string = "не очень укладывается в голове тема с различными вариантами чтения из файла..\n" +
                "например какая здесь разница между 2мя примененными конструкциями - результат их работы одинаковый.";

        fwf.writeStringToFile(string, fileOutput);

        // Exercise 3.
        fwf.mergeTwoFiles(file, fileOutput);

        // Exercise 4.
        fwf.replaceCharacters(file);
    }
}
