package farm;

public class Chicken extends Animal {

    public Chicken(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck");
    }

    public void layEgg() {
        System.out.println(name + " laid an egg");
    }
}