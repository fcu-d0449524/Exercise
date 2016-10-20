package lab3;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("the stringA is abc");
		String A="abc",B;
		System.out.println("Enter the stringB");
		Scanner scan= new Scanner(System.in);
		B=scan.nextLine();
		
		for(int i = 0; i < 99; i++){
		if(!A.equals(B))
			{
		    	System.out.println("not same");
		    	Scanner scan1= new Scanner(System.in);
				B=scan1.nextLine();
			}
		else
		{System.out.println("same");
		
		break;}
		}	
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
