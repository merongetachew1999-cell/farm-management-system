package farm.animals;

public class Cow extends Mammal {

    public Cow(String id, String name, int age) {
        super(id, name, age, "Brown");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Moooo!");
    }

    @Override
    public String getAnimalType() { return "Cow"; }

    public void milk() {
        System.out.println(getName() + " is being milked.");
    }
}
