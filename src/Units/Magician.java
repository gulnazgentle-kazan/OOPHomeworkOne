package Units;// Колдун

public class Magician extends BaseUnit{
    public Magician(String name) {
        super(name, "spell", 100, 100, 10, 10, 1, 5, 1);
    }
    @Override
    public String toString() {
        return name;
    }
}
