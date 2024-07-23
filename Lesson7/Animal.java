package Lesson7;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Абстрактні методи
    public abstract void speak();
    public abstract void eat();
    public abstract void run();
    public abstract void sleep();
}

// Клас Lion
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }
    public void speak() {
        System.out.println(name + " Я Леф");
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
class Mouse extends Animal {
    public Mouse(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(name + " Мікі Маус");
    }
    public void eat() {
        System.out.println(name + " в основному саме Сир");
    }

    public void run() {
        System.out.println(name + " може побіжить коли побаче сир");
    }

    public void sleep() {
        System.out.println(name + " час від часу спить.");
    }
}

// Клас Horse
class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }
    public void speak() {
        System.out.println(name + " Іго-го");
    }
    public void eat() {
        System.out.println(name + "  деколи їсть Сіно");
    }
    public void run() {
        System.out.println(name + " рухається коли треба");
    }

    public void sleep() {
        System.out.println(name + " спит стоячи коли хоче ");
    }
}
