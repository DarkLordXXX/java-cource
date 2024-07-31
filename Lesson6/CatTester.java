package Lesson6;

import Lesson6.Cat;

public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Король ",  5, 10,"Мурчало");
        System.out.print(myCat.getName()+ " це неповторний мишолов ");
        System.out.println(myCat.getBreed());
        System.out.println(myCat.getAge() + " років вік кота");
        System.out.println(myCat.getWeight()+ "кг вага кота");
    }
}
