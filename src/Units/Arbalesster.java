package Units;// Арбалетчик

public class Arbalesster extends Shooter{
    public Arbalesster() {
        super("Vera", "arbalet", 100, 100, 10, 10, 2, 2, 2);
    }
    @Override
    public String toString() {
        return "Арбалетчик";
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
