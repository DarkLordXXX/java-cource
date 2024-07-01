package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int cocos = 1;
        int banana = 2;
        int apples = 3;
        int strawbery = 2;
        int darktimes = 4;
        int newday = 5;
        int fruits = cocos + banana + apples + strawbery;
        System.out.println(fruits);// тут записано як додавали фрукти в тяжкі часи
        int fewMinuteslater = fruits - cocos;
        System.out.println(fewMinuteslater);
        int plusfivemin = fruits / darktimes;
        System.out.println(plusfivemin);
        int needmorefruit = fruits * newday;
        System.out.println(needmorefruit);
        // Тут написано перше завдання множення, діл додавання і віднімання
        int chokolate = 10;
        int bananas = 20;
        int apple = 20;
        if (bananas >= chokolate) {
            System.out.println("We have a lot of banana");
        }
        if (apple == bananas) {
            System.out.println("We dont need more fruits");
            //  завдання 3 виконав хоч і примітивно
        }
    }
}

