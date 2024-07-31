package Lesson6;

public class DogTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("Бобік ",3 ,3.00," порода Вулігарович");
        System.out.println(myDog.getAge());
        System.out.println(myDog.getName());
        System.out.println(myDog.getWeight());
    }
}
