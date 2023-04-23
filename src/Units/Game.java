package Units;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        /*Peasant peasantOne = new Peasant();
        System.out.println(peasantOne.toString());

        Outlaw outlawOne  = new Outlaw();
        System.out.println(outlawOne.toString());

        Sniper sniperOne = new Sniper();
        System.out.println(sniperOne.toString());

        Magician magicianOne = new Magician();
        System.out.println(magicianOne.toString());

        Spearman spearmanOne = new Spearman();
        System.out.println(spearmanOne.toString());

        Arbalesster arbalessterOne = new Arbalesster();
        System.out.println(arbalessterOne.toString());

        Monk monkOne = new Monk();
        System.out.println(monkOne.toString());*/

        ArrayList<BaseUnit> teamOne = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    teamOne.add(new Arbalesster());
                    break;
                case 1:
                    teamOne.add(new Magician());
                    break;
                case 2:
                    teamOne.add(new Monk());
                    break;
                case 3:
                    teamOne.add(new Outlaw());
                    break;
                case 4:
                    teamOne.add(new Sniper());
                    break;
                case 5:
                    teamOne.add(new Spearman());
                    break;
                case 6:
                    teamOne.add(new Peasant());
                    break;
            }
        }
            ArrayList<BaseUnit> teamTwo = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                switch (new Random().nextInt(7)) {
                    case 0:
                        teamTwo.add(new Arbalesster());
                        break;
                    case 1:
                        teamTwo.add(new Magician());
                        break;
                    case 2:
                        teamTwo.add(new Monk());
                        break;
                    case 3:
                        teamTwo.add(new Outlaw());
                        break;
                    case 4:
                        teamTwo.add(new Sniper());
                        break;
                    case 5:
                        teamTwo.add(new Spearman());
                        break;
                    case 6:
                        teamTwo.add(new Peasant());
                        break;
                }
            }
                teamOne.forEach(n -> System.out.println((n.toString() + " " + n.getInfo())));
                System.out.println();
                teamTwo.forEach(m -> System.out.println((m.toString() + " " + m.getInfo())));


    }

}
