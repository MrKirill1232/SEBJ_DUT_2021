package com.hecate.tests;

public class Test_02_two {
    public static void main(int _var) {
        switch (_var) {
            // case (1), (2), (3), (4), (5) -> {}
            case (6), (11), (16), (21), (26) -> _var = 1;
            case (7), (12), (17), (22), (27) -> _var = 2;
            case (8), (13), (18), (23), (28) -> _var = 3;
            case (9), (14), (19), (24), (29) -> _var = 4;
            case (10), (15), (20), (25), (30) -> _var = 5;
        }
        System.out.print("Тест №2\n<<Застосування ризик-орієнтованого підходу для побудови ймовірнісно-логічних моделей виникнення і розвитку НС>>"
                + "\nВариант " + _var + "\n");

        if (_var == 1) {
            System.out.println("01. 3. частота, із якою проявляє себе небезпека, вважається суспільством\n" +
                    "прийнятною (при цьому береться до уваги досягнуті рівні життя, економічного та\n" +
                    "соціально-політичного розвитку, а також стан науки і техніки);");
            System.out.println("02. ");
            System.out.println("03. ");
            System.out.println("04. ");
            System.out.println("05. ");
            System.out.println("06. ");
            System.out.println("07. ");
            System.out.println("08. ");
            System.out.println("09. ");
            System.out.println("10. ");
        }
        else if (_var == 2) {
            System.out.println("01. 4. частота, із якою проявляє себе небезпека, вважається суспільством " +
                    "найвищою з тих, що можна дозволити із урахуванням досягнутих рівнів життя, " +
                    "економічного та соціально-політичного розвитку, а також стану науки і техніки;");
            System.out.println("02. 3. – 4,5·10-4;");
            System.out.println("03. 1. до категорії I, котра характеризується як катастрофічна;");
            System.out.println("04. 4.1:9:10000=1,1⋅10-4, що перевищує прийнятний ризик (10-4);");
            System.out.println("05. 4. цей ризик може бути знижений шляхом впровадження ефективних засобів " +
                    "захисту працюючих і суворого дотримання ними правил техніки безпеки;");
            System.out.println("06. 1. попередній аналіз небезпек (ПАН);");
            System.out.println("07. 4. кількісний вираз, вимірювання;");
            System.out.println("08. 4. соціологічний метод;");
            System.out.println("09. 5 - створити такі умови принципово неможливо;");
            System.out.println("10. 1. на верхівці дерева відмов (ДВ);");
        }
        else if (_var == 3) {
            System.out.println("01. 3. частота, із якою проявляє себе небезпека, вважається суспільством прийнятною (при цьому береться до уваги досягнуті рівні життя, економічного та соціально-політичного розвитку, а також стан науки і техніки);");
            System.out.println("02. 1. 3:7:500=8,6⋅10-4, що перевищує прийнятний ризик (10-12).");
            System.out.println("03. 5. смерть людини або руйнування систем життєзабезпечення класифікуються за ознакою серйозності як категорія I.");
            System.out.println("04. 2. 68:7:15000=6,4⋅10-4, що перевищує прийнятний ризик (10-8).");
            System.out.println("05. ");
            System.out.println("06. ");
            System.out.println("07. ");
            System.out.println("08. ");
            System.out.println("09. ");
            System.out.println("10. R ~ 10-10");
        }
    }
}
