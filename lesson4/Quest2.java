package lesson4;

import java.util.Scanner;
public class Quest2 {
    public static void main(String[] args) {
        System.out.print("Введіть число: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}//Напишіть програму, яка знаходить суму кожного числа від 1 до num. Число завжди
//    буде додатним цілим числом, більшим за 0.

