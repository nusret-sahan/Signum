package csd;

import java.util.Scanner;

class App {

	public static void main(String[] args) 
	{
		for (;;)
			signumTest.run();
	}
	
}

class signumTest {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int val = kb.nextInt();
		signumClass.signum(val);
	}
}
class NumberUtil {
	public static int signum(int val)
	{
		if (val < 0) {
			System.out.println("Girdiğiniz sayı sıfırdan küçük.\n");
			return -1;
		}
		else if (val > 0) {
			System.out.println("Girdiğiniz sayı sıfırdan büyük.\n");
			return 1;
		}
		else {
			System.out.println("Girdiğiniz sayı sıfırdır.\n");
			return 0;
		}
	}
}
