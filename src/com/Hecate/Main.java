package com.Hecate;

import labs.*;
import tests.*;

import java.util.Scanner;

public class Main {
    static int num;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 - Лабы\n2 - Тесты: ");
        num = in.nextInt();
        if (num == 1) {
            System.out.print("""
                    Робота 01 - Екологічний Податок - https://t.me/hellomyteam/269\s
                    Робота 02 - Ризик-орієнтовний підхід - https://t.me/hellomyteam/277\s
                    Робота 03 - Психологічне дослідження - https://t.me/hellomyteam/288\s
                    Робота 04 - Радіаційна безпека -  https://t.me/hellomyteam/282\s
                    Робота 05 - Хімічні речовини та пил - https://t.me/hellomyteam/311\s
                    Робота 06 - Мікроклімат - https://t.me/hellomyteam/312\s
                    Робота 07 - Вентиляція - https://t.me/hellomyteam/313\s
                    Робота 08 - Законодавство з Основ Охорони Праці - https://t.me/hellomyteam/314\s
                    Робота 09 - Дослідження та оцінка виробничого освітлення - https://t.me/hellomyteam/315\s
                    Робота 10 - Оцінка рівнів ЕМВ - https://t.me/hellomyteam/320\s
                    Робота 11 - Домедична допомога - https://t.me/hellomyteam/321\s
                    Робота 12 - Пожежа - https://t.me/hellomyteam/322\s
                    Робота 13 - Шум та вібрація - https://t.me/hellomyteam/323\s
                    Робота 14 - Аналіз травматизму - https://t.me/hellomyteam/324\s
                    Робота 15 - Електробезпека - https://t.me/hellomyteam/325\s
                    ================================================================\s
                    Додатково можна виконати ще 2 роботи:\s
                    Додат. робота №1 - Біологічний Вік - https://t.me/hellomyteam/317\s
                    Додат. робота №2 - Менеджмент Безпеки - https://t.me/hellomyteam/318\s""");
            System.out.print("\n# Лабы: ");
            num = in.nextInt();
            System.out.print("\n");
            if (num == 1)
            {
                Lab_01_first.main();
            }
            else if (num == 2)
            {
                Lab_02_two.main();
            }
            else if (num == 4)
            {
                Lab_04_four.main();
            }
            else if (num == 5)
            {
                Lab_05_fifth.main();
            }
            else if (num == 6)
            {
                Lab_06_six.main();
            }
            else if (num == 7)
            {
                Lab_07_seven.main();
            }
            else if (num == 8)
            {
                Lab_08_eight.main();
            }
            else if (num == 9)
            {
                Lab_09_nine.main();
            }
            else if (num == 10)
            {
                Lab_10_ten.main();
            }
            else if (num == 12)
            {
                Lab_12_twelve.main();
            }
            else if (num == 13)
            {
                Lab_13_thirteen.main();
            }
            else if ( num == 14 )
            {
                Lab_14_.main();
            }
            else if (num == 15)
            {
                Lab_15_fifteenth.main();
            }
        }
        else if (num == 2)
        {
            System.out.print("""
                    ТЕСТ 01 - Екологічний Податок -https://t.me/hellomyteam/342?comment=148\s
                    ТЕСТ 02 - Ризик-орієнтовний підхід - https://t.me/hellomyteam/342?comment=149\s
                    ТЕСТ 03 - Психологічне дослідження - https://t.me/hellomyteam/342?comment=150\s
                    ТЕСТ 04 - Радіаційна безпека -  https://t.me/hellomyteam/342?comment=151\s
                    ТЕСТ 05 - Хімічні речовини та пил - https://t.me/hellomyteam/342?comment=152\s
                    ТЕСТ 06+07 - Мікроклімат + Вентиляція - https://t.me/hellomyteam/342?comment=153\s
                    ТЕСТ 08 - Законодавство з Основ Охорони Праці - https://t.me/hellomyteam/342?comment=154\s
                    ТЕСТ 09 - Дослідження та оцінка виробничого освітлення - https://t.me/hellomyteam/342?comment=155\s
                    ТЕСТ 10 - Оцінка рівнів ЕМВ - https://t.me/hellomyteam/342?comment=156\s
                    ТЕСТ 11 - Домедична допомога - https://t.me/hellomyteam/342?comment=157\s
                    ТЕСТ 12 - Пожежа - https://t.me/hellomyteam/342?comment=158\s
                    ТЕСТ 13 - Шум та вібрація - https://t.me/hellomyteam/342?comment=159\s
                    ТЕСТ 14 - Аналіз травматизму - https://t.me/hellomyteam/342?comment=160\s
                    ТЕСТ 15 - Електробезпека - https://t.me/hellomyteam/342?comment=161\s""");
            System.out.print("\nНомер теста: ");
            num = in.nextInt();
            System.out.print("\nНомер варианта: ");
            int var = in.nextInt();
            System.out.print("\n");
            if (num == 1)
            {
                Test_01_first.main(var);
            }
            else if (num == 4)
            {
                Test_04_four.main(var);
            }
            else if (num == 6)
            {
                Test_06_six.main(var);
            }
            else if (num == 8)
            {
                Test_08_eight.main(var);
            }
            else if (num == 9)
            {
                Test_09_nine.main(var);
            }
            else if (num == 10)
            {
                Test_10_ten.main(var);
            }
            /*else if (num == 11)
            {
                Test_11_eleven.main(var);
            }*/
            else if (num == 12)
            {
                Test_12_twenty.main(var);
            }
            else if (num == 13)
            {
                Test_13_thirteen.main(var);
            }
            else if (num == 14)
            {
                Test_14_fourteenth.main(var);
            }
            else if (num == 15)
            {
                Test_15_fifteenth.main(var);
            }
            else if (num == 16)
            {
                Test_16_sixteenth.main(var);
            }

        }
    }
}
