package tests;

public class Test_09_nine {
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
        System.out.print("Тест №9\n<<Дослідження та оцінка виробничого освітлення;>>"
                + "\nВариант " + _var + "\n");

        if (_var == 1) {
            System.out.println("01. 3. 320 - 400 нм");
            System.out.println("02. 2. %");
            System.out.println("03. 4. Світловий потік в кд");
            System.out.println("04. 3. КПО = (Евн / Езовн)·100%");
            System.out.println("05. 3. 50:24 = 3лампи.");
            System.out.println("06. 3. 150/150х100=100%, перевищує норму");
            System.out.println("07. 2. 0,01");
            System.out.println("08. 3. люксметрія");
            System.out.println("09. 2. Можуть давати шумовий ефект");
            System.out.println("10. 1. Місцева");
        }
        else System.out.println(_var);
    }
}
