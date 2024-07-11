public class MyCode4 {
    public static void main(String[] args) {
        // Приклад масиву цілих чисел
        int[] numbers = {1, 2, 3, 4, 5};
        // Значення, яке ми хочемо перевірити у масиві
        int targetValue = 3;
        // Викликаємо метод для перевірки наявності значення в масиві
        boolean containsValue = contains(numbers, targetValue);
        // Виводимо результат
        if (containsValue) {
            System.out.println("Масив містить значення " + targetValue);
        } else {
            System.out.println("Масив не містить значення " + targetValue);
        }
    }
    public static boolean contains(int[] arr, int value) {
        // Перебираємо всі елементи масиву
        for (int element : arr) {
            // Якщо знайдено співпадіння, повертаємо true
            if (element == value) {
                return true;
            }
        }
        // Якщо значення не знайдено, повертаємо false
        return false;
    }
}
/*
 * У цьому прикладі ми створюємо масив цілих чисел numbers і шукаємо значення targetValue у цьому масиві.
 * Функція contains перевіряє кожен елемент масиву на співпадіння з targetValue.
 * Якщо таке значення знайдено, метод повертає true, в іншому випадку - false.
 * Ви можете змінити значення numbers і targetValue за своїм вибором для
 * перевірки будь-якого масиву на наявність будь-якого значення.
 */

