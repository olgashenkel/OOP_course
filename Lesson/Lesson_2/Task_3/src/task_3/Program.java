package task_3;

import task_3.alliance.*;
import task_3.*;

public class Program {
    public static void main(String[] args) {

        // #region teams
        //// Когда героев становится больше

        // int teamCount = 10;
        // Random rand = new Random();

        // List<task_3.BaseHero> teams = new ArrayList<>();
        // for (int i = 0; i < teamCount; i++) {
        //     int val = rand.nextInt(4);
        //     switch (val) {
        //         case 0:
        //             teams.add(new task_3.Priest());
        //             break;
        //         case 1:
        //             teams.add(new task_3.Magician());
        //             break;
        //         case 2:
        //             teams.add(new task_3.Druid());
        //             break;
        //         default:
        //             // teams.add(new task_3.BaseHero());
        //             break;
        //     }
        //     System.out.println(teams.get(i).getInfo());
        // }

        // System.out.println();

        // #endregion

        // #region ToDo task_3.BaseHero

        // // task_3.BaseHero hero = new task_3.BaseHero();
        // // System.out.println(hero.getInfo());
        // // ToDo task_3.BaseHero
        // task_3.Priest priest = new task_3.Priest();
        // System.out.println(priest.getInfo());
        // task_3.Druid druid = new task_3.Druid();
        // System.out.println(druid.getInfo());
        // task_3.Magician magician = new task_3.Magician();
        // System.out.println(magician.getInfo());

        // priest.attack(magician);
        // System.out.println(magician.getInfo());
        // priest.attack(magician);
        // System.out.println(magician.getInfo());
        // druid.healing(magician);
        // System.out.println(magician.getInfo());
        // druid.healing(magician);
        // System.out.println(magician.getInfo());
        // druid.healing(magician);
        // System.out.println(magician.getInfo());
        // druid.healing(magician);
        // System.out.println(magician.getInfo());
        // druid.healing(magician);
        // System.out.println(magician.getInfo());

        // #endregion

        // #region
        BaseHero dh = new Druid();
        /*task_3.BaseHero*/
        Dwarf dwarf = new Dwarf();
        //dwarf.dwarf_method();
        //((Dwarf)dwarf).dwarf_method();
        System.out.println(dwarf.name);
        // #endregion
    }
}