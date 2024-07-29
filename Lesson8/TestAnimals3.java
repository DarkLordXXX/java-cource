package Lesson8;
public class TestAnimals3 {
    public static void main(String[] args) {
        Animal leon = new Lion1(" Зефір");
        Animal pigeon = new Pigeon("Голуб");
        Animal cat = new Cat(" Мурзик ");
        Animal dog = new oldDog(" Бобік");
        Animal fish = new Fish(" Карась");

        leon.speak();
        leon.eat();
        leon.run();
        leon.sleep();

        pigeon.speak();
        pigeon.eat();
        pigeon.run();
        pigeon.sleep();

        cat.speak();
        cat.eat();
        cat.run();
        cat.sleep();
        ((Cat) cat).hunt();
        ((Cat) cat).meow();


        dog.speak();
        dog.eat();
        dog.run();
        dog.sleep();

        fish.speak();
        fish.eat();
        fish.run();
        fish.sleep();
    }
}

