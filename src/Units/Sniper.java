package Units; // Снайпер

public class Sniper extends Shooter{
    public Sniper(String name) {
        super(name, "AK-47", 100, 100, 10, 10, 5, 10, 10);
    }
    @Override
    public String toString() {
        return name;
    }
}
