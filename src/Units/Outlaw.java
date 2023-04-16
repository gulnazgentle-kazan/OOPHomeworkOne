package Units;//Разбойник

public class Outlaw extends BaseUnit{
    public Outlaw(String name) {
        super(name, "stone", 100, 100, 10, 5, 3, 4, 5);
    }
    @Override
    public String toString() {
        return name;
    }
}
