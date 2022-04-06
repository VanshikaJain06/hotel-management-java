import java.io.*;
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

class Room {
    int Room_id, No_of_Room;
    String status, Room_type;
 
    Room(int roomid, int noofroom, String platform, String Room_Type) {
        Room_id = roomid;
	No_of_Room = noofroom;
        Status = status;
        Room_type = room_Type;
    }

    void display() {
        System.out.println("Room ID: "+this.Room_id + " Status: "+this.Status + " Room Type:" + this.Room_type + " No of Room:" + No_of_Room);
    }
}

class Greet{
	private void message(){
	System.out.println("Hello Guests!");
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
	String name = "RoyalRetreat";
	public void sayHello() {
	sayHelloTo("");
	}
	public void sayHelloTo(String someone) {
	name = someone;
	System.out.println("Welcome to RoyalRetreat " + name);
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
	System.out.println("check our list of hotels, " + name);
	}
};
greetWorld.sayHello();
greetSomeone.sayHelloTo("Vanshika");
}
}

class Main{

   void welcome()    
   {    
	  System.out.println("Hey Customers, You can get 50 percent off on DOOM ETERNAL today!");    
   }    
    
   public static void main(String args[]) throws IOException {
	int ch; // for storing user's choice
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
	    		System.out.println("Enter the number of hours worked:");
	    		int hours = Integer.parseInt(br.readLine());
            		e[i] = new Employee(Emp_id,Dept_id, Emp_name, Emp_salary);
 	    		e[i].compute(hours);
        	}
        	System.out.println("Employee Details: \n-------------------");
        	for(int i=0; i<2; i++){
            	e[i].display();
        	}
		break;
	
	case 2: Room r[] = new Room[2];
        	for(int i=0; i<2; i++){
            		System.out.println("Enter the Room_ID, No of Room, Room status and Room Type("+ (i+1) +")");
            		int Room_id = Integer.parseInt(br.readLine());
 	    		int No_of_Room = Integer.parseInt(br.readLine());
            		String Platform= br.readLine();
			String Room_type= br.readLine();
            		r[i] = new Room(Room_id,No_of_Room, status, Room_type);
        	}
        	System.out.println("Room Details: \n-------------------");
        	for(int i=0; i<2; i++){
            	r[i].display();
        	}
		break;
	
	default: System.out.println("Wrong Choice!");
	}

    }
}