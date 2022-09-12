package Com.bhavna.Assessment;
import java.util.*;

public class TestFoodMain {

	public static void main(String[] args) {
		//Creating Object of Scanner class for taking Input from user;
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you existing customer \nIf yes then enter 1 else 0 ");
		int choice =sc.nextInt();
		// Creating Object of Account class for call
		Accounts acc =new Accounts();
		if(choice == 1) {
		// Calling  method of account
		acc.registration();
		}
		else if(choice ==0) {
		// Calling  method of account
		acc.login();}
		else {
			System.out.println("Ooho Wrong Choice1");
		}
		// Creating variable for logitude and latitude
		double logitude =989.99 ;
		double latitude = 7887.922;
		System.out.print("Logitude");
		//logitude = sc.nextDouble();
		System.out.println("Latitude");
		//latitude = sc.nextDouble();
		sc.close();
		//Creating object of Restaurant of class
		Restaurants rest = new Restaurants();
		//calling search method and pass logitude and latitude.
		rest.searchRestaurants(logitude, latitude);
		
	}

}
