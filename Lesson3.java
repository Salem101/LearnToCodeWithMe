import java.util.*; 
//This import will allow you to use the scanner class to get input from the user
public class NameAgeIncome {

	public static void main(String[]args) {
		String name;
		int age;
		double annualPay; 
		
		Scanner keyboard = new Scanner(System.in);
//this program will store the user's name, age, and income
/* Program will display in the following manner: 
 * My name is (first) (last), my age is (#) and 
 * I earn ($xxx) per year. 
 */
		
		System.out.println("Please enter your name"); 
		name=keyboard.nextLine(); 
		//use nextLine to grab the entire line including first and last name
		//if you use  .next() it might only capture the first word and stop by the space
		System.out.println("Please enter your age"); 
		age=keyboard.nextInt(); 
		//use nextInt to capture the number
		System.out.println("Please enter your income"); 
		annualPay=keyboard.nextDouble(); 
		//use nextDouble to capture the next decimal number
		
		//print each line with it's variable
		System.out.println("My name is: " + name); 
		System.out.println("My age is: "+ age); 
		System.out.println("My annual income is: $"+ annualPay); 

	}
}
