package tests;

public class Test_10_ten {

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
    System.out.print("Тест №10\n<<Оцінка рівнів ЕМВ>>"
            + "\nВариант " + _var + "\n");

    if (_var == 1) {
        System.out.println("01. 5. > 100000 нм. ");
        System.out.println("02. 1. іонізаційна; ");
        System.out.println("03. 4. стимулюють парасимпатичну вегетативну систему;");
        System.out.println("04. 4. за електричною складовою у В/м;");
        System.out.println("05. 4. захист екрануванням;");
        System.out.println("06. 3. Неіонізуючого випрмінювання");
        System.out.println("07. 1. Іонізація молекул, радіоліз води"); // кумулятивна - накопичувальна
        System.out.println("08. 2. (В/м)2 · год.  ");
        System.out.println("09. 3. екранування повітряних ЛЕП санітарно-захисною зоною; ");
        System.out.println("10. 5. використовують поглинальні екрани.");
    }
}
}
