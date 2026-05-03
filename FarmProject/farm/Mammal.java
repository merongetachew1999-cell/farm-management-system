package farm;

public class Mammal extends Animal {

    public Mammal(String id, String name, int age) {
        super(id, name, age);   // super() constructor call
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }
}