package farm;

public class Animal {

    private String id;              // visibility example (private)
    protected String name;          // protected access
    protected int age;

    public Animal(String id, String name, int age) {
        this.id = id;              // this keyword
        this.name = name;
        this.age = age;
    }

    public void eat(Food food) {
        System.out.println(name + " eats " + food.getType());
    }

    public void makeSound() {
        System.out.println("Generic animal sound");
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }

    public static void info() {
        System.out.println("Animal class static method");
    }
}