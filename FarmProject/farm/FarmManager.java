package farm;

public final class FarmManager {

    public void feedAnimal(Animal animal, Food food) {
        animal.eat(food);
    }

    public final void rules() {
        System.out.println("Farm rules: Proper feeding, care, and balance required.");
    }
}