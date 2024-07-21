package lesson4;

public class Example3 {
    public static void main(String[] args) {
        String a = "25";
        try{
            Integer number = Integer.valueOf(a);
            System.out.println(number); // вивід = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}
