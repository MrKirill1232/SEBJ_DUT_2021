package labs;

import java.util.Scanner;

public class Lab_06_six {

    static int num;

    static int tab_2_1;
    static int tab_2_2;
    static String tab_2_3_1;
    static String tab_2_3_2;
    static String tab_2_3_3;
    static String over_tab_2_3_1;
    static String over_tab_2_3_2;
    static String over_tab_2_3_3;
    static int micro_over_tab_2_3_1;
    static int micro_over_tab_2_3_2;
    static int micro_over_tab_2_3_3;
    static String final_over_tab_2_3_1;
    static String final_over_tab_2_3_2;
    static String final_over_tab_2_3_3;

    static double[] F_f = {0, 1};

    static final double[][] tab_6_values = new double[][]
            {
                    {	0	,	1	,	2	,	3	,	4	,	5	,	6	,	7	,	8	,	9	,	10	,	11	,	12	,	13	,	14	,	15	,	16	,	17	,	18	,	19	,	20	,	21	,	22	,	23	,	24	,	25	,	26	,	27	,	28	,	29	,	30	},
                    {	1	,	24	,	18	,	19	,	22	,	18	,	23	,	21	,	25	,	25	,	24	,	25	,	21	,	19	,	20	,	18	,	16	,	25	,	24	,	25	,	24	,	16	,	16	,	23	,	24	,	23	,	17	,	19	,	20	,	25	,	22	},
                    {	2	,	23	,	14	,	16	,	19	,	16	,	17	,	18	,	18	,	24	,	17	,	21	,	17	,	15	,	16	,	14	,	10	,	18	,	16	,	18	,	19	,	12	,	10	,	16	,	17	,	18	,	15	,	14	,	16	,	20	,	16	},
                    {	3	,	757	,	763	,	763	,	759	,	758	,	756	,	760	,	755	,	765	,	763	,	754	,	762	,	761	,	758	,	757	,	754	,	760	,	754	,	762	,	761	,	762	,	765	,	755	,	754	,	762	,	760	,	758	,	757	,	754	,	761	}
            };
    static final double[][] tab_7_values = new double[][]
            {
                    {	0	,	1	,	2	,	3	,	4	,	5	,	6	},
                    {	1	,	5	,	1	,	105	,	16	,	40	,	0.1	},
                    {	2	,	5	,	2	,	175	,	18	,	45	,	0.2	},
                    {	3	,	5	,	3	,	275	,	20	,	50	,	0.3	},
                    {	4	,	5	,	5	,	130	,	22	,	55	,	0.4	},
                    {	5	,	5	,	6	,	240	,	24	,	60	,	0.5	},
                    {	6	,	5	,	7	,	300	,	26	,	65	,	0.6	},
                    {	7	,	5	,	8	,	105	,	28	,	70	,	0.1	},
                    {	8	,	5	,	9	,	175	,	26	,	75	,	0.2	},
                    {	9	,	5	,	11	,	275	,	24	,	80	,	0.3	},
                    {	10	,	5	,	12	,	130	,	22	,	85	,	0.4	},
                    {	11	,	30	,	1	,	240	,	20	,	90	,	0.5	},
                    {	12	,	30	,	3	,	300	,	18	,	40	,	0.6	},
                    {	13	,	30	,	6	,	105	,	20	,	45	,	0.1	},
                    {	14	,	5	,	1	,	175	,	16	,	50	,	0.2	},
                    {	15	,	5	,	2	,	275	,	18	,	55	,	0.3	},
                    {	16	,	5	,	3	,	130	,	20	,	60	,	0.4	},
                    {	17	,	5	,	5	,	240	,	22	,	65	,	0.5	},
                    {	18	,	5	,	6	,	300	,	24	,	70	,	0.6	},
                    {	19	,	5	,	7	,	105	,	26	,	75	,	0.1	},
                    {	20	,	5	,	8	,	175	,	28	,	80	,	0.2	},
                    {	21	,	5	,	9	,	275	,	26	,	85	,	0.3	},
                    {	22	,	5	,	11	,	130	,	24	,	90	,	0.4	},
                    {	23	,	5	,	12	,	240	,	22	,	40	,	0.5	},
                    {	24	,	30	,	1	,	300	,	20	,	45	,	0.6	},
                    {	25	,	30	,	3	,	105	,	18	,	50	,	0.1	},
                    {	26	,	30	,	6	,	175	,	20	,	55	,	0.2	},
                    {	27	,	5	,	3	,	300	,	18	,	40	,	0.6	},
                    {	28	,	5	,	4	,	105	,	20	,	45	,	0.1	},
                    {	29	,	5	,	6	,	240	,	29	,	70	,	0.5	},
                    {	30	,	5	,	4	,	300	,	20	,	75	,	0.6	}

            };

    static public void Zero() {

        PRE_First();
    }

    static public void PRE_First() {
        for (int j=0; j<2;j++) {
            if (tab_6_values[j+1][num] == 7) {
                F_f[j] = 7.51;
            } else if (tab_6_values[j+1][num] == 8) {
                F_f[j] = 8.04;
            } else if (tab_6_values[j+1][num] == 9) {
                F_f[j] = 8.61;
            } else if (tab_6_values[j+1][num] == 10) {
                F_f[j] = 9.21;
            } else if (tab_6_values[j+1][num] == 11) {
                F_f[j] = 9.84;
            } else if (tab_6_values[j+1][num] == 12) {
                F_f[j] = 10.52;
            } else if (tab_6_values[j+1][num] == 13) {
                F_f[j] = 11.23;
            } else if (tab_6_values[j+1][num] == 14) {
                F_f[j] = 11.99;
            } else if (tab_6_values[j+1][num] == 15) {
                F_f[j] = 12.79;
            } else if (tab_6_values[j+1][num] == 16) {
                F_f[j] = 13.63;
            } else if (tab_6_values[j+1][num] == 17) {
                F_f[j] = 14.53;
            } else if (tab_6_values[j+1][num] == 18) {
                F_f[j] = 15.48;
            } else if (tab_6_values[j+1][num] == 19) {
                F_f[j] = 16.48;
            } else if (tab_6_values[j+1][num] == 20) {
                F_f[j] = 17.54;
            } else if (tab_6_values[j+1][num] == 21) {
                F_f[j] = 18.65;
            } else if (tab_6_values[j+1][num] == 22) {
                F_f[j] = 19.83;
            } else if (tab_6_values[j+1][num] == 23) {
                F_f[j] = 21.07;
            } else if (tab_6_values[j+1][num] == 24) {
                F_f[j] = 22.38;
            } else if (tab_6_values[j+1][num] == 25) {
                F_f[j] = 23.76;
            } else if (tab_6_values[j+1][num] == 26) {
                F_f[j] = 25.91;
            } else if (tab_6_values[j+1][num] == 27) {
                F_f[j] = 26.74;
            } else if (tab_6_values[j+1][num] == 28) {
                F_f[j] = 30.04;
            } else if (tab_6_values[j+1][num] == 29) {
                F_f[j] = 31.04;
            } else if (tab_6_values[j+1][num] == 30) {
                F_f[j] = 31.82;
            }
        }
        First();
    }
    static public void First() {
        String firstTableTOPAlignFormat = "| %-2s | %-40s | %-8s | %-30s |%n";
        double ex_1_1 = (tab_6_values[1][num]-tab_6_values[2][num]);
        ex_1_1 = (tab_6_values[3][num]/760)*(ex_1_1);
        ex_1_1 = 0.5*(ex_1_1);
        ex_1_1 = F_f[0] - ex_1_1;
        String s_ex_1_1 = String.format("%.2f", (ex_1_1));

        double ex_1_2 = (ex_1_1/F_f[1])*100;
        String s_ex_1_2 = String.format("%.2f", (ex_1_2));

        System.out.format("+----+------------------------------------------+----------+--------------------------------+%n");
        System.out.format(firstTableTOPAlignFormat, "#1", "Температура повітря у приміщенні по",(int)tab_6_values[1][num]+" °C","");
        System.out.format(firstTableTOPAlignFormat, "  ", "«сухому» термометру, t_сф (°C)","","A = "+s_ex_1_1+" (г/м^3)");
        System.out.format("+----+------------------------------------------+----------+                                +%n");
        System.out.format(firstTableTOPAlignFormat, "#2", "Температура повітря у приміщенні по",(int)tab_6_values[2][num]+" °C","");
        System.out.format(firstTableTOPAlignFormat, "  ", "«вологому» термометру, t_вф (°C)","","φ = "+s_ex_1_2+"%");
        System.out.format("+----+------------------------------------------+----------+                                +%n");
        System.out.format(firstTableTOPAlignFormat, "#3", "Барометричний тиск, ",(int)tab_6_values[3][num],"");
        System.out.format(firstTableTOPAlignFormat, "  ", "Вф (мм.рт.ст.)","мм.рт.ст","");
        System.out.format("+----+------------------------------------------+----------+--------------------------------+%n");
        System.out.print("\n");
        System.out.println("РОЗРАХУНКИ");
        String for_1_1_1 = "%-4s%-1s%-3s%-3s%-3s%-5s%-3s%-5s%-3s%-3s";
        String for_1_1_2 = "%-3s%-5s%-3s%-3s%-3s%-3s%-3s%-3s%-3s%-3s";
        System.out.format(for_1_1_1, "","","","","","","","","","В_ф");
        System.out.format(for_1_1_2, "","","","","","","","","",(int)tab_6_values[3][num]);
        System.out.print("\n");
        System.out.format(for_1_1_1, "А = ","f"," - ","0.5"," * ","(t_сф"," - ","t_вф)"," * ","---");
        System.out.format(for_1_1_2, " = ",F_f[1]," - ","0.5"," * ","("+(int)tab_6_values[1][num]," - ",(int)tab_6_values[2][num]+")"," * ","---");
        System.out.print(" = "+s_ex_1_1+" (г/м^3)");
        System.out.print("\n");
        System.out.format(for_1_1_1, "","","","","","","","","","760");
        System.out.format(for_1_1_2, "","","","","","","","","","760");
        System.out.print("\n");
        String for_2_1_1 = "%-4s%-1s%-3s%-4s";
        String for_2_1_2 = "%-3s%-6s%-3s%-4s";
        System.out.format(for_2_1_1, "","A","","");
        System.out.format(for_2_1_2, "",s_ex_1_1,"","");
        System.out.print("\n");
        System.out.format(for_2_1_1, "φ = ","-"," * ","100%");
        System.out.format(for_2_1_2, " = ","------"," * ","100%");
        System.out.print(" = "+s_ex_1_2+"%");
        System.out.print("\n");
        System.out.format(for_2_1_1, "","F","","");
        System.out.format(for_2_1_2, "",F_f[0],"","");
        PRE_SECOND();
    }

    static public void PRE_SECOND() {
        if (tab_7_values[num][3] >= 90 && tab_7_values[num][3] <= 120)
        {
            tab_2_1 = 1;
        }
        else if (tab_7_values[num][3] >= 121 && tab_7_values[num][3] <= 150)
        {
            tab_2_1 = 2;
        }
        else if (tab_7_values[num][3] >= 151 && tab_7_values[num][3] <= 200)
        {
            tab_2_1 = 3;
        }
        else if (tab_7_values[num][3] >= 201 && tab_7_values[num][3] <= 250)
        {
            tab_2_1 = 4;
        }
        else if (tab_7_values[num][3] >= 251 && tab_7_values[num][3] <= 300)
        {
            tab_2_1 = 5;
        }
        System.out.print("\n");
        int month = (int)tab_7_values[num][2];
        switch (month) {
            case 10, 11, 12, 1, 2, 3, 4 -> {
                if ((int) tab_7_values[num][1] == 5) {
                    if (month == 10) {
                        tab_2_2 = 1;
                    } else {
                        tab_2_2 = 2;
                    }
                } else if ((int) tab_7_values[num][1] == 30) {
                    if (month == 4) {
                        tab_2_2 = 1;
                    } else {
                        tab_2_2 = 2;
                    }
                }
            }
            case 5, 6, 7, 8, 9 -> tab_2_2 = 1;
        }
        /**/
        int local_min = 0;
        int local_max = 0;
        double local_v = 0;
        if (tab_2_1 == 1)
        {
            if (tab_2_2 == 1)
            {
                tab_2_3_1 = "23-25";
                local_min = 23;
                local_max = 25;
            }
            else
            {
                tab_2_3_1 = "22-24";
                local_min = 22;
                local_max = 24;
            }
            tab_2_3_3 = "≤0,1";
            local_v = 0.1;
        }
        else if (tab_2_1 == 2) {
            if (tab_2_2 == 1) {
                tab_2_3_1 = "22-24";
                tab_2_3_3 = "≤0,2";
                local_min = 22;
                local_max = 24;
                local_v = 0.2;
            } else {
                tab_2_3_1 = "21-23";
                tab_2_3_3 = "≤0,1";
                local_min = 21;
                local_max = 23;
                local_v = 0.1;
            }
        }
        else if (tab_2_1 == 3) {
            if (tab_2_2 == 1) {
                tab_2_3_1 = "21-23";
                tab_2_3_3 = "≤0,3";
                local_min = 21;
                local_max = 23;
                local_v = 0.3;
            } else {
                tab_2_3_1 = "19-21";
                tab_2_3_3 = "≤0,2";
                local_min = 19;
                local_max = 21;
                local_v = 0.2;
            }
        }
        else if (tab_2_1 == 4) {
            if (tab_2_2 == 1) {
                tab_2_3_1 = "20-22";
                tab_2_3_3 = "≤0,3";
                local_min = 20;
                local_max = 22;
                local_v = 0.3;
            } else {
                tab_2_3_1 = "17-19";
                tab_2_3_3 = "≤0,2";
                local_min = 17;
                local_max = 19;
                local_v = 0.2;
            }
        }
        else if (tab_2_1 == 5) {
            if (tab_2_2 == 1) {
                tab_2_3_1 = "18-20";
                tab_2_3_3 = "≤0,4";
                local_min = 18;
                local_max = 20;
                local_v = 0.4;
            } else {
                tab_2_3_1 = "16-18";
                tab_2_3_3 = "≤0,3";
                local_min = 16;
                local_max = 18;
                local_v = 0.3;
            }
        }
        tab_2_3_2 = "40-60";

        /* Висновок t °C */
        if ( tab_7_values[num][4] <= local_min )
        {
            over_tab_2_3_1 = "Ниже норми";
            micro_over_tab_2_3_1 = 1;
            final_over_tab_2_3_1 = "охолоджуваючий";
        }
        else if ( tab_7_values[num][4] > local_min &&  tab_7_values[num][4] <= local_max)
        {
            over_tab_2_3_1 = "В межах норми";
            micro_over_tab_2_3_1 = 2;
            final_over_tab_2_3_1 = "нормальний";
        }
        else
        {
            over_tab_2_3_1 = "Вище норми на " + (int)(tab_7_values[num][4]-local_max) + " °C";
            micro_over_tab_2_3_1 = 3;
            final_over_tab_2_3_1 = "нагрівающий";
        }
        /* Висновок φ % */
        if ( tab_7_values[num][5] <= 40 )
        {
            over_tab_2_3_2 = "Ниже норми";
            micro_over_tab_2_3_2 = 1;
            final_over_tab_2_3_2 = "низьким рівнем вологістю";
        }
        else if ( tab_7_values[num][5] > 40 && tab_7_values[num][5] <= 60)
        {
            over_tab_2_3_2 = "В межах норми";
            micro_over_tab_2_3_2 = 2;
            final_over_tab_2_3_2 = "нормальним рівнем вологістю";
        }
        else
        {
            over_tab_2_3_2 = "Вище норми на " + (int)(tab_7_values[num][5]-60) + "%";
            micro_over_tab_2_3_2 = 3;
            final_over_tab_2_3_2 = "підвищенною вологістю";
        }
        /* Висновок φ % */
        if ( tab_7_values[num][6] <= local_v)
        {
            over_tab_2_3_3 = "В межах норми";
            micro_over_tab_2_3_3 = 1;
            final_over_tab_2_3_3 = "нормальним";
        }
        else
        {
            over_tab_2_3_3 = "Вище норми на " + (tab_7_values[num][6]-local_v) + "%";
            micro_over_tab_2_3_3 = 2;
            final_over_tab_2_3_3 = "високим";
        }
        Second();
    }

    static public void Second(){
        String secondTableTOPAlignFormat = "| %-80s |%n";
        String har_rob = "";
        String kat_rob = "";
        String per_roku = "";
        System.out.format("+----------------------------------------------------------------------------------+%n");
        if (tab_2_2 == 1)
        {
            per_roku = "теплий період року";
        }
        else if (tab_2_2 == 2)
        {
            per_roku = "холодний період року";
        }
        if (tab_2_1 == 1)
        {
            har_rob = "Робота, що виконується сидячи";
            kat_rob = "Iа";
        }
        else if (tab_2_1 == 2)
        {
            har_rob = "Робота, що виконується сидячи і стоячи";
            kat_rob = "Iб";
        }
        else if (tab_2_1 == 3)
        {
            har_rob = "Робота, пов'язана з ходінням";
            kat_rob = "IIа";
        }
        else if (tab_2_1 == 4)
        {
            har_rob = "Робота, що виконується стоячи";
            kat_rob = "IIб";
        }
        else if (tab_2_1 == 5)
        {
            har_rob = "Робота, пов'язана з постійним переміщенням";
            kat_rob = "III";
        }
        System.out.format(secondTableTOPAlignFormat, "Характеристика робочого місця - "+har_rob);
        System.out.format("+----------------------------------------------------------------------------------+%n");
        System.out.format(secondTableTOPAlignFormat, "Категорія робіт - "+kat_rob);
        System.out.format("+----------------------------------------------------------------------------------+%n");
        System.out.format(secondTableTOPAlignFormat, "Період Року - "+per_roku);
        System.out.format("+----------------------------------------------------------------------------------+%n");
        String secondTableTab_1_1 = "| %-5s | %-21s | %-21s |%n";
        String secondTableTab_1_2 = "| %-5s | %-8s | %-10s | %-21s |%n";
        System.out.format(secondTableTab_1_1, "Найме","     Значення", "");
        System.out.format("|       |----------+------------|                       |%n");
        System.out.format(secondTableTab_1_2, "йнува","фактичне","оптимальне","     Висновок");
        System.out.format(secondTableTab_1_2, " ння","","","");
        System.out.format("+-------+----------+------------+-----------------------+%n");
        System.out.format(secondTableTab_1_2, "t,°C",tab_7_values[num][4]+" °C",tab_2_3_1+" °C",over_tab_2_3_1);
        System.out.format("+-------+----------+------------+-----------------------+%n");
        System.out.format(secondTableTab_1_2, "φ, %",tab_7_values[num][5]+" %",tab_2_3_2+" %",over_tab_2_3_2);
        System.out.format("+-------+----------+------------+-----------------------+%n");
        System.out.format(secondTableTab_1_2, "v,м/с",tab_7_values[num][6]+" м/с",tab_2_3_3,over_tab_2_3_3);
        System.out.format("+-------+----------+------------+-----------------------+%n");
        System.out.println("Загальний висновок щодо характеристики мікроклімату за класифікацією: ");
        System.out.println("На Вашу думку: який мікроклімат на робочому місці (згідно по класифікації)? ");
        if ((micro_over_tab_2_3_1 == 1 && micro_over_tab_2_3_2 == 1) || (micro_over_tab_2_3_1 == 1 && micro_over_tab_2_3_3 == 1) || (micro_over_tab_2_3_2 == 1 && micro_over_tab_2_3_3 == 1)
                || (micro_over_tab_2_3_1 == 3 && micro_over_tab_2_3_2 == 3) || (micro_over_tab_2_3_1 == 3 && micro_over_tab_2_3_3 == 3) || (micro_over_tab_2_3_2 == 3 && micro_over_tab_2_3_3 == 3))
        {
            System.out.print(" - Мікроклімат несприятливий,");
        }
        else {
            System.out.print(" - Мікроклімат сприятливий,");
        }
        System.out.print(" " +final_over_tab_2_3_1 + " з " + final_over_tab_2_3_2 + ", та " + final_over_tab_2_3_3 + " рухом повітря");
        THIRD();
    }

    static public void THIRD()
    {
        int local_t = 0;
        int local_v = 0;
        int local_w = 0;
        /**/
        int local_max = 0;
        double local_max_v = 0;
        {
            if (tab_2_1 == 1)
            {
                if (tab_2_2 == 1)
                {
                    tab_2_3_1 = "23-25";
                    local_max = 25;
                }
                else
                {
                    tab_2_3_1 = "22-24";
                    local_max = 24;
                }
                tab_2_3_3 = "≤0,1";
                local_max_v = 0.1;
            }
            else if (tab_2_1 == 2) {
                if (tab_2_2 == 1) {
                    tab_2_3_1 = "22-24";
                    tab_2_3_3 = "≤0,2";
                    local_max = 24;
                    local_max_v = 0.2;
                } else {
                    tab_2_3_1 = "21-23";
                    tab_2_3_3 = "≤0,1";
                    local_max = 23;
                    local_max_v = 0.1;
                }
            }
            else if (tab_2_1 == 3) {
                if (tab_2_2 == 1) {
                    tab_2_3_1 = "21-23";
                    tab_2_3_3 = "≤0,3";
                    local_max = 23;
                    local_max_v = 0.3;
                } else {
                    tab_2_3_1 = "19-21";
                    tab_2_3_3 = "≤0,2";
                    local_max = 21;
                    local_max_v = 0.2;
                }
            }
            else if (tab_2_1 == 4) {
                if (tab_2_2 == 1) {
                    tab_2_3_1 = "20-22";
                    tab_2_3_3 = "≤0,3";
                    local_max = 22;
                    local_max_v = 0.3;
                } else {
                    tab_2_3_1 = "17-19";
                    tab_2_3_3 = "≤0,2";
                    local_max = 19;
                    local_max_v = 0.2;
                }
            }
            else if (tab_2_1 == 5) {
                if (tab_2_2 == 1) {
                    tab_2_3_1 = "18-20";
                    tab_2_3_3 = "≤0,4";
                    local_max = 20;
                    local_max_v = 0.4;
                } else {
                    tab_2_3_1 = "16-18";
                    tab_2_3_3 = "≤0,3";
                    local_max = 18;
                    local_max_v = 0.3;
                }
            }
            tab_2_3_2 = "40-60";
        }
        System.out.print("\nВизначте клас умов праці за табл.4");

        // T воздуха
        {
            if (tab_2_2 == 1) //тепла пора року
            {
                if (tab_7_values[num][4] - local_max > 0)
                {
                    if (tab_7_values[num][4] - local_max < 3.0) {
                        local_t = 1;
                    } else if (tab_7_values[num][4] - local_max < 6.0) {
                        local_t = 2;
                    } else if (tab_7_values[num][4] - local_max < 9.0) {
                        local_t = 3;
                    } else if (tab_7_values[num][4] - local_max < 12.0) {
                        local_t = 4;
                    }
                }
                else {
                    if (tab_7_values[num][4] - local_max < -3.0) {
                        local_t = -1;
                    } else if (tab_7_values[num][4] - local_max < -6.0) {
                        local_t = -2;
                    } else if (tab_7_values[num][4] - local_max < -9.0) {
                        local_t = -3;
                    } else if (tab_7_values[num][4] - local_max < -12.0) {
                        local_t = -4;
                    }
                }
            } else if (tab_2_2 == 2) //холодний клімат
            {
                if (tab_7_values[num][4] - local_max > 0) {
                    if (tab_7_values[num][4] - local_max < 2) {
                        local_t = 1;
                    } else if (tab_7_values[num][4] - local_max < 4.0) {
                        local_t = 2;
                    } else if (tab_7_values[num][4] - local_max < 6.0) {
                        local_t = 3;
                    } else if (tab_7_values[num][4] - local_max < 8.0) {
                        local_t = 4;
                    }
                }
                else {
                    if (tab_7_values[num][4] - local_max < -2) {
                        local_t = -1;
                    } else if (tab_7_values[num][4] - local_max < -4.0) {
                        local_t = -2;
                    } else if (tab_7_values[num][4] - local_max < -8.0) {
                        local_t = -4;
                    } else if (tab_7_values[num][4] - local_max < -6.0) {
                        local_t = -3;
                    }
                }
            }
        }
        // V скорость проветривания комнаты - без изменений - холодний клімат - тепла пора року
        {
            if (tab_7_values[num][5] - local_max_v > 3) {
                local_v = 1;
            } else if (tab_7_values[num][5] - local_max_v < 3) {
                local_v = 2;
            } else if (tab_7_values[num][5] - local_max_v > -3) {
                local_v = -1;
            } else if (tab_7_values[num][5] - local_max_v < -3) {
                local_v = -2;
            }
        }
        // W влажность
        {
            if (tab_2_2 == 1) //тепла пора року
            {
                if (tab_7_values[num][6] - 40 > 25 || tab_7_values[num][6] - 60 > 25) {
                    local_w = 1;
                } else if (tab_7_values[num][6] - 40 < 25 || tab_7_values[num][6] - 60 < 25) {
                    local_w = 2;
                }
            } else if (tab_2_2 == 2) //тепла пора року
            {
                if (tab_7_values[num][6] - 40 > 15 || tab_7_values[num][6] - 60 > 15) {
                    local_w = 1;
                } else if (tab_7_values[num][6] - 40 < 15 || tab_7_values[num][6] - 60 < 15) {
                    local_w = 2;
                }
            }
        }
        /* */
        int local_final_2 = (Math.abs(local_t) + Math.abs(local_v) + Math.abs(local_w)) / 3;
        {

            {
                if (local_final_2 == 1) {
                    System.out.print("\nКлас умов - шкідливий, 1 ступіню;\n");
                } else if (local_final_2 == 2) {
                    System.out.print("\nКлас умов - шкідливий, 2 ступіню;\n");
                }
            }
        }
        /*
        TEST OUTPUT
        {
            System.out.println(local_t);
            System.out.println(tab_7_values[num][4] - local_min);
            System.out.println(tab_7_values[num][4] - local_max);
            System.out.println(local_v);
            System.out.println(local_w);
            System.out.println(local_final_2);
        }
        */
        /* Як діє даний мікроклімат на систему терморегуляції людини? */
        {
            System.out.println("Як діє даний мікроклімат на систему терморегуляції людини?");
            if ((local_t == 1 || local_t == 2 || local_t == 3 || local_t == 4) && (local_w == 1 || local_w == 2) && (local_v == -1 || local_v == -2)) {
                System.out.println("Тіло буде нагріватись, а тепловіддача блокується через те, що вологість підвищена та вентиляція погана;");
            } else if (local_t == 2 || local_t == 3 || local_t == 4) {
                System.out.println("Тепловіддача буде збільшуватись;");
            } else if (local_t == 1) {
                System.out.println("Тепловіддача буде зменшуватись;");
            }
            System.out.print("\n");
        }
        /* Які захворювання можуть виникнути? */
        {
            System.out.println("Які захворювання можуть виникнути?");
            if ( local_t == 4 && (local_w == 1 || local_w == 2))
            {
                System.out.println("Можливий тепловий шок;");
            }
            else if ( local_t == 2 && (local_w == 1 || local_w == 2))
            {
                System.out.println("Можлива гіпертермія;");
            }
            if ( ( local_t == -1 || local_t == -2 || local_t == -3 || local_t == -4 ) && (local_v == 1 || local_v == 2))
            {
                System.out.println("Можливе зниження імунологічної реактивності організму;");
            }
            if ( (local_w == 1 || local_w == 2) )
            {
                if ( local_t == -1 )
                {
                System.out.println("Можливо місцеве охолодження;");
                }
                else if ( local_t == -2 )
                {
                    System.out.println("Можливо загальне охолодження;");
                }
                else if ( local_t == -3 )
                {
                    System.out.println("Можливий облітеруючий ендартеріїт;");
                }
                else if ( local_t == -4 )
                {
                    System.out.println("Можливе відмороження;");
                }
                else if ( local_t == 1 || local_t == 2 || local_t == 3 || local_t == 4 )
                {
                    System.out.println("Можлива судима хвороба;");
                }
            }
            if ( local_t == 1 || local_t == 2 || local_t == 3 )
            {
                System.out.println("Можлива гіпертермія;");
            }
            else if ( local_t == 4 )
            {
                System.out.println("Можливий тепловий шок;");
            }
            System.out.print("\n");
        }
        /* Розробіть колективні засоби і заходи профілактики */

        {
            System.out.println("Розробіть колективні засоби і заходи профілактики;");
            if ( local_v == 2  ||  local_v == 1 )
            {
                System.out.println("Потрібно покращувати вентиляцію;");
            }
            System.out.println("    Потрібно встановити графік перерв для відпочинку;");
            System.out.println("    Потрібно встановити спеціальний питний режим;");
            System.out.println("    Потрібно встановити засоби від випромінювання;");
            System.out.println("    Потрібно встановити засоби від ураження струмом;");
            System.out.println("    Потрібно встановити засоби від механічних впливів;");
            System.out.println("    Потрібно встановити засоби для покращення і нормалізації освітлення робочих місць, приміщень;");
            System.out.println("    Потрібно встановити засоби від хімічних чинників;");
            System.out.println("    Потрібно встановити засоби від низьких (високих) температур;");
            System.out.println("    Потрібно встановити засоби для нормалізації повітряного середовища;");
            System.out.print("\n");
        }
        /* Розробіть колективні засоби і заходи профілактики */

        {
            System.out.println("Розробіть індивідуальні заходи і засоби профілактики");
            System.out.println("    Потрібно встановити засоби для надання першої медичної допомоги;");
            System.out.println("    Потрібно періодично проводити медичні огляди;");
            System.out.println("    Потрібно виділити співробітникам спецодяг, якщо потребується;");
            System.out.println("    Потрібно виділити Засоби Індивідуального Захисту ( для захисту голови " +
                              "( теплових опромінень, іскор та бризок металу ), для захисту рук ( від опіків ), для захисту очей та обличчя );");
            System.out.print("\n");
            Final();
        }
    }

    static public void Final()
    {
        System.out.println("=====");
        System.out.print("""
                В ході виконання практичної роботи, я навчився та закріпив на практиці як розраховувати вплив параметрів мікроклімату на організм працівників.
                Роботу виконав - ПІБ - підпис
                Роботу перевірив - Сергеєва Любов Анатоліївна - ______
                ==
                Пару пояснений:
                    П_загальний - все что идет после нижнего подчеркивания пишется в нижнем индексе""");
        System.out.print("\n");
    }
    static public void main()
    {
        System.out.print("""
                Практичного Заняття № 6\040
                «Дослідження та впливу параметрів мікроклімату на організм працівників»""");
        System.out.print("\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант: ");
        num = in.nextInt();
        Zero();
    }
}
