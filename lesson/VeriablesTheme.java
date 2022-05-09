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
		
		
		System.out.println("\n  cpu - " + cpu
				         +"\n  vRamMB - " + vRamMB
		                 +"\n  ramMB - " + ramMB
		                 +"\n  gpuMHz - " + gpuMHz
		                 +"\n  cpuMHz - " + cpuMHz
		                 +"\n  ccdGB - " + ccdGB);
		
		System.out.println("Расчет стоимости товара со скидкой");

		int x = 100;
		int y = 200;
		int price = x + y;
		int discountPercent = 11;
		int discountValue = price*discountPercent/100;
		int newPrice = price - discountValue;
		System.out.println("Discount value - " +discountValue);
		System.out.println("New Price - " + newPrice);
		
		System.out.println("Вывод на консоль слова JAVA");
		
		System.out.println("   J    a  v     v  a           \r\n"
				         + "   J   a a  v   v  a a          \r\n"
				         + "J  J  aaaaa  V V  aaaaa         \r\n"
				         + " JJ  a     a  V  a     a");
		
		System.out.println("Отображение min и max значений числовых типов данных.");
		
		byte b = -128, b1 = 127;
		System.out.println(b1);
		
		byte bmin = (byte) (b + 1);
		byte bmax = (byte) (b1 - 1);
		System.out.println(bmin);
	    System.out.println(bmax);

	    System.out.println("Перестановка значения переменных.");
	   
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
	    
	    
	    System.out.println("Вывод символов и их кодов");
	    
	    char t1 = 34, t2 = 38, s1 = 64, e1 = 94, e2 = 96;
		System.out.println("34 - "+t1);
		System.out.println("38 - "+t2);
     	System.out.println("64 - "+s1);
	    System.out.println("94 - "+e1);
	    System.out.println("96 - "+e2);
	    
	    
	    System.out.println("Произведение и сумма цифр числа");
	    
	    int i2 = 345;
	    int d1 = 3, d2 = 4, d3 = 5;
	    int d4 = d1*d2*d3;
	    i2 = d4;
	    System.out.println(i2);
	    
	    int d5 = d1+d2+d3;
	    i2 = d5;
	    System.out.println(i2);
	    
	    System.out.println("Вывод на консоль ASCII-арт Дюка");
	    
	    int c = 32, c1 = 40, c2 = 41, c3 = 47, c4 = 92, c5 = 95; 
	    System.out.println("    /\\                                                                                                                                       \r\n"
	    		         + "   /  \\                                                                                                                                      \r\n"
	    	             + "  /_( )\\                                                                                                                                     \r\n"
	    		         + " /      \\                                                                                                                                    \r\n"
	    		         + "/____/\\__\\\r");
	    System.out.println(c);
	    
	    
		System.out.println("Отображение количества сотен, десятков и единиц числа");
	    
	    int in = 123/100;
	    int in1 = 123/ 10 % 10;
	    int in2 = 123 % 10;
	    System.out.println("Число 123 содержит: " + in + " сотню");
	    System.out.println("Число 123 содержит: " + in1 + " десятка");
	    System.out.println("Число 123 содержит: " + in2 + " еденицы");
	    
	    System.out.println("Преобразование секунд");
	   
	    int hours = 86399/3600;
	    int minuts = (86399 % 3600) / 60;
	    int sec = 86399 % 60;
	    System.out.println(hours + ":" + minuts + ":" + sec);
 
	    
	}
}

