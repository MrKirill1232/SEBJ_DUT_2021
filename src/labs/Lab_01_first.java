package labs;

import java.util.Scanner;

public class Lab_01_first {
    /*
    //Початкові дані до виконання практичного заняття
    */
    static final double[][] addition_one = new double[][]
            {
                    // річка - 1, ставок - 2,
                    // 3 км - 3, вМежахНаселенногоПункта - 4;
                    // озерах - 5;
                    {2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                    {1.0, 15.7, 20, 13, 0.1, 1.9, 1, 4, 4, 4},
                    {2.0, 4.2, 14, 19, 0.2, 2.0, 2, 3, 6, 3},
                    {5.0, 3.6, 18, 42, 0.4, 0.1, 5, 4, 8, 2},
                    {7.5, 7.4, 12, 34, 0.8, 0.2, 1, 3, 12, 1},
                    {9.8, 2.8, 11, 26, 1.0, 0.4, 2, 4, 14, 5},
                    {4.2, 4.4, 17, 17, 1.2, 0.8, 5, 3, 18, 6},
                    {3.6, 1.6, 13, 85, 1.4, 1.0, 1, 4, 2, 7},
                    {7.4, 12.4, 19, 17, 1.6, 1.2, 2, 3, 22, 8},
                    {2.8, 7.5, 42, 13, 1.7, 1.4, 5, 4, 12, 7},
                    {4.4, 9.8, 34, 15, 1.9, 0.1, 1, 3, 13, 6},
                    {1.6, 4.2, 26, 11, 2.0, 0.2, 2, 4, 34, 5},
                    {8.0, 3.6, 17, 6, 0.1, 0.4, 5, 3, 47, 4},
                    {12.4, 7.4, 85, 19, 0.2, 0.8, 1, 4, 16, 3},
                    {11.7, 2.8, 17, 20, 0.4, 1.0, 2, 3, 74, 2},
                    {13.6, 4.4, 13, 14, 0.8, 1.2, 5, 4, 9, 1},
                    {13.2, 1.6, 15, 18, 1.0, 0.1, 1, 3, 11, 12},
                    {15.7, 8.0, 11, 12, 1.2, 0.2, 2, 4, 16, 1},
                    {4.2, 12.4, 6, 11, 1.4, 0.4, 5, 3, 4, 11},
                    {3.6, 1.0, 19, 17, 0.1, 0.8, 1, 4, 8, 10},
                    {7.4, 2.0, 32, 13, 0.2, 1.0, 2, 3, 7, 9},
                    {2.8, 5.0, 38, 19, 0.4, 1.2, 5, 4, 12, 8},
                    {4.4, 7.5, 26, 42, 0.8, 1.4, 1, 3, 40, 7},
                    {1.6, 9.8, 67, 20, 1.0, 1.6, 2, 4, 78, 6},
                    {12.4, 4.2, 45, 17, 1.2, 1.7, 5, 3, 18, 5},
                    {11.7, 3.6, 12, 85, 1.4, 1.9, 1, 4, 14, 4},
                    {13.6, 7.4, 74, 17, 1.6, 2.0, 2, 3, 12, 3},
                    {13.2, 2.8, 14, 13, 1.7, 0.1, 5, 4, 9, 2},
                    {15.7, 4.4, 19, 15, 0.1, 0.2, 1, 3, 5, 1},
                    {1.0, 1.6, 44, 11, 0.2, 0.4, 2, 4, 7, 2},
                    {2.0, 8.0, 37, 6, 0.4, 0.8, 5, 3, 12, 3}
            };
    /*
    //Речовини, що потрапляють в біосферу з викидами підприємства
    */
    static final int[][] addition_two = new int[][]
            {
                    // Високоактивні - 3
                    // Середньоактивні - 2
                    // Низькоактивні - 1
                    {0, 1, 2, 3, 4, 5, 6},
                    {12, 10, 1, 6, 10, 1, 3},
                    {13, 11, 2, 7, 11, 2, 2},
                    {14, 12, 3, 8, 12, 3, 1},
                    {15, 13, 4, 9, 13, 4, 3},
                    {16, 14, 5, 1, 14, 5, 2},
                    {17, 15, 6, 2, 15, 6, 1},
                    {1, 16, 7, 3, 16, 7, 3},
                    {2, 17, 8, 4, 17, 8, 2},
                    {3, 18, 9, 5, 18, 9, 1},
                    {4, 19, 1, 6, 19, 10, 3},
                    {5, 20, 2, 7, 20, 11, 2},
                    {6, 21, 3, 8, 21, 12, 1},
                    {7, 22, 4, 9, 22, 13, 3},
                    {8, 23, 5, 1, 23, 14, 2},
                    {9, 24, 6, 2, 24, 15, 1},
                    {10, 1, 7, 3, 12, 10, 3},
                    {11, 2, 8, 4, 13, 11, 2},
                    {12, 3, 9, 5, 14, 12, 1},
                    {13, 4, 1, 6, 15, 13, 3},
                    {14, 5, 2, 7, 16, 14, 2},
                    {15, 6, 3, 8, 17, 15, 1},
                    {16, 7, 4, 9, 1, 16, 3},
                    {17, 8, 5, 1, 2, 17, 2},
                    {18, 9, 6, 2, 3, 18, 1},
                    {19, 10, 7, 3, 4, 19, 3},
                    {20, 11, 8, 4, 5, 20, 2},
                    {21, 12, 9, 5, 6, 21, 1},
                    {22, 13, 1, 6, 7, 22, 3},
                    {23, 14, 2, 7, 8, 23, 2},
                    {24, 15, 3, 8, 9, 24, 1}
            };
    /*
    //Ставки податку за викиди в атмосферне повітря окремих забруднюючих речовин
    //стаціонарними джерелами забруднення (станом на 01.01.2017 р.)
    */
    static final double[] addition_two_table_one_numbers =
            {
                    // Ставка податку, гривень за 1 тонну
                    0,
                    2204.89,
                    413.53,
                    2204.89,
                    827.06,
                    2806850.49,
                    496.61,
                    8270.62,
                    83.07,
                    83.07,
                    124.61,
                    5458.98,
                    83.07,
                    17451.37,
                    17451.37,
                    88914.54,
                    2204.89,
                    93463.38,
                    93463.38,
                    7086.02,
                    4604.82,
                    2204.89,
                    16100.62,
                    10007.8,
                    5458.98,
                    59192.69
            };
    static final String[] addition_two_table_one_names =
            {
                    // Найменування забруднюючої речовини
                    "",
                    "Азоту оксиди",
                    "Аміак",
                    "Ангідрид сірчистий",
                    "Ацетон",
                    "Бензопірен",
                    "Бутилацетат",
                    "Ванадію п’ятиокис",
                    "Водень хлористий",
                    "Вуглецю окис",
                    "Вуглеводні",
                    "Газоподібні фтористі сполуки",
                    "Тверді речовини",
                    "Кадмію сполуки",
                    "Марганець та його сполуки",
                    "Нікель та його сполуки",
                    "Озон",
                    "Ртуть та її сполуки",
                    "Свинець та його сполуки",
                    "Cірководень",
                    "Сірковуглець",
                    "Спирт н-бутиловий",
                    "Стирол",
                    "Фенол",
                    "Формальдегід",
                    "Хром та його сполуки"
            };
    /*
    //Ставки податку за скиди окремих забруднюючих речовин у водні об’єкти
    */
    static final double[] addition_two_table_second_numbers =
            {
                    // Ставка податку, гривень за 1 тонну
                    0,
                    1448.27,
                    579.68,
                    41.54,
                    8519.83,
                    124.61,
                    7113.1,
                    41.54,
                    1157.54,
                    41.54
            };
    static final String[] addition_two_table_second_names =
            {
                    // Найменування забруднюючої речовини
                    "",
                    "Азот амонійний",
                    "Органічні речовини",
                    "Завислі речовини",
                    "Нафтопродукти",
                    "Нітрати",
                    "Нітрити",
                    "Сульфати",
                    "Фосфати",
                    "Хлориди"
            };
    static final String[] first_answer =
            // Вкажіть принципи державної політики в галузі охорони навколишнього
            // природного середовища.
            {
                    "Пріоритетність вимог екологічної безпеки, обов'язковість додержання екологічних стандартів, нормативів та лімітів " +
                            "використання природних ресурсів при здійсненні господарської, управлінської та іншої діяльності;",
                    "Гарантування екологічно безпечного середовища для життя і здоров'я людей;",
                    "Запобіжний характер заходів щодо охорони навколишнього природного середовища;",
                    "Екологізація матеріального виробництва на основі комплексності рішень у питаннях охорони навколишнього природного " +
                            "середовища, використання та відтворення відновлюваних природних ресурсів, широкого впровадження новітніх технологій;",
                    "Збереження просторової та видової різноманітності і цілісності природних об'єктів і комплексів;",
                    "Науково обґрунтоване узгодження екологічних, економічних та соціальних інтересів суспільства на основі поєднання " +
                            "міждисциплінарних знань екологічних, соціальних, природничих і технічних наук та прогнозування стану навколишнього " +
                            "природного середовища;",
                    "Обов'язковість надання висновків державної екологічної експертизи;",
                    "Гласність і демократизм при прийнятті рішень, реалізація яких впливає на стан навколишнього природного середовища, " +
                            "формування у населення екологічного світогляду;",
                    "Науково обґрунтоване нормування впливу господарської та іншої діяльності на навколишнє природне середовище;",
                    "Безоплатність загального та платність спеціального використання природних ресурсів для господарської діяльності;",
                    "Компенсація шкоди, заподіяної порушенням законодавства про охорону навколишнього природного середовища;",
                    "Вирішення питань охорони навколишнього природного середовища та використання природних ресурсів з урахуванням ступеня " +
                            "антропогенної зміненості територій, сукупної дії факторів, що негативно впливають на екологічну обстановку;",
                    "Поєднання заходів стимулювання і відповідальності у справі охорони навколишнього природного середовища;",
                    "Вирішення проблем охорони навколишнього природного середовища на основі широкого міждержавного співробітництва;",
                    "встановлення екологічного податку, рентної плати за спеціальне використання води, рентної плати за спеціальне " +
                            "використання лісових ресурсів, рентної плати за користування надрами відповідно до Податкового кодексу України."
            };

    static final String[] third_answer =
            // Відтворіть ієрархію нормативно-правових актів у сфері екологічного права
            {
                    "Міжнародні конвенції та угоди, прийняті Верховною Радою України;",
                    "Закони України;",
                    "Підзаконні акти Верховної Ради України;",
                    "Укази Президента України;",
                    "Нормативно-правові акти Кабінету Міністрів України;",
                    "Загальнообов'язкові акти Міністерства екології та природних ресурсів, інших міністерств і відомств;",
                    "Відомчі акти органів державного управління;"
            };

    static int num;
    static int timer;

    static String first_final_form;
    static String second_final_form;
    static String third_final_form;
    static String fourth_final_form;
    static String fifth_final_form;

    static double first_final;
    static double second_final;
    static double third_final;
    static double fourth_final;
    static double fifth_final;

    static double Koc = 1;
    static double Ko = 1;
    static double Kt = 1;
    static double podatok = 0;

    public static void First()
    {
        int j = 5 + (int) (Math.random() * 10);
        System.out.print("1. Вкажіть принципи державної політики в галузі охорони навколишнього природного середовища.");
        System.out.print("\n");
        timer = 0;
        for (int i = 0; i < j;i++)
        {
            timer++;
            System.out.print("  " + timer + ". " + first_answer[i]+"\n");
        }
        System.out.print("==\n");
        Second();
    }
    public static void Second()
    {
        System.out.print("2. Дайте визначення. <b>Екологічне законодавство</b> – це структура, що об'єднує екологічні юридичні норми " +
                         "різного рівня і різної спрямованості. Ними можуть бути норми конституційні, звичайні, норми, орієнтовані на соціальні " +
                         "відносини різного змісту, з приводу охорони різних природних об'єктів.");
        System.out.print("\n");
        System.out.print("==\n");
        Third();
    }
    public static void Third()
    {
        System.out.print("3. Відтворіть ієрархію нормативно-правових актів у сфері екологічного права");
        System.out.print("\n");
        timer = 0;
        for (int i = 0; i < 7;i++)
        {
            timer++;
            System.out.print("  " + timer + ". " + third_answer[i]+"\n");
        }
        System.out.print("==\n");
        Fourth_Table();
    }
    public static void Fourth_Table()
    {
        System.out.print("4. Розрахуйте суму екологічного податку для заданого за варіантом підприємства за наведений звітний період.");
        System.out.print("\n");
        System.out.print("  Фактичний обсяг викиду і-тої забруднюючої речовини Млі, (т)");
        System.out.print("\n");
        timer=0;
        for (int i=0; i<6; i++)
        {
            timer++;
            System.out.print("      Речовина №" + timer + ": " + addition_one[num][i] + " т.");
            System.out.print("\n");
            System.out.print("      Назва або тип речовини №" + timer + ": ");
            if (i == 2 || i == 3 ) {
                System.out.print(addition_two_table_second_names[addition_two[num][i]]);
            }
            else
            {
                System.out.print(addition_two_table_one_names[addition_two[num][i]]);
            }
            System.out.print("\n");
        }
        System.out.print("  Місце скиду речовин № 3 та № 4 -");
        if ((int) addition_one[num][6]==1)
        {
            System.out.print(" Річка");
        }
        else if ((int) addition_one[num][6]==2)
        {
            System.out.print(" Ставок");
        }
        else if ((int) addition_one[num][6]==5)
        {
            System.out.print(" Озеро");
        }
        System.out.print("\n");
        System.out.print("  Місце розміщення відходів речовин № 5 та № 6 -");
        if ((int) addition_one[num][7]==3)
        {
            System.out.print(" 3 км");
        }
        else if ((int) addition_one[num][7]==4)
        {
            System.out.print(" МНП");
        }
        System.out.print("\n");
        System.out.print("  Фактичний об'єм радіоактивних відходів, V (м³) - " + addition_one[num][8] + " м³");
        System.out.print("\n");
        System.out.print("  Кількість повних календарних кварталів, Tзб - " + addition_one[num][9]);
        System.out.print("\n");
        System.out.print("  Категорія відходів - ");
        if (addition_two[num][6] == 3)
        {
            System.out.print("Високоактивні");
        }
        else if (addition_two[num][6] == 2)
        {
            System.out.print("Середньоактивні");
        }
        else if (addition_two[num][6] == 1)
        {
            System.out.print("Низькоактивні");
        }
        System.out.print("\n");
        Fourth_Searching_First();
    }
    public static void Fourth_Searching_First()
    {
        System.out.print("Розрахунки:");
        System.out.print("\n");
        System.out.print("Сума податку, який справляється за викиди в атмосферне повітря: ");
        System.out.print("\n");
        //
        timer=0;
        for (int i=0; i<2; i++) {
            timer++;
            System.out.print("      Речовина №" + timer +" : " + addition_one[num][i] + " т.");
            System.out.print("\n");
            System.out.print("      Назва або тип речовини №" + timer +" : ");
            System.out.print(addition_two_table_one_names[addition_two[num][i]]);
            System.out.print("\n");
            System.out.print("      Фактичний обсяг викиду заб. речовини №" + timer +" : ");
            System.out.print(addition_one[num][i] + "т. ");
            System.out.print("\n");
            System.out.print("      Податок за викид 1 тонни заб. речовини №" + timer +" : ");
            System.out.print(addition_two_table_one_numbers[addition_two[num][i]] + "грн. ");
            System.out.print("\n==\n");
        }
        //
        System.out.print("П_пс = ∑(i=1)^n = (M_i * H_ni) = ");
        System.out.print("(" + addition_one[num][0] + " * " + addition_two_table_one_numbers[addition_two[num][0]] + ")"
                + " + (" + addition_one[num][1] + " * " + "(" + addition_two_table_one_numbers[addition_two[num][1]]+ ") = ");
        double first_1 = (addition_one[num][0]* addition_two_table_one_numbers[addition_two[num][0]]);
        double first_2 = (addition_one[num][1]* addition_two_table_one_numbers[addition_two[num][1]]);
        first_final = (first_1)+(first_2);
        String first_1_form = String.format("%.2f", first_1);
        String first_2_form = String.format("%.2f", first_2);
        first_final_form = String.format("%.2f", first_final);
        System.out.print("("+ (first_1_form) + ")"
                + " + " + "(" + (first_2_form) + ") = ");
        System.out.print(first_final_form + " грн.");
        System.out.print("\n==\n");
        Fourth_Searching_Second();
    }
    public static void Fourth_Searching_Second()
    {
        System.out.print("  Сума податку, який справляється за викиди у водні об'єкти: ");
        // річка - 1, ставок - 2,
        // 3 км - 3, вМежахНаселенногоПункта - 4;
        // озерах - 5;
        System.out.print("\n");
        if (addition_one[num][6] == 2 || addition_one[num][6] == 5)
        {
            Koc = 1.5;
            System.out.print("  Через те, що зкиди відбуваються у Ставок або Озеро, Коєфіцієнт Кос = 1.5;");
            System.out.print("\n");
        }
        //
        timer=2;
        for (int i=2; i<4; i++) {
            timer++;
            System.out.print("      Речовина №" + timer +" : " + addition_one[num][i] + " т.");
            System.out.print("\n");
            System.out.print("      Назва або тип речовини №" + timer +" : ");
            System.out.print(addition_two_table_second_names[addition_two[num][i]]);
            System.out.print("\n");
            System.out.print("      Фактичний обсяг викиду заб. речовини №" + timer +" : ");
            System.out.print(addition_one[num][i] + "т. ");
            System.out.print("\n");
            System.out.print("      Податок за викид 1 тонни заб. речовини №" + timer +" : ");
            System.out.print(addition_two_table_second_numbers[addition_two[num][i]] + "грн. ");
            System.out.print("\n==\n");
        }
        //
        System.out.print("П_с = ∑(i=1)^n = (M_i * H_ni * K_oc) = ");
        System.out.print("(" + addition_one[num][2] + " * " + addition_two_table_second_numbers[addition_two[num][2]] + " * " + Koc + ")"
                + " + (" + addition_one[num][3] + " * " + "(" + addition_two_table_second_numbers[addition_two[num][3]] + " *  " + Koc + ") = ");
        double second_1 = (addition_one[num][2]* addition_two_table_second_numbers[addition_two[num][2]] * Koc);
        double second_2 = (addition_one[num][3]* addition_two_table_second_numbers[addition_two[num][3]] * Koc);
        second_final = (second_1)+(second_2);
        String second_1_form = String.format("%.2f", second_1);
        String second_2_form = String.format("%.2f", second_2);
        second_final_form = String.format("%.2f", second_final);
        System.out.print("("+ (second_1_form) + ")"
                + " + " + "(" + (second_2_form) + ") = ");
        System.out.print(second_final_form + "грн. ");
        System.out.print("\n==\n");
        Fourth_Searching_Third();
    }
    public static void Fourth_Searching_Third()
    {
        System.out.print("  Сума податку, який справляється за розміщення відходів: ");
        // річка - 1, ставок - 2,
        // 3 км - 3, вМежахНаселенногоПункта - 4;
        // озерах - 5;
        System.out.print("\n");
        if (addition_one[num][7] == 4)
        {
            System.out.print("  Через те, що зкиди відбуваються в Межами Населеного Пункта, Коєфіцієнт Кт = 3;");
            Kt = 3;
            System.out.print("\n");
        }
        if (addition_one[num][6] == 2 || addition_one[num][6] == 5)
        {
            System.out.print("  Через те, що місце розміщення відходів у Ставку чи Озері, Коєфіцієнт Ко = 3;");
            Ko=3;
            System.out.print("\n");
        }
        //
        timer=4;
        for (int i=4; i<6; i++) {
            timer++;
            System.out.print("      Речовина №" + timer +" : " + addition_one[num][i] + " т.");
            System.out.print("\n");
            System.out.print("      Назва або тип речовини №" + timer +" : ");
            System.out.print(addition_two_table_one_names[addition_two[num][i]]);
            System.out.print("\n");
            System.out.print("      Фактичний обсяг викиду заб. речовини №" + timer +" : ");
            System.out.print(addition_one[num][i] + "т. ");
            System.out.print("\n");
            System.out.print("      Податок за викид 1 тонни заб. речовини №" + timer +" : ");
            System.out.print(addition_two_table_one_numbers[addition_two[num][i]] + "грн. ");
            System.out.print("\n==\n");
        }
        //
        System.out.print("П_рв = ∑(i=1)^n = (M_i * H_ni * K_т * К_ос) = ");
        System.out.print("(" + addition_one[num][4] + " * " + addition_two_table_one_numbers[addition_two[num][4]] + " * " + Kt + " * " + Ko + ")"
                + " + (" + addition_one[num][5] + " * " + "(" + addition_two_table_one_numbers[addition_two[num][5]] + " * " + Kt + " * " + Ko + ") = ");
        double third_1 = (addition_one[num][4]* addition_two_table_one_numbers[addition_two[num][4]]*Ko*Kt);
        double third_2 = (addition_one[num][5]* addition_two_table_one_numbers[addition_two[num][5]]*Ko*Kt);
        third_final = (third_1)+(third_2);
        String third_1_form = String.format("%.2f", third_1);
        String third_2_form = String.format("%.2f", third_2);
        third_final_form = String.format("%.2f", third_final);
        System.out.print("("+ (third_1_form) + ")"
                + " + " + "(" + (third_2_form) + ") = ");
        System.out.print(third_final_form + " грн.");
        System.out.print("\n==\n");
        Fourth_Searching_Fourth();
    }
    public static void Fourth_Searching_Fourth()
    {
        System.out.print("  Сума податку, за тимчасове зберігання радіоактивних відходів:\n");
        System.out.print("      Категорія відходів - ");
        if (addition_two[num][6] == 3)
        {
            System.out.print("Високоактивні");
            podatok = 541743.45;
        }
        else if (addition_two[num][6] == 2)
        {
            System.out.print("Середньоактивні");
            podatok = 10112.54;
        }
        else if (addition_two[num][6] == 1)
        {
            System.out.print("Низькоактивні");
            podatok = 10112.54;
        }
        System.out.print("\n==\n");
        System.out.print("S_зб = V * N * T_зб = ");
        System.out.print("(" + addition_one[num][8] + " * " + podatok + " * " + addition_one[num][9] + ") = ");
        fourth_final = (addition_one[num][8] * podatok * addition_one[num][9]);
        fourth_final_form = String.format("%.2f", fourth_final);
        System.out.print(fourth_final_form + " грн.");
        System.out.print("\n==\n");
        Fourth_Searching_Fifth();
    }
    public static void Fourth_Searching_Fifth() {
        System.out.print("Загальна сума єкологічного податку:\n");
        System.out.print("П_загальний = П_пс + П_с + П_рв + S_зб = ");
        System.out.print((first_final_form) + " + " + (second_final_form) + " + " + (third_final_form) + " + " + (fourth_final_form) + " = ");
        fifth_final = ((first_final)+(second_final)+(third_final)+(fourth_final));
        fifth_final_form = String.format("%.2f", fifth_final);
        System.out.print(fifth_final_form + " грн.");
        System.out.print("\n==\n");
        Final();
    }
    public static void Final()
    {
        System.out.print("Результати вибору коефіцієнтів:\n");
        System.out.print("  Н_п1: " + (addition_two_table_one_numbers[addition_two[num][0]]) + "грн. \n");
        System.out.print("  Н_п2: " + (addition_two_table_one_numbers[addition_two[num][1]]) + "грн. \n");
        System.out.print("  П_пс: " + (first_final_form) + "грн. ");
        System.out.print("\n==\n");
        System.out.print("  Н_п3: " + (addition_two_table_second_numbers[addition_two[num][2]]) + "грн. \n");
        System.out.print("  Н_п4: " + (addition_two_table_second_numbers[addition_two[num][3]]) + "грн. \n");
        System.out.print("  K_oc: " + (Koc) + "\n");
        System.out.print("  П_c: " + (second_final_form) + "грн. ");
        System.out.print("\n==\n");
        System.out.print("  Н_п3: " + (addition_two_table_one_numbers[addition_two[num][4]]) + "грн. \n");
        System.out.print("  Н_п4: " + (addition_two_table_one_numbers[addition_two[num][5]]) + "грн. \n");
        System.out.print("  K_т: " + (Kt) + "\n");
        System.out.print("  K_o: " + (Ko) + "\n");
        System.out.print("  П_рв: " + (third_final_form) + "грн. ");
        System.out.print("\n==\n");
        System.out.print("  N: " + (podatok) + "грн. \n");
        System.out.print("  С_зб: " + (fourth_final_form) + "грн. ");
        System.out.print("\n==\n");
        System.out.print("  П_загальний: " + (fifth_final_form) + "грн. ");
        System.out.print("\n==\n");
        System.out.print("""
                Висновок\040
                В ході виконання лабораторної роботи, я навчився розраховувати екологічні податки в таких ситуаціях як:
                    * при скидуванні заб. речовин у водні об'єкти;
                    * за тимчасове збереження радіоактивних відходів;
                    * при розміщенні відходів у межах населеного пункта;
                    * за викиди в атмосферне повітря;
                Також дослідив правові та організаційні основи законодавства України з охорони навколишнього середовища.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе
                    ∑(i=1)^n - тут i=1 будет над оператором, а n под оператором сумми.
                """);
    }
    public static void main()
    {
        System.out.print("""
                Практичного Заняття № 1\040
                «ДОСЛІДЖЕННЯ ПРАВОВИХ ТА ОРГАНІЗАЦІЙНИХ ОСНОВ ЗАКОНОДАВСТВА УКРАЇНИ З ОХОРОНИ НАВКОЛИШНЬОГО СЕРЕДОВИЩА. РОЗРАХУНОК ЕКОЛОГІЧНОГО ПОДАТКУ»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        First();
    }
}
