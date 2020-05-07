import java.util.Scanner;

public class landCalculation {
	public static void main(String[]args) {
		
		double squareFeet; 
		double acres; 
		final double SF_ACRE = 43560; 
		//final means number can never be changed. I set the number to 43560. 
		//because 1 acre is 43560 square feet. 
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number of square feet"); 
		squareFeet = keyboard.nextDouble();
		
		//Let's calculate the acres: 
		acres = (squareFeet/SF_ACRE); 
		
		System.out.print("Square Feet: "+ squareFeet); 
		System.out.printf( " equals "+ "%.2f",acres); 
		System.out.print("acres");
		
		
		
	}
}
