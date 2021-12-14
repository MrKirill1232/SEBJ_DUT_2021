package labs;

import java.util.Scanner;

public class Lab_04_four {
    static int num;

    static double D;
    static double Q;
    static double T;
    static double R;
    static double D_5;
    static double P;

    static String second_final_form;
    static String third_final_form;
    static String fourth_final_form;
    static String fifth_final_form;

    static final double[][] task_1 = new double[][]
            {
                    /*
                    {	0   ,   Q   ,	T	,	R	},*/
                    {	0   ,   1   ,	2	,	3	},
                    {	1	,	3	,	3	,	1	},
                    {	2	,	2	,	4	,	2	},
                    {	3	,	4	,	5	,	1	},
                    {	4	,	3	,	6	,	2	},
                    {	5	,	2	,	2	,	1	},
                    {	6	,	5	,	3	,	3	},
                    {	7	,	4	,	6	,	6	},
                    {	8	,	3	,	4	,	2	},
                    {	9	,	2	,	5	,	1	},
                    {	10	,	6	,	1	,	3	},
                    {	11	,	7	,	6	,	1	},
                    {	12	,	5	,	7	,	2	},
                    {	13	,	5	,	8	,	1	},
                    {	14	,	2	,	2	,	1	},
                    {	15	,	2	,	3	,	1	}
            };
    static final double[][] task_2 = new double[][]
            {
                    /*
                    {	0   ,   T   ,	R	},*/
                    {	0	,	1	,	2	},
                    {	1	,	27	,	1	},
                    {	2	,	30	,	2	},
                    {	3	,	28	,	1	},
                    {	4	,	35	,	2	},
                    {	5	,	28	,	1	},
                    {	6	,	31	,	2	},
                    {	7	,	26	,	1	},
                    {	8	,	32	,	2	},
                    {	9	,	27	,	1	},
                    {	10	,	20	,	2	},
                    {	11	,	15	,	1	},
                    {	12	,	40	,	2	},
                    {	13	,	35	,	1	},
                    {	14	,	30	,	2	},
                    {	15	,	25	,	1	}
            };
    static final double[][] task_3 = new double[][]
            {
                    /*
                    {	0   ,   R   ,	Q	},*/
                    {	0	,	1	,	2	},
                    {	1	,	1	,	5	},
                    {	2	,	2	,	6	},
                    {	3	,	3	,	7	},
                    {	4	,	1	,	8	},
                    {	5	,	2	,	9	},
                    {	6	,	3	,	10	},
                    {	7	,	4	,	15	},
                    {	8	,	2	,	16	},
                    {	9	,	3	,	17	},
                    {	10	,	5	,	15	},
                    {	11	,	2	,	16	},
                    {	12	,	3	,	17	},
                    {	13	,	6	,	5	},
                    {	14	,	2	,	6	},
                    {	15	,	3	,	7	}
            };
    static final double[][] task_4 = new double[][]
            {
                    /*
                    {	0   ,   T   },*/
                    {	0	,	1	},
                    {	1	,	15	},
                    {	2	,	20	},
                    {	3	,	25	},
                    {	4	,	30	},
                    {	5	,	25	},
                    {	6	,	15	},
                    {	7	,	20	},
                    {	8	,	25	},
                    {	9	,	30	},
                    {	10	,	25	},
                    {	11	,	15	},
                    {	12	,	20	},
                    {	13	,	25	},
                    {	14	,	30	},
                    {	15	,	25	}
            };
    static final double[][] task_5 = new double[][]
            {
                    /*
                    {	0   ,   T   },*/
                    {	0	,	1	},
                    {	1	,	1	},
                    {	2	,	2	},
                    {	3	,	3	},
                    {	4	,	4	},
                    {	5	,	5	},
                    {	6	,	6	},
                    {	7	,	7	},
                    {	8	,	8	},
                    {	9	,	7	},
                    {	10	,	6	},
                    {	11	,	5	},
                    {	12	,	4	},
                    {	13	,	3	},
                    {	14	,	2	},
                    {	15	,	1	}
            };
    static final double[][] task_6 = new double[][]
            {
                    /*
                    {	0   ,   T   },*/
                    {	0	,	1	},
                    {	1	,	15	},
                    {	2	,	10	},
                    {	3	,	20	},
                    {	4	,	25	},
                    {	5	,	30	},
                    {	6	,	5	},
                    {	7	,	10	},
                    {	8	,	15	},
                    {	9	,	20	},
                    {	10	,	25	},
                    {	11	,	30	},
                    {	12	,	25	},
                    {	13	,	20	},
                    {	14	,	15	},
                    {	15	,	10	}
            };
    public static void First() {
        System.out.print("\n==\n");
        System.out.print("Задача № 1\n");
        System.out.print("«Оцінка дози випромінювання.»\n");
        System.out.print("Дано:");
        System.out.print("\n    Q = " + task_1[num][1] + " мгекв.Ra");
        System.out.print("\n    T = " + task_1[num][2] + " год/добу");
        System.out.print("\n    R = " + task_1[num][3] + " м.");
        System.out.print("\n---------------------");
        System.out.print("\nЗнайти:");
        System.out.print("\n    D_фактичне - ? бер");
        System.out.print("\n---------------------");
        System.out.print("\nРозв'язок:");
        int t = (int) task_1[num][2] * 50 * 5;
        D = ((int) task_1[num][2] * 8.4 * t) / ((int) task_1[num][1] * Math.pow(10, 4));
        System.out.print("\n    kγ = 8,4, так як активність радіонукліда виражена у мг-еквівалентах Радія");
        System.out.print("\n    t = T * (кіл-ть неділь в році) * (кількість робочіх днів в неділі) = " + (int) task_1[num][2] + " * ( 50 ) * ( 5 ) = " + t + " (год/рік) ");
        System.out.print("\n    D_фактичне = ( Q * kγ * t ) / ( R^2 * 10^4 );");

        System.out.print("\n    D_фактичне = ("+ (int) task_1[num][2] + " * 8.4 * " + t + ") / ( " + (int) task_1[num][1] + " * 10^4 "
                + ((int) task_1[num][2] * 8.4 * t) + " / " + ((int) task_1[num][1] * Math.pow(10, 4)) + " = " + D + " бер;");
        if (D < 2)
        {
            System.out.print(" бер ↓\n    D_limit = 2 бер;");
        System.out.print("\n\nВідповідь: D_фактичне в допустимих значеннях і меньше за D_lim.");
        }
        else {
            System.out.print(" бер ↑\n    D_limit = 2 бер;");
            System.out.print("\n\nВідповідь: D_фактичне не э допустимим і більше за D_lim.");
        }
        Second();
    }
    public static void Second() {
        System.out.print("\n==\n");
        System.out.print("Задача № 2\n");
        System.out.print("«Знайти безпечну активність радіонукліду, якщо працюють з Co^60 - Kγ=13,1.»\n");
        System.out.print("Дано:");
        System.out.print("\n    T = " + task_2[num][1] + " год/тиждень");
        System.out.print("\n    R = " + task_2[num][2] + " м.");
        System.out.print("\n    kγ = 13,1 (СО^60 - Кобальт)");
        System.out.print("""

                    D_le = 2 бер\s
                * ( 1 – ліміт ефективної дози за рік для категорії А (особи, які постійно або тимчасово працюють безпосередньо з джерелами іонізуючих випромінювань);""");
        System.out.print("\n---------------------");
        System.out.print("\nЗнайти:");
        System.out.print("\n    Q_безпечне - ? бер");
        System.out.print("\n---------------------");
        System.out.print("\nРозв'язок:");
        Q = ( ( 2 * Math.pow((int) task_2[num][2],2) * Math.pow(10, 4) ) / ( 13.1 * (int) task_2[num][1] * 50 * 5 ) );
        System.out.print("\n    (D_le / Q_Безпечне ) = ( kγ * t ) / ( R^2 * 10^4 ) = > Q_Безпечне = ( D_le * R^2 * 10^4 ) / ( kγ * t )");
        System.out.print("\n    t = (кіл-ть неділь в році) * (кількість робочіх днів в неділі) * T = 5 * 50 * " + (int) task_2[num][1] + " = " + (int) task_2[num][1] * 50 * 5 + " год/рік");
        System.out.print("\n    Q_Безпечне = ( 2 * " + (int) task_2[num][2] + "^2 * 10^4 ) / ( 13,1 * " + (int) task_2[num][1] + " * 50 * 5 ) = "
                        + ( 2 * (int) Math.pow(task_2[num][2],2) * Math.pow(10, 4) ) + " / " + ( 13.1 * (int) task_2[num][1] * 50 * 5 ) + " = ");
        second_final_form = String.format("%.3f", Q);
        System.out.print(second_final_form + " мКи.");
        Third();
    }
    public static void Third() {
        System.out.print("\n==\n");
        System.out.print("Задача № 3\n");
        System.out.print("«Знайти безпечний час роботи на РНО (в годинах за тиждень)»\n");
        System.out.print("Дано:");
        System.out.print("\n    R = " + task_3[num][1] + " м.");
        System.out.print("\n    Q = " + task_3[num][2] + " мгекв.Ra");
        System.out.print("""

                    kγ = 8.4 (Радій)
                * ( Так як активність радіонукліда виражена у мг-еквівалентах Радія );""");
        System.out.print("""

                    D_le = 2 бер\s
                * ( ліміт ефективної дози за рік для осіб, які постійно або тимчасово працюють безпосередньо з джерелами іонізуючих випромінювань);""");
        System.out.print("\n---------------------");
        System.out.print("\nЗнайти:");
        System.out.print("\n    T_безпечне - ? год/доб");
        System.out.print("\n---------------------");
        System.out.print("\nРозв'язок:");
        T = ( ( ( 2 * Math.pow(task_3[num][1],2) * Math.pow(10,4) / ( task_3[num][2] * 8.4 ) ) / (50 * 5) ) );
        System.out.print("\n    D_le = ( Q * kγ * t ) / ( R^2 * 10^4 ) => t = ( D_le * R^2 * 10^4 ) / ( Q * kγ );");
        System.out.print("\n    t = ( 2 * " + task_3[num][1] + "^2 * 10^4 ) / ( " + task_3[num][2] + " * 8.4 ) = ");
        String local_1 = String.format("%.1f",( task_3[num][2] * 8.4 ));
        System.out.print(( 2 * Math.pow(task_3[num][1],2) * Math.pow(10,4) + " / " + local_1 ) + " = ");
        String local_2 = String.format("%.3f", ( 2 * Math.pow(task_3[num][1],2) * Math.pow(10,4) / ( task_3[num][2] * 8.4 ) ));
        System.out.print(( local_2 + " год / рік;"));
        System.out.print("\n    T = t / (кіл-ть неділь в році) * (кількість робочіх днів в неділі) = " + local_2 + " / ( 5 * 50 ) = ");
        third_final_form = String.format("%.3f", T);
        System.out.print(third_final_form + " год/доб;");
        Fourth();
    }
    public static void Fourth() {
        System.out.print("\n==\n");
        System.out.print("Задача № 4\n");
        System.out.print("«Знайти безпечну відстань від джерела ІВ, " +
                "якщо працюють із радіоактивним йодом – 131, " +
                "вийнятого із захисного контейнера, " +
                "активність складає 250 мКu. Kγ = 2,15.»\n");
        System.out.print("Дано:");
        System.out.print("\n    T = " + task_4[num][1] + " год/тиж.");
        System.out.print("\n    Q = 250 мКи.");
        System.out.print("\n    kγ = 2,15 (I^131 - Йод)");
        System.out.print("""

                    D_le = 2 бер\s
                * ( ліміт ефективної дози за рік для осіб, які постійно або тимчасово працюють безпосередньо з джерелами іонізуючих випромінювань);""");
        System.out.print("\n---------------------");
        System.out.print("\nЗнайти:");
        System.out.print("\n    R_безпечне - ? ");
        System.out.print("\n---------------------");
        System.out.print("\nРозв'язок:");
        R = ( Math.sqrt( (250 * 2.15 * (task_4[num][1] * 50) ) / ( 2 * Math.pow(10,4) ) ) );
        System.out.print("\n    D_le = ( Q * kγ * t ) / ( R^2 * 10^4 ) => R^2 = ( Q * kγ * t ) / ( D_le * 10^4 ) => R = √(( Q * kγ * t ) / ( D_le * 10^4 ))");
        System.out.print("\n    t = T * (кіл-ть неділь в році) = ( " + task_4[num][1] + " * 50 ) = " + (task_4[num][1] * 50) + " год/доб;");
        System.out.print("\n    R = √( ( 250 * 2.15 * " + (task_4[num][1] * 50) + " ) / 2 * 10^4 ) = "  );
        System.out.print("√(" + (250 * 2.15 * (task_4[num][1] * 50) ) + " / " + 2 * Math.pow(10,4) + ") = "  );
        fourth_final_form = String.format("%.3f", R);
        System.out.print(fourth_final_form + "");
        Fifth();
    }
    public static void Fifth() {
        System.out.print("\n==\n");
        System.out.print("Задача № 5\n");
        System.out.print("«Оцінка дози випромінювання, якщо за даними, " +
                "фактична потужність дорівнює 5 мбер/годину.»\n");
        System.out.print("Дано:");
        System.out.print("\n    T = " + task_5[num][1] + " год/рік.");
        System.out.print("\n    P = 5 мбер/год.");
        System.out.print("\n---------------------");
        System.out.print("\nЗнайти:");
        System.out.print("\n    D_фактичне - ? бер");
        System.out.print("\n---------------------");
        System.out.print("\nРозв'язок:");
        D_5 = ( ( 5 * ( task_5[num][1] * 50 * 5 ) ) / 1000 );
        System.out.print("\n    P = ( D / t ) => D = P * t;");
        System.out.print("\n    t = T * (кіл-ть неділь в році) * (кіл-ть днів в неділі)  = ( " + task_5[num][1] + " * 50 * 5 ) = " + (task_5[num][1] * 50 * 5) + " год/доб;");
        System.out.print("\n    D = 5 * " + task_5[num][1] * 50 * 5 + " = " );
        System.out.print(D_5*1000 + " мбер => " + D_5*1000 + " / 1000 = " + D_5 + " бер;");
        Sixth();
    }
    public static void Sixth() {
        System.out.print("\n==\n");
        System.out.print("Задача № 6\n");
        System.out.print("«Знайти допустиму потужність дози (мбер/годину).»\n");
        System.out.print("Дано:");
        System.out.print("\n    T = " + task_6[num][1] + " год/тиж.");
        System.out.print("""

                    D_le = 2 бер\s
                * ( ліміт ефективної дози за рік для осіб, які постійно або тимчасово працюють безпосередньо з джерелами іонізуючих випромінювань);""");
        System.out.print("\n---------------------");
        System.out.print("\nЗнайти:");
        System.out.print("\n    P_безпечне - ? мбер/год");
        System.out.print("\n---------------------");
        System.out.print("\nРозв'язок:");
        P = ( (2 * 1000) / ( task_6[num][1] * 50 ) );
        System.out.print("\n    P = ( D_le / t );");
        System.out.print("\n    D_le = 2 (бер) * 1000  = " + 2*1000 + " мбер;");
        System.out.print("\n    t = " + task_6[num][1] + " * 50 (кіл-ть неділь в році) = " + (task_6[num][1] * 50 ) + " год/рік;");
        System.out.print("\n    P = 2000 / " + ( task_6[num][1] * 50 ) + " = " + P + " мбер/год.");
        Final();
    }
    public static void Final()
    {
        System.out.print("\n==");
        System.out.print("\nВисновки:");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці як розрахувати оціночну дозу випромінювання, безпечний період впливу радіонукліда та безпечну відстань роботи від джерела радіонукліда.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    Работа делалась по примеру с пары, то-есть на паре не вычислялись насколько толстый защитный экран и тд.
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе
                    √ - в данном случае все под корень уходит""");
        System.out.print("\n");
    }
    public static void main()
    {
        System.out.print("""
                Практичне Заняття № 4\040
                «Радіаційна небезпека та протирадіаційний захист на об’єктах з радіаційно-ядерними технологіями.»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        if (num > 15)
        {
            num = num - 15;
        }
        First();
    }
}
