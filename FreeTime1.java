public class FreeTime1 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        int x = 3;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
    public static void task2() {
        int c = 4;
        while ( c < 10 ){
            c = c -1;
            if( c > 3 ){
                System.out.println("big c");
            }
        }
    }
}
