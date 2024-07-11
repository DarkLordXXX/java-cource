public class MyCode3 {
    public static void main(String[] args) {
        //Урок 4. 3 завдання
        // Ініціалізація масиву з числами
        int[] array = {5, 10, 15, 20, 25};

        // Виклик функції для обчислення середнього значення
        double average = findAverage(array);

        // Виведення результату
        System.out.println("Середнє значення елементів масиву: " + average);
    }
    public static double findAverage(int[] arr) {
        int sum = 0;
        double average;

        // Обчислення суми елементів масиву
        for (int num : arr) {
            sum += num;
        }

        // Обчислення середнього значення
        average = (double) sum / arr.length;

        return average;
    }
}


