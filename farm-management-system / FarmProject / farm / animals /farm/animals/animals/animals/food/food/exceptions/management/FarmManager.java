package farm.management;

import farm.animals.Animal;
import farm.exceptions.AnimalNotFoundException;
import farm.food.Food;

import java.util.ArrayList;

public class FarmManager {

    private String farmName;
    private ArrayList<Animal> animals;

    public FarmManager(String farmName) {
        this.farmName = farmName;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " added to " + farmName);
    }

    public Animal findById(String id) throws AnimalNotFoundException {
        for (Animal a : animals) {
            if (a.getId().equals(id)) return a;
        }
        throw new AnimalNotFoundException(id);
    }

    public void feedAll(Food food) {
        for (Animal a : animals) {
            a.eat(food);
        }
    }

    public void allMakeSounds() {
        for (Animal a : animals) {
            a.makeSound();
        }
    }

    public void displayAll() {
        System.out.println("\n--- " + farmName + " ---");
        for (Animal a : animals) {
            a.displayInfo();
        }
    }
}
