// Урок 5. Хранение и обработка данных ч2: множество коллекций Map
// Написать программу вычисления n-ого треугольного числа.
// n-е треугольное число может быть записано как сумма n натуральных чисел, то есть n * (n + 1) / 2
package seminars.sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sem5 {
    public static void main(String[] args) {
        Map<Integer, Integer> javaLessonsMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число для вывода n-треугольного числа: ");
        int n = sc.nextInt();
        int n_triangular = 0;
        for (int i = 1; i <= n; i++) {
            n_triangular = i * (i + 1) / 2;
            javaLessonsMap.put(i,n_triangular);
        }

        javaLessonsMap.forEach((a, b) -> System.out.println("n-треугольное число №: " + String.valueOf(a) + " = " + String.valueOf(b)));
    }
}