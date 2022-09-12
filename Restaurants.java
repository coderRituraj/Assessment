package Com.bhavna.Assessment;
import java.util.*;

public class Restaurants {
	//Method to search hotel, that is nearest to your location.
	public void searchRestaurants(double logitude , double latitude) {
		int n = noOfHotels();
		
		if(n<5) {
			System.out.println("Checking within the radius of 2.5 km");
		}
		else {
			System.out.println("checking within the radius 1.5 km");
		}
		System.out.println("Nearest Restaurant list :-");
		for(int i = 0;i<n;i++) {
			System.out.println("Restaurant"+i);
		
		}
	}
	// Method to count number of hotel and generate randomaly.
	public int noOfHotels() {
		Random rand = new Random();
		int max = 11;
		int n = rand.nextInt(max);
		return n;
	}
	

}
