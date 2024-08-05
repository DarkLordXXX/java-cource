package lesson4;

public class Quest6 {
    public static void main(String[] args) {

        int[] values = {3, 6, 9, 12};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sum = 1;

        for (int d : values) {
            sum +=d;
            if (d < min) {
                min += d;
            }
            if (d > max) {
                max = d;
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}

