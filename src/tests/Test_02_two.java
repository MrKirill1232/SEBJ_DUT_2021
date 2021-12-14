package tests;

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
        else if (_var == 2) {
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
    }
}
