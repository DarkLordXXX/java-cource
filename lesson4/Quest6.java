package lesson4;

public class Quest6 {
    public static void main(String[] args) {

        int[] values = {3, 6, 9, 12};
        int max = 10;
        int min = 4;
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
            System.out.println(sum);
        }
    }
}

