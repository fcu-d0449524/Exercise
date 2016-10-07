package lab3;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc = 0;
		float a =0;
		String b;
		
		System.out.println("輸入一個INT");
		Scanner scan= new Scanner(System.in);
		abc=scan.nextInt();
		
		System.out.println("輸入一個FLOAT");
		Scanner scan1 = new Scanner(System.in);
		a=scan1.nextFloat();
		
		System.out.println("輸入一個NAME");
		Scanner scan2 = new Scanner(System.in);
		b=scan2.nextLine();
		
		
		
		
		System.out.printf("Hi %s, the multiplication of %d and %f is %4.2e. ",b,abc,a,abc*a);
		
		
		
	}

}
