package Units; // Крестьянин

public class Peasant extends BaseUnit {

    public Peasant(String name) {
        super(name, "pitchfork", 100, 100, 1, 1, 1, 2, 2);
    }
    @Override
    public String toString() {
        return name;
    }
}
