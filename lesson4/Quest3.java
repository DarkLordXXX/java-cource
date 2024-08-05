package lesson4;

public class Quest3 {
    public static void main(String[] args) {
        double[] values = {3,6,9,12};

        double max = values[0];
        double min = values[0];
        double sum = 0;

        for (double d : values){
            sum += d;
            if(d< min){
                min = d;
            }
            if(d > max){
                max = d;
            }
        }

        System.out.println("Avarenge is " + (sum/ values.length));
        System.out.println(min);
        System.out.println(max);
    }
}
