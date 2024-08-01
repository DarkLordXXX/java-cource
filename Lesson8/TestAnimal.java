package Lesson8;

public class TestAnimal{
    public static void main(String[] args) {
        Animal animal1 = new Animal("Пес", 3, "Пітбуль");
        Animal animal2 = new Animal("Кіт", 2, "Дворовий звичайний");
        Animal animal3 = new Animal("Корова Мілка", 10, " Приблуда звичайна");
        Animal animal4 = new Animal("Голуб",4,"Звичайний вуличний");

        System.out.print(animal1.getName()+ " ");
        System.out.print(animal1.getAge() + " років ");
        System.out.println(animal1.getBreed());
        System.out.print(animal2.getName()+ " ");
        System.out.print(animal2.getAge() + " років ");
        System.out.println(animal2.getBreed());
        System.out.print(animal3.getName()+ " ");
        System.out.print(animal3.getAge() + " років ");
        System.out.println(animal3.getBreed());
        System.out.print(animal4.getName()+ " ");
        System.out.print(animal4.getAge() + " роки ");
        System.out.println(animal4.getBreed());
    }
}
