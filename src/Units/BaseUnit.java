package Units;

/*Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
   Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
   Создать абстрактный класс и иерархию наследников. Расположить классы в пакет так,
   чтобы в основной программе небыло видно их полей. В не абстрактных классах переопределить метод toString()
   так чтобы он возвращал название класса или имя. Создать в основной программе по одному обьекту каждого не
   абстрактного класса и вывести в консоль его имя.*/
public abstract class BaseUnit implements GameInterface {
   protected String name; //имя
   protected String typeDamage; // тип атаки
   protected int hp; // здоровье
   protected int maxhp; // максимальное здоровье
   protected int armor; // броня
   protected int speedMove; //скорость передвижения
   protected int damage; // урон
   protected int speedDamage; // скорость атаки
   protected int rangeDamage; // дальность атаки

   public BaseUnit(String name, String typeDamage, int hp, int maxhp, int armor, int speedMove, int damage, int speedDamage, int rangeDamage) {
      this.name = name;
      this.typeDamage = typeDamage;
      this.hp = hp;
      this.maxhp = maxhp;
      this.armor = armor;
      this.speedMove = speedMove;
      this.damage = damage;
      this.speedDamage = speedDamage;
      this.rangeDamage = rangeDamage;
   }

   public static void Step(){ //Перемещается

   }

   public static void Attack(){ // атакует

   }

   public static void fallBack(){ // отступает

   }

   public static void Recover(){ // восстанавливается

   }
   public static void Dead(){ // умирает

   }

}




