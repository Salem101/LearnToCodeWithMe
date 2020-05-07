import java.util.*; 

public class stringManipulator {

	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter name of city"); 
		String cityName = keyboard.nextLine();
		
		//lets take the city name and find: 
		//# of characters in word      variable.length(); 
		System.out.println("Number of characters in "+ cityName + " is " + cityName.length());
		
		//word in all uppercase   variable.toUpperCase();
		System.out.println("City in all uppercase: "+ cityName.toUpperCase());
		
		//word in all lowercase    variable.toLowerCase();
		System.out.println("City in all lowercase: "+ cityName.toLowerCase());
		
		//print only first character of word  variable.charAt(0); (0 is first letter, 1 is second letter, etc.)
		System.out.println("City's first character: " + cityName.charAt(0));
		
	}
}
