package com.hecate.tests;

public class Test_06_six {
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
        System.out.print("Тест №6 и 7\n<<Мікроклімат + Вентиляція>>"
                + "\nВариант " + _var + "\n");

        if (_var == 1) {
            System.out.println("01. 3. Запалення судин та нервів.");
            System.out.println("02. 1. оптимальний, допустимий;");
            System.out.println("03. 1. Терморегуляція");
            System.out.println("04. 4. Від періоду року, категорії робіт по енерговитратам, постійне або непостійне робоче місце");
            System.out.println("05. 5. Анемометр.");
            System.out.println("06. 5. інженерно-технічного рішення колективної профілактики.");
            System.out.println("07. 1. К = Vчистого повітря, що надходить / V;");
            System.out.println("08. 3. 1,5х1,0х2,0х 3600/150 = 72 р/год");
            System.out.println("09. 1. шкідливих;");
            System.out.println("10. 4. водоповітряне душування;");
        }
        if (_var == 4) {
            System.out.println("01. 3. Тепловий шок.");
            System.out.println("02. 2. Допустимі");
            System.out.println("03. 5. Випаровування вологи, випромінювання, конвекція.");
            System.out.println("04. 5. 100 вт/м2 при опроміненні 25% та більше поверхні тіла.");
            System.out.println("05. 3. Анемометр чашковий.");
            System.out.println("06. 4. Щитки для захисту від бризок розплавленого металу");
            System.out.println("07. 1. К = Vчистого повітря, що надходить / Vприміщення;");
            System.out.println("08. 1. 3400:1500 = 2,26");
            System.out.println("09. 4. небезпечних;");
            System.out.println("10. 3. приймання мінералізованої води.");
        }
    }
}
