package com.hecate.labs;

import java.util.Scanner;

public class Lab_14_ {

    private static int num;

    final static int[][] tab_1_1 = new int[][]
    {
        {	0	,	1	,	2	,	3	,	4	,	5	,	6	},
        {	1	,	80	,	5	,	94	,	174	,	21	,	614	},
        {	2	,	120	,	8	,	56	,	352	,	34	,	205	},
        {	3	,	365	,	13	,	118	,	576	,	14	,	185	},
        {	4	,	427	,	14	,	219	,	418	,	19	,	458	},
        {	5	,	520	,	28	,	410	,	592	,	9	,	124	},
        {	6	,	98	,	6	,	82	,	453	,	2	,	83	},
        {	7	,	115	,	1	,	15	,	217	,	1	,	41	},
        {	8	,	214	,	22	,	312	,	185	,	3	,	12	},
        {	9	,	718	,	40	,	618	,	142	,	6	,	45	},
        {	10	,	59	,	4	,	51	,	257	,	22	,	18	},
        {	11	,	74	,	6	,	74	,	783	,	36	,	57	},
        {	12	,	88	,	2	,	35	,	954	,	4	,	196	},
        {	13	,	95	,	8	,	38	,	84	,	4	,	228	},
        {	14	,	125	,	5	,	48	,	67	,	1	,	28	},
        {	15	,	230	,	28	,	614	,	80	,	5	,	23	},
        {	16	,	174	,	17	,	205	,	120	,	8	,	14	},
        {	17	,	352	,	21	,	185	,	365	,	13	,	94	},
        {	18	,	576	,	34	,	458	,	427	,	14	,	56	},
        {	19	,	418	,	14	,	124	,	520	,	28	,	118	},
        {	20	,	592	,	19	,	228	,	98	,	6	,	92	},
        {	21	,	453	,	9	,	63	,	115	,	1	,	10	},
        {	22	,	217	,	2	,	12	,	214	,	22	,	82	},
        {	23	,	185	,	1	,	45	,	718	,	40	,	15	},
        {	24	,	142	,	3	,	18	,	59	,	4	,	312	},
        {	25	,	257	,	6	,	57	,	74	,	6	,	618	},
        {	26	,	783	,	22	,	196	,	88	,	2	,	51	},
        {	27	,	954	,	36	,	428	,	95	,	8	,	74	},
        {	28	,	84	,	4	,	56	,	125	,	5	,	35	},
        {	29	,	67	,	4	,	23	,	230	,	28	,	38	},
        {	30	,	53	,	1	,	14	,	174	,	17	,	48	},
    };

    public static void Zero(){
        First();
    }
    public static void First(){
        System.out.println("1. Аналіз основних причин виробничого травматизму та появи виробничих факторів, що викликають професійні захворювання:");
        System.out.println("    Причини НЕЩАСНИХ ВИПАДКІВ на виробництві:");
        System.out.println("        1. ОРГАНІЗАЦІЙНІ");
        System.out.println("        2. ТЕХНІЧНІ");
        System.out.println("        3. САНІТАРНО-ГІГІЄНІЧНІ");
        System.out.println("        4. ПСИХОФІЗІОЛОГІЧНІ");
        System.out.println("    Фактори, які формують професійні захворювання:");
        System.out.println("        1. ХІМІЧНІ");
        System.out.println("        2. ФІЗИЧНІ");
        System.out.println("        3. БІОЛОГІЧНІ");
        System.out.println("        4. ПСИХОФІЗІОЛОГІЧНІ");
        System.out.println("    Етіологічні ознаки:");
        System.out.println("        1. механічні (забиття, переломи, порізи тощо);");
        System.out.println("        2. термічні (опіки, обмороження, сонячні удари);");
        System.out.println("        3. хімічні (гострі отруєння, опіки кислотами, лугами);");
        System.out.println("        4. електричні (електричні удари, електричні травми);");
        System.out.println("        5. променеві (опіки, ушкодження тканин, кровотворних органів);");
        System.out.println("        6. нервово-психічні (переляк, шок);");
        System.out.println("        7. комбіновані");
        System.out.println("2. Основні заходи щодо профілактики професійних захворювань:");
        System.out.println("    Колективні заходи:");
        System.out.println("        - ЗАКОНОДАВЧЕ-ОРГАНІЗАЦІЙНІ;");
        System.out.println("        - АРХІТЕКТУРНО-ПЛАНУВАЛЬНІ;");
        System.out.println("        - ТЕХНОЛОГІЧНІ;");
        System.out.println("        - САНІТАРНО-ТЕХНІЧНІ;");
        System.out.println("        - ГІГІЄНІЧНЕ НОРМУВАННЯ;");
        System.out.println("    Індивідуальні заходи:");
        System.out.println("        - ЗАХОДИ ІНДИВІДУАЛЬНОГО ЗАХИСТУ;");
        System.out.println("        - ЛІКУВАЛЬНО-ПРОФІЛАКТИЧНІ;");
        System.out.println("        - ВИКОНАННЯ Техніки Безпеки");
        System.out.print("\n");
        Second();
    }
    public static void Second(){
        System.out.println("Статистичні методи оцінки травматизму (за варіантом) " + num + ":\n");
        System.out.println("Т – кількість нещасних випадків та професійних захворювань, " +
                "що сталися на підприємстві за звітний період (наприклад, квартал, півріччя, рік) " +
                "і призвели до втрати працездатності на 1 добу і більше;");
        System.out.println("Р – середньосписочна чисельність працюючих на підприємстві за той самий звітний період.");
        System.out.print("\n");
        System.out.println("    Розрахунок частоти травматизму для виробництва А:");
        double k_4_1 = ( ( (double)tab_1_1[num][2] * 1000 ) / (double)tab_1_1[num][1] );
        String for_1_1 = "%-7s%-2s%-3s%-5s";
        String for_1_2 = "%-3s%-4s%-3s%-5s";
        System.out.format(for_1_1, "", " T", " * ", "1000");
        System.out.format(for_1_2, "", " "+tab_1_1[num][2], " * ", "1000" );
        System.out.print("\n");
        System.out.format(for_1_1, "К_ч = ", "--","---","-----");
        System.out.format(for_1_2, " = ", "----","---","-----");
        System.out.print(" = " + String.format("%.2f",k_4_1));
        System.out.print("\n");
        System.out.format(for_1_1, "", ""," P","");
        System.out.format(for_1_2, "", ""," "+tab_1_1[num][1],"");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("    Розрахунок частоти травматизму для виробництва B:");
        double k_4_2 = ( ( (double)tab_1_1[num][5] * 1000 ) / (double)tab_1_1[num][4] );
        System.out.format(for_1_1, "", " T", " * ", "1000");
        System.out.format(for_1_2, "", " "+tab_1_1[num][5], " * ", "1000" );
        System.out.print("\n");
        System.out.format(for_1_1, "К_ч = ", "--","---","-----");
        System.out.format(for_1_2, " = ", "----","---","-----");
        System.out.print(" = " + String.format("%.2f",k_4_2));
        System.out.print("\n");
        System.out.format(for_1_1, "", ""," P","");
        System.out.format(for_1_2, "", ""," "+tab_1_1[num][4],"");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("    Розрахунок тяжкості травматизму для виробництва А:");
        double k_m_1 = (double)tab_1_1[num][3] / (double)tab_1_1[num][2];
        String for_2_1 = "%-7s%-3s";
        String for_2_2 = "%-3s%-5s";
        System.out.format(for_2_1, ""," Д");
        System.out.format(for_2_2, ""," "+tab_1_1[num][3]);
        System.out.print("\n");
        System.out.format(for_2_1, "К_м = ","---");
        System.out.format(for_2_2, " = ","-----");
        System.out.print(" = " + String.format("%.2f",k_m_1));
        System.out.print("\n");
        System.out.format(for_2_1, ""," Т");
        System.out.format(for_2_2, ""," "+tab_1_1[num][2]);
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("    Розрахунок тяжкості травматизму для виробництва А:");
        double k_m_2 = (double)tab_1_1[num][6] / (double)tab_1_1[num][5];
        System.out.format(for_2_1, ""," Д");
        System.out.format(for_2_2, ""," "+tab_1_1[num][6]);
        System.out.print("\n");
        System.out.format(for_2_1, "К_м = ","---");
        System.out.format(for_2_2, " = ","-----");
        System.out.print(" = " + String.format("%.2f",k_m_2));
        System.out.print("\n");
        System.out.format(for_2_1, ""," Т");
        System.out.format(for_2_2, ""," "+tab_1_1[num][5]);
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("  Визначення коефіцієнту втрат на виробництві A:");
        System.out.println("К_в_1 = К_ч_1 * К_м_1 = " + String.format("%.2f",k_4_1) + " * " + String.format("%.2f",k_m_1) + " = " + String.format("%.2f",(k_4_1/k_m_1)));
        System.out.println("  Визначення коефіцієнту втрат на виробництві В:");
        System.out.println("К_в_2 = К_ч_2 * К_м_2 = " + String.format("%.2f",k_4_2) + " * " + String.format("%.2f",k_m_2) + " = " + String.format("%.2f",(k_4_2/k_m_2)));
        System.out.print("\n");
        System.out.println("Порівняння стану охорони праці в колективах:");
        if (k_4_1/k_m_1 < k_4_2/k_m_2){
            System.out.println("    Умови праці в коллективі В більш безпечні, ніж в коллективі А, тому-що коефіцієнт втрат там більший, ніж в коллективі В;");
        }
        else {
            System.out.println("    Умови праці в коллективі A більш безпечні, ніж в коллективі B, тому-що коефіцієнт втрат там більший, ніж в коллективі A;");
        }

        Final();
    }
    public static void Final(){
        System.out.println("=====");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці оцінку коефіціентів частоти травматизму, коефіціентів тяжкості травматизму та як розрахувати коефіцієнт виробничих втрат.
                Також, під час виконання роботи я дізнався про класифікацію професійних захворючань та чинників, які їх викликають;
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе;""");
        System.out.print("\n");
    }
    public static void main()
    {
        System.out.print("""
                Практичне Заняття № 14\040
                « Аналіз виробничого травматизму та профілактика професійних захворювань »""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Вариант: ");
        num = in.nextInt();
        Zero();
    }
}
