package com.hecate.tests;

public class Test_05_five {

    public static void main(int VAR)
    {
    int _var = VAR;
        switch (_var) {
            // case (1), (2), (3), (4) -> {}
            case (5), (9), (13), (17), (21), (25), (29) -> _var = 1;
            case (6), (10), (14), (18), (22), (26), (30) -> _var = 2;
            case (7), (11), (15), (19), (23), (27) -> _var = 3;
            case (8), (12), (16), (20), (24), (28) -> _var = 4;
        }
    System.out.print("5 тест\n<<Хімічні речовини та пил>>"
            + "\nВариант " + _var + "\n");

    if (_var == 1)
        {
            System.out.println("01. ");
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
    else if (_var == 2)
    {
        System.out.println("01. ");
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
    else if (_var == 3)
    {
        System.out.println("01. ");
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
    else if (_var == 4)
    {
        System.out.println("01. 5. коефіцієнт можливого інгаляційного отруєння.");
        System.out.println("02. 3. мг/м3;");
        System.out.println("03. 2. кумуляція;");
        System.out.println("04. 3. викликають функціональні порушення, які відновлюються за час регламентованого відпочинку");
        System.out.println("05. 3. Абіогенна дія (0,7+0,3+0,4 =1,4)");
        System.out.println("06. 3. 200х760:750=202,6л."); // 1 000 л = 1 м^3
        System.out.println("07. 1. пилові бронхіти;");
        System.out.println("08. 3. лінійно-колористичний");
        System.out.println("09. 4. аспіраційний;");
        System.out.println("10. 4. Гігієнічне нормування та моніторинг хімічних речовин.");
    }
}
}
