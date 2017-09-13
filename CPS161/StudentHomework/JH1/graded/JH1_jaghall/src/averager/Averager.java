package averager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Averager {
	public static void main(String[] args) {
		
		int total = 0;
		List<Integer> nums = new ArrayList<>();

		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 3; i > 0; i--) {
			System.out.println("Enter int");
			int value = keyboard.nextInt();
			nums.add(value);
			
			total += value;
		}
		
		System.out.println("Average is: " + total / 3);
		
	}
}