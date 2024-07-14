public class FreeTime2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = x - y;
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
    }

    public static void task2() {
        int x = 0;
        int y = 0;
        while ( x < 5 ) {
            y = y + x;
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
    }
    public static void task3() {
        int x = 0;
        int y = 0;
        while ( x < 5 ) {
            y = y + 2;
            if ( y > 4 ){
                y = y - 1;
            }
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
    }
    public static void task4() {
        int x = 0;
        int y = 0;
        while ( x < 5 ) {
            x = x + 1;
            y = y + x;
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
    }
    public static void task5() {
        int x = 0;
        int y = 0;
        while ( x < 5 ) {
            if ( y < 5){
                x = x + 1;
                if ( y < 3 ){
                    x = x -1;
                }
            }
            y = y + 2;
            System.out.println(x + "" + y + " ");
            x = x + 1;
        }
    }
}
