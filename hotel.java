/*
Lab 6
Implement the following concepts in your domain
1.String Class
2.Draw the memory layout of string class with reference variable and object
3.StringBuffer Class
4.StringBuilder Class*/

import java.util.*;
import java.io.*;

class Hotel
{
    int Hotel_id, No_of_Rooms;
    String Hotel_name, City;
 
    Hotel(int hotelid, int noofrooms, String hotel_name, String city) {
        Hotel_id = hotelid;
		No_of_Rooms= noofrooms;
        hotel_name = hotel_name;
        City = city;
    }

    void display() {
        System.out.println("Hotelt ID: "+this.Hotel_id  + " City:" + this.City + " No of Rooms:" + No_of_Rooms);
    }
}

class Payment
{
     void coupon(){
        StringBuilder sb=new StringBuilder("Welcomehere");  
        sb.reverse();  
        System.out.println("Today's Coupon Code:");
        System.out.println(sb);
    }

    void calculate()
    {
        String c1 = new String("payment123cw");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the Total Price");
        float price = sn.nextFloat();
        System.out.println("Enter Coupon Code - if any");
        String coupon = sn.next();
        
        if(coupon.equals(c1))
        {
            price = price/2;
            System.out.println("Half Price Coupon Applied!");
            System.out.printf("Final Price %.2f \n\n", price);
        }
        else
        {
            System.out.println("Coupon cannot be identified!");
            System.out.printf("Final Price %.2f \n\n", price);
        }

    }

}

class Main
{
    public static void main(String args[])
    {
        Scanner sn = new Scanner(System.in);
        Payment b = new Payment();
        b.coupon();
        b.calculate();

        Hotel g[] = new Hotel[2];
        for(int i=0; i<2; i++){
            System.out.println("Enter the Hotel_ID, No of Rooms, City and Hotel Name("+ (i+1) +")");
            int Hotel_id = sn.nextInt();
 	    	int No_of_Rooms = sn.nextInt();
    		String City= sn.next();
			String hotel_name= sn.next();
            g[i] = new Hotel(Hotel_id,No_of_Rooms, City, hotel_name);
           
            StringBuffer sb=new StringBuffer(hotel_name);  
            sb.delete(1,3);  

            System.out.println("");
            System.out.println("Generated Unique ID:"+ sb + Hotel_id);
            System.out.println("Generated Unique Key: " + WlcometoHotel(City, 10) + "><<exit<>");
            System.out.println("");
        	}
        	
        System.out.println("Hotel Details: \n-------------------");
        for(int i=0; i<2; i++){
            	g[i].display();
        }
    }
        public static String WlcometoHotel(String str, int n) {
             return String.format("%1$" + n + "s", str).replace(' ', '#');
        }

}