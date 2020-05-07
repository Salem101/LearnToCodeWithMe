import java.util.*; 

public class calorieCounter {

	//this program calculates the total # of calories per item/container
	public static void main(String[]args) {
		Scanner keyboard = new Scanner (System.in);
		
		int servings; 
		int calPerServing; 
		int calPerContainer; 
		int servingSize; 
		int itemsPerContainer; 
		
		System.out.println("Enter total serving per container");
		servings= keyboard.nextInt(); 
		System.out.println("Enter total calories per serving");
		calPerServing= keyboard.nextInt(); 
		System.out.println("Enter total serving size");
		servingSize= keyboard.nextInt(); 
		
		calPerContainer = (servings * calPerServing); 
		System.out.println("Total calories per container: " + calPerContainer + "."); 
		
		itemsPerContainer=(servingSize*servings); 
		System.out.println("There are " + itemsPerContainer + " items in the container. "); 
		
		System.out.println("# Stop counting your calories"); 		
		
		
	}
}
