//every class you create needs a file name
public class Lesson1 {
	//to write a single comment use //
	//to write a multi-line comment use /* to start and */ to close the comment. 
		
	/*notice all the variable names start with lowercase and whenever
	 * we start the next word we use capital letter like 'theirNames' 
	 * with lowercase t and capital N. This is called 'Camel Case'.  
	 */
	//Every program will have to have a main method to run. 
	//we use {} curly brackets to open and close each section or method
			
	public static void main (String[]args) {
		/*variable are names that store info.
		before declaring a variable you need to say what data type it is.
		*/
		//double means number with decimal point like 3.5 or 100.25
		double theirAge;
		theirAge = 25.5; 
		//String means a regular word like apple, Marilyn, Jessie, etc.
		String theirName; 
		theirName= "Jessica"; 
		//int means a whole number without a decimal
		int theirIncome;  
		theirIncome = 65000;
		
		/*To print out to the console use System.out.print
		 * or use System.out.println to print on a new line 
		 * Dont forget after each line we put a semicolon; 
		 */ 
		System.out.print("This will print on the same line as the next statement. ");

		System.out.println("We are printing on a new line.");
		
		//Now we will use the variable and print them out
		//We use the + sign to put 2 separate things in the same line
		System.out.println("Her name is: " + theirName); 
		System.out.println("Age: " + theirAge); 
		System.out.println("Annual Income: $" + theirIncome); 
	}
}
