package com.hecate.tests;

public class Test_08_eight {

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
        System.out.print("Тест №08\n<< Законодавство з Основ Охорони Праці >>"
                + "\nВариант " + _var + "\n");

        if (_var == 2) {
            System.out.println("01. 4. Правові та організаційні питання ОП; Основи фізіології, гігієни праці та виробничої санітарії; Основи техніки безпеки; Основи пожежної безпеки.");
            System.out.println("02. 1. наукова організація праці;");
            System.out.println("03. 4. будівельні норми та правила;");
            System.out.println("04. 5. 1 раз на 3 роки");
            System.out.println("05. 2. Конституція України, Кодекс Законів про працю в Україні, Закон України «Про охорону праці» від 14 жовтня 1992 року із змінами та доповненнями від 21 " +
                    "листопада 2000 року");
            System.out.println("06. 3. На органи прокуратури");
            System.out.println("07. 4. Про перевірку знань з охорони праці");
            System.out.println("08. 4. Після тривалої відпустки");
            System.out.println("09. 4. Видача безкоштовної путівки");
            System.out.println("10. 2. 36 годин.");
        }
    }
}
