import java.util.*; 

public class testAverage {
	public static void main(String[]args) {
		
		Scanner keyboard = new Scanner(System.in);
		
	double score1;
	double score2; 
	double score3; 
	double average; 
	
	System.out.println("Please enter score of test 1: "); 
	score1 = keyboard.nextDouble(); 
	System.out.println("Please enter score of test 2: "); 
	score2 = keyboard.nextDouble(); 
	System.out.println("Please enter score of test 3: "); 
	score3 = keyboard.nextDouble(); 
	
	average = ((score1 + score2 + score3)/3);
	
	System.out.print("The three test scores were: "); 
	System.out.println(score1 + ", " + score2 + ", "+ score3); 
	
	System.out.println("The average of the 3 tests was: " + average); 
	
	}
}
