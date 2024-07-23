package Lesson6;

public class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bobik ",  3, 30.0);
        System.out.println(myDog.bark());
        System.out.println(myDog.getAge());
        System.out.println(myDog.getName());
        System.out.println(myDog.getOlder());
        System.out.println(myDog.getWeight());
    }
}
