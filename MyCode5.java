public class MyCode5 {
    public static void main(String[] args) {
        //5) Напишіть програму на Java для видалення певного елемента з масиву.
        // Оголошення масиву чисел
        //6) Напишіть програму на Java для знаходження максимального та мінімального
        //значення масиву.
        int[] numbers = {5, 18, 3, 25, 7, 10};
        // Ініціалізація змінних для зберігання максимального та мінімального значень
        int max = numbers[0]; // Припускаємо, що перший елемент масиву є максимальним
        int min = numbers[0]; // Припускаємо, що перший елемент масиву є мінімальним
        // Цикл для знаходження максимального та мінімального значень
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        // Виведення результатів
        System.out.println("Максимальне значення в масиві: " + max);
        System.out.println("Мінімальне значення в масиві: " + min);
    }
}

