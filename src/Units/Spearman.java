package Units;//Копейщик

public class Spearman extends Shooter{
    public Spearman() {
        super("Roman", "spear", 100, 100, 10, 5, 1, 5, 1);
    }
    @Override
    public String toString() {
        return "Копейщик";
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
