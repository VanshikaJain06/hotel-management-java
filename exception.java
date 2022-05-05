/*Implement Exception Handling with the following constraints
1.Implement at least 2 checked and unchecked exceptions
2.Nested 'try' and 'catch' with 'final' block
3.Implement 2 custom exception based on your domain*/

import java.io.*;

//Custom Exceptions
class SalaryException extends Exception  
{  
    public SalaryException(String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  

class HourException extends Exception  
{  
    public HourException(String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  


class Employee {
    int Emp_id, Dept_id, hours;
    String Emp_name, gender, email;
    float Emp_salary;

    Employee(int empid, int deptid, String empname, float empsalary) {
        Emp_id = empid;
		Dept_id = deptid;
        Emp_name = empname;
        Emp_salary = empsalary;
    }

    public void display() {
        System.out.println("Employee ID: "+this.Emp_id + " Name: "+this.Emp_name + " Hour Rate" + this.Emp_salary);
    }

    void compute(int hours){
       System.out.println("Today's expected salary:"+Emp_salary*24);
       if(hours<=24)
       {
       System.out.println("Today's received salary:"+ hours*Emp_salary);
       }
       else
       {
       System.out.println("Salary Cannot be Calculated! Hours exceeded!");
    	}
   }
}

class hotel {
    int hotel_id, rating;
    String hotel_name, hotel_type;
 
    hotel(int hotel_id, int rating, String hotel_name, String hotel_type) {
        this.hotel_id = hotel_id;
		this.rating = rating;
        this.hotel_name = hotel_name;
        this.hotel_type = hotel_type;
    }

    void display() {
        System.out.println("Hotel ID: "+hotel_id + " Hotel Name: "+hotel_name + " Hotel Type:" + hotel_type + " Ratings:" + rating);
    }
}

class Greet{
	private void message(){
	System.out.println("Hi Guests!");
	}
}

class HelloAnonymousClass extends Greet {
	interface HelloWorld 
	{
	public void sayHello();
	public void sayHelloTo(String someone);
	}

	public void sayHello() {
	class GreetWorld implements HelloWorld {
	String name = "Luxurious Hotel";
	public void sayHello() {
	sayHelloTo("");
	}
	public void sayHelloTo(String someone) {
	name = someone;
	System.out.println("Welcome to Hotel " + name);
	}
	}
	HelloWorld greetWorld = new GreetWorld();
	HelloWorld greetSomeone = new HelloWorld() {
	String name = "John";
	public void sayHello() {
	sayHelloTo("John");
	}
	public void sayHelloTo(String someone) {
	name = someone;
	System.out.println("Hope you enjoy the stay here, " + name);
	}
};
greetWorld.sayHello();
greetSomeone.sayHelloTo("Vanshika");
}
}

class Main{

   void welcome()    
   {    
	  System.out.println("Hey guests, You can get 50 percent off on DOOM ETERNAL today!");    
   }    

    static void validate (float salary) throws SalaryException{    
       if(salary<=0){  
  
        // throw an object of user defined exception  
        throw new SalaryException("Salary should be more than 0"); 
    }  
       else {   
        System.out.println("Valid Salary");   
        }   
     }    
    
    static void validate2 (int hour) throws HourException{    
       if(hour<=4){  
  
        // throw an object of user defined exception  
        throw new HourException("This Employee Must Meet the Manager immediately");    
    }  
       else {   
        System.out.println("You have worked limited required hours at our hotel. Good job!");   
        }   
     }    


    public static void main(String args[]) throws IOException {
	int ch; // for storing user's choice
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try
    {
		FileReader file = new FileReader("somefile.txt");
	}
    catch (FileNotFoundException e)
    {
    	//Alternate logic
		e.printStackTrace();
	}
	try
	{
		try  
		{  
		Class cls = Class.forName("Main");   
		//creates an instance of the class using the newInstance() method  
		Main obj = (Main)cls.newInstance();   
		//invoking the welcome() method  
		obj.welcome();
		}
		catch (ClassNotFoundException e)   
		{   
			e.printStackTrace();   
		}   
		catch (InstantiationException e)   
		{   
			e.printStackTrace();   
		}   
		catch (IllegalAccessException e)   
		{   
			e.printStackTrace();   
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}    
	finally
	{
		System.out.println("");
		System.out.println("Manage Hotel Employees and Hotels");
		System.out.println("");
	}
	
	//Anonymous Class
	HelloAnonymousClass myApp = new HelloAnonymousClass();
	myApp.sayHello();

	System.out.println("1. Add/Manage Employee ");
    System.out.println("2. Add/Manage Hotels");
    System.out.println("Enter your choice:");
	ch=Integer.parseInt(br.readLine());
	switch(ch)
	{
	
	//Creating Array of Object
	case 1:	Employee e[] = new Employee[2];
        	for(int i=0; i<2; i++){
            		System.out.println("Enter the Emp_ID, Dept_ID, Name and Hourly Rate of Employee("+ (i+1) +")");
            		int Emp_id = Integer.parseInt(br.readLine());
 	    			int Dept_id = Integer.parseInt(br.readLine());
            		String Emp_name = br.readLine();
            		float Emp_salary = Float.parseFloat(br.readLine());
                    try  
                    {  
                        // calling the method   
                        validate(Emp_salary);  
                    }  
                    catch (SalaryException ex)  
                    {   
                        System.out.println("Exception occured: " + ex);  
                    }     
                    
	    		System.out.println("Enter the number of hours worked:");
	    		int hours = Integer.parseInt(br.readLine());
                 try  
                    {  
                        // calling the method   
                        validate2(hours);  
                    }  
                    catch (HourException ex)  
                    {   
                        System.out.println("Exception occured: " + ex);  
                    }  
            	e[i] = new Employee(Emp_id,Dept_id, Emp_name, Emp_salary);
 	    		e[i].compute(hours);
        	}
        	System.out.println("Employee Details: \n-------------------");
        	for(int i=0; i<2; i++){
            	e[i].display();
        	}
		break;
	
	case 2: hotel g[] = new hotel[2];
        	for(int i=0; i<2; i++){
            		System.out.println("Enter the hotel_id, ratings, hotel_name and hotel_type("+ (i+1) +")");
            		int hotel_id = Integer.parseInt(br.readLine());
 	    			int ratings = Integer.parseInt(br.readLine());
            		String hotel_name= br.readLine();
			        String hotel_type= br.readLine();
            		g[i] = new hotel(hotel_id,ratings, hotel_name, hotel_type);
        	}
        	System.out.println("Hotel Details: \n-------------------");
        	for(int i=0; i<2; i++){
            	g[i].display();
        	}
		break;
	
	default: System.out.println("Wrong Choice!");
	}

    }
}