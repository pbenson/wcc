package averager;
import java.util.Scanner;

public class Averager {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int total = 0;
		for(int i = 0; i < 3; i++) {
			System.out.printf("Integer %d:", i + 1);
			total += keyboard.nextInt();
		}
		
		System.out.printf("The average of those numbers is %f", total / 3f);
		keyboard.close();
	}
}
