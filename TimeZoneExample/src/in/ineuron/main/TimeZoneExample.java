package in.ineuron.main;

import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		
		TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");       
		   System.out.println("Value of ID is: " + timezone.getID());  
	}

}
