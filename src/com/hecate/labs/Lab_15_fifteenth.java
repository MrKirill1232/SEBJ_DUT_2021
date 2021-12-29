package com.hecate.labs;

import java.util.Scanner;

public class Lab_15_fifteenth {

    private static int num;
    private static int num1 = num;
    private static int num2 = num;
    private static int num3 = num;
    private static int num4 = num;
    private static int num5 = num;

    static final double[][] tab_1_1 = new double[][]
            {
                    {	0	,	1	,	2   	,	3 	    ,	4	,	5	},
                    {	1	,	220	,	1.5 	,	0.8 	,	75	,	26	},
                    {	2	,	380	,	0.5 	,	1.0 	,	60	,	18	},
                    {	3	,	220	,	0.1 	,	0.6 	,	40	,	10	},
                    {	4	,	220	,	1.2 	,	0.8 	,	60	,	18	},
                    {	5	,	380	,	0.01 	,	0.7 	,	80	,	27	},
                    {	6	,	220	,	0.6 	,	0.6 	,	75	,	26	},
                    {	7	,	220	,	0.1 	,	0.8 	,	65	,	19	},
                    {	8	,	380	,	1.2 	,	0.8 	,	40	,	10	},
                    {	9	,	220	,	1.5 	,	0.9 	,	60	,	18	},
                    {	10	,	220	,	0.9 	,	0.6 	,	75	,	26	},
                    {	11	,	380	,	1.5 	,	0.7 	,	60	,	18	},
                    {	12	,	220	,	1.0 	,	0.6 	,	80	,	27	},
                    {	13	,	220	,	1.2 	,	0.9 	,	60	,	18	},
                    {	14	,	380	,	1.0 	,	0.75 	,	40	,	10	},
                    {	15	,	220	,	1.25 	,	1.0 	,	80	,	27	},
                    {	16	,	220	,	0.6 	,	0.9 	,	75	,	26	},
                    {	17	,	380	,	1.5 	,	0.5 	,	40	,	10	},
                    {	18	,	220	,	0.8 	,	0.6 	,	70	,	24	},
                    {	19	,	220	,	1.2 	,	0.8 	,	40	,	10	},
                    {	20	,	380	,	1.5 	,	0.9 	,	60	,	18	},
                    {	21	,	220	,	1.0 	,	0.75 	,	40	,	10	},
                    {	22	,	220	,	0.8 	,	1	    ,	75	,	26	},
                    {	23	,	380	,	0.8 	,	0.75 	,	40	,	10	},
                    {	24	,	220	,	0.85 	,	0.7 	,	60	,	18	},
                    {	25	,	220	,	0.65 	,	0.5 	,	75	,	26	},
                    {	26	,	380	,	0.9 	,	1	    ,	80	,	28	},
                    {	27	,	220	,	0.7 	,	0.5 	,	75	,	26	},
                    {	28	,	380	,	0.6 	,	0.6 	,	40	,	10	},
                    {	29	,	220	,	1.0 	,	0.8 	,	70	,	24	},
                    {	30	,	220	,	0.4 	,	0.9 	,	40	,	10	},
            };

    static final double[][] tab_2_1 = new double[][]
            {
                    {	0	,	1	,	2	,	3	,	4	},
                    {	1	,	600	,	510	,	650	,	10	},
                    {	2	,	860	,	450	,	600	,	4	},
                    {	3	,	500	,	510	,	790	,	8	},
                    {	4	,	720	,	550	,	620	,	3	},
                    {	5	,	470	,	850	,	410	,	5	},
                    {	6	,	845	,	470	,	460	,	3.8	},
                    {	7	,	550	,	750	,	870	,	1.7	},
                    {	8	,	450	,	830	,	500	,	5	},
                    {	9	,	860	,	430	,	760	,	6	},
                    {	10	,	520	,	880	,	520	,	2.4	},
                    {	11	,	720	,	550	,	820	,	3	},
                    {	12	,	420	,	850	,	410	,	5	},
                    {	13	,	445	,	470	,	860	,	3.8	},
                    {	14	,	550	,	750	,	820	,	1.8	},
                    {	15	,	800	,	480	,	450	,	10	},
                    {	16	,	860	,	550	,	500	,	4	},
                    {	17	,	860	,	450	,	760	,	6	},
                    {	18	,	520	,	480	,	520	,	2.4	},
                    {	19	,	820	,	450	,	410	,	5	},
                    {	20	,	445	,	870	,	460	,	3.8	},
                    {	21	,	500	,	510	,	490	,	8	},
                    {	22	,	720	,	550	,	820	,	3	},
                    {	23	,	720	,	550	,	820	,	3	},
                    {	24	,	420	,	430	,	810	,	5	},
                    {	25	,	845	,	470	,	460	,	3.8	},
                    {	26	,	550	,	750	,	820	,	1.5	},
                    {	27	,	500	,	720	,	490	,	2	},
                    {	28	,	720	,	420	,	720	,	4	},
                    {	29	,	640	,	550	,	820	,	3.5	},
                    {	30	,	820	,	430	,	810	,	6	},
            };

    public static void Zero(){
        First();
    }
    public static void First(){
        /* preparing */
        double local = tab_2_1[num][1];
        double i_4;
        {
            if ( local > tab_2_1[num][2])
            {
                local = tab_2_1[num][2];
            }
            if ( local > tab_2_1[num][3])
            {
                local = tab_2_1[num][3];
            }
            i_4 = (350/((((local*1000) / 3))+1000))*1000;
        }
        double k_b;
        double u_gd;
        {
            if (tab_1_1[num][2] <= 0.01){
                u_gd = 650;
            }
            else if (tab_1_1[num][2] <= 0.1){
                u_gd = 500;
            }
            else if (tab_1_1[num][2] <= 0.5){
                u_gd = 100;
            }
            else if (tab_1_1[num][2] <= 1.0){
                u_gd = 50;
            }
            else {
                u_gd = 36;
            }
            k_b = i_4 / u_gd;
        }
        /* completing */
        String tab_1 = "| %-50s | %-10s |%n";
        String var_tab_1 = "+----------------------------------------------------+------------+";

        System.out.println(var_tab_1);
        System.out.format(tab_1,"Чинники","Варіант");
        System.out.println(var_tab_1);
        System.out.format(tab_1,"1. Напруга в електромережі, U_ф; (В)",tab_1_1[num][1] + " B");
        System.out.println(var_tab_1);
        System.out.format(tab_1,"2. Час аварійного відключення, t_відкл; (секунди)",tab_1_1[num][2] + " сек.");
        System.out.println(var_tab_1);
        System.out.format(tab_1,"3. Коефіцієнт напруги дотику, α",tab_1_1[num][3]);
        System.out.println(var_tab_1);
        System.out.format(tab_1,"4. Відносна вологість повітря, φ (%)",tab_1_1[num][4] + " %");
        System.out.println(var_tab_1);
        System.out.format(tab_1,"5. Температура повітря в приміщенні, t (*С)",tab_1_1[num][5] + " *C");
        System.out.println(var_tab_1);

        /* */
        String tab_2_1_1 = "| %-40s | %-37s |%n";
        String tab_2_2_1 = "| %-40s | %-17s | %-17s |%n";
        String var_tab_2_1 = "+------------------------------------------+---------------------------------------+";
        String var_tab_2_2 = "+------------------------------------------+-------------------+-------------------+";
        String var_tab_2_3 = "|                                          +-------------------+-------------------+";
        String var_tab_2_4 = "|                                          |                   |                   |";
        System.out.println(var_tab_2_1);
        System.out.format(tab_2_1_1, "","Значення");
        System.out.println(var_tab_2_3);
        System.out.format(tab_2_2_1, "Параметри","фактичні","нормативні");
        System.out.println(var_tab_2_2);
        System.out.format(tab_2_2_1, "1. Опір ізоляції фазних дротів:","","");
        System.out.println(var_tab_2_4);
        System.out.format(tab_2_2_1, "    Фаза 1, R_ф1 (кОм)",tab_2_1[num][1]+" кОм","");
        System.out.println(var_tab_2_3);
        System.out.format(tab_2_2_1, "    Фаза 2, R_ф2 (кОм)",tab_1_1[num][2]+" кОм","");
        System.out.println(var_tab_2_3);
        System.out.format(tab_2_2_1, "    Фаза 3, R_ф3 (кОм)",tab_2_1[num][3]+" кОм","");
        System.out.println(var_tab_2_2);
        System.out.format(tab_2_2_1, "2. Опір захисного заземлення, R_х(Ом)",tab_2_1[num][4]+" кОм","Не рахуємо");
        System.out.println(var_tab_2_2);
        System.out.format(tab_2_2_1, "3. Напруга дотику","","");
        System.out.format(tab_2_2_1, "у «нормальному» режимі U_п.ф. (В)", "","");
        System.out.println(var_tab_2_2);
        System.out.format(tab_2_2_1, "4. Коефіцієнт відповідності умов праці,","","");
        System.out.format(tab_2_2_1, "К_в при «нормальному» режимі","","        ≤1");
        System.out.println(var_tab_2_2);
        System.out.format(tab_2_2_1, "5. Напруга дотику","","");
        System.out.format(tab_2_2_1, "у «аварійному» режимі, U_п.ф. (В)","  "+String.format("%.1f",i_4)+" В","");
        System.out.println(var_tab_2_2);
        System.out.format(tab_2_2_1, "6. Коефіцієнт відповідності умов праці,","","");
        System.out.format(tab_2_2_1, "Кв при «аварійному» режимі","  "+String.format("%.3f",k_b),"        ≤1");
        System.out.println(var_tab_2_2);

        /* Напруга дотику(струм, що проходить через тіло людини)*/
        String for_1_1 = "%-7s%-20s";
        String for_1_2 = "%-3s%-33s";
        String for_1_3 = "%-3s%-21s";
        String for_1_4 = "%-3s%-9s";

        /* 18 formula I_che */
        /* upper side */
        System.out.format(for_1_1,""," U_ф");
        System.out.format(for_1_2,""," 380");
        System.out.format(for_1_3,""," 380");
        System.out.format(for_1_4,"","  380");
        System.out.print("\n");
        /* center side */
        System.out.format(for_1_1,"I_ч = ","--------------------");
        System.out.format(for_1_2," = ","---------------------------------");
        System.out.format(for_1_3," = ","----------------------");
        System.out.format(for_1_4," = ","---------");
        System.out.print(" = " + String.format("%.4f", 350/((((local*1000) / 3))+1000)) + " A");
        System.out.print(" = " + String.format("%.1f", (350/((((local*1000) / 3))+1000))*1000) + " мA");
        System.out.print("\n");
        /* lower side */
        System.out.format(for_1_1,""," R_ч + ( R_ф / 3 )");
        System.out.format(for_1_2,""," 1000 + ( ( " + local + " * 1000 ) / 3 )");
        System.out.format(for_1_3,""," 1000 + ( " + String.format("%.2f", ((local*1000) / 3)) + " )");
        System.out.format(for_1_4,"","  "+ String.format("%.2f", (((local*1000) / 3))+1000) + "");
        System.out.print("\n");
        /* formula end */
        System.out.print("Дія струму на людину: ");
        if ( i_4 <= 1.5 ){
            System.out.println("Слабке свербіння, пощипування");
        }
        else if ( i_4 <= 4 ){
            System.out.println("Відчуття розповсюджується на зап'ястку; " +
                    "злегка зводить м'язи");
        }
        else if ( i_4 <= 7 ){
            System.out.println("Больові відчуття посилюються у всій кисті; " +
                    "судоми; слабкі болі у всій руці до передпліччя");
        }
        else if ( i_4 <= 10 ){
            System.out.println("Сильні болі і судоми у всій руці, включаючи передпліччя. " +
                    "Руки важко відірвати від електродів.");
        }
        else if ( i_4 <= 15 ){
            System.out.println("Болі у всій руці, які ледве витримуються. " +
                    "Руки неможливо відірвати від електродів. Із збільшенням тривалості протікання струму болі посилюються.");
        }
        else if ( i_4 <= 25 ){
            System.out.println("Сильні болі. Руки паралізуються миттєво, " +
                    "відірвати їх від електродів неможливо. Дихання ускладнено.");
        }
        else if ( i_4 <= 50 ){
            System.out.println("Дуже сильний біль в руках і грудях. Дихання дуже " +
                    "ускладнено. При тривалій дії може наступити параліч " +
                    "дихання або ослаблення серцевої діяльності з втратою " +
                    "свідомості.");
        }
        else if ( i_4 <= 80 ){
            System.out.println("Дихання паралізується, через декілька секунд " +
                    "порушується робота серця. При тривалій дії може наступити " +
                    "фібриляція серця.");
        }
        else if ( i_4 <= 100 ){
            System.out.println("Фібриляція серця через 2-3 с, ще через декілька секунд – параліч дихання");
        }
        else {
            System.out.println("Фібриляція серця менше за 2 с, ще через секунди – параліч дихання");
        }
        System.out.println("U_п.ф. = I_ч * R_ч" + " = 1000 * " + String.format("%.3f",(i_4/1000)) + " = " + String.format("%.1f",i_4) + " В");

        /* formula K_B start */
        String for_2_1= "%-7s%-9s";
        String for_2_2= "%-3s%-9s";

        System.out.format(for_2_1, ""," U_п.ф.");
        System.out.format(for_2_2, ""," "+String.format("%.1f",i_4));
        System.out.print("\n");
        System.out.format(for_2_1, "К_в = ","---------");
        System.out.format(for_2_2, " = ","---------");
        System.out.print(" = " + String.format("%.3f",k_b) + " рази");
        System.out.print("\n");
        System.out.format(for_2_1, ""," U_г.д.");
        System.out.format(for_2_2, ""," "+u_gd);
        System.out.print("\n");
        if ( k_b <= 1){
            System.out.print("Коефіцієнт відповідності умов праці Кв при «аварійному» режимі в норми; ");
            System.out.println(String.format("%.3f",k_b) + " ≤ 1;");
        }
        else {
            System.out.print("Коефіцієнт відповідності умов праці Кв при «аварійному» режимі вище норми!; ");
            System.out.println(String.format("%.3f",k_b) + " > 1;");
        }
        Final();
    }
    public static void Final(){
        System.out.print("\n==");
        System.out.print("\nВисновки:");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці як оцінити стан електробезпеки на робочих місцях.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    Работа делалась по указанием препадователя!;
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе
                    """);
        System.out.print("\n");
    }
    public static void main()
    {
        System.out.print("""
                Практичне Заняття № 15\040
                « Дослідження та оцінка стану електробезпеки на робочих місцях »""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        Zero();
    }
}
