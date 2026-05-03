package farm;

public class Cow extends Mammal {

    public Cow(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    public void milk() {
        System.out.println(name + " is being milked");
    }

    // method hiding (static)
    public static void info() {
        System.out.println("Cow static info (method hiding)");
    }
}