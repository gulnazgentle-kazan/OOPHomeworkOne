package Units;// Колдун

public class Magician extends BaseUnit{
    public Magician() {
        super("Gulnaz", "spell", 100, 100, 10, 10, 1, 5, 1);
    }
    @Override
    public String toString() {
        return "Маг";
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
