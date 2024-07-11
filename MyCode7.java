import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class MyCode7 {
    public static void main(String[] args) {
        //9) Напишіть програму на Java для видалення повторюваних елементів з масиву.
        int[] numbers = {1, 2, 3, 4, 3, 2, 1, 5, 6};
        // Видаляємо повторювані елементи
        int[] uniqueNumbers = removeDuplicates(numbers);
        // Виводимо масив без повторюваних елементів
        System.out.println("Масив без повторюваних елементів: " + Arrays.toString(uniqueNumbers));
    }
    public static int[] removeDuplicates(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        // Додаємо всі елементи масиву до набору (HashSet)
        for (int num : numbers) {
            set.add(num);
        }
        // Перетворюємо набір назад у масив
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
