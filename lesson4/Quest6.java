package lesson4;

public class Quest6 {
    public static void main(String[] args) {
        int[] values = {-5,-2,3, 6, 9, 12};
        int max = 0;
        int min = 0;
        int sum = 0;

        for (int d : values) {
            if (d < min) {
                min = d;
            }
            if (d > max) {
                max = d;
            }
        }
        for (int value : values) {
            sum += value;
        }
            System.out.println("Max : + " +max);
            System.out.println("Min : + " + min);
            System.out.println("Sum : + " + sum);
            System.out.println(values.length);
    }
}


