package com.hecate.tests;

public class Test_12_twenty {
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
        System.out.print("Тест №12\n<<Пожежна безпека>>"
                + "\nВариант " + _var + "\n");

        if (_var == 1) {
            System.out.println("01. 1. відкриті;");
            System.out.println("02. 1. самозаймання; ");
            System.out.println("03. 4. детонаційне;");
            System.out.println("04. 4. один раз на рік;");
            System.out.println("05. 2. обмеження матеріальних збитків при виникненні пожежі; ");
            System.out.println("06. 2. забороняючі, попереджувальні; ");
            System.out.println("07. 3. В; ");
            System.out.println("08. 2. В; ");
            System.out.println("09. 1. всі види; ");
            System.out.println("10. 1.вуглекислотні, порошкові; ");
        }
    }
}
