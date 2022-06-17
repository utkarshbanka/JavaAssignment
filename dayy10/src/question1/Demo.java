package question1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount)
	{
		if(amount <= 200)
		{
			RoadSideHotel road = new RoadSideHotel();
			return road;
		}
		else 
		{
			TajHotel  taj = new TajHotel();
			return taj;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Scanner sc = new Scanner(System.in);
	    int am = sc.nextInt();
		
	    Demo a = new Demo();
	    Hotel hotel = a.provideFood(am);
	    if(hotel!=null)
	    {
	    	hotel.chickenBiryani();
	    	hotel.masalaDosa();
	    	if(hotel instanceof TajHotel)
	    	{
	    		((TajHotel)hotel).welcomeDrink();
	    	}
	    }
		
		
		
	}

}
