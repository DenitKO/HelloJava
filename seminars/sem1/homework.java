// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

package seminars.sem1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class homework {

    public static void main(String[] args) {
        
        String newLine = new String();
        File fileInput = new File("C:/GB/HelloJava/seminars/sem1/input.txt");
        File fileOutput = new File("C:/GB/HelloJava/seminars/sem1/output.txt");
        String a = "";
        String b = "";
        float c = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(fileInput)))
            {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
                if (line.split(" ")[0].equals("b"))
                    b = line.split(" ")[1];
                if (line.split(" ")[0].equals("a"))
                    a = line.split(" ")[1];
            }
            br.close();
            } catch(IOException ex){
                System.out.println(ex.getMessage());
            }

        c = Exponentiation(Integer.parseInt(a), Integer.parseInt(b));
        if (Float.isNaN(c))
            System.out.println("не определено");
        else
            System.out.println(c);


        try (FileWriter fw = new FileWriter(fileOutput, false)) {
            if (Float.isNaN(c))
                fw.write("не определено");
            else
                fw.write(String.valueOf(c));
            fw.flush();
            fw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }

    public static float Exponentiation(int digit, int degree)
    {
        int index = 1;
        int ExpDigit = digit;
        if (degree > 0)
        {
            while (index < degree)
            {
                ExpDigit=ExpDigit*digit;
                index++;
            }
        return ExpDigit;
        }
        if (degree < 0)
        {
            degree = degree * -1;
            while (index < degree)
            {
                ExpDigit=ExpDigit*digit;
                index++;
            }
        return 1/(float)ExpDigit;
        }
        if ((degree == 0) && (digit != 0))
        return 1;
        else
        return Float.NaN;
    }
}