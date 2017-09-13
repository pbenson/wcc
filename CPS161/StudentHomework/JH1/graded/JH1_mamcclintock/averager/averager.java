package averager;

import java.util.Scanner;

public class averager {

public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter integer 1:");
        int firstInt;
        firstInt = keyboard.nextInt();
        
        System.out.println("Enter integer 2:");
        int secondInt;
        secondInt = keyboard.nextInt();
        
        System.out.println("Enter integer 3:");
        int thirdInt;
        thirdInt = keyboard.nextInt();
        keyboard.close();
        System.out.println("You have entered: ");
        System.out.println("Integer 1: " + firstInt);
        System.out.println("Integer 2: " + secondInt);
        System.out.println("Integer 3: " + thirdInt);
        
        double average = (firstInt+secondInt+thirdInt)/3.0;
        
        System.out.println("The average of these integers is " + average);
        

}

}
