package farm;

public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow("C001", "HERMELLA", 5);
        Chicken chicken = new Chicken("CH001", "HASSET", 2);

        Grass grass = new Grass();
        Grain grain = new Grain();

        FarmManager manager = new FarmManager();

        
        manager.feedAnimal(cow, grass);
        manager.feedAnimal(chicken, grain);

        System.out.println();

        // polymorphism 
        cow.makeSound();
        chicken.makeSound();

        System.out.println();

        // static method hiding
        Animal.info();
        Cow.info();

        System.out.println();

        // display info
        cow.displayInfo();
    }
}