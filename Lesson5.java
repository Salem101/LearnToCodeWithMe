import java.util.*; 

public class charityPrediction {

	public static void main(String[]args) {
//every year a company pays %12 of their income to charity
//write a program to calculate it for them
			
		Scanner keyboard = new Scanner (System.in);
		
		double annualIncome; 
		double percentCharity; 
		double donationTotal; 
			
	System.out.println("Please enter the annual income of your company"); 
	annualIncome= keyboard.nextDouble(); 
	System.out.println("What percentage would you like to donate to charity?"); 
	percentCharity= keyboard.nextDouble(); 
	
	double percentage = (percentCharity/100); 
	//the reason i am using the variable percentage is when multiplying I need to make it into decimal: 10% = .10, 25%=.25, etc.
	// the equation for this is just dividing it by 100
		
	donationTotal = (annualIncome*percentage);
	System.out.printf("Total donation to Charity: $"+ "%.2f",donationTotal);
	//use printf if you want to change the way it's displayed. 
	/*using printf, I wrote "%.2f",variable  this makes sure it displays it with 
	2 decimal spaces. 
	If I didn't use this it will display the answer as such: $125.0 or $1523.253243
	(and we obviously don't want that in regards to currency)
	*/
	}
}
