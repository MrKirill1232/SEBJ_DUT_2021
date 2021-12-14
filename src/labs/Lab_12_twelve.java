package labs;

import java.util.Scanner;

public class Lab_12_twelve {

    /* Сохраняем переменную варианта */
    private static int num;

    /* Сохраняем переменную категорії приміщень */
    private static int category;

    static final double[][] tab_1_values = new double[][]
            {
                    {	0	,	1	,	2	    ,	3	    ,	4	    ,	5	,	6	},
                    {	1	,	1 	,	4.0 	,	46.0 	,	3.9 	,	150	,	7.5	},
                    {	2	,	2	,	5.5 	,	10.0 	,	10.4 	,	230	,	12.0},
                    {	3	,	3 	,	6.3 	,	16.75 	,	2.7 	,	180	,	9.3	},
                    {	4	,	4 	,	7.4 	,	24.3 	,	7.4 	,	90	,	11.4},
                    {	5	,	5 	,	8.7 	,	33.52 	,	5.6 	,	250	,	15.0},
                    {	6	,	6 	,	12.8 	,	14.0 	,	7.8 	,	170	,	6.2	},
                    {	7	,	7 	,	14.5 	,	10.0 	,	9.4 	,	240	,	10.0},
                    {	8	,	8	,	16.9 	,	14.0 	,	10.2 	,	89	,	9.8	},
                    {	9	,	3 	,	27.2 	,	16.75 	,	5.8 	,	74	,	11.4},
                    {	10	,	4 	,	11.4 	,	24.3 	,	4.4 	,	93	,	5.0	},
                    {	11	,	9	,	8.6 	,	27.67 	,	2.8 	,	38	,	3.5	},
                    {	12	,	10	,	23.2 	,	39.0 	,	3.1 	,	52	,	4.0	},
                    {	13	,	5 	,	26.0 	,	33.52 	,	13.4 	,	49	,	9.6	},
                    {	14	,	11 	,	400.0 	,	20.0 	,	17.6 	,	160	,	6.4	},
                    {	15	,	1 	,	27.2 	,	46.0 	,	21.7 	,	120	,	5.0	},
                    {	16	,	2	,	41.4 	,	10.0 	,	37.4 	,	210	,	7.1	},
                    {	17	,	3 	,	18.6 	,	16.75 	,	15.8 	,	87	,	6.0	},
                    {	18	,	4 	,	13.2 	,	24.3 	,	17.8 	,	49	,	4.3	},
                    {	19	,	5 	,	36.0 	,	33.52 	,	9.1 	,	92	,	3.4	},
                    {	20	,	6 	,	260.0 	,	14.0 	,	10.7 	,	187	,	6.2	},
                    {	21	,	7 	,	57.2 	,	10.0 	,	15.8 	,	165	,	7.5	},
                    {	22	,	8	,	24.0 	,	14.0 	,	4.9 	,	174	,	4.0	},
                    {	23	,	3 	,	35.5 	,	16.75 	,	12.6 	,	94	,	5.3	},
                    {	24	,	4 	,	56.3 	,	24.3 	,	13.1 	,	136	,	6.4	},
                    {	25	,	9	,	17.4 	,	27.67 	,	13.9 	,	188	,	7.0	},
                    {	26	,	10	,	28.7 	,	39.0 	,	6.4 	,	134	,	8.5	},
                    {	27	,	5 	,	72.8 	,	33.52 	,	12.7 	,	173	,	9.0	},
                    {	28	,	11 	,	64.5 	,	20.0 	,	17.4 	,	248	,	3.3	}

            };

    static final String[] material_names =
            {
                    "Матеріал",
                    "Бензин",
                    "Сосна вологістю 12 %",
                    "Бавовна",
                    "Пластик",
                    "Гума",
                    "ДСП ( 417 кг*м^(-3) )",
                    "Тофробрикет",
                    "Торф кусковий",
                    "Склопластик",
                    "Пергамін",
                    "Вугілля"

            };
    static public void Zero(){
        double local = 0;
        local = ( 100 * tab_1_values[num][4] ) / tab_1_values[num][5];
        if ( (int)tab_1_values[num][1] == 1){
            category = 2;
        }
        else if ( (int)tab_1_values[num][1] == 2){
            category = 2;
        }
        else if ( (int)tab_1_values[num][1] == 3){
            category = 2;
        }
        else if ( (int)tab_1_values[num][1] == 4){
            category = 2;
        }
        else if ( (int)tab_1_values[num][1] == 5){
            category = 4;
        }
        else if ( (int)tab_1_values[num][1] == 6){
            category = 3;
        }
        else if ( (int)tab_1_values[num][1] == 7){
            category = 2;
        }
        else if ( (int)tab_1_values[num][1] == 8){
            category = 2;
        }
        else if ( (int)tab_1_values[num][1] == 9){
            category = 4;
        }
        else if ( (int)tab_1_values[num][1] == 10){
            category = 3;
        }
        else if ( (int)tab_1_values[num][1] == 11){
            category = 2;
        }

        First();
    }
    static public void First(){
        String tab_1_1 = "| %-30s | %-20s | %-20s | %-20s | %-20s | %-40s |%n";
        String ras_tab_1_1 = "+--------------------------------+----------------------+----------------------+----------------------+----------------------+------------------------------------------+";
        System.out.println(ras_tab_1_1);
        System.out.format(tab_1_1, "", "Кількість", "Нижня теплота", "Площа розміщення", "Площа приміщення", "Мінімальна відстань відповерхні");
        System.out.format(tab_1_1, "        Матеріал", "матеріалу,", "згоряння, Q^p_1,", "матеріалу, S, м^2", "S_прим., м^2", "матеріалупожежної навантаги до");
        System.out.format(tab_1_1, "", "G_i, кг,", "МДж/кг", "", "", "нижнього поясу ферм перекриття, Н, м");
        System.out.println(ras_tab_1_1);
        System.out.format(tab_1_1, material_names[(int)tab_1_values[num][1]], tab_1_values[num][2]+" кг", tab_1_values[num][3]+" МДж/кг", tab_1_values[num][4]+" м^2", (int)tab_1_values[num][5]+" м^2", tab_1_values[num][6]+" м");
        System.out.println(ras_tab_1_1);
        System.out.println("Величина пожежної навантаги => Q = G_i * Q^p_1 = " + tab_1_values[num][2] + " * " + tab_1_values[num][3] + " = " + String.format("%.2f",(tab_1_values[num][2]*tab_1_values[num][3])) + " МДж");
        System.out.println("Питома пожежна навантага    => g =   Q  /  S   = " + String.format("%.2f",(tab_1_values[num][2]*tab_1_values[num][3])) + " / " + tab_1_values[num][4] + " = " + String.format("%.2f", ((tab_1_values[num][2]*tab_1_values[num][3])/tab_1_values[num][4]))+ " МДж/м^2");
        Second();
    }

    static public void Second(){
        String ras_tab_2_1 = "+------------------------------------------+--------------------------------+-----------------------------------------------------------------------------------------------------------------------------------+";
        String ras_tab_2_2 = "|                                          |                                +--------------------------------+--------------------------------+--------------------------------+--------------------------------+";
        String ras_tab_2_3 = "+------------------------------------------+--------------------------------+--------------------------------+--------------------------------+--------------------------------+--------------------------------+";

        String tab_2_1 = "| %-40s | %-30s | %-129s |%n";
        String tab_2_2 = "| %-40s | %-30s | %-30s | %-30s | %-30s | %-30s |%n";

        System.out.println(ras_tab_2_1);
        System.out.format(tab_2_1, "", "", "Кількість засобів пожежогасіння");
        System.out.println(ras_tab_2_2);
        System.out.format(tab_2_2, "    Категорії", "Площа, приміщення", "", "", "", "");
        System.out.format(tab_2_2, "    приміщення", "що захищається, м^2", "Вуглекислотні", "Пінні вогнегасники", "Ящик з піском", "Повсть, повстина");
        System.out.format(tab_2_2, "", "", "вогнегасники", "(хім., пов., рідкі)", "вміщ. 0,5; 1 та 3 м3 і лопата", "або азбест (1х1; 2х1,5;2х2 м)");
        System.out.println(ras_tab_2_3);
        if ( category == 2){
            System.out.format(tab_2_2, "        Б", "400-500", "2", "4", "1", "1");
        }
        else if ( category == 3){
            System.out.format(tab_2_2, "        В", "500-600", "1", "4", "-", "-");
        }
        else if ( category == 4){
            System.out.format(tab_2_2, "        Д", "600-800", "1", "1", "-", "-");
        }
        System.out.println(ras_tab_2_3);
        System.out.print("\n");
        Third();
    }

    static public void Third(){
        System.out.println("Первинні засоби пожежогасіння:");
        System.out.println("    1. Назва:   Гасіння водою;");
        System.out.println("    1. Будова / Особливості:");
        System.out.println("    1. Переваги:");
        System.out.println("        - Доступність;");
        System.out.println("        - Дешевість;");
        System.out.println("        - Може використовуватись у вигляді пари (дрібно разпиленна вода),\n" +
                           "        для гасіння легкозаймистих та інших речей;\n"+
                           "        Створює туманоподібну хмару, що ізолює поверні рідин від потрапляння кисню;\n");
        System.out.println("    1. Недоліки:");
        System.out.println("        - Не можна гасити речовини, які мають густину < 1 г/см^3");
        System.out.println("        - Не можна гасити електрообладнення під напругою;");
        System.out.println("        - Не можна гасити речовини, які реагують з виділенням великох кількості тепла;");
        System.out.println("        - При гасінні деякі речі, можуть прийти до непридатного стану;");
        System.out.println("=======================================================");
        System.out.println("    2. Назва:   Гасіння пінами;");
        System.out.println("    2. Будова / Особливості:");
        System.out.println("        - Піна - колоїдна дисперсна система, яка складається ");
        System.out.println("        з дрібних бульбашок, заповнених газом;");
        System.out.println("    2. Переваги:    Повітряномеханічні && Хімічні");
        System.out.println("        - Вибір газів, які підходять для тушіння;");
        System.out.println("        - Низька теплопровідність;");
        System.out.println("        - Висока стійкість;");
        System.out.println("        - Охолоджувальні властивості;");
        System.out.println("        - Низька вартість ( повітряномеханічні );");
        System.out.println("        - Для гасіння нафтопродуктів, та речовин, з якими вода входить в термічну реакцію;");
        System.out.println("        - ( Повітряномеханічні ) вогнегасники не шкідливі для людей;");
        System.out.println("        - Не викликає корозію;");
        System.out.println("    2. Недоліки:    Повітряномеханічні && Хімічні");
        System.out.println("        - Складність в використанні;");
        System.out.println("        - Висока вартість ( хімічні );");
        System.out.println("        - Вибір газів для тушіння;");
        System.out.println("        - Кратність;");
        System.out.println("        - Складність транспортування;");
        System.out.println("    2.5. Переваги:  Вуглекислий Газ ( CO_2 )");
        System.out.println("        - Не горить;");
        System.out.println("        - Низька єлектропровідність;");
        System.out.println("        - Можна гасити речі, які б після дії води можуть прийти до непридатного стану;");
        System.out.println("        - Має температуру -79*С");
        System.out.println("    2.5. Недоліки:  Вуглекислий Газ ( CO_2 )");
        System.out.println("        - Висока вартість;");
        System.out.println("        - Складність транспортування;");
        System.out.println("        - Температура -79*С");
        System.out.println("=======================================================");
        System.out.println("    3. Назва:   Гасіння інертними газами;");
        System.out.println("    3. Будова / Особливості:");
        System.out.println("        - Інертний Газ;");
        System.out.println("        - Створення середовища, яке не підтримує горіння;");
        System.out.println("    3. Переваги:    Діоксид карбону");
        System.out.println("        - Для гасіння електрообладнення;");
        System.out.println("        - Для гасіння аккумуляторних станцій;");
        System.out.println("        - Для гасіння пічей-сушарок;");
        System.out.println("    3. Недоліки:    Діоксид карбону");
        System.out.println("        - Висока токсичність ( > 10% - смерть );");
        System.out.println("        - Додатковы методи попередження людей про використання газу;");
        System.out.println("        - Не можна використовувати для гасіння:");
        System.out.println("            - Лужних та лужно-земельних металів;");
        System.out.println("            - Деякі гібриди металів та сполук, до складу яких входить оксиген;");
        System.out.println("    3.1. Переваги:  Азот");
        System.out.println("        - Для гасіння речовин, які горять полум'ям ( рідини, гази );");
        System.out.println("    3.1. Недоліки:  Азот");
        System.out.println("        - Погано гасить речовини, які тліють ( деревина, папір, бавовна );");
        System.out.println("        - Не гасить волокнисті речовини ( бавовна, тканини );");
        System.out.println("        - Отруйний при концентрації в повітрі від 12-16%;");
        System.out.println("    3.2. Переваги:    Водяна Пара:");
        System.out.println("        - Для створення парою завіс над відкритими технічними установками;");
        System.out.println("        - Для гасіння пожеж у приміщеннях невеликого об'єму;");
        System.out.println("    3.3. Будова / Особливості:  Галоїдовані вуглеводні (хлодони)");
        System.out.println("        - гасіння за рахунок сповільнення хімічної реакції;");
        System.out.println("    3.3. Переваги:  Галоїдовані вуглеводні (хлодони)");
        System.out.println("        - Гальмує хімічний процесс горіння;");
        System.out.println("        - Використовується для гасіння твердих та рідких горючих речовин;");
        System.out.println("        - Погано розчиняється у воді;");
        System.out.println("        - Добре змішується з багатьма органічними речовинами;");
        System.out.println("        - Мають високі діалектричні властивості ( для обладнення під напругою );");
        System.out.println("        - Висока густина, низька t* замерзання:");
        System.out.println("            - дозволяє легко проникати у полум'я;");
        System.out.println("            - використовується при мінусових t*;");
        System.out.println("            - для гасінняматеріалів, які тліють;");
        System.out.println("        - Для попередження вибуху;");
        System.out.println("    3.3. Недоліки:  Галоїдовані вуглеводні (хлодони)");
        System.out.println("        - Висока токсичність: (макс -> мін)");
        System.out.println("            - фтор -> хлор -> бром -> йод;");
        System.out.println("        - Продукти термічного розкладу особливо токсичні;");
        System.out.println("        - Мають високу корозійну активність;");
        System.out.println("        - Не можна гасити наступні речовини:");
        System.out.println("            - метали та металоорганічні сполуки;");
        System.out.println("            - гідриди металів;");
        System.out.println("            - речовини, які містять \"оксиген\"");
        System.out.println("=======================================================");
        System.out.println("    4. Назва:   Гасіння твердими речовинами;");
        System.out.println("    4. Будова / Особливості:");
        System.out.println("        - Для гасіння малих очагів полум'я;");
        System.out.println("        - Використовується, якщо інші вогнегасні речовини ( вода та інші ) не можуть погасити полум'я;");
        System.out.println("        - Викоростовується у вигляді порошкової суміші;");
        System.out.println("    4. Переваги:");
        System.out.println("        - Здійснюється ізоляція зони горіння від кисню, або іншої речовини, котра викликає горіння;");
        System.out.println("        - Висока вогнегасна ефективність;");
        System.out.println("        - Універсальність в використанні;");
        System.out.println("        - Можливість використання при мінусових температурах;");
        System.out.println("        - Не токсичний;");
        System.out.println("        - Не має корозійного впливу;");
        System.out.println("        - Можна застосовувати разом з водою, або пінними газами пожежогасіння;");
        System.out.println("        - Використовується для гасіння:");
        System.out.println("            - металів;");
        System.out.println("            - метало-органічних сполук;");
        System.out.println("            - газового полум'я;");
        System.out.println("        - Створення ізоляційної плівки, шляхом механичного сбивання полум'я на місці застосування;");
        System.out.println("    4. Недоліки:");
        System.out.println("        - Здатність залежуватись;");
        System.out.println("        - Утворюються шматки, під час зберігання;");
        System.out.println("=======================================================");
        Final();
    }
    static public void Final(){
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("Висновки: В ході виконання практичної роботи, я навчився заходити величину пожежної навантаги, питому пожежну навантагу, та зміг розрахувати категорію приміщення;;");
        System.out.println("Роботу виконав: ___________;");
    }
    static public void main()
    {
        System.out.print("""
                Практичне Заняття № 12\040
                «Пожежа»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        Zero();
    }
}