package Units;//Копейщик

public class Spearman extends Shooter{
    public Spearman(String name) {
        super(name, "spear", 100, 100, 10, 5, 1, 5, 1);
    }
    @Override
    public String toString() {
        return name;
    }
}
