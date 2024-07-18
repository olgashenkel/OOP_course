// Инкапсуляция – это свойство системы,
//позволяющее объединить данные и методы, работающие
//с ними в классе, скрыв детали реализации и защитив
//от пользователя этого класса объектов.

public class Program {
    public static void main(String[] args) {

////         #region Robot_1 demo
//
//          Robot_1 robot1 = new Robot_1("name_1", 1);
//
//
//         robot1.level = 100500;
//         System.out.printf("%s %d\n", robot1.name, robot1.level);
//
//
//         //#endregion
//
//         // #region processing
//
//         robot1.startBIOS();
//         robot1.startOS();
//         robot1.sayHi();
//
//         robot1.work();
//
//         robot1.sayBye();
//         robot1.stopOS();
//         robot1.stopBIOS();
//
//         // #endregion
//
//        System.out.println();
//        // #endregion

        // #region Robot_2 demo

        // Robot_2 robot2 = new Robot_2("name_2", 1);

        // System.out.printf("%s %d\n",
        // robot2.getName(), robot2.getLevel());

        // robot2.work();
        // robot2.work();
        // robot2.work();
        // robot2.powerOff();

        // #endregion

        //#region Robot_3 demo

        Robot_3 robot3 = new Robot_3("name_3");
        System.out.println("-------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();

        //#endregion
    }

}