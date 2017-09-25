import java.util.Scanner;
public class factorial {
	public static void main(String args[]){
		int n,fact=1;
		char letter;
		int number;
		String s = "";
		Scanner keyboard = new Scanner(System.in);
		s = "y";
		letter = s.charAt(0);
		while (letter != 'n' && letter != 'N'){
			System.out.println("Enter in N:" );
			number = keyboard.nextInt();
			 fact=1;
			for(n=1;n<=number;n++){    
				fact=fact*n; 
			}
			System.out.println("Factorial: "+ fact);
			System.out.println("Do you want to continue?");
			s = keyboard.next();
			letter = s.charAt(0);			
		}
		System.out.println("Have a nice day!");
		keyboard.close();}
}