package Units; // Снайпер

public class Sniper extends Shooter{
    public Sniper() {
        super("Anton", "AK-47", 100, 100, 10, 10, 5, 10, 10);
    }
    @Override
    public String toString() {
        return "Снайпер";
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
