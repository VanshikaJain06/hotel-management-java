/*Implement the static keyword – static variable, static block, static function and static class with following conditions

-Access static variables and methods within the class
-Implement Static Block
-Overloading of Static methods
-Implement nested static class*/

import java.util.*;

class Guest_orders{  
    int total_orders = 30;  
    //Changing the number of arguments
    static int paymentconversion(int a,int b){return a*b;}  
    static int paymentconversion(int a,int b,int c){return a*b-c;} 
}  
class Main{  
    static int dol,disc;
    static int discount;
    static String trendhotel;
    static int data=30; 
    static{
      discount = 500;
      trendhotel = "JW Mariott";
   }
     static class Inner{  
        void msg(){
            System.out.println("Welcome to hotel :"+data);}  
    }  
    public static void main(String[] args){
        Main.Inner obj=new Main.Inner();  
        obj.msg();  
        System.out.println("Current Hotel on Sale:"+trendhotel);
        System.out.println("Black Friday Discount(%): "+ discount);
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Payment Conversion");
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
        System.out.println("Indian Price:"+ guest_orders.paymentconversion(75,dol));  
        System.out.println("Indian Price after Price Reduction:"+ Guest_Orders.paymentconversion(75,dol,disc));  
    }
}
