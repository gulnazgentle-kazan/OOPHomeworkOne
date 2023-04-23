package Units;//Разбойник

public class Outlaw extends BaseUnit{
    public Outlaw() {
        super("German", "stone", 100, 100, 10, 5, 3, 4, 5);
    }
    @Override
    public String toString() {
        return "Разбойник";
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
