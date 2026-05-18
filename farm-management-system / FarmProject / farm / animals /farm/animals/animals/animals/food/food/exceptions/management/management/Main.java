package farm.management;

import farm.animals.*;
import farm.exceptions.AnimalNotFoundException;
import farm.food.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter farm name: ");
        String farmName = scanner.nextLine();

        FarmManager farm = new FarmManager(farmName);

        farm.addAnimal(new Cow("C001", "Hermella", 5));
        farm.addAnimal(new Chicken("CH001", "Hasset", 2));

        System.out.print("\nEnter a name for a new cow: ");
        String cowName = scanner.nextLine();

        System.out.print("Enter age: ");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            if (age < 0) throw new IllegalArgumentException("Age cannot be negative.");
            farm.addAnimal(new Cow("C002", cowName, age));
        } catch (NumberFormatException e) {
            System.out.println("Invalid age entered, skipping.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n-- All animals making sounds --");
        farm.allMakeSounds();

        System.out.println("\n-- Feeding all animals --");
        farm.feedAll(new Grass());

        farm.displayAll();

        System.out.print("\nEnter an animal ID to look up: ");
        String searchId = scanner.nextLine();
        try {
            Animal found = farm.findById(searchId);
            System.out.println("Found: " + found.getName() + " (" + found.getAnimalType() + ")");

            if (found instanceof Cow cow) {
                cow.milk();
            } else if (found instanceof Chicken chicken) {
                chicken.layEgg();
            }
        } catch (AnimalNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
