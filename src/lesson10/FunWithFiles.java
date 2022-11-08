package lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FunWithFiles {

    // Exercise 1.
    public List<String> fileToString(File file){
        List<String> stringList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){


            String input;
            while ((input = reader.readLine()) != null){
                stringList.add(input);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return stringList;
    }

    // Exercise 2.
    public void writeStringToFile(String string, File file){
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            if(string != null){
                os.write(string.getBytes());
            }
        }catch (IOException ioe){
            System.err.println(ioe.getMessage());
        }
        finally {
            try{
                if(os != null){
                    os.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    // Exercise 3.
    public void mergeTwoFiles(File file1, File file2){

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1))) {
            try (BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("fileStorage/output3.txt"))) {
                    // Вариант с OutputStream.
                    //OutputStream os = Files.newOutputStream(Paths.get("fileStorage/output3.txt")
                    String input1;
                    String input2;
                    StringBuilder builder = new StringBuilder();

                    while ((input1 = reader1.readLine()) != null){
                        writer.write(String.valueOf(builder.append(input1)));
                    }
                    while ((input2 = reader2.readLine()) != null){
                        writer.write(String.valueOf(builder.append(input2)));
                    }

//                      Вариант с OutputStream.
//                    while ((input1 = reader1.readLine()) != null) {
//                        os.write(input1.getBytes());
//                    }
//                    while ((input2 = reader2.readLine()) != null) {
//                        os.write(input2.getBytes());
//                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }

    // Exercise 4.
    public void replaceCharacters(File file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("fileStorage/output4.txt"))) {

                String pattern = "[^а-яА-Яa-zA-Z0-9]";
                String str;

                while ((str = reader.readLine()) != null) {
                    writer.write(str.replaceAll(pattern, "\\$"));
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getClass());
        }
    }
}
