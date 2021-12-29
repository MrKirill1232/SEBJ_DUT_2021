package com.hecate.tests;

public class Test_13_thirteen {

    public static void main(int VAR) {
        int _var = VAR;
        switch (_var) {
            // case (1), (2), (3), (4) -> {}
            case (5), (9), (13), (17), (21), (25), (29) -> _var = 1;
            case (6), (10), (14), (18), (22), (26), (30) -> _var = 2;
            case (7), (11), (15), (19), (23), (27) -> _var = 3;
            case (8), (12), (16), (20), (24), (28) -> _var = 4;
        }
        System.out.print("13 тест\n<<Шум та вібрація>>"
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
        else if (_var == 3) {
            System.out.println("01. 1. Інтервал між Vо та Vmах (aо та amах);");
            System.out.println("02. 2. L = 20 lg (V / Vo) –дБ – логарифмічні рівні віброшвидкості;");
            System.out.println("03. 2.  за  рівнями  вібрації  (дБ)  в  октавних  смугах з середньогеометричними частотами;");
            System.out.println("04. 3. При контактному шляху передачі – пікове значення віброшвидкості у м/с.");
            System.out.println("05. 2. Загальна; ");
            System.out.println("06. 3. порушення психічного стану;");
            System.out.println("07. 5. перетворення енергії механічних коливань на теплову.");
            System.out.println("08. 2.  пружні  коливання  і  хвилі  нижче  діапазону  чутності  людини  (нижче  20 Гц);");
            System.out.println("09. 3. здійснюють віброгасіння фундаменту; ");
            System.out.println("10. 3. беруши та шлемофони;");
        }
    }
}
