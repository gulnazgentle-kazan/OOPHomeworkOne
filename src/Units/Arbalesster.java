package Units;// Арбалетчик

public class Arbalesster extends Shooter{
    public Arbalesster(String name) {
        super(name, "arbalet", 100, 100, 10, 10, 2, 2, 2);
    }
    @Override
    public String toString() {
        return name;
    }
}
