package Lesson8;

abstract class Animal {


    protected String name;
    protected int age;
    protected String breed;

    public Animal(String name) {
    }
    public abstract void speak();
    public abstract void eat();
    public abstract void run();
    public abstract void sleep();

}
class Cat extends Animal {

    public Cat(String name) {super(name);}
    public void speak() {System.out.println(name + "Я просто кіт.");}

    public void eat() {System.out.println(name + " їсть Мясо.");}

    public void run() {System.out.println(name + " рухається коли бачить мясо");}

    public void sleep() {System.out.println(name + " багато спить");}

    public void hunt(){System.out.println(name + " ловить мишей");}
    public void meow(){System.out.println(name + " Мяу, міяу, мьєв! ");}
}
class Fish extends Animal {
    public Fish(String name) {super(name);}
    public void speak() {System.out.println(name + " Це просто карась.");}
    public void eat() {System.out.println(name + " їсть червака, кукурудзу і хліб");}

    public void run() {System.out.println(name + " не біжить але пливе ");}

    public void sleep() {System.out.println(name + " час від часу спить.");}

}
class Lion1 extends Animal {
    public Lion1(String name) {super(name);}
    public void speak() {
        System.out.println(name + " Я Леф2");
    }
    public void eat() {
        System.out.println(name + " їсть Мясо.");
    }

    public void run() {
        System.out.println(name + " рухається коли бачить мясо");
    }

    public void sleep() {
        System.out.println(name + " багато спить");
    }
}
class oldDog extends Animal {
    public oldDog(String name) {super(name);}

    public void speak() {System.out.println(name + "Це старий собака.");}

    public void eat() {System.out.println(name + " їсть корм.");}

    public void run() {System.out.println(name + " любе бігати на прогулянці");}

    public void sleep() {System.out.println(name + " багато спить");}
}
class Pigeon extends Animal {
    public Pigeon(String name) {super(name);}

    public void speak() {System.out.println(name + "Це просто голуб.");}

    public void eat() {System.out.println(name + " їсть насіння і черваки.");}

    public void run() {System.out.println(name + " рухається коли хоче їсти");}

    public void sleep() {System.out.println(name + " спить тільки у гнізді");}
}
