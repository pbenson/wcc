//package breaking_it_down;
//import java.util.Scanner;
//
//public class BreakingItDown {
//	private double num1=0;
//	private double num2=0;
//	private static String answer="";
//
//
//
//	//get method
//	public String getStart() {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter your operand + - * / or q to quit:");
//		String answer = input.nextLine();
//		answer = answer.trim();
//		input.close();
//		
//		return answer;
//	}
//	
//	
//	
//	public double getNum1() {
//		System.out.println("Please enter the first number: ");
//		Scanner input = new Scanner(System.in);
//		double num1 = input.nextDouble();
//		input.close();
//		
//		return num1;
//	}
//	
//	public double getNum2() {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter the second number: ");
//		double num2 = input.nextDouble();
//		input.close();
//		
//		return num2;
//	}
//	//addition method
//	public double addition(double num1, double num2) {
//		this.num1 = getNum1();
//		this.num2 = getNum2();
//		
//		double added = num1 +num2;
//		
//		System.out.println();
//		return added;
//		
//	}
////	//subtraction method
////	public int subtraction() {
////		
////	}
////	//multiply method
////	public int multiply() {
////		
////	}
////	//divide method
////	public int divide() {
////		
////	}
//	
//	//quit
//	public void quit() {
//		
//	}
//	
//	
//
//	public static void main(String[] args) {
//		BreakingItDown go = new BreakingItDown();
//		go.getStart();
//		while (answer != "q") {
//			
//				if (answer.length() != 1) {
//					System.out.println("Your operator is bad, try again");
//					getStart();
//				} 
//					 
//				switch (answer)
//					{
//					case "q":
//						;
//					case "+":
//						addition(num1, num2);
////					case "-":
////						subtraction();
////					case '*':
////						multiply();
////					 case '/':
////						 divide();
//					 default:
//					 System.out.println("Your operator is bad ... try again:");
//					 //getStart();
//					 }
//					 
//			
//		}
//		
//		
//		
//	}
//
//}
