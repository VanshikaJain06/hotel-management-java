//LAB 10
// Java program to Iterate the elements
// in an ArrayList
 

import java.util.*;
 
// Main class
class MyHotel {
 
    // Main driver method
    public static void main(String args[])
    {
        // Creating an Arraylist of string type
        ArrayList<String> al = new ArrayList<>();
 
        // Adding elements to ArrayList
        //  using standard add() method
        al.add("welcome");
        al.add("Hotel");
        al.add(1, "to my");


  
        // Create an iterator for the list
        // using iterator() method
        Iterator<String> iter  = al.iterator();
  
        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values"
                           + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        {
            //Creating linked list of string type
            LinkedList<String> a1= new LinkedList<>();
       
            a1.add("Welcome");
            a1.add("to my");
            a1.add(1, "Hotel");
       
 
        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++) {
 
            System.out.print(al.get(i) + " ");
        }

 
        System.out.println();
 
        
    }
    System.out.printf("\n\n");
    //creating hashset
    HashSet<String> set=new HashSet<String>();
    //adding elemnts to hashset  
    set.add("TAJ HOTEL");  
    set.add("RADISSION BLU");  
    set.add("JW MARIOTT");  
    set.add("HOTEL TULIP");  
    //Traversing elements  
    Iterator<String> itr=set.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
  }  
  //creating tree set
  TreeSet<String> sett=new TreeSet<String>();  
  //adding elemnts to treeset
  sett.add("price is 2400");  
  sett.add("price is 3000");  
  sett.add("price is 4000");  
  sett.add("price is 5000");  
  System.out.println("Traversing element through Iterator in descending order");  
  Iterator i=sett.descendingIterator();  
  while(i.hasNext())  
  {  
      System.out.println(i.next());  
  }  
    
}  
}


