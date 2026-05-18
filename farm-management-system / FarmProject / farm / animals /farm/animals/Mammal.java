package farm.animals;

public abstract class Mammal extends Animal {

    protected String furColor;

    public Mammal(String id, String name, int age, String furColor) {
        super(id, name, age);
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes a mammal sound.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur color: " + furColor);
    }
}
