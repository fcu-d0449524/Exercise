package lab3;
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc;
		
		System.out.println("輸入一個INT");
		Scanner scan= new Scanner(System.in);
		abc=scan.nextInt();
		
		if(abc%2==0)
		System.out.printf("這是偶數");
		else
		System.out.printf("這是奇數");
		
		
		
		

	}

}
