package farm.animals;

public class Chicken extends Animal {

    public Chicken(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Cluck cluck!");
    }

    @Override
    public String getAnimalType() { return "Chicken"; }

    public void layEgg() {
        System.out.println(getName() + " laid an egg!");
    }
}
