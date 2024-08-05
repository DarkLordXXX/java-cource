package lesson4;

public class Quest3 {
    public static void main(String[] args) {
        double[] values = {3,6,9,12};
        double sum = 0;

        for (double d : values){
            sum += d;

        }
        System.out.println("Avarenge is " + (sum/ values.length));
    }
}
