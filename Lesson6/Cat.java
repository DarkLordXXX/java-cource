package Lesson6;

public class Cat {
    private double weight;
    private int age;
    private String name;

    private String breed;

    public Cat(String name, int age, double weight,String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }
    public String meow() {

        return name + "  Даст іст фантастіш ";
    }
}

