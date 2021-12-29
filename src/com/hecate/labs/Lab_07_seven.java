package com.hecate.labs;

import java.util.Scanner;

public class Lab_07_seven {

    private static int num;
    private static double ex_2_1_final;
    private static double ex_2_2_final;

    static final double[][] tab_1_values = new double[][]
            {
                    {	0	,	1	,	2	,	3	    ,	4	,	5	,	6	,	7	},
                    {	1	,	35	,	15	,	6	    ,	10	,	60	,	3.5 ,	0.1	},
                    {	2	,	36	,	16	,	6.1 	,	15	,	65	,	4	,	0.2	},
                    {	3	,	37	,	17	,	6.2 	,	20	,	70	,	4.5 ,	0.3	},
                    {	4	,	38	,	18	,	6.3 	,	25	,	75	,	5	,	0.4	},
                    {	5	,	39	,	19	,	6.4 	,	10	,	80	,	5.5 ,	0.15},
                    {	6	,	40	,	20	,	6.5 	,	15	,	85	,	6	,	0.25},
                    {	7	,	41	,	15	,	5	    ,	20	,	90	,	3.5 ,	0.35},
                    {	8	,	42	,	16	,	5.1 	,	25	,	95	,	4	,	0.45},
                    {	9	,	43	,	17	,	5.2 	,	10	,	78	,	4.5 ,	0.1	},
                    {	10	,	44	,	18	,	5.3 	,	15	,	75	,	5	,	0.2	}
            };

    static final double[][] tab_2_values = new double[][]
            {
                    {	0	,	1	,	2	,	3	    ,	4	,	5       ,	6       ,	7	},
                    {	1	,	5	,	2	,	3	    ,	20	,	0.5 	,	0.2 	,	1.2	},
                    {	2	,	6	,	3	,	3	    ,	35	,	0.7 	,	0.3 	,	1.5	},
                    {	3	,	7	,	4	,	3	    ,	20	,	0.6 	,	0.4 	,	2.0	},
                    {	4	,	9	,	2	,	3	    ,	25	,	0.9 	,	0.2 	,	1.8	},
                    {	5	,	4	,	3	,	3	    ,	30	,	0.8 	,	0.3 	,	1.3	},
                    {	6	,	5	,	4	,	3   	,	25	,	0.45 	,	0.4 	,	2.5	},
                    {	7	,	6	,	4	,	3	    ,	20	,	0.38 	,	0.2 	,	2.4	},
                    {	8	,	7	,	3	,	3	    ,	25	,	0.56 	,	0.3 	,	1.2	},
                    {	9	,	8	,	2	,	3	    ,	30	,	0.36 	,	0.4 	,	0.6	},
                    {	10	,	9	,	2	,	3	    ,	45	,	0.9 	,	0.5 	,	0.7	}
            };

    static public void Zero()
    {
        System.out.println("Щодо розрахунку необхідної кратності ШТУЧНОЇ вентиляції");
        String tab_1 = "| %-5s | %-4s | %-4s | %-5s | %-3s | %-7s | %-11s | %-12s |%n";
        System.out.println("+-------+------+------+-------+-----+---------+-------------+--------------+");
        System.out.format(tab_1, "# вар", "A", "B", "H", "V_m","G", "q_рз","q_0");
        System.out.println("+-------+------+------+-------+-----+---------+-------------+--------------+");
        System.out.format(tab_1, "  "+num, (int)tab_1_values[num][1]+" м", (int)tab_1_values[num][2]+" м", tab_1_values[num][3]+" м", (int)tab_1_values[num][4]+"%", (int)tab_1_values[num][5]+"гр/г", tab_1_values[num][6]+" мг/м^3", tab_1_values[num][7]+" мг/м^3");
        System.out.println("+-------+------+------+-------+-----+---------+-------------+--------------+");
        System.out.println("Розрахунки:");
        System.out.println("Вільний об’єм токарно-механічного цеху (м^3)");
        double ex_1 = (((int)tab_1_values[num][1]*(int)tab_1_values[num][2]*tab_1_values[num][3]) * ( (100-tab_1_values[num][4])/100));
        String V_1_1 = "%-4s%-12s%-5s%-3s%-5s";
        String V_1_2 = "%-3s%-2s%-3s%-2s%-3s%-3s%-3s%-2s%-3s%-3s%-2s%-2s";
        /* Вверхняя строка */
        System.out.format(V_1_1, "", "", "( 100", " - ", "V_m )");
        System.out.format(V_1_2, "", "", "", "", "", "", "", "( ", "100", " - ", "10", " )");
        System.out.print("\n");
        /* Средняя строка */
        System.out.format(V_1_1, "V = ", "A * B * H * ", "-----", "---", "-----");
        System.out.format(V_1_2, " = ", (int)tab_1_values[num][1], " * ", (int)tab_1_values[num][2], " * ", tab_1_values[num][3], " * ", "--", "---", "---", "--", "--");
        System.out.print(" = " + String.format("%.2f", (int)tab_1_values[num][1]*(int)tab_1_values[num][2]*tab_1_values[num][3]) + " * " + ( (100-tab_1_values[num][4])/100) +
                         " = " + String.format("%.2f", ex_1) + " м^3;");
        System.out.print("\n");
        /* Нижняя строка */
        System.out.format(V_1_1, "", "", "", "100", "");
        System.out.format(V_1_2, "", "", "", "", "", "", "", "", "", "100", "", "");
        System.out.print("\n");

        System.out.println("Необхідний повітрообмін у виробничому приміщенні (м^3/год):");
        System.out.println("k = 1;");

        double ex_2 = ( ( 1 * tab_1_values[num][5] ) / ( (tab_1_values[num][6] - tab_1_values[num][7])* 0.001 ) ) ;
        String V_2_1 = "%-6s%-9s";
        String V_2_2 = "%-3s%-4s%-3s%-5s";

        /* Вверхняя строка */
        System.out.format(V_2_1, "", " k *  G");
        System.out.format(V_2_2, "", "   1", " * ", (int)tab_1_values[num][5]);
        System.out.format(V_2_2, "", "   1", " * ", (int)tab_1_values[num][5]);
        System.out.print("\n");
        /* Средняя строка */
        System.out.format(V_2_1, "L_ш = ", "---------");
        System.out.format(V_2_2, " = ", "----", "---", "-----");
        System.out.format(V_2_2, " = ", "----", "---", "-----");
        System.out.print(" = " + String.format("%.2f", ex_2) + " м^3/год;");
        System.out.print("\n");
        /* Нижняя строка */
        System.out.format(V_2_1, "", " q - q_0");
        System.out.format(V_2_2, "", " "+tab_1_values[num][6], " - ", tab_1_values[num][7]);
        System.out.format(V_2_2, "", " "+(tab_1_values[num][6] - tab_1_values[num][7])," * ", "0.001");
        System.out.print("\n");
        System.out.println("Вообщем там такой прикол G предоставляется в граммах, а q и q_0 предоставляются в мили граммах, по-этому сразу переводим с милиграмов в грамы;");
        System.out.print("\n");
        System.out.println("РЕЗУЛЬТАТ - Кратність повітрообміну в цеху становитиме (раз/год):");

        double ex_1_final = ex_2 / ex_1;

        String V_3_1 = "%-4s%-3s";
        String V_3_2 = "%-3s%-11s";

        /* Вверхняя строка */
        System.out.format(V_3_1, "", "L_ш");
        System.out.format(V_3_2, "", "  "+String.format("%.2f", ex_2));
        System.out.print("\n");
        /* Средняя строка */
        System.out.format(V_3_1, "K = ", "----");
        System.out.format(V_3_2, " = ", "-----------");
        System.out.print(" = " + String.format("%.2f", ex_1_final) + " раз/год;");
        System.out.print("\n");
        /* Нижняя строка */
        System.out.format(V_3_1, "", " V");
        System.out.format(V_3_2, "", "  "+String.format("%.2f", ex_1));
        System.out.print("\n");
        First();
    }

    static public void First()
    {
        System.out.print("\n==\n");
        System.out.println("Щодо розрахунку ЕФЕКТИВНОСТІ ПРИРОДНОЇ вентиляції");
        String tab_1 = "| %-5s | %-5s | %-5s | %-6s | %-7s | %-6s | %-6s | %-8s |%n";
        System.out.println("+-------+-------+-------+--------+---------+--------+--------+----------+");
        System.out.format(tab_1, "# вар", "A", "B", "H", "n","a", "b","c");
        System.out.println("+-------+-------+-------+--------+---------+--------+--------+----------+");
        System.out.format(tab_1, "  "+num, (int)tab_2_values[num][1]+" м", (int)tab_2_values[num][2]+" м", (int)tab_2_values[num][3]+" м", (int)tab_2_values[num][4]+" чол", tab_2_values[num][5]+" м", tab_2_values[num][6]+" м", tab_2_values[num][7]+" м/с");
        System.out.println("+-------+-------+-------+--------+---------+--------+--------+----------+");
        System.out.println("Розрахунки:");
        double V = (int)tab_2_values[num][1]*(int)tab_2_values[num][2]*(int)tab_2_values[num][3];
        System.out.print("V = A * B * H = " + (int)V + " м^3");
        System.out.print("\n");
        System.out.print("L_атм = ( a * b * c ) * 3 600 = " + String.format("%.2f", (tab_2_values[num][5]*tab_2_values[num][6]*tab_2_values[num][7])*3600) + " м^3/год");
        System.out.print("\n");

        double ex_2 = ( ( ( (tab_2_values[num][5]*tab_2_values[num][6]*tab_2_values[num][7])*3600) ) / ( (int)V ) );
        ex_2_1_final = ex_2;
        String V_4_1 = "%-14s%-5s";
        String V_4_2 = "%-3s%-11s";

        /* Вверхняя строка */
        System.out.format(V_4_1, "", "L_атм");
        System.out.format(V_4_2, "", "  "+String.format("%.2f", (tab_2_values[num][5]*tab_2_values[num][6]*tab_2_values[num][7])*3600));
        System.out.print("\n");
        /* Средняя строка */
        System.out.format(V_4_1, "К_фактична = ", "-----");
        System.out.format(V_4_2, " = ", "-----------");
        System.out.print(" = " + String.format("%.2f", ex_2) + " раз/год;");
        System.out.print("\n");
        /* Нижняя строка */
        System.out.format(V_4_1, "", "  V");
        System.out.format(V_4_2, "", "  "+(int)V);
        System.out.print("\n");

        System.out.println("K_CO_2 – 22,4 л СО2 видихає 1 студент за годину;");
        System.out.println("ГДК_CO_2 – гранично допустима концентрація в приміщенні у *промиле* %о або в л/м^3 = 1 л/м^3;");
        System.out.println("С_атм – вміст СО2 в атмосферному повітрі у л/м^3 – він дорівнює 0,4;");

        double ex_3 = ( ( (int)tab_2_values[num][4] * 22.4 ) / ( 1 - 0.4 ) );
        double ex_4 = ( ex_3 / V );
        ex_2_2_final = ex_4;
        String L_5_1 = "%-11s%-8s%-3s%-6s";
        String L_5_2 = "%-3s%-2s%-3s%-4s";
        String L_5_3 = "%-3s%-7s";
        /* Вверхняя строка */
        System.out.format(L_5_1, "", "   n", " * ", "K_CO_2");
        System.out.format(L_5_2, "", (int)tab_2_values[num][4]," * ","22,4");
        System.out.format(L_5_3, "", " "+String.format("%.2f", (int)tab_2_values[num][4] * 22.4));
        System.out.print("\n");
        /* Средняя строка */
        System.out.format(L_5_1, "L_необх = ", "--------","---","------");
        System.out.format(L_5_2, " = ", "--","---","----");
        System.out.format(L_5_3, " = ", "-------");
        System.out.print(" = " + String.format("%.2f", ex_4) + " раз/год;");
        System.out.print("\n");
        /* Нижняя строка */
        System.out.format(L_5_1, "", "ГДК_СО_2", " - ", "С_атм");
        System.out.format(L_5_2, "", " 1"," - ","0.4");
        System.out.format(L_5_3, "", "  "+( 1 - 0.4 ));
        System.out.print("\n");

        PreFinal();
    }

    static public void PreFinal(){
        System.out.print("\n==\n");
        if ( ex_2_1_final / ex_2_2_final > 1 ){
            System.out.print("Природня ветиляція ефективна;");
        }
        else {
            System.out.print("Природня ветиляція не ефективна;");
        }
        System.out.print("\n");
        Final();
    }

    public static void Final() {
        System.out.println("=====");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці як розраховувати оцінку ефектвності природньої та необхідну кратність штучної вентиляції.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе
                    П_загальний_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе и то что идет после второго подчеркивания, пишется в нижнем индексе нижнего индекса""");
        System.out.print("\n");
    }

    static public void main()
    {
        System.out.print("""
                Практичного Заняття № 7\040
                «Оцінка ефективності вентиляції у виробничому приміщенні»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        if (num == 20 || num == 30)
        {
            num = 10;
        }
        else if (num > 10 && num < 30) {
            double local = num * Math.pow(10,-1);
            local = local - (int) ( num * Math.pow(10,-1) );
            num = (int) (local*10);
        }
        Zero();
    }
}
