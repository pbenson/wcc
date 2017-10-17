package stringMethods;

public class StringMethods {

	public static void main(String[] args) {


		 import java.util.Scanner;  

	    	private String myStr=""+ input;         
			public void readString()     {   
			
				Scanner keyboard = new Scanner(System.in);
				
				System.out.println("Enter a string: ");
				String input = nextLine();
				// Prompt the user and read in a String from a Scanner class from the keyboard          
				// with the nextLine() method and store it in "myStr"   
				}     
				public void setString(String s)    
				{         myStr =s;     }   
				public int countOccurrences(String s)   
				{   
					int count = 0;
					for (int i=0; i< len; i++)
						char s = s.charAt(i);
						if (s == 's')
							count +=1;
				}
					int index = s.indexOf('s', index +1);
					System.out.println("index =" +index);
					// use indexOf and return the number of occurrences of the string "s" in "myStr"     
					}     public int countOccurrences(char c)    
					{         // use indexOf and return the number of occurrences of the character "c" in "myStr"   
					int index = s.indexOf('c', index +1);
					System.out.println("index =" +index);
						
					}     int countUpperCaseLetters()    
					
							String.toUpperCase();
							int index = s.indexOf(toUpperCase);
							
					
					{         // return the number of upper case letters in "myStr"   
						
					} 
				}
			}

				int countLowerCaseLetters()     { 
					String.toLowerCase();
					int index = s.indexOf(toLowerCase);
					// return the number of lower case letters in "myStr"   
					}     public void printCounts(String s, char c)     
					{    
					System.out.println("***************************************");        
					System.out.println("Analyzing: myStr="+myStr);        
					System.out.println("Number of Upper case letters="+ countUpperCaseLetters());        
					System.out.println("Number of Lower case letters="+ countLowerCaseLetters());         
					System.out.println("Number of "+s + " is "+ countOccurrences(s));         
					System.out.println("Number of "+c + " is "+ countOccurrences(c));   
					} 
					

					public static void main(String[] args) {        
						MyStringMethods msm = new MyStringMethods();   
						msm.readString();        
						msm.printCounts("big", 'a');               
						msm.setString("Parked in a van down by the river bank .... The van evan  vanished  near a lot of other vans"); 
						msm.printCounts("van", 'a');            
						MyStringMethods msm2 = new MyStringMethods();    
						msm2.setString("the elephant in the room wouldn't budge");     
						msm2.printCounts("the", 'i');   
						} 
					


			}

		
}
}
}
}
}