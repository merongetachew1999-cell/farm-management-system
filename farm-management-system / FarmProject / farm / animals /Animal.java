package farm.animals;

import farm.food.Food;

public abstract class Animal {

    private String id;
    private String name;
    private int age;

    public Animal(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId()   { return id; }
    public String getName() { return name; }
    public int getAge()     { return age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age)      { this.age = age; }

    public abstract void makeSound();
    public abstract String getAnimalType();

    public void eat(Food food) {
        System.out.println(name + " eats " + food.getType());
    }

    public void displayInfo() {
        System.out.println("Type: " + getAnimalType() + ", ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
