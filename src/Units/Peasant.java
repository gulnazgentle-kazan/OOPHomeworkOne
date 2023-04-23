package Units; // Крестьянин

public class Peasant extends BaseUnit {

    public Peasant() {
        super("Sergey", "pitchfork", 100, 100, 1, 1, 1, 2, 2);
    }
    @Override
    public String toString() {
        return "Крестьянин";
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return name + " тип атаки: " + typeDamage + " здоровье: " + hp + " максимальный уровень здоровья: " + maxhp +
                " броня " + armor + " скорость движения: " + speedMove + " атака " + damage + " скорость атаки: " +
                speedDamage + " дальность атаки: " + rangeDamage;
    }
}
