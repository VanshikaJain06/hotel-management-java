/*
Lab 7
Implement following concepts based on your domain
1.Any two type of inheritance
2.Aggregation
3.Composition
4.Accessing parent class variable, method and constructor using super
5.Reusing parent constructor using super
6.Abstract class with constructor member and methods
7.Use final keyword in appropriate places*/

import java.util.*;

abstract class HotelDisplay{  
  abstract void show(); 
  void HotelDisplay()
  {
     System.out.println("Welcome to the Taj Hotel");
  } 
}  

class Welcome extends HotelDisplay
{
    int hotels = 50;
    void show()
    {
        System.out.println("Welcome to Hotel Database!");
		System.out.printf("Currently there are %d hotels present in the database of Hotel!\n\n", games); 
    }
    public Welcome()
    {
        super();
    }

    public Welcome(int i, int j)
    {
        System.out.printf("There are currently %d games with %d Roomss available in hotel \n\n",i,j);
    }
} 

class Hotel extends Hoteldisplay
{
	int id;
	String name, Room;
	void read()
	{
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the Hotel Name");
		name = sn.next();
		System.out.println("Enter the Room");
		Room = sn.next();
		System.out.println("Enter the Guest ID");
		id = sn.nextInt();
	}
	void show()
	{
		System.out.println("Hotel Database");
		System.out.println("****************");
		System.out.printf("Hotel Name :%s \n",name);
		System.out.printf("Room :%s \n",Room);
		System.out.printf("Guest ID :%d \n",id);
	}
}

class Details extends Hotel
{
	String companyName, Description, Rating;
	void read()
	{
		Scanner sn = new Scanner(System.in);
		super.read();
		System.out.println("Enter the Company Name");
		companyName = sn.next();
		System.out.println("Enter Description");
		Description = sn.next();
		System.out.println("Enter the Hotel Rating ");
		Rating = sn.next();
	}
	void display()
	{
		super.show();
		System.out.printf("Company Name :%s \n",companyName);
		System.out.printf("Description :%s \n",Description);
		System.out.printf(" Rating :%s \n",Rating);
		
	}
}

class Reviews extends Details
{
	float pl,pr,nr, totalreviews, prpercent, nrpercent;
	void read()
	{
		Scanner sn = new Scanner(System.in);
		super.read();
		System.out.println("Enter the Number of Guests");
		pl = sn.nextFloat();
		System.out.println("Enter the number of Positive Reviews");
		pr = sn.nextFloat();
		System.out.println("Enter the number of Negative Reviews");
		nr = sn.nextFloat();
	}
	
	void Net_salary()
	{
        final int disc = 100;
		totalreviews = pr + nr ;
		System.out.printf("Total Reviews: %.2f \n", totalreviews);
        prpercent = pr/totalreviews * disc;
        System.out.printf("Postive Review Percentage: %.2f \n", prpercent );
        nrpercent = nr/totalreviews * disc;
        System.out.printf("Negative Review Percentage: %.2f \n", nrpercent );
	}
	void display()
	{	
		System.out.println("-------------------------");
		super.display();
		System.out.println("-------------------------");
	}
		
}

class Guests {   
    int count; 
    String country;    
    // initialize Guests using constructor  
    public Guests(int count, String country) {    
        this.count = count;     
        this.country = country;  
    }    
}  

//Aggregation Example
class BookingOnly {
    int b_id;
    Guests No_of_Guests;
    String Booking_name, Booking_status;
 
    BookingOnly(int bookingid, Players noofguests, String booking_Name, String booking_Status) {
        Booking_id = bookingid;
		No_of_Guests = noofguests;
        Booking_name = booking_Name;
        Booking_status = booking_Status;
    }

    void display() {
        System.out.println("Booking ID: "+this.Booking_id + " Booking Name: "+this.Booking_name + " Booking Status:" + this.Booking_status + " No of Guests(Country):" + No_of_Guests.count + " " + No_of_Guests.country);
    }
}


final class Main
{
	public static void main(String args[])
	{
		HotelDisplay g = new Welcome();
        g.show();
        Welcome w = new Welcome(10,20);
		Scanner sn = new Scanner(System.in);
		Reviews r= new Reviews();
		r.read();
		r.display();
		r.Net_salary();

        Guests p1 = new Guests(200,"India");
        Guests p2 = new Guests(3755,"Spain");

        BookingOnly g1 = new BookingOnly(1,p1,"Smith","confirm");
        BookingOnly g2 = new BookingOnly(2,p2,"Justin","confirm");
        System.out.println("");
        g1.display();
        System.out.println("");
        g2.display();

	}
		
}
	
