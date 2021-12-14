package labs;

import java.util.Scanner;

public class Lab_09_nine {

    /* Сохраняем переменную варианта */
    private static int num;

    /* Коефіцієнт світлового клімату, m */
    private static double koef_m_int;
    private static String koef_m_str;

    /* Світловий потік ламп розжарювання, Fл. станд. (лм) */
    private static int F_l_def_int;
    private static String F_l_def_str;

    /* Розряд і підрозряд зорової роботи */
    private static String index = "";
    private static double KPO_Norm;
    private static double KPO_Norm_from_tab;

    /* Тип світильників */
    private static String lamp_type = "";


    static final double[][] tab_1_values = new double[][]
            {
                    {	0	,	1	    ,	2	,	3	,	4	,	5	,	5	,	6	,	7	,	8	,	9	,	10	,	11	,	12	,	13	},
                    {	1	,	0.45	,	1	,	0	,	1	,	3	,	1	,	1	,	1	,	3	,	2	,	1.5	,	12	,	6	,	4	},
                    {	2	,	0.10	,	2	,	0	,	2 	,	1	,	2	,	2	,	2	,	2.7	,	3	,	1.3	,	90	,	12	,	6	},
                    {	3	,	0.27	,	3	,	0	,	4 	,	2	,	3	,	3	,	3	,	2.2	,	1.8	,	1.3	,	8	,	15	,	8	},
                    {	4	,	0.65	,	4	,	0	,	3 	,	4	,	4	,	4	,	4	,	2.4	,	2.4	,	1.7	,	14	,	20	,	10	},
                    {	5	,	0.80	,	5	,	0	,	7 	,	5	,	1	,	5	,	5	,	2.6	,	3	,	1.7	,	20	,	14	,	12	},
                    {	6	,	0.12	,	6	,	0	,	6 	,	1	,	1	,	6	,	6	,	1.8	,	3.4	,	1.3	,	80	,	8	,	4	},
                    {	7	,	0.32	,	7	,	0	,	5 	,	3	,	2	,	7	,	7	,	2	,	2.8	,	1.5	,	8	,	6	,	6	},
                    {	8	,	0.16	,	8	,	0	,	1 	,	2	,	4	,	8	,	8	,	3	,	2.4	,	1.3	,	100	,	10	,	8	},
                    {	9	,	0.52	,	9	,	0	,	2 	,	4	,	3	,	9	,	9	,	2	,	4	,	1.7	,	44	,	12	,	10	},
                    {	10	,	1.10	,	10	,	0	,	4 	,	5	,	2	,	1	,	10	,	2.2	,	3.8	,	1.7	,	52	,	16	,	12	},
                    {	11	,	5.40	,	11	,	0	,	3 	,	6	,	0	,	9	,	11	,	2.4	,	3.6	,	1.3	,	6	,	8	,	4	},
                    {	12	,	0.13	,	12	,	0	,	7 	,	1	,	3	,	7	,	12	,	2.6	,	2.4	,	1.3	,	22	,	15	,	6	},
                    {	13	,	0.28	,	13	,	0	,	6 	,	2	,	1	,	10	,	13	,	3	,	2.8	,	1.3	,	40	,	10	,	8	},
                    {	14	,	0.41	,	14	,	0	,	5 	,	3	,	3	,	11	,	14	,	3.2	,	2.2	,	1.5	,	20	,	12	,	10	},
                    {	15	,	0.62	,	15	,	0	,	1 	,	4	,	2	,	4	,	15	,	3.5	,	2.8	,	1.5	,	90	,	20	,	12	},
                    {	16	,	0.74	,	16	,	0	,	2 	,	4	,	1	,	5	,	16	,	1.8	,	3.4	,	1.5	,	36	,	4	,	4	},
                    {	17	,	0.11	,	17	,	0	,	4 	,	1	,	4	,	2	,	17	,	2	,	3	,	1.3	,	6	,	14	,	6	},
                    {	18	,	0.20	,	18	,	0	,	3 	,	2	,	2	,	7	,	18	,	2.2	,	3	,	1.3	,	22	,	12	,	8	},
                    {	19	,	0.48	,	19	,	0	,	7 	,	3	,	4	,	8	,	19	,	2.4	,	2.4	,	1.5	,	10	,	18	,	10	},
                    {	20	,	0.67	,	20	,	0	,	6 	,	4	,	1	,	11	,	20	,	2.6	,	2.6	,	1.7	,	12	,	16	,	12	},
                    {	21	,	2.40	,	21	,	0	,	5 	,	5	,	3	,	4	,	21	,	2.8	,	4	,	1.7	,	14	,	10	,	4	},
                    {	22	,	0.23	,	22	,	0	,	1 	,	2	,	2	,	6	,	22	,	3	,	2.6	,	1.3	,	24	,	6	,	6	},
                    {	23	,	0.14	,	23	,	0	,	2 	,	1	,	1	,	7	,	23	,	3.2	,	2.8	,	1.3	,	96	,	10	,	8	},
                    {	24	,	0.34	,	24	,	0	,	4 	,	3	,	4	,	12	,	24	,	3.5	,	3.2	,	1.5	,	5	,	10	,	10	},
                    {	25	,	0.29	,	25	,	0	,	3 	,	2	,	3	,	13	,	25	,	1.8	,	3.4	,	1.3	,	21	,	15	,	12	},
                    {	26	,	3.60	,	1	,	0	,	7 	,	5	,	1	,	8	,	26	,	2	,	4	,	1.7	,	8	,	8	,	4	},
                    {	27	,	0.80	,	2	,	0	,	6 	,	4	,	1	,	11	,	27	,	2.2	,	2.2	,	1.7	,	2	,	6	,	6	},
                    {	28	,	0.17	,	3	,	0	,	5 	,	2	,	4	,	8	,	28	,	2.4	,	2	,	1.5	,	12	,	14	,	8	},
                    {	29	,	0.09	,	4	,	0	,	1 	,	1	,	3	,	7	,	29	,	2.6	,	2.6	,	1.3	,	46	,	12	,	10	},
                    {	30	,	0.47	,	5	,	0	,	2 	,	3	,	1	,	14	,	30	,	2.8	,	3	,	1.5	,	8	,	20	,	12	}
            };

    static final String[] city_names =
            {
                    "Населений пункт",
                    "Тернопільська",
                    "Миколаївська",
                    "Івано-Франківська",
                    "Дніпропетровська",
                    "Донецька",
                    "Житомирська",
                    "Закарпатська",
                    "Запорізька",
                    "Вінницька",
                    "Київська",
                    "Кіровоградська",
                    "Луганська",
                    "Львівська",
                    "Волинська",
                    "Одеська",
                    "Полтавська",
                    "Рівненська",
                    "Сумська",
                    "АР Крим",
                    "Харківська",
                    "Херсонська",
                    "Хмельницька",
                    "Черкаська",
                    "Чернівецька",
                    "Чернігівська",
            };
    static public void Zero(){
        /* Коефіцієнт світлового клімату, m */
        {
            if (tab_1_values[num][2] == 15 || tab_1_values[num][2] == 19) {
                if (tab_1_values[num][4] == 1) {
                    koef_m_int = 0.85;
                    koef_m_str = "ПН";
                } else if (tab_1_values[num][4] == 2) {
                    koef_m_int = 0.85;
                    koef_m_str = "ПНС";
                } else if (tab_1_values[num][4] == 3) {
                    koef_m_int = 0.85;
                    koef_m_str = "ПНЗ";
                } else if (tab_1_values[num][4] == 4) {
                    koef_m_int = 0.80;
                    koef_m_str = "C";
                } else if (tab_1_values[num][4] == 5) {
                    koef_m_int = 0.80;
                    koef_m_str = "ПДС";
                } else if (tab_1_values[num][4] == 6) {
                    koef_m_int = 0.80;
                    koef_m_str = "ПДЗ";
                } else if (tab_1_values[num][4] == 7) {
                    koef_m_int = 0.75;
                    koef_m_str = "ПД";
                }
            } else {
                if (tab_1_values[num][4] == 1) {
                    koef_m_int = 0.90;
                    koef_m_str = "ПН";
                } else if (tab_1_values[num][4] == 2) {
                    koef_m_int = 0.90;
                    koef_m_str = "ПНС";
                } else if (tab_1_values[num][4] == 3) {
                    koef_m_int = 0.90;
                    koef_m_str = "ПНЗ";
                } else if (tab_1_values[num][4] == 4) {
                    koef_m_int = 0.85;
                    koef_m_str = "C";
                } else if (tab_1_values[num][4] == 5) {
                    koef_m_int = 0.85;
                    koef_m_str = "ПДС";
                } else if (tab_1_values[num][4] == 6) {
                    koef_m_int = 0.85;
                    koef_m_str = "ПДЗ";
                } else if (tab_1_values[num][4] == 7) {
                    koef_m_int = 0.85;
                    koef_m_str = "ПД";
                }
            }
        }

        /* Світловий потік ламп розжарювання, Fл. станд. (лм) */
        {
            switch ((int) tab_1_values[num][7]) {
                case (1) -> {
                    F_l_def_int = 2700;
                    F_l_def_str = "НГ-200";
                }
                case (2) -> {
                    F_l_def_int = 1110;
                    F_l_def_str = "ЛДЦ-30";
                }
                case (3) -> {
                    F_l_def_int = 2200;
                    F_l_def_str = "ЛТБ-40";
                }
                case (4) -> {
                    F_l_def_int = 715;
                    F_l_def_str = "ЛН-60";
                }
                case (5) -> {
                    F_l_def_int = 1240;
                    F_l_def_str = "НБ-100";
                }
                case (6) -> {
                    F_l_def_int = 1500;
                    F_l_def_str = "ЛТБ-30";
                }
                case (7) -> {
                    F_l_def_int = 3840;
                    F_l_def_str = "ЛХБ-80";
                }
                case (8) -> {
                    F_l_def_int = 980;
                    F_l_def_str = "ЛБ-20";
                }
                case (9) -> {
                    F_l_def_int = 620;
                    F_l_def_str = "НБ-60";
                }
                case (10) -> {
                    F_l_def_int = 370;
                    F_l_def_str = "НБ-40";
                }
                case (11) -> {
                    F_l_def_int = 2100;
                    F_l_def_str = "ЛН-150";
                }
                case (12) -> {
                    F_l_def_int = 2720;
                    F_l_def_str = "ЛДЦ-80";
                }
                case (13) -> {
                    F_l_def_int = 3440;
                    F_l_def_str = "ЛД-80";
                }
                case (14) -> {
                    F_l_def_int = 840;
                    F_l_def_str = "НБ-75";
                }
                case (15) -> {
                    F_l_def_int = 430;
                    F_l_def_str = "НБК-40";
                }
                case (16) -> {
                    F_l_def_int = 1080;
                    F_l_def_str = "НБК-75";
                }
                case (17) -> {
                    F_l_def_int = 4320;
                    F_l_def_str = "ЛБ-80";
                }
                case (18) -> {
                    F_l_def_int = 2480;
                    F_l_def_str = "ЛБ-40";
                }
                case (19) -> {
                    F_l_def_int = 1350;
                    F_l_def_str = "ЛН-100";
                }
                case (20) -> {
                    F_l_def_int = 1900;
                    F_l_def_str = "НГ-150";
                }
                case (21) -> {
                    F_l_def_int = 2920;
                    F_l_def_str = "ЛН-200";
                }
                case (22) -> {
                    F_l_def_int = 2200;
                    F_l_def_str = "ЛХБ-40";
                }
                case (23) -> {
                    F_l_def_int = 1740;
                    F_l_def_str = "ЛБ-30";
                }
                case (24) -> {
                    F_l_def_int = 4600;
                    F_l_def_str = "ЛН-300";
                }
                case (25) -> {
                    F_l_def_int = 1960;
                    F_l_def_str = "ЛД-40";
                }
                case (26) -> {
                    F_l_def_int = 4350;
                    F_l_def_str = "НГ-300";
                }
                case (27) -> {
                    F_l_def_int = 8300;
                    F_l_def_str = "ЛН-500";
                }
                case (28) -> {
                    F_l_def_int = 1520;
                    F_l_def_str = "ЛДЦ-40";
                }
                case (29) -> {
                    F_l_def_int = 1500;
                    F_l_def_str = "ЛХБ-30";
                }
                case (30) -> {
                    F_l_def_int = 8100;
                    F_l_def_str = "НГ-500";
                }
            }
        }

        /* Розряд і підрозряд зорової роботи */
        {
            switch ((int) tab_1_values[num][5]) {
                default -> index = "I";
                case (2) -> index = "II";
                case (3) -> index = "III";
                case (4) -> index = "IV";
                case (5) -> index = "V";
                case (6) -> index = "VI";
            }
            switch ((int) tab_1_values[num][6]) {
                default -> index = index + "";
                case (1) -> index = index + " а";
                case (2) -> index = index + " б";
                case (3) -> index = index + " в";
                case (4) -> index = index + " г";
            }
        }

        /* Тип світильників */
        {
            switch ( (int) tab_1_values[num][7] ){
                case (1) -> lamp_type = "У";
                case (2) -> lamp_type = "ОД";
                case (3) -> lamp_type = "ОДР";
                case (4) -> lamp_type = "ПГТ";
                case (5) -> lamp_type = "Пц";
                case (6) -> lamp_type = "ОДОР";
                case (7) -> lamp_type = "ШОД";
                case (8) -> lamp_type = "УЗ";
                case (9) -> lamp_type = "УМП";
                case (10) -> lamp_type = "ПВЛ-1";
                case (11) -> lamp_type = "УСХМ";
                case (12) -> lamp_type = "ГПМ";
                case (13) -> lamp_type = "ШЛП";
                case (14) -> lamp_type = "Г";
            }
        }
        if ( tab_1_values[num][2] > 0.15 ){
            KPO_Norm_from_tab = 2.0;
        }
        else if ( tab_1_values[num][2] > 0.3 ){
            KPO_Norm_from_tab = 1.5;
        }
        else if ( tab_1_values[num][2] > 0.5 ){
            KPO_Norm_from_tab = 1.2;
        }
        else if ( tab_1_values[num][2] > 1.0 ){
            KPO_Norm_from_tab = 0.9;
        }
        else if ( tab_1_values[num][2] > 5.0 ){
            KPO_Norm_from_tab = 0.6;
        }
        else if ( tab_1_values[num][2] <= 5.0 ){
            KPO_Norm_from_tab = 0.6;
        }
        KPO_Norm=koef_m_int*KPO_Norm_from_tab;
        First();
    }

    static public void First(){
        System.out.println("Початкові дані для оцінки природного освітлення");
        String tab_1 = "| %-30s | %-18s |%n";
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Чинник", "Значення");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Найменший розмір", tab_1_values[num][1] + " мм.");
        System.out.format(tab_1, "oб’єкту розрізнення (мм)", "");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Населений пункт", city_names[(int)tab_1_values[num][2]]);
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Розташування", "В зовнішніх");
        System.out.format(tab_1, "світлового отвору", "стінах будинків");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Орієнтація світлових пройомів", koef_m_str);
        System.out.format(tab_1, "за сторонами горизонту", koef_m_int);
        System.out.println("+--------------------------------+--------------------+\n");

        System.out.println("Початкові дані для оцінки штучного освітлення");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Чинник", "Значення");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Розряд і під розряд", index);
        System.out.format(tab_1, "зорової роботи", "");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Тип світильників", lamp_type);
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Тип ламп", F_l_def_str);
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Кількість ламп", (int)tab_1_values[num][12] + " штук");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Розмір приміщення А (м)", (int)tab_1_values[num][13] + " м.");
        System.out.format(tab_1, "Розмір приміщення В (м)", (int)tab_1_values[num][14] + " м.");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Відстань між лампами (м)", tab_1_values[num][9] + " м.");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Висота підвісу ламп над", (int)tab_1_values[num][10] + " м.");
        System.out.format(tab_1, "робочою поверхнею (м)", "");
        System.out.println("+--------------------------------+--------------------+");
        System.out.format(tab_1, "Коефіцієнт запасу К_З", tab_1_values[num][11]);
        System.out.println("+--------------------------------+--------------------+");
        Second();
    }

    static public void Second()
    {
        System.out.println("=======================================================");
        System.out.println("Таблиця для розрахунку природного освітлення:");
        System.out.println("=======================================================");
        String tab_3_1 = "| %-30s | %-12s | %-12s | %-12s | %-12s | %-12s |%n";
        String tab_3_2 = "| %-30s | %-12s | %-12s | %-12s | %-27s |%n";
        System.out.println("+--------------------------------+--------------+--------------+--------------+--------------+--------------+");
        System.out.format(tab_3_1, "Точка вимірювання", "Поглинач", "Показник", "Е, лк", "КПО, %", "КПО");
        System.out.format(tab_3_1, "", "", "індикатору", "", "", "нормативне,%");
        System.out.println("+--------------------------------+--------------+--------------+--------------+--------------+--------------+");
        System.out.format(tab_3_1, "1 робоче місце (р.м.)", "100", "8.5 лк", "850"+" лк", "1.7%", "");
        System.out.println("+--------------------------------+--------------+--------------+--------------+--------------+              |");
        System.out.format(tab_3_1, "2 р.м", "100", "7.5 лк", "750"+" лк", "1.5%", "");
        System.out.println("+--------------------------------+--------------+--------------+--------------+--------------+              |");
        System.out.format(tab_3_1, "3 р.м", "10", "60 лк", "600"+" лк", "1.2%", KPO_Norm+"%");
        System.out.println("+--------------------------------+--------------+--------------+--------------+--------------+              |");
        System.out.format(tab_3_1, "4 р.м", "10", "40 лк", "400"+" лк", "0.8%", "");
        System.out.println("+--------------------------------+--------------+--------------+--------------+--------------+              |");
        System.out.format(tab_3_1, "5 р.м", "10", "20 лк", "200"+" лк", "0.4%", "");
        System.out.println("+--------------------------------+--------------+--------------+--------------+--------------+--------------+");
        System.out.format(tab_3_2, "На вулиці", "1000", "50 лк", "50 000"+" лк","Не розраховують");
        System.out.format(tab_3_2, "(під відкритим небом)", "", "", "","");
        System.out.println("+--------------------------------+--------------+--------------+--------------+-----------------------------+");
        System.out.println("=============================================================================================================");
        System.out.println("E_вн_1 = 8.5 * 100 = 850 (лк.)");
        System.out.println("E_вн_2 = 7,5 * 100 = 750 (лк.)");
        System.out.println("E_вн_3 = 60 * 10 = 600 (лк.)");
        System.out.println("E_вн_4 = 40 * 10 = 400 (лк.)");
        System.out.println("E_вн_5 = 20 * 10 = 200 (лк.)");
        System.out.println("E_зовн_вул = 50 * 1000 = 50 000 (лк.)");
        System.out.println("================================");
        {
            System.out.print("\n");
            String for_1_1 = "%-9s%-8s%-7s";
            System.out.format(for_1_1, "", "   850", "");
            System.out.print("\n");
            System.out.format(for_1_1, "КПО_1 = ", "--------", " * 100%");
            System.out.print(" = 1.7%");
            System.out.print("\n");
            System.out.format(for_1_1, "", " 50 000", "");
            System.out.print("\n");
            System.out.print("\n");
            System.out.format(for_1_1, "", "   750","");
            System.out.print("\n");
            System.out.format(for_1_1, "КПО_2 = ", "--------"," * 100%");
            System.out.print(" = 1.5%");
            System.out.print("\n");
            System.out.format(for_1_1, "", " 50 000","");
            System.out.print("\n");
            System.out.print("\n");
            System.out.format(for_1_1, "", "   600","");
            System.out.print("\n");
            System.out.format(for_1_1, "КПО_3 = ", "--------"," * 100%");
            System.out.print(" = 1.2%");
            System.out.print("\n");
            System.out.format(for_1_1, "", " 50 000","");
            System.out.print("\n");
            System.out.print("\n");
            System.out.format(for_1_1, "", "   400","");
            System.out.print("\n");
            System.out.format(for_1_1, "КПО_4 = ", "--------"," * 100%");
            System.out.print(" = 0.8%");
            System.out.print("\n");
            System.out.format(for_1_1, "", " 50 000","");
            System.out.print("\n");
            System.out.print("\n");
            System.out.format(for_1_1, "", "   200","");
            System.out.print("\n");
            System.out.format(for_1_1, "КПО_5 = ", "--------"," * 100%");
            System.out.print(" = 0.4%");
            System.out.print("\n");
            System.out.format(for_1_1, "", " 50 000","");
            System.out.print("\n");
            System.out.print("\n");
            System.out.println("КПО_нормативне = " + KPO_Norm_from_tab + " * " + koef_m_int + " = " + KPO_Norm + "%");

        }
        Third();
    }
    static public void Third(){
        /* Висновки зробіть щодо достатності природного освітлення на робочих місцях в порівнянні з нормою. Штучне освітлення розраховувати не треба. */
        System.out.println("=======================================================");
        System.out.println("Результати дослідження:");
        System.out.println("=======================================================");
        System.out.println("+------------------------------------------+-------------------------------------------------+------------+");
        String tab_4_1 = "| %-40s | %-47s | %-10s |%n";
        String tab_4_2 = "| %-40s | %-7s | %-7s | %-7s | %-7s | %-7s | %-10s |%n";
        String tab_4_3 = "| %-40s | %-7s   %-7s   %-7s   %-7s   %-7s | %-10s |%n";
        System.out.format(tab_4_1, "Параметр", "Номер умовного робочого місця", "Нормоване");
        System.out.println("+                                          +---------+---------+---------+---------+---------+            +");
        System.out.format(tab_4_2, "", "   1", "   2", "   3", "   4", "   5", " значення");
        System.out.println("+------------------------------------------+---------+---------+---------+---------+---------+------------+");
        System.out.format(tab_4_2, "Освітленість приміщення при", "  850", "  750", "  600", "  400", "  200", "    --");
        System.out.format(tab_4_2, "природному освітленні Е_вн., (лк)", "", "", "", "", "", "    --");
        System.out.println("+------------------------------------------+---------+---------+---------+---------+---------+------------+");
        System.out.format(tab_4_3, "Зовнішня освітленість Е_зовн., (лк)", "", ""," 50 000","", "", "    --");
        System.out.println("+------------------------------------------+---------+---------+---------+---------+---------+------------+");
        System.out.format(tab_4_2, "Коефіцієнт природного", " 1.7%", " 1.5%", " 1.2%", " 0.8%", " 0.4%", " "+KPO_Norm+"%");
        System.out.format(tab_4_2, "освітлення КПО_еф, е_норм., %", "", "", "", "", "", "");
        System.out.println("+------------------------------------------+---------+---------+---------+---------+---------+------------+");
        System.out.format(tab_4_3, "Освітленість при штучному", "", "","  ---","", "", "    --");
        System.out.format(tab_4_3, "освітленні Е_розр., Е_н., (лк)", "", "","  ---","", "", "    --");
        System.out.println("+------------------------------------------+-------------------------------------------------+------------+");
        Four();
    }

    static final double[] local ={
            1.7,
            1.5,
            1.2,
            0.8,
            0.4
    };

    static public void Four(){
        System.out.println("Зробити висновок про достатність природнього освітлення:");
        for (int i = 0; i < 5;i++) {
            if (local[i] / KPO_Norm >= 1) System.out.println("На робочому місці " + String.format("%s",i+1) + " освітлення в нормі;");

            else System.out.println("На робочому місці " + String.format("%s",i+1) + " освітлення не достатньо;");
        }
        Final();
    }
    static public void Final(){
        System.out.print("\n");
        System.out.println("Висновки: В ході виконання практичної роботи, я дізнався як потрібно розраховувати достатність природнього освітлення на робочому місці;");
        System.out.println("Роботу виконав: ___________;");
    }
    static public void main()
    {
        System.out.print("""
                Практичне Заняття № 9\040
                «Дослідження та оцінка виробничого освітлення»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        Zero();
    }
}
