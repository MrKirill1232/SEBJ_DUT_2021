package labs;

import java.util.Scanner;

public class Lab_10_ten {

    static int num;

    static int pre_one; // для перевода кГерцов в МегаГерци             //1 - МГц //0 - кГц
    static double ENgdr; // Параметр с табл 6
    static int pre_two; // может понадобится.                           //0 - мВт/м2 //1 - Вт/м2 //2 - В/м //3 - А/м
    static int pre_thr; // см дм
    static int pre_for; // см -> м
    static int pre_fif; // см -> м -> км // table_2

    static double ENfact1_1;   // 1_1
    static String ENfact1_2;   // 1_2
    static String S1_2;   // 1_2
    static String GPE_s;   // 1_2

    static final double[][] table1 = new double[][]{
            {	0	,	1	,	2	,	3	,	4	,	5	,	6	},
            {	1	,	360	,	800	,	3	,	0.8	,	50	,	5	},
            {	2	,	460	,	0.5	,	8	,	0.3	,	30	,	4	},
            {	3	,	360	,	700	,	3	,	0.7	,	30	,	5	},
            {	4	,	480	,	0.9	,	7	,	0.6	,	40	,	5	},
            {	5	,	1000,	1	,	5	,	0.5	,	50	,	6	},
            {	6	,	31	,	140	,	2	,	5	,	1	,	4	},
            {	7	,	40	,	190	,	3	,	4	,	0.5	,	5	},
            {	8	,	56	,	90	,	4	,	3	,	0.3	,	8	},
            {	9	,	72	,	80	,	5	,	2	,	1	,	5	},
            {	10	,	39	,	70	,	6	,	1	,	0.4	,	6	},
            {	11	,	180	,	12.5,	2	,	0.7	,	50	,	8	},
            {	12	,	120	,	13.5,	7	,	0.4	,	30	,	6	},
            {	13	,	220	,	8.5	,	4	,	0.6	,	30	,	7	},
            {	14	,	200	,	16	,	6	,	0.5	,	40	,	5	},
            {	15	,	150	,	12.5,	5	,	0.4	,	50	,	8	},
            {	16	,	350	,	700	,	3	,	4	,	1	,	2	},
            {	17	,	450	,	0.4	,	2	,	3	,	0.5	,	3	},
            {	18	,	350	,	600	,	1	,	5	,	0.3	,	4	},
            {	19	,	470	,	0.8	,	4	,	6	,	1	,	5	},
            {	20	,	900	,	0.6	,	3	,	2	,	0.4	,	6	},
            {	21	,	21	,	120	,	4	,	7	,	1	,	4	},
            {	22	,	30	,	180	,	5	,	6	,	0.5	,	5	},
            {	23	,	46	,	80	,	6	,	5	,	0.3	,	8	},
            {	24	,	62	,	70	,	7	,	4	,	1	,	5	},
            {	25	,	29	,	60	,	8	,	3	,	0.4	,	6	},
            {	26	,	170	,	10.5,	4	,	0.9	,	50	,	8	},
            {	27	,	110	,	11.5,	9	,	0.6	,	30	,	6	},
            {	27	,	210	,	7.5	,	6	,	0.8	,	30	,	7	},
            {	29	,	190	,	15	,	8	,	0.7	,	40	,	5	},
            {	30	,	150	,	13.5,	7	,	0.6	,	50	,	8	}


    };

    static final double[][] table2 = new double[][]{
        /*
        КР - 1
        КВ - 2
        ПР - 3
         */
            {	0	,	1	    ,	2	    ,	3	,	4	,	5	,	6	,	7   	,	8	,	9	,	10	},
            {	1	,	300 	,	3.5 	,	4 	,	1 	,	2  	,	13	,	2   	,	5	,	600	,	9	},
            {	2	,	3   	,	3.4 	,	4 	,	2 	,	4  	,	10	,	3	    ,	3	,	500	,	10	},
            {	3	,	30  	,	3.54 	,	4 	,	3 	,	3  	,	15	,	1.5 	,	8	,	400	,	11	},
            {	4	,	3 	    ,	3.54 	,	4 	,	1 	,	3  	,	20	,	1   	,	7	,	300	,	10	},
            {	5	,	300 	,	3.54 	,	4 	,	3 	,	4  	,	25	,	4   	,	4	,	200	,	9	},
            {	6	,	3   	,	3.54 	,	4 	,	1 	,	2  	,	12	,	5   	,	4	,	600	,	10	},
            {	7	,	400 	,	3.54 	,	4 	,	2 	,	2  	,	13	,	6   	,	6	,	500	,	11	},
            {	8	,	4   	,	3.54 	,	4 	,	3 	,	4  	,	10	,	7   	,	8	,	400	,	9	},
            {	9	,	40  	,	3.54 	,	4 	,	1 	,	3  	,	25	,	8       ,	2	,	300	,	10	},
            {	10	,	4   	,	2.54 	,	4 	,	3 	,	3  	,	30	,	7.5 	,	3	,	200	,	11	},
            {	11	,	500 	,	2.54 	,	4 	,	1 	,	4  	,	15	,	8.5 	,	7	,	600	,	10	},
            {	12	,	5   	,	2.54 	,	4 	,	2 	,	2  	,	12	,	6.5 	,	6	,	500	,	9	},
            {	13	,	500 	,	2.54 	,	4 	,	3 	,	2  	,	16	,	9.5 	,	4	,	400	,	10	},
            {	14	,	5  	    ,	2.54 	,	4 	,	1 	,	4  	,	17	,	1.5 	,	6	,	300	,	11	},
            {	15	,	50  	,	2.54 	,	4 	,	3 	,	3  	,	18	,	2.5 	,	8	,	200	,	9	},
            {	16	,	5 	    ,	2.54 	,	4 	,	1 	,	3  	,	19	,	3	    ,	10	,	600	,	10	},
            {	17	,	600 	,	2.54 	,	4 	,	2 	,	4  	,	20	,	4	    ,	12	,	500	,	11	},
            {	18	,	6 	    ,	4.4 	,	4 	,	3 	,	2  	,	10	,	5.5 	,	11	,	400	,	9	},
            {	19	,	600 	,	4.54 	,	4 	,	1 	,	2  	,	12	,	4	    ,	10	,	300	,	9	},
            {	20	,	6 	    ,	4.54 	,	4 	,	3 	,	4  	,	15	,	5	    ,	9	,	200	,	10	},
            {	21	,	60  	,	4.54	,	4	,	1	,	3 	,	15	,	6	    ,	10	,	600	,	11	},
            {	22	,	6	    ,	4.54	,	4	,	2	,	3 	,	14	,	7	    ,	9	,	500	,	9	},
            {	23	,	700 	,	4.54	,	4	,	3	,	4 	,	13	,	8	    ,	8	,	400	,	10	},
            {	24	,	7	    ,	4.54	,	4	,	1	,	2 	,	12	,	7.5 	,	7	,	300	,	11	},
            {	25	,	700 	,	4.54	,	4	,	3	,	3 	,	17	,	8.5 	,	6	,	200	,	10	},
            {	26	,	7 	    ,	4.54	,	4	,	1	,	5 	,	18	,	6.5 	,	5	,	600	,	9	},
            {	27	,	80 	    ,	5.54	,	4	,	2	,	4 	,	19	,	9.5	    ,	4	,	500	,	10	},
            {	28	,	8	    ,	3.54	,	4	,	3	,	2 	,	20	,	1.5	    ,	3	,	400	,	11	},
            {	29	,	800 	,	3.54	,	4	,	1	,	3 	,	21	,	2.5 	,	2	,	300	,	9	},
            {	30	,	9	    ,	3.54	,	4	,	3	,	4 	,	30	,	2	    ,	1	,	200	,	10	}

    };

    public static void Zero()
    {
        switch (num) {
            case (1), (2), (3), (4), (5), (10), (16), (17), (18), (19), (20), (25) -> pre_one = 1;                                      //МГц
            case (6), (7), (8), (9), (11), (12), (13), (14), (15), (21), (22), (23), (24), (26), (27), (28), (29), (30) -> pre_one = 0; //кГЦ
        }
        switch (num) {
            case (1), (3), (16), (18) -> pre_two = 0;                                       // мВт/м2
            case (2), (4), (5), (17), (19), (20) -> pre_two = 1;                            // Вт/м2
            case (6), (7), (8), (9), (10), (21), (22), (23), (24), (25) -> pre_two = 2;     // В/м
            case (11), (12), (13), (14), (15), (26), (27), (28), (29), (30) -> pre_two = 3; // А/м
        }
        switch (num) {
            case (6), (7), (8), (9), (10), (16), (17), (18), (19), (20), (21), (22), (23), (24), (25) -> pre_thr = 0;   //дм
            default -> pre_thr = 1;                                                                                     //см
        }
        switch (num) {
            case (6), (7), (8), (9), (10), (16), (17), (18), (19), (20), (21), (22), (23), (24), (25) -> pre_for = 0;   //м
            default -> pre_for = 1;                                                                                     //см
        }
        switch (num) {
            case (2), (3), (8), (9), (14), (15), (20), (21), (26), (27) -> pre_fif = 0;                                 //см
            case (1), (4), (5), (7), (10), (11), (13), (16), (17), (19), (22), (23), (25), (28), (29) -> pre_fif = 0;   //м
            default -> pre_fif = 2;                                                                                     //км
        }
        switch (pre_two){
            case (0):
            case (1): {
                double local = 1.0;
                if (pre_one==0)
                {
                    local = 0.001;
                }
                if (table1[num][1] * local >= 300 && table1[num][1] * local <= 300*1000) {
                    ENgdr = 2;
                }
                break;
            }
            case (2): {
                double local = 1.0;
                if (pre_one==0)
                {
                    local = 0.001;
                }
                if (table1[num][1] * local >= 0 && table1[num][1] * local <= 3.0) {
                    ENgdr = 20000;
                } else if (table1[num][1] * local >= 3.0 && table1[num][1] * local <= 30.0) {
                    ENgdr = 7000;
                } else if (table1[num][1] * local >= 30.0 && table1[num][1] * local <= 300.0) {
                    ENgdr = 800;
                }
                break;
            }
            case (3): {
                double local = 1.0;
                if (pre_one == 0) {
                    local = 0.001;
                }
                if (table1[num][1] * local >= 0 && table1[num][1] * local <= 3.0) {
                    ENgdr = 200;
                }
                break;
            }
        }
        First();
    }

    public static void First()
    {
        System.out.print("""
                В общем сложно будет... Слишком много данных. Если данные не совпадают - писать @mrkirill1232
                Начнем...
                =========
                ГДР - Гранично Допустимі Рівні - напруженість електричного поля, що виражається середнбоквадратичним значенням і рівень поверхневої
                Густини Потоку Енергії (ГПЕ), який виражається середнім значенням, визначаються залежно від частоти і режиму вимірювання;
                це такі рівні Електро Магнітного Випромінювання РадіоЧастотного-діапазону, які на протязі всього життя (для населення)
                та 50 років праці (для робітників) не будуть змінювати стан їхнього здоров'я не будуть впливати на функції організму та працездатності.
                =========
                ГПЕ - Густина Потоку Енергії
                =========""");
        System.out.print("\n");
        System.out.println("Початкові дані. Етап 1. Оцінка величини енергетичного навантаження");
        System.out.println("Вихідні дані для одного джерела (задачи 1 та 2)");
        System.out.println("Варіант: " + num);
        switch (pre_one)
        {
            case 1:
                System.out.println("Частота: f = " + table1[num][1] + " МГц");
                break;
            case 0:
                System.out.println("Частота: f = " + table1[num][1] + " кГц");
                break;
        }
        switch (pre_two)
        {
            case 0:
                System.out.println("ГПЕ, Е або Н -фактичні значення: ГПЕ = " + table1[num][2] + " мВт/м^2");
                break;
            case 1:
                System.out.println("ГПЕ, Е або Н -фактичні значення: ГПЕ = " + table1[num][2] + " Вт/м^2");
                break;
            case 2:
                System.out.println("ГПЕ, Е або Н -фактичні значення: E = " + table1[num][2] + " В/м");
                break;
            case 3:
                System.out.println("ГПЕ, Е або Н -фактичні значення: H = " + table1[num][2] + " А/м");
                break;
        }
        System.out.println("=====");
        System.out.println("Розв'язок");
        System.out.println("За таблицею №6 знаходемо значення ЕНгдр для нашої задачі;");
        switch (pre_two)
        {
            case 0:
                System.out.println("Час опромінення T = " + table1[num][6] + " год");
                System.out.println("ГПЕ, Е або Н -фактичні значення: ГПЕ = " + table1[num][2] + " мВт/м^2");
                System.out.println("W_гдр = K * ( ЕН_w_гдр / T );");
                System.out.println("K = 1 ( для антен, що не обертаються та не сканують )");
                System.out.println("ЕН_w_гдр = " + ENgdr + " Вт * год / м^2");
                System.out.println("Переводимо значення ГПЕ з мВт в Вт ( умжножаем на 0.001 )");
                ENfact1_1 = ENgdr/table1[num][6];
                System.out.println("W_гдр = 1 * ( " + ENgdr + " / " + table1[num][6] + " ) = " + ENfact1_1 + " Вт/м^2");
                System.out.println("K = ГПЕ / W_гдр = " + String.format("%.2f",table1[num][2]*0.001) + " / " + ENfact1_1 + " = " + String.format("%.2f",table1[num][2]*0.001 / ENfact1_1));
                System.out.println("Відповідь: Перевищення в " + String.format("%.2f",table1[num][2]*0.001 / ENfact1_1) + " разів!");
                break;
            case 1:
                System.out.println("Час опромінення T = " + table1[num][6] + " год");
                System.out.println("ГПЕ, Е або Н -фактичні значення: ГПЕ = " + table1[num][2] + " Вт/м^2");
                System.out.println("W_гдр = K * ( ЕН_w_гдр / T );");
                System.out.println("K = 1 ( для антен, що не обертаються та не сканують )");
                System.out.println("ЕН_w_гдр = " + ENgdr + " Вт * год / м^2");
                ENfact1_1 = ENgdr/table1[num][6];
                System.out.println("W_гдр = 1 * ( " + ENgdr + " / " + table1[num][6] + " ) = " + ENfact1_1 + " Вт/м^2");
                System.out.println("K = ГПЕ / W_гдр = " + table1[num][2] + " / " + ENfact1_1 + " = " + table1[num][2] / ENfact1_1);
                System.out.println("Відповідь: Перевищення в " + table1[num][2] / ENfact1_1 + " разів!");
                break;
            case 2:
                System.out.println("ГПЕ, Е або Н -фактичні значення: E = " + table1[num][2] + " В/м");
                System.out.println("ЕН_фактичне = Е^2 * T = " + table1[num][2] + "^2 * " + table1[num][6] + " = "
                + Math.pow(table1[num][2],2) + " * " + table1[num][6] + " = " + Math.pow(table1[num][2],2)*table1[num][6] + " (В/м)^2 * год");
                ENfact1_1 = Math.pow(table1[num][2],2)*table1[num][6];
                System.out.println("ЕН_гдр = " + ENgdr + " (В/м)^2 * год");
                System.out.println("К = ЕН_фактичне / ЕН_гдр = ( " + ENfact1_1 + " / " + ENgdr + " ) = " + ENfact1_1 / ENgdr + " ");
                System.out.println("Відповідь: Перевищення в " + ENfact1_1 / ENgdr + " разів!");
                break;
            case 3:
                System.out.println("Час опромінення T = " + table1[num][6] + " год");
                System.out.println("ГПЕ, Е або Н -фактичні значення: H = " + table1[num][2] + " А/м");
                ENfact1_1 = Math.sqrt(ENgdr / table1[num][6]);
                System.out.println("Н_гдр = √( ЕН_нгдр / Т ) = √( " + ENgdr + " / " + table1[num][6] + " ) = " + ENfact1_1 + " A/м");
                System.out.println("К =  ЕН_нгдр / Н_гдр= ( " + table1[num][2] + " / " + ENfact1_1 + " ) = " + table1[num][2]  / ENfact1_1 + " ");
                System.out.println("Відповідь: Перевищення в " + table1[num][2] / ENfact1_1  + " разів!");
                break;
        }


        Two();
    }

    public static void Two()
    {
        double local_wire = 1.0;
        double local_r;
        System.out.println("=====");
        System.out.println("Вихідні дані для другого джерела(задача 2)");
        switch (pre_thr)
        {
            case 0:
                System.out.println("Довжина хвилі λ = " + table1[num][3] + " дм");
                break;
            case 1:
                System.out.println("Довжина хвилі λ = " + table1[num][3] + " см");
                break;
        }
        System.out.println("Потужність Р = " + table1[num][4] + " Вт");
        if (pre_for ==1) {
            System.out.println("Відстань R = " + table1[num][5] + " см");
            local_wire = 0.01;
        }
        else if (pre_for == 0) {
            System.out.println("Відстань R = " + table1[num][5] + " м");
        }
        local_r = table1[num][5]*local_wire;
        System.out.println("Час опромінення T = " + table1[num][6] + " год");
        System.out.println("=====");
        System.out.println("Розв'язок");
        System.out.println("З таблиці №5 беремо формулу для визначення ГПЕ, та адаптуємо під нашу задачу:");
        double GPE = table1[num][4] / ( 4 * 3.14 * Math.pow(local_r,2));
        GPE_s = String.format("%.2f", (GPE));
        double ENfact1_2_data =  GPE * table1[num][6];
        ENfact1_2 = String.format("%.2f", (ENfact1_2_data));
        System.out.println("ГПЕ = P / ( 4 * π * R^2 ) = " + table1[num][4] + " / ( 4 * 3.14 * " +  String.format("%.2f", (Math.pow(local_r,2))) + " ) = " + GPE_s + " ( Вт ) / м^2");
        System.out.println("ЕН_фактичне = ГПЕ * T = " + GPE_s + " * " + table1[num][6] + " = " + ENfact1_2 + " ( Вт * год ) / м^2");
        System.out.println("ЕН_ГПЕ_гдр = 2 ( Вт * год ) / м^2 (норма)");
        double S1_2_data = ENfact1_2_data / 2;
        S1_2 = String.format("%.2f", (S1_2_data));
        System.out.println("S = ЕН_гпе фактичне / ЕН_ГПЕ_гдр = " + ENfact1_2 + " / 2 = " + S1_2);
        System.out.println("=====");
        System.out.println("Висновок: в таких умовах працювати не можна. Треба розробляти засоби профілактики!");
        System.out.println("=====");
        System.out.println("Задача 3. Оцінка Енергетичного Випромінювання від двох джерел.");
        System.out.println("(( ЕН_факт / ЕН_гдр ) + ( ЕН_гпе фактичне / ЕН_ГПЕ_гдр )) =< 1");
        System.out.println("( " + ENfact1_1/ENgdr + " + " + S1_2 + " ) =< 1");
        double hehe = (ENfact1_1/ENgdr)+S1_2_data;
        System.out.println("( " + String.format("%.2f", (hehe))  + " ) =< 1");
        System.out.println("=====");
        Three();
    }
    public static void Three()
    {
        double local_wire = 1.0;
        double local_lambda;
        int c = 300000000;
        System.out.println("=====");
        System.out.println("Початкові дані (Етап 2). Розробка профілактичних заходів");
        System.out.println("=====");
        System.out.println("Визначити необхідну товщину захисного екрану з алюмінію:");
        System.out.println("№ варіанту: " + num);
        if ( pre_fif == 0)
        {
            System.out.println("Довжина хвилі λ: " + table2[num][1] + " см;");
            local_wire = 0.01;
        }
        else if ( pre_fif == 1)
        {
            System.out.println("Довжина хвилі λ: " + table2[num][1] + " м;");
            local_wire = 1.0;
        }
        else if ( pre_fif == 2)
        {
            System.out.println("Довжина хвилі λ: " + table2[num][1] + " км;");
            local_wire = 1000.0;
        }
        System.out.println("(сигма) σ: " + table2[num][2] + " (Ом*м^-1)");
        System.out.println("(мю) μ: " + table2[num][3] + "*10^(-7) (Гн/м)");
        System.out.println("=====");
        System.out.println("Визначити необхідну довжину трубки перетину:");
        /*
        КР - 1
        КВ - 2
        ПР - 3
         */
        if ( table2[num][4] == 1 )
        {
            System.out.println("Перетин: Круглий (КР)");
        }
        else if ( table2[num][4] == 2 )
        {
            System.out.println("Перетин: Квадратний (КВ)");
        }
        else if ( table2[num][4] == 3 )
        {
            System.out.println("Перетин: Прямокутний (ПР)");
        }
        System.out.println("Діаметр D: " + table2[num][5] + " (см)");
        System.out.println("Еффективність Р: " + table2[num][6] + " (дБ)");
        System.out.println("=====");
        System.out.println("Визначити необхідну відстань від скануючої антени");
        System.out.println("Потужність Р: " + table2[num][7] + " (Вт)");
        System.out.println("T = " + table2[num][8] + " (год)");
        System.out.println("g-* = " + table2[num][9] + " ");
        System.out.println("№d - Діапазон РЧ = " + table2[num][10] + " ");
        System.out.println("=====");
        System.out.println("Результати розрахунків. Етап 1. Оцінка величини енергетичного навантаження Задача 1 (одне джерело)");
        System.out.println("Визначити необхідну товщину захисного екрану з алюмінію:");
        System.out.println("№ варіанту: " + num);
        if ( pre_fif == 0)
        {
            System.out.println("Довжина хвилі λ: " + table2[num][1] + " см;");
            local_wire = 0.01;
        }
        else if ( pre_fif == 1)
        {
            System.out.println("Довжина хвилі λ: " + table2[num][1] + " м;");
            local_wire = 1.0;
        }
        else if ( pre_fif == 2)
        {
            System.out.println("Довжина хвилі λ: " + table2[num][1] + " км;");
            local_wire = 1000.0;
        }
        local_lambda = table2[num][1] * local_wire;
        System.out.println("(сигма) σ: " + table2[num][2] + " (Ом*м^-1)");
        System.out.println("(мю) μ: " + table2[num][3] + "*10^(-7) (Гн/м)");
        System.out.println("=====");
        System.out.println("Розв'язок");
        System.out.println("d => r = 1 / ( √((ω*μ)/σ) | d больше равно r равно 1 делённое на корень из произведения омеги на мю и делённое на сигма");
        System.out.println("Если нужно - переводим значения в метры (км в метры или сантиметры в метры. 1 км - 1000 метров; 1 см - 0.01 метров;");
        System.out.println("ω = 2 * π * f");
        System.out.println("f = c / λ | с = скорость света ( 300 000 000 метров*секунду ) ");
        double f = c/local_lambda;
        System.out.println("f = 300 000 000 / " + local_lambda + " = " + f + " м*с | Е - это умножение 10 в степени, значение которой после буквы Е");
        double ω = 2*3.14*f;
        String S_ω = String.format("%.2f", (ω));
        System.out.println("ω = 2 * 3.14 * " + f + " = " + S_ω + " м*с");
        double local_1 = Math.sqrt((ω*(table2[num][3]*Math.pow(10,-7)))/table2[num][2]);
        String S_local_1 = String.format("%.2f", (local_1));
        System.out.println("√((ω*μ)/σ) = √((" + S_ω + " * " + table2[num][3] + "*10^(-7)) / " + table2[num][2] + " = " + S_local_1);
        double d =  1/local_1;
        String S_d = String.format("%.3f", (d));
        System.out.println("d = 1 / " + S_local_1 + " = " + S_d + " (м)");
        System.out.println("=====");
        System.out.println("Визначити необхідну довжину трубки перетину:");
        if ( table2[num][4] == 1 )
        {
            System.out.println("Перетин: Круглий (КР)");
        }
        else if ( table2[num][4] == 2 )
        {
            System.out.println("Перетин: Квадратний (КВ)");
        }
        else if ( table2[num][4] == 3 )
        {
            System.out.println("Перетин: Прямокутний (ПР)");
        }
        System.out.println("Діаметр D: " + table2[num][5] + " (см)");
        System.out.println("Еффективність Р: " + table2[num][6] + " (дБ)");
        System.out.println("=====");
        System.out.println("Розв'язок");
        double local_E = 0;
        if ( table2[num][4] == 1 )
        {
            System.out.println("Перетин: Круглий (КР)");
            local_E = 32 / table2[num][5];
            String S_local_E = String.format("%.1f", (local_E));
            System.out.println("Е = 32 / D (дБ/см) = 32 / " + table2[num][5] + " = " + S_local_E + " дБ/см");
        }
        else if ( table2[num][4] == 2 || table2[num][4] == 3 )
        {
            System.out.println("Перетин: Квадратний (КВ) або Прямокутний (ПР)");
            local_E = 27 / table2[num][5];
            String S_local_E = String.format("%.1f", (local_E));
            System.out.println("Е = 27 / D (дБ/см) = 27 / " + table2[num][5] + " = " + S_local_E + " дБ/см");
        }
        String S_local_E = String.format("%.1f", (local_E));
        System.out.println("Для зниження РадіоХвиль на " + S_local_E + " дБ/см - необхідна трубка в 1 см.");
        System.out.println("Для зниження РадіоХвиль на " + table2[num][6] + " дБ/см - необхідна трубка в Х см.");
        System.out.println("1 см = " + S_local_E + " дБ/см");
        System.out.println("Х см = " + table2[num][6] + " дБ/см");
        System.out.println("Х * " + S_local_E + " = " + table2[num][6]);
        double local_x = table2[num][6] / local_E;
        String S_local_x = String.format("%.1f", (local_x));
        System.out.println("Х = " + S_local_x + " см");
        Four();
    }
    public static void Four()
    {
        System.out.println("=====");
        System.out.println("Задача 2 (безпечна відстань) - Визначити необхідну відстань від скануючої антени");
        System.out.println("Визначити необхідну відстань від скануючої антени ( для населення )");
        System.out.println("Потужність Р: " + table2[num][7] + " (Вт)");
        System.out.println("T = " + table2[num][8] + " (год)");
        System.out.println("g-* = " + table2[num][9] + " ");
        System.out.println("№d - Діапазон РЧ = " + table2[num][10] + " ");
        System.out.println("=====");
        System.out.println("Розв'язок");
        System.out.println("За таблицею №2, знаходимо в колонці з діапазонами, даний нам на початку діапазон та виписуємо значення ГДР для населення.");
        double local_diap;
        if ( table2[num][10] == 9){
            local_diap = 10;
        }
        else {
            local_diap = 2.5;
        }
        System.out.println("ГПЕ_гдр (для населення) = " + String.format("%.2f", (local_diap)) + " мкВт/см^2 = " + String.format("%.2f", (local_diap/0.0001)) + " мкВт/м^2");
        double local_r_2_3 = ( (table2[num][7] / 0.0001 ) * table2[num][9] ) / (4 * 3.14 * local_diap/0.0001);
        String S_local_r_2_3 = String.format("%.2f", (local_r_2_3));
        String S_sqrt_local_r_2_3 = String.format("%.2f", (Math.sqrt(local_r_2_3)));
        System.out.println("P = " + table2[num][7] + " мкВт/см^2 = " + ( table2[num][7] /0.0001 ) + " мкВт/м^2");
        System.out.println("ГПЕ = ( P * g ) / ( 4 * π * R^2 ) " );
        System.out.println("R^2 = ( P * g ) / ( 4 * π * ГПЕ ) => ( " + ( table2[num][7] /0.0001 ) + " * " + table2[num][9] + " ) / 4 * 3.14 * " + String.format("%.2f", (local_diap/0.0001)) + " = " + S_local_r_2_3 + " м^2");
        System.out.println("R = √" + S_local_r_2_3 + " = " + S_sqrt_local_r_2_3 + " м");
        System.out.println("=====");
        System.out.println("Визначити необхідну відстань від скануючої антени ( для працюючих )");
        System.out.println("Потужність Р: " + String.format("%.2f", (table2[num][7])) + " (Вт)");
        System.out.println("T = " + table2[num][8] + " (год)");
        System.out.println("g-* = " + table2[num][9] + " ");
        System.out.println("№d - Діапазон РЧ = " + table2[num][10] + " ");
        System.out.println("=====");
        System.out.println("Розв'язок");
        System.out.println("За таблицею №2, знаходимо в колонці з діапазонами, даний нам на початку діапазон та виписуємо значення ГДР для працюючих.");
        if ( table2[num][10] == 9){
            local_diap = 10;
        }
        else {
            local_diap = 10;
        }
        System.out.println("ГПЕ_гдр (для працюючих) = " + String.format("%.2f", (local_diap)) + " мкВт/см^2 = " + String.format("%.2f", (local_diap/0.0001)) + " мкВт/м^2 = " + String.format("%.2f", ((local_diap/0.0001)*0.000001)) + " мкВт/м^2");
        System.out.println("P = " + table2[num][7] + " мкВт/см^2 => " + String.format("%.2f", ((table2[num][7]/0.0001)*0.000001)) + " Вт/м^2" );
        local_r_2_3 = ( ((table2[num][7]/0.0001)*0.000001) * table2[num][9] ) / (4 * 3.14 * 2 / ((local_diap/0.0001)*0.000001));
        S_local_r_2_3 = String.format("%.2f", (local_r_2_3));
        S_sqrt_local_r_2_3 = String.format("%.2f", (Math.sqrt(local_r_2_3)));
        System.out.println("ЕН = 2 Вт*год/м^2 | з Таблиці 6" );
        System.out.println("ГПЕ = ( ЕН / T ) = ( 2 / " + table2[num][8] + " ) = " + String.format("%.2f",(2 / table2[num][8])) + " Вт/м^2");
        System.out.println("R^2 = ( P * g ) / ( 4 * π * ГПЕ ) => ( " + String.format("%.2f", (table2[num][7])) + " * " + table2[num][9] + " ) / 4 * 3.14 * " + String.format("%.2f", (((local_diap/0.0001)*0.000001))) + " = " + S_local_r_2_3 + " м^2");
        System.out.println("R = √" + S_local_r_2_3 + " = " + S_sqrt_local_r_2_3 + " м");
        Final();
    }

    public static void Final()
    {
        System.out.println("=====");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці оцінку рівнів Електро Магнітного Випромінювання РадіоЧастотного-діапазону та основні принципи захисту персоналу та населення в галузі телекомунікацій.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе
                    П_загальний_загальний - тут нижний индекс и еще нижнее индекс;
                    Работа делалась примерно по тому принципу, что и на занятии""");
        System.out.print("\n");
    }
    public static void main()
    {
        System.out.print("""
                Практичне Заняття № 10\040
                «Оцінка рівнів Електро Магнітного Випромінювання РадіоЧастотного-діапазону та основні принципи захисту персоналу та населення в галузі телекомунікацій.»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        Zero();
    }
}
