public class MyCode6 {
    public static void main(String[] args) {
        //7) Напишіть програму на Java для обчислення середнього значення масиву цілих
        //чисел, крім найбільшого та найменшого значень
        int[] numbers = {5, 1, 9, 3, 8, 2, 7};
        // Знаходимо середнє значення без урахування найменшого та найбільшого значень
        double average = calculateAverage(numbers);
        if (average != -1) {
            System.out.println("Середнє значення (без найбільшого та найменшого): " + average);
        } else {
            System.out.println("Масив повинен містити принаймні 3 елементи.");
        }
    }
    public static double calculateAverage(int[] numbers) {
        if (numbers.length < 3) {
            return -1; // Якщо менше 3 елементів, повертаємо -1
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        // Віднімаємо найменше та найбільше значення від суми
        sum -= (min + max);
        // Повертаємо середнє значення
        return sum / (double)(numbers.length - 2);
    }
}
