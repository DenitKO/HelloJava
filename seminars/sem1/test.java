package seminars.sem1;

import java.io.File; 
import java.io.IOException; // Исключения
import java.io.PrintWriter; // Записывать в файл
import java.io.BufferedReader; // Для чтения из файла
import java.io.FileReader; // Тоже для чтения из файла

public class test {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("C:/GB/HelloJava/seminars/sem1/newFile.txt");

            if(file.exists())
                file.createNewFile();

                PrintWriter pw = new PrintWriter(file);
                pw.println("Everything is working");
                pw.println("Hello World!");
                pw.close();

                br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null){
                    System.out.println(line);
                }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                // TODO: handle exception
            }

            
        }
    }
}
