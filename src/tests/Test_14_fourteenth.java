package tests;

public class Test_14_fourteenth {
    public static void main(int VAR) {
        int _var = VAR;
        if (_var > 12){
            _var = _var-12;
        }
        System.out.print("Тест №14 \n<<Аналіз травматизму>>"
                + "\nВариант " + _var + "\n");

        if (_var == 2) {
            System.out.println("01. 5");
            System.out.println("02. 2");
            System.out.println("03. 1");
            System.out.println("04. 3");
            System.out.println("05. 3");
            System.out.println("06. 1");
            System.out.println("07. 5");
            System.out.println("08. 5");
            System.out.println("09. 3");
            System.out.println("10. 3");
        }
        else if (_var == 11) {
            System.out.println("01. 4. пневмоконіози;\n");
            System.out.println("02. 2. за першим класом небезпеки виділяють 3 зони;");
            System.out.println("03. 3. 30:5=6,0;");
            System.out.println("04. 5. під час використання працівниками справних транспортних засобів, устаткування, інструментів підприємства без дозволу роботодавця;");
            System.out.println("05. 4. 5х1000:5000=1,0;");
            System.out.println("06. 2. отруєння свинцем;");
            System.out.println("07. 1. 1 клас");
            System.out.println("08. 5. 5х1000:250 = 20мг/м3."); // до 80, после 85, обьем 50литоров -> 85 - 80 и переводим в ДМ кубические, тоесть умножаем на 1000;
            System.out.println("09. 3. Респіратор фільтруючий газопилозахисний РУ-60М.");
            System.out.println("10. 3. Герметизація виробничого процесу.");
        }
        else System.out.println(_var);
    }
}
