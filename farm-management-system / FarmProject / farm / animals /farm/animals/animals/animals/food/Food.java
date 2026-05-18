package farm.food;

public abstract class Food {

    private String type;

    public Food(String type) {
        this.type = type;
    }

    public String getType() { return type; }

    public abstract String getDescription();
}
