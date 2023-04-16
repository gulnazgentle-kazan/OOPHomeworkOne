package Units; // Монах

public class Monk extends BaseUnit{
    public Monk(String name) {
        super(name, "Prayer", 100, 100, 10, 5, 1, 5, 1);
    }

    @Override
    public String toString() {
        return name;
    }
}

