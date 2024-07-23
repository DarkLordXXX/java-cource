package Lesson7;

public class Animal2 {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo");
        Animal mouse = new Mouse("Mickey");
        Animal horse = new Horse("Spirit");

        lion.speak();
        lion.eat();
        lion.run();
        lion.sleep();

        mouse.speak();
        mouse.eat();
        mouse.run();
        mouse.sleep();

        horse.speak();
        horse.eat();
        horse.run();
        horse.sleep();
    }
}
