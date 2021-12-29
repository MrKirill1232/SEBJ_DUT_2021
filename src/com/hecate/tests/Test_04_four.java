package com.hecate.tests;

public class Test_04_four {

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
    System.out.print("4 тест\n<<Радіаційна безпека>>"
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
        System.out.println("01. 4. цей ризик краще знижується при комплексному впровадженні всіх вказаних засобів;");
        System.out.println("02. 4. захоплення ядерних установок і матеріалів;");
        System.out.println("03. 5. глибиною, шириною, кутовими розмірами.");
        System.out.println("04. 3. Р;");
        System.out.println("05. 2. К = Dфакт./ DL;");
        System.out.println("06. 5. 10х13,2х30х50:10000=1,9. Не перевищує ліміт ефективної дози (5бер).");
        System.out.println("07. 3. 2:50 = 0,04.");
        System.out.println("08. 2. нейтронне, альфа-, бета- випромінювання.");
        System.out.println("09. 3. спадкові захворювання;");
        System.out.println("10. 2. споживання вітамінів-антиоксидантів А, С, Е;");
    }
}
}
