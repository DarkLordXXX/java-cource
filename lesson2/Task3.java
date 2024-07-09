package lesson2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int y = 56;
        int w = 72;
        System.out.println(y + w);
        System.out.println(y * w);
        System.out.println(y - w);
        System.out.println(y / w);
        System.out.println(y % w);
        System.out.println(++y % w);
        // завдання 1 уроку 3


        //. 2/Напишіть програму на Java для перетворення десятирічного числа у восьмирічне, двійкове,
        //шістнадцятирічне.
        private class ReverseNumber {

            private static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Запит користувачеві ввести ціле число
                System.out.print("Введіть ціле число: ");
                int number = scanner.nextInt();

                // Викликаємо функцію для перевертання числа
                int reversedNumber = reverseNumber(number);

                // Виводимо результат
                System.out.println("Число з перевернутими цифрами: " + reversedNumber);

                scanner.close();
            }

            // Функція для перевертання числа
            public static int reverseNumber(int num) {
                int reversed = 0;

                // Поки є цифри у числі, виконуємо перевертання
                while (num != 0) {
                    int digit = num % 10; // Отримуємо останню цифру числа
                    reversed = reversed * 10 + digit; // Додаємо цифру до результуючого числа
                    num /= 10; // Видаляємо останню цифру з оригінального числа
                }

                return reversed;


                //завдання 3 уроку 3 3. Напишіть програму для порівняння двох чисел.
                int t = 768;
                int b = 455434;
                if (t <= b) {
                    System.out.println("t bigger then b");
                }// завдання 3 викон
                //4. Напишіть програму для обчислення суми перших 10 натуральних чисел.
                short s1 = 10;
                short s2 = 20;
                short s3 = 30;
                short s4 = 40;
                short s5 = 50;
                short s6 = 60;
                short s7 = 70;
                short s8 = 80;
                short s9 = 90;
                short s10 = 100;
                System.out.println(s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9 + s10);
                // завдання 4 готово
                //5. Напишіть програму для обчислення суми цифр цілого числа Зверху написано

                //6. Напишіть програму для знаходження факторіалу будь-якого числа, введеного з клавіатури.
                // 5 ! + 4 ! = 5 ⋅ 4 ⋅ 3 ⋅ 2 ⋅ 1 + 4 ⋅ 3 ⋅ 2 ⋅ 1 = 120 + 24 = 144.

                private class Factorial {
                    public static int getFactorial(int f) {
                        int result = 1;
                        for (int i = 1; i <= f; i++) {
                            result = result * i;
                        }
                        return result;
                    }
                }
                // не розумію чому не працює
                //7. Напишіть програму для обчислення відстані між двома точками на поверхні землі.

                //8. Напишіть програму, яка пропонує користувачеві ввести ціле число, а потім виводить число з
                //перевернутими цифрами. Наприклад, якщо введено 12345, вихід має бути 54321.


                //9. Напишіть програму для друку всіх чисел Армстронга від 1 до 500. Якщо сума кубів кожної
                //цифри числа дорівнює самому числу, то це число називається числом Армстронга.
                //Наприклад, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
            }
        }
    }
}