package lesson4;

public class Quest6 {
    public static void main(String[] args) {
        int[] values = {3, 6, 9, 12};
        int max = 0;
        int min = 1;
        int sum = 0;

        for (int d : values) {
            if (d < min) {
                min = d;
            }
            if (d > max) {
                max = d;
            }
        }
            System.out.println("Max : + " +max);
            System.out.println("Min : + " + min);
            System.out.println("Sum : + " + sum);
    }
}


