package lesson;

public class VeriablesTheme {
	public static void main(String[]args) {

            System.out.println("1.Создание переменных и вывод их значений на консоль.");

            byte cpu = 6;
            short vRamMB = 6144;
            int ramMB = 16384;
            long gpuMHz = 1450;
            float cpuMHz = 3.3f;
            double ccdGB = 512+1024;
            char symbl = 127;
            boolean namePC = true;
            System.out.println(" cpu - " + cpu
                            +"\n vRamMB - " + vRamMB
                            +"\n ramMB - " + ramMB
                            +"\n gpuMHz - " + gpuMHz
                            +"\n cpuMHz - " + cpuMHz
                            +"\n ccdGB - " + ccdGB
                            +"\n symbl - " + symbl
                            +"\n namePC - " + namePC);

            System.out.println("2.Расчет стоимости товара со скидкой");

            int product = 100;
            int product1 = 200;
            int price = product + product1;
            int discountPercent = 11;
            int discountValue = price*discountPercent/100;
            int newPrice = price - discountValue;
            System.out.println("Discount value - " +discountValue);
            System.out.println("New Price - " + newPrice);

            System.out.println("3.Вывод на консоль слова JAVA");

            System.out.println("   J    a  v     v  a \n"
                             + "   J   a a  v   v  a a \n"
                             + "J  J  aaaaa  V V  aaaaa \n"
                             + " JJ  a     a  V  a     a ");

            System.out.println("4.Отображение min и max значений числовых типов данных.");

            byte firstByte = 127;
            byte maxByte = ++firstByte, minByte = --firstByte;
            short firstShort = 32767;
            short maxShort = ++firstShort, minShort = --firstShort;
            int firstInt = 2147483647;
            int maxInt = ++firstInt, minInt = --firstInt;
            long firstLong = 9223372036854775807l;
            long minLong = ++firstLong, maxLong = --firstLong;
            System.out.println(firstByte + " " + maxByte + " " + minByte + "\n"
                          + firstShort + " " + maxShort + " " + minShort + "\n"
                          + firstInt + " " + maxInt + " " + minInt + "\n"
                          + firstLong + " " + maxLong + " " + minLong);

            System.out.println("5.Перестановка значения переменных.");

            float a = 3.3f;
            float b3 = 5.2f;
            System.out.println(a);
            System.out.println(b3);

            float f;

            f = a;
            a = b3;
            b3 = f;
            System.out.println(a);
            System.out.println(b3);

            System.out.println("6.Вывод символов и их кодов");

            char code = 34, code1 = 38, code2 = 64, charCode = 94, charCode1 = 96;
            System.out.println((int)code + "-" +code + "\n"+
                              (int)code1 + "-" +code1 + "\n"+
                              (int)code2 + "-" +code2 + "\n"+
                              (int)charCode + "-" +charCode + "\n" +
                              (int)charCode1 + "-" +charCode1);

            System.out.println("7.Произведение и сумма цифр числа");

            int srcNum = 345;
            int intHun = srcNum / 100;
            int intDoz = srcNum / 10 % 10;
            int intUn = srcNum % 10;
            int srcNumSum = intHun + intDoz +intUn;
            int scrNumMult = intHun * intDoz * intUn;
            System.out.println(srcNumSum + "" + "\n" + scrNumMult);

            System.out.println("8.Вывод на консоль ASCII-арт Дюка");

            char symbol32 = 32, symbol40 = 40, symbol41 = 41, symb47 = 47, symb92 = 92, symb95 = 95;
            System.out.println(symbol32 + "" + symbol32 + "" + symbol32 + "" + symbol32 + "" + symb47 +
                               "" + symb92 + "\n"+ symbol32 + "" + symbol32 + "" + symbol32 +
                               "" + symb47 + "" + symbol32 + "" + symbol32 + "" + symb92 + "\n" +
                               "" + symbol32 + "" + symbol32 + "" + symb47 + "" + symb95 + "" + symbol40 +
                               "" + symbol32 +""+ symbol41 +""+ symb92 + "\n" +
                               "" + symbol32 +""+ symb47 + "" + symbol32 + "" + symbol32 + "" + symbol32 +
                               "" + symbol32 + "" + symbol32 + "" + symbol32 + "" + symb92 + "\n" +
                               "" + symb47 + "" + symb95 + "" + symb95 + "" + symb95 + "" + symb95 +
                               "" + symb47 + "" + symb92 + "" + symb95 + "" + symb95 + "" + symb92);

            System.out.println("9.Отображение количества сотен, десятков и единиц числа");

            int intNumber = 123;
            int intHundreds = 123/100;
            int intDozens = 123 / 10 % 10;
            int intUnits = 123 % 10;
            System.out.println(intNumber + " содержит: " + intHundreds + " сотню" + "\n"
                              +intNumber + " содержит: " + intDozens + " десятка" + "\n"
                              +intNumber + " содержит: " + intUnits + " еденицы");

            System.out.println("10.Преобразование секунд"); 

            int srcSeconds = 86399;
            int hours = srcSeconds/3600;
            int min = (srcSeconds % 3600) / 60;
            int sec = srcSeconds % 60;
            System.out.println(hours + ":" + min + ":" + sec);
        }
    }
