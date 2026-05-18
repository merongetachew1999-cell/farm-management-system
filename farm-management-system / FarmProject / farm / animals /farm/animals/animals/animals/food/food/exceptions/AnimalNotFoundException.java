package farm.exceptions;

public class AnimalNotFoundException extends Exception {
    public AnimalNotFoundException(String id) {
        super("No animal found with ID: " + id);
    }
}
