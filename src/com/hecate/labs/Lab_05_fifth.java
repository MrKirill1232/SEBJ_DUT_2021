package com.hecate.labs;

import java.util.Scanner;

public class Lab_05_fifth {

    static int num;

    static int NAME;

    static final double[][] tab_1 = new double[][]
            {
                    {	0	,	1	,	2	,	3	,	4	,	4	},
                    {	1	,	1	,	2.0 ,	4	,	2	,	0	},
                    {	2	,	2	,	6.0 ,	4	,	2	,	0	},
                    {	3	,	3	,	8.0 ,	4	,	2	,	0	},
                    {	4	,	4.1	,	1.0	,	3	,	2	,	0	},
                    {	5	,	4.2	,	2.0	,	4	,	2	,	0	},
                    {	6	,	4.3	,	4.0	,	4	,	2	,	0	},
                    {	7	,	5	,	1.0 ,	3	,	2	,	0	},
                    {	8	,	6.1	,	6.0	,	4	,	2	,	0	},
                    {	9	,	6.2	,	10.0,	3	,	2	,	0	},
                    {	10	,	6.3	,	4.0	,	3	,	2	,	0	},
                    {	11	,	7	,	6.0 ,	4	,	2	,	0	},
                    {	12	,	8.1	,	2	,	4	,	2	,	0	},
                    {	13	,	8.2	,	4	,	4	,	1	,	2	},
                    {	14	,	8.3	,	4	,	3	,	1	,	2	},
                    {	15	,	9.1	,	2	,	4	,	3	,	2	},
                    {	16	,	9.2	,	6	,	4	,	2	,	0	},
                    {	17	,	9.3	,	2	,	3	,	2	,	0	},
                    {	18	,	9.4	,	4	,	4	,	2	,	0	},
                    {	19	,	10	,	4.0 ,	3	,	3	,	2	},
                    {	20	,	11	,	6.0 ,	4	,	2	,	0	},
                    {	21	,	12	,	6.0 ,	4	,	1	,	2	},
                    {	22	,	13	,	10.0 ,	4	,	2	,	0	},
                    {	23	,	14	,	2.0 ,	4	,	2	,	0	}
            };
    static final String[] tab_1_strings =
            {
/*	0	*/	"	1	"	,
/*	1	*/	"Алюмінію окис у вигляді аерозолю конденсації"	,
/*	2	*/	"Алюмінію окис у вигляді аерозолю дезінтеграції (глинозем, електрокорунд)"	,
/*	3	*/	"Алмаз металізований"	,
/*	4	*/	"Кремнію двоокис кристалічний при вмісті понад 70%"	,
/*	5	*/	"Кремнію двоокис кристалічний при вмісті від 10% до  70%"	,
/*	6	*/	"Кремнію двоокис кристалічний при вмісті від 2% до 10%"	,
/*	7	*/	"Кремнію двоокис аморфний у вигляді аерозолю конденсації"	,
/*	8	*/	"Антрацит із вмістом кремнію до 5%"	,
/*	9	*/	"Інше вугілля з вмістом SiO2 до 5%"	,
/*	10	*/	"Інше вугілля з вмістом SiO2 від 5% до 10%"	,
/*	11	*/	"Кокси кам’яновугільний, піковий, нафтовий, сланцевий"	,
/*	12	*/	"Пил рослинного та тваринного походження з домішками двоокису кремнію більше 10%"	,
/*	13	*/	"Пил рослинного та тваринного походження з домішками двоокису кремнію від 2% до 10%"	,
/*	14	*/	"Пил рослинного та тваринного походження, зерновий"	,
/*	15	*/	"Силікати та силікатовмісткий пил - азбест"	,
/*	16	*/	"Силікати та силікатовмісткий пил - азбестоцемент, апатит, глина"	,
/*	17	*/	"Силікати та силікатовмісткий пил - цемент"	,
/*	18	*/	"Силікати та силікатовмісткий пил - тальк, слюда"	,
/*	19	*/	"Сажа чорна промислова "	,
/*	20	*/	"Чавун"	,
/*	21	*/	"Фенопласти"	,
/*	22	*/	"Фторопласт"	,
/*	23	*/	"Шамото-графітові вогнетривкі"	,
            };
    static final double[][] tab_2 = new double[][]
            {
                    {	0	,	3	    ,	4	,	6	,	6	,	6	},
                    {	1	,	5	    ,	2	,	4	,	5	,	0	},
                    {	2	,	20	    ,	4	,	5	,	0	,	0	},
                    {	3	,	0.01 	,	1	,	3	,	0	,	0	},
                    {	4	,	0.1 	,	1	,	4	,	0	,	0	},
                    {	5	,	0.01 	,	1	,	4	,	0	,	0	},
                    {	6	,	0.1 	,	2	,	3	,	0	,	0	},
                    {	7	,	0.5 	,	1	,	4	,	0	,	0	},
                    {	8	,	100	    ,	4	,	4	,	1	,	0	},
                    {	9	,	0.001 	,	1	,	5	,	3	,	1	},
                    {	10	,	0.1 	,	1	,	4	,	0	,	0	},
                    {	11	,	0.00015 ,	1	,	3	,	0	,	0	},
                    {	12	,	0.5 	,	2	,	5	,	4	,	0	},
                    {	13	,	0.05 	,	1	,	1	,	4	,	0	},
                    {	14	,	0.01 	,	1	,	4	,	1	,	0	},
                    {	15	,	0.05 	,	1	,	4	,	1	,	5	},
                    {	16	,	5	    ,	2	,	5	,	4	,	0	},
                    {	17	,	0.1 	,	1	,	5	,	4	,	0	},
                    {	18	,	0.01 	,	1	,	4	,	0	,	0	},
                    {	19	,	1	    ,	2	,	5	,	0	,	0	},
                    {	20	,	1	    ,	3	,	5	,	0	,	0	},
                    {	21	,	0.5 	,	2	,	5	,	0	,	0	},
                    {	22	,	1   	,	2	,	5	,	0	,	0	},
                    {	23	,	0.8 	,	2	,	4	,	0	,	0	},
                    {	24	,	0.0005 	,	1	,	4	,	3	,	1	},
                    {	25	,	0.1 	,	2	,	4	,	5	,	0	},
                    {	26	,	10  	,	2	,	4	,	0	,	0	},
                    {	27	,	0.5 	,	2	,	4	,	5	,	0	},
                    {	28	,	0.005 	,	1	,	1	,	4	,	0	},
                    {	29	,	1	    ,	2	,	4	,	0	,	0	},
                    {	30	,	0.05 	,	1	,	4	,	5	,	0	},
                    {	31	,	0.005 	,	1	,	4	,	0	,	0	},
                    {	32	,	20.0 	,	4	,	4	,	0	,	0	}

            };
    static final String[] tab_2_strings =
            {
/*	0	*/	"0",
/*	1	*/	"Азоту оксиди (NO_2)",
/*	2	*/	"Аміак",
/*	3	*/	"Миш’як",
/*	4	*/	"Ангідрид селену",
/*	5	*/	"Ангідрид хромовий",
/*	6	*/	"Анілін",
/*	7	*/	"Барій вуглекислий",
/*	8	*/	"Бензин",
/*	9	*/	"Берилій і його сполуки",
/*	10	*/	"Натрію нітрит",
/*	11	*/	"3,4-бенз(а)пірен",
/*	12	*/	"Бром",
/*	13	*/	"Гама-гексахлорциклогексан",
/*	14	*/	"Кобальту гідрокарбоніл",
/*	15	*/	"Метилізоціанат",
/*	16	*/	"Гідрохлорид",
/*	17	*/	"Диметидсульфат",
/*	18	*/	"Свинець",
/*	19	*/	"Сірчана кислота",
/*	20	*/	"Натрію хлорид",
/*	21	*/	"Луги їдкі",
/*	22	*/	"Йод",
/*	23	*/	"Бензолу ціанід",
/*	24	*/	"Нікелю карбоніл",
/*	25	*/	"Озон",
/*	26	*/	"Сірководень",
/*	27	*/	"Формальдегід",
/*	28	*/	"Тетраетилсвинець",
/*	29	*/	"Хлор",
/*	30	*/	"Фосфору хлороксид",
/*	31	*/	"Диетилртуть",
/*	32	*/	"Оксид вуглецю",
            };
    static final double[][] addition_one = new double[][]
            {
                    {01.00, 02.00, 03.00, 04.00, 05.00, 06.00, 07.00, 08.00,  09.00, 10.00, 11.00, 12.00},
                    {01.00, 12.00, 70.00, 74.5,  26.00, 10.00, 21.00, 680.00, 27.00, 0.3,   15.00, 766.00},
                    {02.00, 13.00, 72.00, 76.00, 28.00, 11.00, 22.00, 690.00, 32.00, 15.00, 16.00, 768.00},
                    {03.00, 14.00, 74.00, 78.00, 20.00, 12.00, 23.00, 697.00, 30.00, 0.15,  17.00, 770.00},
                    {04.00, 7.00,  76.00, 80.00, 22.00, 13.00, 24.00, 700.00, 13.00, 0.09,  18.00, 772.00},
                    {05.00, 8.10,  78.00, 79.50, 24.00, 14.00, 25.00, 710.00, 1.00,  6.00,  19.00, 764.00},
                    {06.00, 8.20,  80.00, 85.00, 16.00, 15.00, 26.00, 720.00, 2.00,  25.00, 20.00, 765.00},
                    {07.00, 8.30,  82.00, 88.5,  8.00,  16.00, 27.00, 735.00, 3.00,  0.04,  11.00, 776.00},
                    {08.00, 9.10,  84.00, 87.5,  20.00, 17.00, 28.00, 740.00, 4.00,  0.3,   12.00, 777.00},
                    {09.00, 9.20,  86.00, 88.00, 22.00, 18.00, 29.00, 650.00, 5.00,  0.02,  13.00, 778.00},
                    {10.00, 9.30,  88.00, 90.00, 24.00, 19.00, 30.00, 728.00, 6.00,  0.09,  14.00, 769.00},
                    {11.00, 1.00,  90.00, 91.5,  26.00, 20.00, 31.00, 680.00, 7.00,  0.7,   15.00, 772.00},
                    {12.00, 2.00,  70.00, 76.5,  18.00, 21.00, 32.00, 686.00, 8.00,  250.00,16.00, 774.00},
                    {13.00, 3.00,  72.00, 75.00, 10.00, 22.00, 33.00, 678.00, 9.00,  0.003, 17.00, 776.00},
                    {14.00, 4.10,  74.00, 77.00, 16.00, 23.00, 34.00, 692.00, 10.00, 0.4,   18.00, 778.00},
                    {15.00, 4.20,  76.00, 79.5,  18.00, 24.00, 35.00, 656.00, 1.00,  20.00, 5.00,  770.00},
                    {16.00, 4.30,  78.00, 80.00, 10.00, 25.00, 34.00, 735.00, 12.00, 1.5,   6.00,  772.00},
                    {17.00, 5.00,  80.00, 81.5,  12.00, 26.00, 33.00, 721.00, 13.00, 0.15,  7.00,  774.00},
                    {18.00, 6.10,  82.00, 84.00, 14.00, 27.00, 32.00, 678.00, 14.00, 0.02,  8.00,  776.00},
                    {19.00, 6.20,  84.00, 87.00, 16.00, 28.00, 31.00, 690.00, 15.00, 0.15,  9.00,  766.00},
                    {20.00, 6.30,  85.00, 88.00, 18.00, 29.00, 30.00, 689.00, 16.00, 10.00, 10.00, 778.00},
                    {21.00, 7.00,  80.00, 84.5,  10.00, 30.00, 29.00, 680.00, 17.00, 0.15,  11.00, 770.00},
                    {22.00, 8.10,  82.00, 83.5,  32.00, 10.00, 28.00, 655.00, 18.00, 0.03,  12.00, 772.00},
                    {23.00, 8.20,  78.00, 80.00, 34.00, 11.00, 27.00, 649.00, 19.00, 4.00,  13.00, 774.00},
                    {24.00, 8.30,  72.00, 76.00, 26.00, 12.00, 26.00, 678.00, 20.00, 4.7,   20.00, 775.00},
                    {25.00, 9.10,  74.00, 77.5,  28.00, 13.00, 25.00, 754.00, 21.00, 2.5,   14.00, 776.00},
                    {26.00, 9.20,  76.00, 80.00, 10.00, 14.00, 24.00, 714.00, 22.00, 1.8,   16.00, 777.00},
                    {27.00, 9.30,  78.00, 81.5,  16.00, 15.00, 23.00, 760.00, 23.00, 2.8,   17.00, 778.00},
                    {28.00, 9.40,  70.00, 74.00, 18.00, 16.00, 22.00, 743.00, 14.00, 0.02,  18.00, 779.00},
                    {29.00, 10.00, 72.00, 77.00, 20.00, 17.00, 21.00, 702.00, 25.00, 0.17,  19.00, 772.00},
                    {30.00, 11.00, 74.00, 78.5,  22.00, 15.00, 20.00, 679.00, 32.00, 22.00, 20.00, 769.00}
            };

    static final int[][] vars = new int[][]
            {
                    {	0	,	1	,	2	,	3	,	4	,	5	},
                    {	1	,	6	,	1	,	2	,	8	,	4	},
                    {	2	,	7	,	9	,	3	,	10	,	5	},
                    {	3	,	12	,	16	,	11	,	14	,	13	},
                    {	4	,	19	,	20	,	18	,	17	,	15	}
            };

    static final double[][] addition_two_vars = new double[][]
            {
                    {0, 1},
                    {1, 1.5},
                    {2, 4.0},
                    {3, 16},
                    {4, 0.05},
                    {5, 0.00014},
                    {6, 87},
                    {7, 0.0009},
                    {8, 0.003},
                    {9, 0.7},
                    {10, 0.007},
                    {11, 0.3},
                    {12, 0.04},
                    {13, 0.007},
                    {14, 0.09},
                    {15, 0.0002},
                    {16, 3.5},
                    {17, 0.008},
                    {18, 0.5},
                    {19, 0.001},
                    {20, 5.0}
            };

    static final String[] addition_two_strings = {
            "1",
            "Азбест",
            "Азоту оксид",
            "Аміак",
            "Анілін",
            "3-4-Бензапірен",
            "Бензин",
            "Берилій",
            "Диетилртуть",
            "Кремнію двоокис, 70%",
            "Кобальт",
            "Луги їдкі",
            "Метилізоціонат",
            "Миш’як",
            "Натрію нітрит",
            "Нікелю карбонат",
            "Сажі чорні промислові",
            "Свинець",
            "Сірчана кислота",
            "Тетраетилсвинець",
            "Чавун"
    };

    static final int[][] second_task = new int[][]
            {
                    {	0	,	1	,	2	,	3	,	4	,	5	},
                    {	1	,	8	,	15	,	1	,	31	,	6	},
                    {	2	,	9	,	4	,	2	,	14	,	11	},
                    {	3	,	15	,	19	,	21	,	10	,	3	},
                    {	4	,	28	,	20	,	19	,	19	,	24	}
            };

    public static void Zero() //сложные рассчеты
    {
        if (addition_one[num][1] == 1)
        {
            NAME = 1;
        }
        else if (addition_one[num][1] == 2){
            NAME = 2;
        }
        else if (addition_one[num][1] == 3){
            NAME = 3;
        }
        else if (addition_one[num][1] == 4.1){
            NAME = 4;
        }
        else if (addition_one[num][1] == 4.2){
            NAME = 5;
        }
        else if (addition_one[num][1] == 4.3){
            NAME = 6;
        }
        else if (addition_one[num][1] == 5){
            NAME = 7;
        }
        else if (addition_one[num][1] == 6.1){
            NAME = 8;
        }
        else if (addition_one[num][1] == 6.2){
            NAME = 9;
        }
        else if (addition_one[num][1] == 6.3){
            NAME = 10;
        }
        else if (addition_one[num][1] == 7){
            NAME = 11;
        }
        else if (addition_one[num][1] == 8.1){
            NAME = 12;
        }
        else if (addition_one[num][1] == 8.2){
            NAME = 13;
        }
        else if (addition_one[num][1] == 8.3){
            NAME = 14;
        }
        else if (addition_one[num][1] == 9.1){
            NAME = 15;
        }
        else if (addition_one[num][1] == 9.2){
            NAME = 16;
        }
        else if (addition_one[num][1] == 9.3){
            NAME = 17;
        }
        else if (addition_one[num][1] == 9.4){
            NAME = 18;
        }
        else if (addition_one[num][1] == 10)
        {
            NAME = 19;
        }
        else if (addition_one[num][1] == 11)
        {
            NAME = 20;
        }
        else if (addition_one[num][1] == 12)
        {
            NAME = 21;
        }
        else if (addition_one[num][1] == 13)
        {
            NAME = 22;
        }
        else if (addition_one[num][1] == 14)
        {
            NAME = 23;
        }
        First();
    }
    public static void First()
    {
        String firstTableTOPAlignFormat = "| %-3s | %-41s | %-8s | %-147s |%n";
        String leftAlignFormat = "| %-3s | %-41s | %-8s | %-15s | %-11s | %-11s |%n";

        System.out.format("+-----+-------------------------------------------+----------+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        System.out.format(firstTableTOPAlignFormat, "#1", "Р №1 - речовина №1 фіброгенної дії (пил)", addition_one[num][1], tab_1_strings[NAME]);
        System.out.format(firstTableTOPAlignFormat, "#1", "Р №1 - речовина №1 хімічного походження", addition_one[num][8], tab_2_strings[(int)addition_one[num][8]]);
        System.out.format("+-----+-------------------------------------------+----------+-----------------------------------------------------------------------------------------------------------------------------------------------------+%n");
        System.out.format(leftAlignFormat, "#", "Параметри", "Позна", "Одиниці", "Значення", "Значення");
        System.out.format(leftAlignFormat, "з/п", "", "чення", "виміру", "ВП№1 Р№1", "ВП№2 Р№2");
        System.out.format("+-----+-------------------------------------------+----------+-----------------+-------------+-------------+%n");
        int i = 1;
        System.out.format(leftAlignFormat, i++, "Маса фільтру до аспіраціх", "P1", "мг", (int)addition_one[num][2]+ "мг", "С_t.p. = ");
        System.out.format("+-----+-------------------------------------------+----------+-----------------+-------------|             |%n");
        System.out.format(leftAlignFormat, i++, "Маса фільтру після аспіраціх", "P2", "мг", addition_one[num][3]+" мг", addition_one[num][9]+"мг/м^3");
        System.out.format("+-----+-------------------------------------------+----------+-----------------+-------------+-------------+%n");
        System.out.format(leftAlignFormat, i++, "Температура повітря в приміщенні", "t", "°C", (int)addition_one[num][6]+"°C", (int)addition_one[num][10]+"°C");
        System.out.format("+-----+-------------------------------------------+----------+-----------------+-------------+-------------+%n");
        System.out.format(leftAlignFormat, i++, "Барометричний тиск", "B", "мм.рт.ст", (int)addition_one[num][7]+"мм.рт.ст", (int)addition_one[num][11]);
        System.out.format("+-----+-------------------------------------------+----------+-----------------+-------------+-------------+%n");
        System.out.format(leftAlignFormat, i++, "Час відбору проби", "T", "хв.", (int)addition_one[num][4]+" хв", "");
        System.out.format("+-----+-------------------------------------------+----------+-----------------+-------------+-------------+%n");
        System.out.format(leftAlignFormat, i, "Об'ємна швид. аспірації (відбору проби)", "Q_m", "л/хв", (int)addition_one[num][5]+" л/хв", "");
        System.out.format("+-----+-------------------------------------------+----------+-----------------+-------------+-------------+%n");
        Second();
    }

    public static void Second()
    {
        System.out.println("Розрахунки та висновки (задача 1)");
        System.out.println("Обсяг відібраної проби повітря для Р №1:");
        System.out.format("\n");
        String for_1 = "%-6s %-6s%-3s%-3s%-6s%-3s%-3s%-10s%n";
        double V_t = (addition_one[num][5] * addition_one[num][4]) / 1000;
        String SV_t = String.format("%.3f", (V_t));
        System.out.format(for_1, "", " Q_t * ", "T","", (int)addition_one[num][5]+" * ",(int)addition_one[num][4] ,"","");
        System.out.format(for_1, "V_t =", "------", "---", " = ", "------", "---", " = ", SV_t + " м^3");
        System.out.format(for_1, "", " 1000", "","", " 1000", "","","");
        System.out.format("\n");
        System.out.println("Обсяг повітря приведений до нормальних умов для Р №1:");
        System.out.format("\n");
        String for_2 = "%-6s%-5s%-3s%-10s%-3s%-7s";
        double V_0 = (V_t * (273+20) * addition_one[num][7] ) / ((273+(int)addition_one[num][6]) * 760);
        String SV_0 = String.format("%.3f", (V_0));
        System.out.format(for_2, "", " V_t ", " * ", "(273 + 20) ", " * ", " B ");
        System.out.format(for_2, "", SV_t, " * ", "(273 + 20) ", " * ", (int)addition_one[num][7]);
        System.out.format("\n");
        System.out.format(for_2, "V_o = ", "-----", "---", "----------", "---", "-------");
        System.out.format(for_2, "  =  ", "-----", "---", "----------", "---", "-------");
        System.out.format(for_2, "  =  ", SV_0, " м^3", "", "", "");
        System.out.format("\n");
        System.out.format(for_2, "", "", "", "(273 + t) ", " * ", "760");
        System.out.format(for_2, "", "", "", "(273 + "+(int)addition_one[num][6]+") ", " * ", "760");
        System.out.format("\n");
        System.out.println("Фактична концентрація пилу для Р №1:");
        System.out.format("\n");
        String for_3_1_1 = "%-9s%-5s%-5s%-4s";
        String for_3_1_2 = "%-3s%-5s%-5s%-4s";
        double ex_3_1 = ((addition_one[num][3] - addition_one[num][2])/V_0);
        String s_ex_3_1 = String.format("%.2f", (ex_3_1));
        System.out.format(for_3_1_1, "", " P_2","  -  ", "P_1");
        System.out.format(for_3_1_2, "", " "+addition_one[num][3],"  -  ", (int)addition_one[num][2]);
        System.out.format("\n");
        System.out.format(for_3_1_1, "C_факт = ", "-----","-----", "----");
        System.out.format(for_3_1_2, " = ", "-----","-----", "----");
        System.out.format(for_3_1_2, " = ",s_ex_3_1, "мг/м^3", "");
        System.out.format("\n");
        System.out.format(for_3_1_1, "", ""," V_o ", "");
        System.out.format(for_3_1_2, "", "",SV_0, "");
        System.out.format("\n");
        System.out.println("Фактична концентрація хімічної речовини для Р №2:");
        System.out.format("\n");
        String for_3_2_1 = "%-6s%-9s%-1s%-4s%-3s%-3s%-3s%-4s%-1s";
        String for_3_2_2 = "%-3s%-9s%-1s%-4s%-3s%-3s%-3s%-4s%-1s";
        String for_3_2_3 = "%-3s%-9s%-1s%-10s%-1s";
        double ex_3_2 = ((((273+20)*addition_one[num][11])/((273+(int)addition_one[num][10])*760))*addition_one[num][9]);
        String s_ex_3_2 = String.format("%.2f", (ex_3_2));
        System.out.format(for_3_2_1, "", "", "⌈","","","","","","⌉");
        System.out.format(for_3_2_2, "", "", "⌈","","","","","","⌉");
        System.out.format(for_3_2_3, "", "", "⌈","","⌉");
        System.out.format("\n");
        System.out.format(for_3_2_1, "", "", "|","(273"," + ","20)"," * ","P","|");
        System.out.format(for_3_2_2, "", "", "|","(273"," + ","20)"," * ",(int)addition_one[num][11],"|");
        System.out.format(for_3_2_3, "", "", "|"," "+((273+20)*addition_one[num][11]),"|");
        System.out.format("\n");
        System.out.format(for_3_2_1, "С_н = ", "C_tp * ","|","----","---","---","---","----","|");
        System.out.format(for_3_2_2, " = ", addition_one[num][9]+" * ","|","----","---","---","---","----","|");
        System.out.format(for_3_2_3, " = ", addition_one[num][9]+" * ","|","----------","|");
        System.out.format(" = " + s_ex_3_2 + " мг/м^3");
        System.out.format("\n");
        System.out.format(for_3_2_1, "", "", "|","(273"," + ","t)"," * ","760","|");
        System.out.format(for_3_2_2, "", "", "|","(273"," + ",(int)addition_one[num][10]+")"," * ","760","|");
        System.out.format(for_3_2_3, "", "", "|"," "+((273+(int)addition_one[num][10])*760),"|");
        System.out.format("\n");
        System.out.format(for_3_2_1, "", "", "⌊","","","","","","⌋");
        System.out.format(for_3_2_2, "", "", "⌊","","","","","","⌋");
        System.out.format(for_3_2_3, "", "", "⌊","","⌋");
        System.out.format("\n");
        System.out.println("Коефіцієнт невідповідності умовам праці для Р №1");
        System.out.format("\n");
        String for_4_1_1 = "%-8s%-6s";
        String for_4_1_2 = "%-3s%-6s";
        double ex_4_1 = ( ex_3_1 / tab_1[NAME][2] );
        String s_ex_4_1 = String.format("%.2f", (ex_4_1));
        System.out.format(for_4_1_1, "", "C_факт");
        System.out.format(for_4_1_2, "", " "+s_ex_3_1);
        System.out.format("\n");
        System.out.format(for_4_1_1, "К_нуп = ", "------");
        System.out.format(for_4_1_2, " = ", "------");
        System.out.format(" = " + s_ex_4_1);
        System.out.format("\n");
        System.out.format(for_4_1_1, "", "С_гдк");
        System.out.format(for_4_1_2, "", " "+tab_1[NAME][2]);
        System.out.format("\n");
        System.out.println("Коефіцієнт невідповідності умовам праці для Р №2");
        System.out.format("\n");
        double ex_4_2 = ( ex_3_2 / tab_2[num][1] );
        String s_ex_4_2 = String.format("%.2f", (ex_4_2));
        System.out.format(for_4_1_1, "", "C_н");
        System.out.format(for_4_1_2, "", " "+s_ex_3_2);
        System.out.format("\n");
        System.out.format(for_4_1_1, "К_нуп = ", "------");
        System.out.format(for_4_1_2, " = ", "------");
        System.out.format(" = " + s_ex_4_2);
        System.out.format("\n");
        System.out.format(for_4_1_1, "", "С_гдк");
        System.out.format(for_4_1_2, "", " "+tab_2[num][1]);

        System.out.format("\n");
        System.out.println("Визначення класу умов праці (по таблиці №3) для Р №1");

        if (tab_1[NAME][3] == 1 || tab_1[NAME][3] == 2)
        {
            if (ex_4_1 <= 1)
            {
                System.out.println("Класс умов праці - допустимий (2), так як перевищення в межах ГДК");
            }
            else if (ex_4_1 > 1 && ex_4_1 <= 3.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.1), так як кратність перевищення ГДК більше одиниці - " + s_ex_4_1);
            }
            else if (ex_4_1 > 3.0 && ex_4_1 <= 6.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.2), так як кратність перевищення ГДК більше трьох - " + s_ex_4_1);
            }
            else if (ex_4_1 > 6.0 && ex_4_1 <= 10.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.3), так як кратність перевищення ГДК більше шости - " + s_ex_4_1);
            }
            else if (ex_4_1 > 10.0 && ex_4_1 <= 20.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.4), так як кратність перевищення ГДК більше десяти - " + s_ex_4_1);
            }
            else {
                System.out.println("Класс умов праці - небезпечний (4), так як кратність перевищення ГДК більше двадцяти - " + s_ex_4_1);
            }
        }
        else if (tab_1[NAME][3] == 4 || tab_1[NAME][3] == 3)
        {
            if (ex_4_1 <= 1)
            {
                System.out.println("Класс умов праці - допустимий (2), так як перевищення в межах ГДК");
            }
            else if (ex_4_1 > 1 && ex_4_1 <= 3.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.1), так як кратність перевищення ГДК більше одиниці - " + s_ex_4_1);
            }
            else if (ex_4_1 > 3.0 && ex_4_1 <= 10.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.2), так як кратність перевищення ГДК більше трьох - " + s_ex_4_1);
            }
            else if (ex_4_1 > 10.0 && ex_4_1 <= 15.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.3), так як кратність перевищення ГДК більше десяти - " + s_ex_4_1);
            }
            else {
                System.out.println("Класс умов праці - небезпечний (3.4), так як кратність перевищення ГДК більше п'ятнадцяти - " + s_ex_4_1);
            }
        }

        System.out.format("\n");
        System.out.println("Визначення класу умов праці (по таблиці №3) для Р №2");
        if (tab_2[num][2] == 1 || tab_2[num][2] == 2)
        {
            if (ex_4_2 <= 1)
            {
                System.out.println("Класс умов праці - допустимий (2), так як перевищення в межах ГДК");
            }
            else if (ex_4_2 > 1 && ex_4_2 <= 3.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.1), так як кратність перевищення ГДК більше одиниці - " + s_ex_4_2);
            }
            else if (ex_4_2 > 3.0 && ex_4_2 <= 6.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.2), так як кратність перевищення ГДК більше трьох - " + s_ex_4_2);
            }
            else if (ex_4_2 > 6.0 && ex_4_2 <= 10.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.3), так як кратність перевищення ГДК більше шости - " + s_ex_4_2);
            }
            else if (ex_4_2 > 10.0 && ex_4_2 <= 20.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.4), так як кратність перевищення ГДК більше десяти - " + s_ex_4_2);
            }
            else {
                System.out.println("Класс умов праці - небезпечний (4), так як кратність перевищення ГДК більше двадцяти - " + s_ex_4_2);
            }
        }
        else if (tab_2[num][2] == 4 || tab_2[num][2] == 3)
        {
            if (ex_4_2 <= 1)
            {
                System.out.println("Класс умов праці - допустимий (2), так як перевищення в межах ГДК");
            }
            else if (ex_4_2 > 1 && ex_4_2 <= 3.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.1), так як кратність перевищення ГДК більше одиниці - " + s_ex_4_2);
            }
            else if (ex_4_2 > 3.0 && ex_4_2 <= 10.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.2), так як кратність перевищення ГДК більше трьох - " + s_ex_4_2);
            }
            else if (ex_4_2 > 10.0 && ex_4_2 <= 15.0 )
            {
                System.out.println("Класс умов праці - шкідливий (3.3), так як кратність перевищення ГДК більше десяти - " + s_ex_4_2);
            }
            else {
                System.out.println("Класс умов праці - небезпечний (3.4), так як кратність перевищення ГДК більше п'ятнадцяти - " + s_ex_4_2);
            }
        }
        Third();
    }

    public static void Third(){
        System.out.println("\n");
        System.out.println("Оцінка комбінованої дії речовин на працівників (задача 2):");
        String leftAlignFormat = "| %-22s | %-15s | %-15s | %-15s | %-15s |%n";

        System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
        System.out.format(leftAlignFormat, "Назва речовини та", "Фактична ", "ГДК речовини", "Кратність", "Оцінка комбіно-");
        System.out.format(leftAlignFormat, "ознаки дії на організм", "концентрація", "в робочій зоні", "перевищення ГДК", "ваного впливу");
        System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
        double kd_g = 0;
        double kd_p = 0;
        double kd_k = 0;
        double kd_a = 0;
        double kd_f = 0;

        int local=0;
        if (num == 1 || num == 6 || num == 11 || num == 16 || num == 21 ||num == 26)
        {
            local = 1;
        }

        else if (num == 3 || num == 8 || num == 13 || num == 18 || num == 23 ||num == 28)
        {
            local = 3;
        }
        else if (num == 4 || num == 9 || num == 14 || num == 19 || num == 24 ||num == 29)
        {
            local = 4;
        }
        else if (num ==5 || num == 10 || num == 15 || num == 20 || num == 25 ||num == 30)
        {
            local = 5;
        }
        if (num == 2 || num == 7 || num == 12 || num == 17 || num == 22 ||num == 27)
        {

            for (int j=1; j<5;j++)
            {
                if ((int)tab_1[second_task[j][2]][4] == 1) //A
                {
                    kd_a = kd_a + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][4] == 2) //F
                {
                    kd_f = kd_f + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][4] == 3) //K
                {
                    kd_k = kd_k + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][4] == 4) //G
                {
                    kd_g = kd_g + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][4] == 5) //P
                {
                    kd_p = kd_p + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                if ((int)tab_1[second_task[j][2]][5] == 1) //A
                {
                    kd_a = kd_a + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][5] == 2) //F
                {
                    kd_f = kd_f + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][5] == 3) //K
                {
                    kd_k = kd_k + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][5] == 4) //G
                {
                    kd_g = kd_g + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
                else if ((int)tab_1[second_task[j][2]][5] == 5) //P
                {
                    kd_p = kd_p + addition_two_vars[vars[j][2]][1]/tab_1[second_task[j][2]][2];
                }
            }
            int i=1;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][2]], addition_two_vars[vars[i][2]][1] + " мг/м^3", tab_1[second_task[i][2]][2] + " мг/м^3",String.format("%.2f", (addition_two_vars[vars[i][2]][1]/tab_1[second_task[i][2]][2])), "К_кд(г) = " + String.format("%.2f", (kd_g)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
            i++;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][2]], addition_two_vars[vars[i][2]][1] + " мг/м^3", tab_1[second_task[i][2]][2] + " мг/м^3",String.format("%.2f", (addition_two_vars[vars[i][2]][1]/tab_1[second_task[i][2]][2])), "К_кд(п) = " + String.format("%.2f", (kd_p)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
            i++;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][2]], addition_two_vars[vars[i][2]][1] + " мг/м^3", tab_1[second_task[i][2]][2] + " мг/м^3",String.format("%.2f", (addition_two_vars[vars[i][2]][1]/tab_1[second_task[i][2]][2])), "К_кд(к) = " + String.format("%.2f", (kd_k)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
            i++;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][2]], addition_two_vars[vars[i][2]][1] + " мг/м^3", tab_1[second_task[i][2]][2] + " мг/м^3",String.format("%.2f", (addition_two_vars[vars[i][2]][1]/tab_1[second_task[i][2]][2])), "К_кд(а) = " + String.format("%.2f", (kd_a)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
        }

        else
        {
            for (int j=1; j<5;j++)
            {
                if ((int)tab_2[second_task[j][local]][3] == 1) //A
                {
                    kd_a = kd_a + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][3] == 2) //F
                {
                    kd_f = kd_f + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][3] == 3) //K
                {
                    kd_k = kd_k + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][3] == 4) //G
                {
                    kd_g = kd_g + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][3] == 5) //P
                {
                    kd_p = kd_p + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
            }
            for (int j=1; j<5;j++){
                if ((int)tab_2[second_task[j][local]][4] == 1) //A
                {
                    kd_a = kd_a + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][4] == 2) //F
                {
                    kd_f = kd_f + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][4] == 3) //K
                {
                    kd_k = kd_k + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][4] == 4) //G
                {
                    kd_g = kd_g + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][4] == 5) //P
                {
                    kd_p = kd_p + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
            }
            for (int j=1; j<5;j++){
                if ((int)tab_2[second_task[j][local]][5] == 1) //A
                {
                    kd_a = kd_a + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][5] == 2) //F
                {
                    kd_f = kd_f + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][5] == 3) //K
                {
                    kd_k = kd_k + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][5] == 4) //G
                {
                    kd_g = kd_g + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
                else if ((int)tab_2[second_task[j][local]][5] == 5) //P
                {
                    kd_p = kd_p + addition_two_vars[vars[j][local]][1]/tab_2[second_task[j][local]][1];
                }
            }
            int i=1;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][local]], addition_two_vars[vars[i][local]][1] + " мг/м^3", tab_2[second_task[i][local]][1] + " мг/м^3",String.format("%.3f",addition_two_vars[vars[i][local]][1]/tab_2[second_task[i][local]][1]), "К_кд(г) = " + String.format("%.2f", (kd_g)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
            i++;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][local]], addition_two_vars[vars[i][local]][1] + " мг/м^3", tab_2[second_task[i][local]][1] + " мг/м^3",String.format("%.3f",addition_two_vars[vars[i][local]][1]/tab_2[second_task[i][local]][1]), "К_кд(п) = " + String.format("%.2f", (kd_p)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
            i++;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][local]], addition_two_vars[vars[i][local]][1] + " мг/м^3", tab_2[second_task[i][local]][1] + " мг/м^3",String.format("%.3f",addition_two_vars[vars[i][local]][1]/tab_2[second_task[i][local]][1]), "К_кд(к) = " + String.format("%.2f", (kd_k)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
            i++;
            System.out.format(leftAlignFormat,addition_two_strings[vars[i][local]], addition_two_vars[vars[i][local]][1] + " мг/м^3", tab_2[second_task[i][local]][1] + " мг/м^3",String.format("%.3f",addition_two_vars[vars[i][local]][1]/tab_2[second_task[i][local]][1]), "К_кд(ф) = " + String.format("%.2f", (kd_f)) + ";");
            System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
        }
        System.out.format(leftAlignFormat,"", "", "","", "К_кд(а) = " + String.format("%.2f", (kd_a)) + ";");
        System.out.format("+------------------------+-----------------+-----------------+-----------------+-----------------+%n");
        Final();
    }

    public static void Final() {
        System.out.println("=====");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці як розраховувати оцінку впливу хімічних речовин та пилу на організм працівників.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе
                    К сожалению в последнем расчетов никаких не предоставляю ибо запутаемся все :)
                    Если есть желание - кратность находится делением ГДК на Фактическую Концентрацию, а
                    Оценка Комбинированного действия по таблице спотреть буквы нужно, и добавлять кратность согласно обозначениям;
                    Пример - Азбест - К+Ф, Кремний Двоокис 70% - Ф, Чавун - Ф; К_кф = Азбест + Кремний + Чавун; К_кк = Азбест; Везде используется кратность ГДК""");
        System.out.print("\n");
    }
    public static void main()
    {
        System.out.print("""
                Практичного Заняття № 5\040
                «ОЦІНКА ВПЛИВУ ХІМІЧНИХ РЕЧОВИН ТА ПИЛУ НА ОРГАНІЗМ ПРАЦІВНИКІВ»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        Zero();
    }
}
