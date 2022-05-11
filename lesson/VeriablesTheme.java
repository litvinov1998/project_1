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
        System.out.println();
        System.out.println("2.Расчет стоимости товара со скидкой");
                int costProduct = 100;
                int costProduct1 = 200;
                int price = costProduct + costProduct1;
                int discountPercent = 11;
                int discountValue = price * discountPercent / 100;
                int newPrice = price - discountValue;
                System.out.println("Discount value - " + discountValue);
                System.out.println("New Price - " + newPrice);
        System.out.println();
        System.out.println("3.Вывод на консоль слова JAVA");
                    System.out.println("   J    a  v     v  a \n"
                                     + "   J   a a  v   v  a a \n"
                                     + "J  J  aaaaa  V V  aaaaa \n"
                                     + " JJ  a     a  V  a     a ");
        System.out.println();
        System.out.println("4.Отображение min и max значений числовых типов данных.");
                int firstByte = 127;
                int maxByte = ++firstByte, minByte = --firstByte;
                int firstShort = 32767;
                int maxShort = ++firstShort, minShort = --firstShort;
                int firstInt = 2147483647;
                int maxInt = ++firstInt, minInt = --firstInt;
                long firstLong = 9223372036854775807l;
                long minLong = ++firstLong, maxLong = --firstLong;
                System.out.println(firstByte + " " + maxByte + " " + minByte + "\n"
                                  + firstShort + " " + maxShort + " " + minShort + "\n"
                                  + firstInt + " " + maxInt + " " + minInt + "\n"
                                  + firstLong + " " + maxLong + " " + minLong);
        System.out.println();
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
        System.out.println();
        System.out.println("6.Вывод символов и их кодов");

                char code = 34, code1 = 38, code2 = 64, charCode = 94, charCode1 = 96;
                System.out.println((int) code + "-" +code + "\n"+
                                  (int) code1 + "-" +code1 + "\n"+
                                  (int) code2 + "-" +code2 + "\n"+
                                  (int) charCode + "-" +charCode + "\n" +
                                  (int) charCode1 + "-" +charCode1);
        System.out.println();
        System.out.println("7.Произведение и сумма цифр числа");
                int srcNum = 345;
                int intHun = srcNum / 100;
                int intDoz = srcNum / 10 % 10;
                int intUn = srcNum % 10;
                int sumDigits = intHun + intDoz +intUn;
                int productDigits = intHun * intDoz * intUn;
                System.out.println(sumDigits + "\n" + productDigits);
        System.out.println();
        System.out.println("8.Вывод на консоль ASCII-арт Дюка");
                char space = 32, oParenthesis = 40, cParenthesis = 41, slash = 47, backslash = 92, underscore = 95;
                System.out.println("" + space + space + space + space + slash + backslash + "\n"+ space + 
                                   "" + space + space + slash + space + space + backslash + "\n" +
                                   "" + space + space + slash + underscore + oParenthesis + space +
                                   "" + cParenthesis + backslash + "\n" + space + slash + space + 
                                   "" + space + space + space + space + space + backslash + "\n" +
                                   "" + slash + underscore + underscore + underscore + underscore +
                                   "" + slash + backslash + underscore + underscore + backslash);
        System.out.println();
        System.out.println("9.Отображение количества сотен, десятков и единиц числа");
                int Number = 123;
                int Hundreds = 123/100;
                int Dozens = 123 / 10 % 10;
                int Units = 123 % 10;
                System.out.println(Number + " содержит: " + Hundreds + " сотню" + "\n"
                                   + Number + " содержит: " + Dozens + " десятка" + "\n"
                                   + Number + " содержит: " + Units + " единицы");
        System.out.println();
        System.out.println("10.Преобразование секунд"); 
                int srcSeconds = 86399;
                int hours = srcSeconds/3600;
                int min = (srcSeconds % 3600) / 60;
                int sec = srcSeconds % 60;
                System.out.println(hours + ":" + min + ":" + sec);
        }
    }
