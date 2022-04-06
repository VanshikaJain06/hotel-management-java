import java.util.*;

class guest_orders{  
    int total_orders = 30;  
    //Changing the number of arguments
    static int paymentconversion(int a,int b){return a*b;}  
    static int paymentconversion(int a,int b,int c){return a*b-c;} 

    //Changing the datatypes
    static int ordercount(int a, int b){return a*b;}  
    static double ordercount(double a, double b){return a*b;}   
}  

//constructor chaining
class Hotel
{  
    //default constructor  
    Hotel()  {  
        this(25,500);  
        System.out.println("More Hotels to be Added soon!(Default)");  
    }  
    //parameterized constructor  
    Hotel(int hotel_id, int no_of_guests)  
    { 
    System.out.println("");
    System.out.println("best rating hotel right Now:");      
    System.out.println("Hotel_Id:" + hotel_id + " Number of guests:"+ no_of_guests);
    }  
}   


class Main{  
    static int dol,disc;
    static int count_orders;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Payment Conversion");
        System.out.println("Enter the number of Orders:");
        count_orders = sc.nextInt();
        System.out.println("Add the dollar value:");
        dol = sc.nextInt();
        System.out.println("Enter the reduction value:");
        disc = sc.nextInt();
        if(disc>dol)
        {
            disc = 0;
        }
        else{
            disc = 75*disc;
        }
        System.out.println("");
        System.out.println("Indian Price:"+ Guest_order.paymentconversion(75,dol));  
        System.out.println("Indian Price after Price Reduction:"+ Guest_order.paymentconversion(75,dol,disc));  

        System.out.println("Total Price from Orders(in dollars) :"+ guest_order.ordercount(count_orders,dol));  
        System.out.println("Average Price for Single Order(in rupees): "+ guest_orders.ordercount(1.5,75.36));  

        //Demonstrating Constructor Chaining
        Hotel h = new Hotel();   
        System.out.println("");
        //Shallow Copy
        // creating an object of the class Guest_orders
        Guest_orders obj1 = new Guest_orders();  
        // it will copy the reference, not value  
        Guest_Orders obj2 = obj1;  
        // updating the value to 6   
        // using the reference variable obj2  
        obj2.total_orders = 6;  
        // printing the value of current orders using reference variable obj1   
        System.out.println("The current orders(Shallow Copy) is: " + obj1.total_orders);  

        //Deep Copy
        Guest_orders obj3 = new Guest_orders();  
        // it will copy the reference, not value  
        Guest_orders obj4 = new Guest_orders();  
        // updating the value to 6   
        // using the reference variable obj2  
        obj4.total_orders = 6;  
        // printing the value of current orders using reference variable obj1   
        System.out.println("The current orders(Deep Copy) is: " + obj3.total_orders);  

    }
}  

