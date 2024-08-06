package lesson4;

public class Quest6 {
    public static void main(String[] args) {
        int[] numbers = {5, 18, 3, 25, 7, 10};;

        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
                for (int value : numbers) {
                    sum += value;
                }
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Sum : " + sum);
        System.out.println(numbers.length);
    }
}
    //6) Напишіть програму на Java для знаходження максимального та мінімального
    //значення масиву.


