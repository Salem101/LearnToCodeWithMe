import java.util.*; 

public class restaurantBill {
//In this program we are making a restaurant bill calculator
	//it will include calculating tax and optional tip
	
		public static void main(String[]args) {
			
			Scanner keyboard = new Scanner(System.in);
			
			double mealCost; 
			double tax; 
			double percentTax = .08; 
			double totalCost; 
			double tip; 
			
			
			System.out.println("Enter total meal cost:"); 
			mealCost = keyboard.nextDouble(); 
			tax = (mealCost * percentTax); 
			System.out.println("How much tip would you like to add?"); 
			tip = keyboard.nextDouble(); 
			//total cost is cost for meal with tax and tip
			totalCost = (mealCost + tax + tip); 
			System.out.printf("Meal Cost: " +"%.2f", mealCost);
			System.out.println(); 
			System.out.printf("Total tax: " +"%.2f", tax);
			System.out.println();
			System.out.printf("Tip total: " +"%.2f", tip);
			System.out.println();
			System.out.println("________________"); 
			System.out.printf("Total Bill: $" + "%.2f", totalCost); 
			
		}
}
