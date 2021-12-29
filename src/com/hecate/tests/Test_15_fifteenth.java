package com.hecate.tests;

public class Test_15_fifteenth {
    public static void main(int VAR) {
        int _var = VAR;
        switch (_var) {
            // case (1), (2), (3), (4), (5) -> {}
            case (6), (11), (16), (21), (26) -> _var = 1;
            case (7), (12), (17), (22), (27) -> _var = 2;
            case (8), (13), (18), (23), (28) -> _var = 3;
            case (9), (14), (19), (24), (29) -> _var = 4;
            case (10), (15), (20), (25), (30) -> _var = 5;
        }
        System.out.print("Тест №15\n<< Електробезпека >>"
                + "\nВариант " + _var + "\n");

        if (_var == 1) {
            System.out.println("01. 4. Фізичні характеристики прикладеної напруги. ");
            System.out.println("02. 4. Iз = 220 : (430000:3+4)=0,17 мА");
            System.out.println("03. 3. Спрацьовування заземлення. ");
            System.out.println("04. 1. Iз = 220 : (440000:3+10)=0,16 мА. ");
            System.out.println("05. 5. 50 – 60 мА. ");
            System.out.println("06. 4. Напруга дотику (220:1000=0,22) нижче Uг.д. ");
            System.out.println("07. 5. навчання та перевірка знань обслуговуючого персоналу з техніки електробезпеки. ");
            System.out.println("08. 4. Напруга дотику (220:1000=0,2) нижче Uг.д. ");
            System.out.println("09. 3. III;");
            System.out.println("10. 2. Напруга дотику (0,9х0,0002х10=0,0018) нижче Uг.д;");
        }
    }
}
