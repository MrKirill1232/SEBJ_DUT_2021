package com.hecate.labs;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Lab_02_two {

    static int num;
    static int sec_num;

    static double num_Ri3;
    static double sec_num_Ri3;

    static double num_RiHB;
    static double sec_num_RiHB;

    static double num_D;
    static double sec_num_D;

    static double num_t;
    static double sec_num_t;

    static double Td = 168;

    static final double[][] table  = new double[][]
            {
                    {   0   ,   1   ,   2   ,   3   ,   4   ,   5   ,   6   ,   7   },
                    {	1	,	16	,	1000,	50	,	500	,	40	,	2	,	2	},
                    {	2	,	15	,	500	,	60	,	350	,	36	,	3	,	2	},
                    {	3	,	14	,	600	,	70	,	420	,	31	,	4	,	3	},
                    {	4	,	13	,	550	,	80	,	400	,	33	,	5	,	2	},
                    {	5	,	12	,	400	,	50	,	350	,	32	,	2	,	3	},
                    {	6	,	11	,	450	,	60	,	360	,	35	,	3	,	4	},
                    {	7	,	10	,	350	,	50	,	290	,	30	,	4	,	2	},
                    {	8	,	9	,	300	,	70	,	180	,	37	,	5	,	1	},
                    {	9	,	8	,	600	,	50	,	370	,	38	,	2	,	3	},
                    {	10	,	7	,	250	,	60	,	180	,	39	,	3	,	4	},
                    {	11	,	6	,	440	,	40	,	200	,	40	,	4	,	2	},
                    {	12	,	5	,	600	,	50	,	300	,	41	,	5	,	3	},
                    {	13	,	4	,	300	,	60	,	230	,	39	,	2	,	2	},
                    {	14	,	3	,	250	,	40	,	150	,	38	,	3	,	1	},
                    {	15	,	2	,	350	,	50	,	170	,	37	,	4	,	3	},
                    {	16	,	1	,	200	,	50	,	90	,	36	,	5	,	4	},
                    {	17	,	17	,	800	,	70	,	600	,	35	,	2	,	2	},
                    {	18	,	18	,	900	,	80	,	550	,	34	,	3	,	1	},
                    {	19	,	19	,	1100,	70	,	750	,	33	,	4	,	2	},
                    {	20	,	20	,	1200,	60	,	800	,	32	,	5	,	3	},
                    {	21	,	21	,	1500,	40	,	1000,	40	,	4	,	3	},
                    {	22	,	22	,	1700,	60	,	880	,	41	,	3	,	2	},
                    {	23	,	23	,	2000,	50	,	1200,	36	,	2	,	1	},
                    {	24	,	24	,	2500,	50	,	1500,	38	,	2	,	1	},
                    {	25	,	25	,	1800,	45	,	750	,	37	,	3	,	2	},
                    {	26	,	26	,	3000,	65	,	1700,	39	,	4	,	3	},
                    {	27	,	27	,	3500,	70	,	2200,	41	,	3	,	2	},
                    {	28	,	28	,	3200,	50	,	1500,	40	,	2	,	1	},
                    {	29	,	29	,	2900,	55	,	1100,	36	,	4	,	3	},
                    {	30	,	30	,	3100,	60	,	1600,	39	,	1	,	1	},
                    {	31	,	31	,	4000,	55	,	2000,	37	,	2	,	2	},
                    {	32	,	32	,	5000,	50	,	2600,	40	,	4	,	3	}

            };

    public static void Zero()
    {
        if (num <= 15)
        {
            sec_num = num + 15;
        }
        else
        {
            sec_num = num - 15;
        }
        First();
    }
    public static void First()
    {
        System.out.print("Вихідні дані для розрахунку індивідуальногоризику загибелі та нещасного випадку");
        System.out.print("\n  Варіанти виконання:\n" +
                         "      Перше завдання - " + num + ";\n" +
                         "      Друге завдання - " + sec_num + ";\n");
        System.out.print("  Кількість загиблих мешканців у населеному пункті, N_п, (осіб)\n");
        System.out.print("      " + table[num][1] + " (осіб)\n");
        System.out.print("      " + table[sec_num][1] + " (осіб)\n");
        System.out.print("  Кількість жителів, що мешкають у населеному пункті, N_o, (осіб)\n");
        System.out.print("      " + table[num][2] + " (осіб)\n");
        System.out.print("      " + table[sec_num][2] + " (осіб)\n");
        System.out.print("  Статистичний період спостережень, Т, (років)\n");
        System.out.print("      " + table[num][3] + " (років)\n");
        System.out.print("      " + table[sec_num][3] + " (років)\n");
        System.out.print("  Кількість мешканців населеного пункту, які отримали травми за період спостережень, N_нв (осіб)\n");
        System.out.print("      " + table[num][4] + " (осіб)\n");
        System.out.print("      " + table[sec_num][4] + " (осіб)\n");
        System.out.print("  Кількість годин на тиждень, які житель А працює поза пунктом проживання, М (год.)\n");
        System.out.print("      " + table[num][5] + " (год.)\n");
        System.out.print("      " + table[sec_num][5] + " (год.)\n");
        System.out.print("  Кількість тижнів відпочинку за рік із виїздом за межі пункту проживання, О, (тижні)\n");
        System.out.print("      " + table[num][6] + " (тижні)\n");
        System.out.print("      " + table[sec_num][6] + " (тижні)\n");
        System.out.print("  Кількість тижнів відряджень за рік, К, (тижні)\n");
        System.out.print("      " + table[num][7] + " (тижні)\n");
        System.out.print("      " + table[sec_num][7] + " (тижні)");
        Second();
    }
    public static void Second()
    {
        for (int i=0; i<2;i++)
        {
            int var;
            if (i==0)
            {var=num;}
            else {var=sec_num;}
            System.out.print("\n==\n");
            System.out.print("Визначимо індивідуальний ризик на підприємстві для " + var + " варіанта: \n");
            System.out.print("  R_i = N_n / N_o = ");
            System.out.print((table[var][1]) + " / " + (table[var][2]) + ";");
            System.out.print("\n");
            double Ri = ((table[var][1]) / (table[var][2]));
            int local;
            if ((int) (Ri * Math.pow(10, 2)) != 0) {
                System.out.print("Ступінь допустимості ризику  - Ризик неприпустимий");
                System.out.print("\nСтупінь перевищення ризику   - в 3 рази");
                System.out.print("\nУмови життєдіяльності людини - Небезпечні");
                System.out.print("\nОцінка допустимості ризику   - Високий, необхідні заходи захисту");
                local = 2;
            } else if ((int) (Ri * Math.pow(10, 3)) != 0) {
                System.out.print("Ступінь допустимості ризику  - Ризик припустимий тільки при особливих обставинах");
                System.out.print("\nСтупінь перевищення ризику   - в 2 рази");
                System.out.print("\nУмови життєдіяльності людини - Небезпечні");
                System.out.print("\nОцінка допустимості ризику   - Високий, необхідні заходи захисту");
                local = 3;
            } else if ((int) (Ri * Math.pow(10, 4)) != 0) {
                System.out.print("Ступінь допустимості ризику  - Потрібне детальне обґрунтування допустимості");
                System.out.print("\nСтупінь перевищення ризику   - в 2 рази");
                System.out.print("\nУмови життєдіяльності людини - Небезпечні");
                System.out.print("\nОцінка допустимості ризику   - Високий, необхідні заходи захисту");
                local = 4;
            } else if ((int) (Ri * Math.pow(10, 5)) != 0) {
                System.out.print("Ступінь допустимості ризику  - Ризик прийнятий без обмежень");
                System.out.print("\nСтупінь перевищення ризику   - у 2 рази");
                System.out.print("\nУмови життєдіяльності людини - Відносно безпечні");
                System.out.print("\nОцінка допустимості ризику   - Відносно невисокий - допустимий");
                local = 5;
            } else if ((int) (Ri * Math.pow(10, 6)) != 0) {
                System.out.print("Ступінь допустимості ризику  - Ризик прийнятий без обмежень");
                System.out.print("\nУмови життєдіяльності людини - Відносно безпечні");
                System.out.print("\nОцінка допустимості ризику   - Відносно невисокий - допустимий");
                local = 6;
            } else if ((int) (Ri * Math.pow(10, 7)) != 0) {
                System.out.print("Ступінь допустимості ризику  - Ризик прийнятий без обмежень");
                System.out.print("\nУмови життєдіяльності людини - Відносно безпечні");
                System.out.print("\nОцінка допустимості ризику   - Відносно невисокий - допустимий");
                local = 7;
            } else {
                System.out.print("Ступінь допустимості ризику  - Ризик прийнятий без обмежень");
                System.out.print("\nУмови життєдіяльності людини - Безпечні");
                System.out.print("\nОцінка допустимості ризику   - Зовсім незначний");
                local = 8;
            }
            String Ri_s = String.format("%.3f", (Ri * Math.pow(10, local)));
            System.out.print("\n    R_i = " + Ri_s + " * 10^-" + local);
        }
        Third();
    }
    public static void Third()
    {
        System.out.print("\n==\n");
        System.out.print("Розрахуємо індівідуальний ризик загибелі: \n");
        System.out.print("R_із = (N_n * D * t) / ( T * N_o * d * T_d)");
        System.out.print("\n==");
        System.out.print("\nN_n - кількість загиблих ( 1 - " + table[num][1] + "; 2 - " + table[sec_num][1]+" );");
        System.out.print("\nD - кількість тижніі протягом року, коли житель А, проживаж в населеному пункту");
        System.out.print("\n=> D = d - O - K [тижнів]");
        System.out.print("\nd - кількість тижнів на рік ( d = 52 )");
        System.out.print("\nO - кількість тижнів відпочинку ( 1 - " + table[num][6] + "; 2 - " + table[sec_num][6]+" );");
        System.out.print("\nK - кількість тижнів у відрядженні ( 1 - " + table[num][7] + "; 2 - " + table[sec_num][7]+" );");
        System.out.print("\nt - кількість тижнів, коли мешканець не піддається небезпекам");
        System.out.print("\n=> t = T_d - M [тижнів];");
        System.out.print("\nT_d - кількість годин у тижні");
        System.out.print("\n=> T_d = t_n * d_m [год];");
        System.out.print("\nt_n - кількість годин у добі ( t_n = 24 (год.);");
        System.out.print("\nd_m - кількість днів у тижні ( d_m = 7 (днів.);");
        System.out.print("\nT - статистичний період спостережень ( 1 - " + table[num][3] + "; 2 - " + table[sec_num][3]+" );");
        System.out.print("\nN_o - кількість мешканців в населеному пункті ( 1 - " + table[num][2] + "; 2 - " + table[sec_num][2]+" );");
        System.out.print("\nM - кількість годин на тиждень, за роботу поза пунктном проживання ( 1 - " + table[num][5] + "; 2 - " + table[sec_num][5]+" );");
        for (int i=0; i<2; i++)
        {
            System.out.print("\n==\n");
            int var;
            double local;
            double local2;
            if (i==0)
            {var=num;}
            else {var=sec_num;}
            System.out.print("\n");
            System.out.print("Варіант " + var + ":\n");
            System.out.print("D = d - O - K = ");
            int D = (52 - (int) table[var][6] - (int) table[var][7]);
            System.out.print("52 - " + (int) table[var][6] + " - " + (int) table[var][7] + " = " + D);
            System.out.print("\n");
            System.out.print("t = (t_н * d_м) - M = ");
            int t = ((24 * 7) - (int) table[var][5]);
            System.out.print("(24 * 7) - " + (int) table[var][5]+" = " + t);
            System.out.print("\n");
            System.out.print("T_d = (t_н * d_м) = ");
            System.out.print("(24 * 7) = " + Td);
            System.out.print("\n");
            local = ((table[var][1] * D * t) / (table[var][3] * table[var][2] * 52 * Td));
            System.out.print("R_і.зв = ( " + table[var][1] + " * " + D + " * " + t + " ) / ( " + table[var][3] + " * " + table[var][2] + " * 52 * " + Td + " ) = ");
            System.out.print((table[var][1] * D * t) + " / ");
            NumberFormat df = new DecimalFormat("#");
            System.out.print(df.format((table[var][3] * table[var][2] * 52 * Td)*Math.pow(10, 1)));
            System.out.print(" = ");
            System.out.print(df.format(local*Math.pow(10, 6)));
            System.out.print(" * 10^-6");
            System.out.print("\nНебезпека вище норми в " + (int)(local*Math.pow(10, 6)) + " раз!");
            System.out.print("\n==\n");
            System.out.print("R_і.нв = ( ( N_n + N_нв ) * D * t) / ( T * N_o * d * T_d )");
            System.out.print("\nN_n - кількість загиблих мешканція населеного пункта ( 1 - " + table[num][1] + "; 2 - " + table[sec_num][1]+" );");
            System.out.print("\nN_нв - кількість мешканців, отримавших травми внаслідок нещасного випадку ( 1 - " + table[num][4] + "; 2 - " + table[sec_num][4]+" );");
            System.out.print("\nR_і.нв = ( (" + table[var][1] + " + " + table[var][4] + ") * " + D + " * " + t + " ) / ( " + table[var][3] + " * " + table[var][2] + " * 52 * 168 ) = ");
            local2 = ( (table[var][1] + table[var][4] ) * D * t ) / ( table[var][3] * table[var][2] * 52 * 168 );
            System.out.print(df.format((table[var][1] + table[var][4] ) * D * t ));
            System.out.print(" / ");
            System.out.print(df.format( table[var][3] * table[var][2] * 52 * 168 ));
            System.out.print(" = ");
            if (i==0)
            {
                num_t = t;
                num_D = D;
                num_Ri3= Double.parseDouble(df.format(local*Math.pow(10, 6)));
                num_RiHB= Double.parseDouble(df.format(local2*Math.pow(10, 6)));
                System.out.print(df.format(local2*Math.pow(10, 6)));
                System.out.print(" * 10^-6");
                System.out.print("\nНебезпека перевищена в " + (int)(local2*Math.pow(10, 6)) + " разів!");
            }
            else {
                sec_num_t = t;
                sec_num_D = D;
                sec_num_Ri3= Double.parseDouble(df.format(local*Math.pow(10, 6)));
                sec_num_RiHB= Double.parseDouble(df.format(local2*Math.pow(10, 6)));
                System.out.print(df.format(local2*Math.pow(10, 6)));
                System.out.print(" * 10^-6");
                System.out.print("\nНебезпека перевищена в " + (int)(local2*Math.pow(10, 6)) + " разів!");
            }
        }
        System.out.print("\n==");
        Final();
    }
    public static void Final()
    {
        System.out.print("\nРезультати розрахунків");
        System.out.print("\n    Кількість тижнів проживання у населеному пункті за рік, D, (тижнів)");
        System.out.print("\n        Для варіанта №" + num + " - " + num_D);
        System.out.print(" (тижнів)");
        System.out.print("\n        Для варіанта №" + sec_num + " - " + sec_num_D);
        System.out.print(" (тижнів)");
        System.out.print("\n    Кількість годин у тижні, T_d, (год.)");
        System.out.print("\n        Для варіанта №" + num + " - " + Td);
        System.out.print(" (год.)");
        System.out.print("\n        Для варіанта №" + sec_num + " - " + Td);
        System.out.print(" (год.)");
        System.out.print("\n    Кількість годин у тижні, житель А не які піддається небезпекам, t, (год.)");
        System.out.print("\n        Для варіанта №" + num + " - " + num_t);
        System.out.print(" (год.)");
        System.out.print("\n        Для варіанта №" + sec_num + " - " + sec_num_t);
        System.out.print(" (год.)");
        System.out.print("\n    Індивідуальний ризик летального наслідку за існуючого способу життя, R_із");
        System.out.print("\n        Для варіанта №" + num + " - " + num_Ri3);
        System.out.print(" * 10^-6");
        System.out.print("\n        Для варіанта №" + sec_num + " - " + sec_num_Ri3);
        System.out.print(" * 10^-6");
        System.out.print("\n    Індивідуальний ризик нещасного випадку за існуючого образу життя, R_інв");
        System.out.print("\n        Для варіанта №" + num + " - " + num_RiHB);
        System.out.print(" * 10^-6");
        System.out.print("\n        Для варіанта №" + sec_num + " - " + sec_num_RiHB);
        System.out.print(" * 10^-6");
        System.out.print("\n==");
        System.out.print("\nВисновки:");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці ризико-орієнтованого підходу для побудови ймовірносно-логічних моделей виникнення та розвитку Надзвийчайних Ситуацій.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе""");
        System.out.print("\n");
    }
    public static void main()
    {
        System.out.print("""
                Практичне Заняття № 2\040
                «Застосування ризик-орієнтованого підходу для побудови ймовірнісно-логічних моделей виникнення і розвитку надзвичайних ситуацій»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        Zero();
    }
}
