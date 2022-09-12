package Com.bhavna.Assessment;
import java.util.*;
public class Accounts {
	// Method to register new user.
	public void registration() {
		Scanner sc = new Scanner(System.in); // Creating object of Scanner class
		System.out.println("Registration Page :");
		System.out.print("Enter here name"); 
		String name = sc.next(); // Creating name as variable , for store name from 
		System.out.print("Enter Mobile Number :");
		Long mobileNumber = sc.nextLong();
		System.out.print("Enter Email-id : ");
		String emailId = sc.next();
		sc.close();
		System.out.println("\t\tYou have Successfully registered");
	}
	//Method to login existing user 
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****Login Page****");
		System.out.print("Enter your register mobile number");
		Long mobileNumber = sc.nextLong();
		System.out.print("Kidly verify your number");
		int otp = sc.nextInt();
		sc.close();
		System.out.print("\n\t Login Successful");
		
	}

}
