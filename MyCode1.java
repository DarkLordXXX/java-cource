public class MyCode1 {
    public static void main(String[] args) {
        // урок 4.1
        String numberStr = "987654321";
        int number = stringToInt(numberStr);
        System.out.println("Ціле число: " + number);
    }
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }
}