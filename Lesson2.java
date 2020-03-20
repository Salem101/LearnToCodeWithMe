//You need to import the scanner to be able to use it to get data from user
import java.util.Scanner; 

//public means its visible to the public (it's not private)
public class IOchallenge {

	public static void main (String[]args) {
		//use the scanner object to get info from the user
		Scanner scan = new Scanner(System.in);
		//print a question 
		System.out.println("What's your first number?"); 
		//'a' will hold the answer that the user typed in 
        int a = scan.nextInt();
		System.out.println("What's your second number?"); 
        int b = scan.nextInt(); 
		System.out.println("What's your third number?"); 
        int c = scan.nextInt(); 
        // use the + sign to write separate variables in the same line is called cancatination
        //putting " " around words makes them strings 
        System.out.println("1st Number: " + a); 
	System.out.println("2nd Number: " + b); 
        System.out.println("3rd Number: " + c); 
    }
}
