public class Homework31 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    /**
     * Блочный комментарий 3 урок 1 завдання
     */
    public static void task1() {
        int y = 100;
        int w = 2;
        System.out.println(y + w);
        System.out.println(y * w);
        System.out.println(y - w);
        System.out.println(y / w);
    }
    /**
     * Блочный комментарий 3 урок 2 завдання
     */
    public static void task2() {
        int x = 3;
        if (x > 2) {
            System.out.print("a");
        }while (x > 0) {
            x = x - 1;
            System.out.print("-");
        }
        if (x == 2) {
            System.out.println("b c");
        }
        while (x > 0) {
            x = x - 1;
            System.out.println("-");
        }
        if(x==1){
            System.out.println("d");
        }
    }
    public static void task3(){
        int sum = 0;
        for(int s=1;s<=10;s++) {
            sum += s;
        }
        System.out.println(sum);
    }
}

