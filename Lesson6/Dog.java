package Lesson6;

public class Dog {

    //private String breed;
    private double weight;
    private int age;
    private String name;
    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String bark() {
        return name + " is barking!";
    }

    public String getOlder(int years) {
        this.age += years;
        return name + " is now " + age + " years old.";
    }
    public String getOlder(){
        return this.getOlder(1);

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
}




