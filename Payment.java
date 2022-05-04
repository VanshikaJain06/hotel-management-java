/*
Implement Interface and Packages with following constraints
1.Multiple Inheritance using interface
2.Extending Interface
3.Default and Static method inside interface
4.Nested Interface
5.Implement package with fully qualified name and display the package information using Package class*/

package hotel;
import java.util.*;
interface PC1 {
 
    // Default method
    default int paymentconversion(int a,int b){return a*b;}  
}

interface Welcome extends PC1 {
    void print();  
    interface MessagePrintable{  
        void msg();  
    }
}
// Interface 2
interface PC2 {
 
    // Default method
    static int paymentconversion(int a,int b,int c){return a*b-c;}
}
class Message implements Welcome.MessagePrintable
{  
 public void msg(){System.out.println("Hey Customers, You can get 50 percent off today!");}  
}

// Main class
// Implementation class code
class Payment implements PC1, PC2 {
    int dol,disc;
    int discount;
    public int paymentconversion()
    {
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
        System.out.println("Indian Price:"+ PC1.super.paymentconversion(75,dol));  
        System.out.println("Indian Price after Price Reduction:"+ PC2.paymentconversion(75,dol,disc));  
        return PC2.paymentconversion(75,dol,disc);
    }
 
    // Main driver method
    public static void main(String args[])
    {
        Welcome.MessagePrintable message=new Message();//upcasting here  
        message.msg();  

        Payment d = new Payment();
        d.paymentconversion();
    }
}