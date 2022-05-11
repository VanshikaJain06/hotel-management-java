/*
Implement multithreading with the following constraints
1.Create a thread using Runnable interface and by extending thread class(Display the current thread also)
2.Thread Priority
3.Implement methods such as join(),sleep,notify(),notifyALL()
4.Synchronized method */
import java.util.*;

class Hotel extends Thread{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
}

class Hotel2 implements Runnable{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
}


class OddEvenNumberPrinterThread implements Runnable{
    static int counter = 0;
    static Object lock = new Object();
    static boolean isOdd = true;
       @Override
       public void run() {
          while (counter<10){
            synchronized(lock){
              counter++;
              String tName = Thread.currentThread().getName();
              System.out.println(tName + " --> "+ counter);
              try {
                if(isOdd) {
                  isOdd = !isOdd; //---------> 2
                  lock.wait();    //---------> 3
                  lock.notify();  //---------> 4
                } else {
                  isOdd = !isOdd; //---------> 2
                  lock.notify();  //---------> 5
                  lock.wait();    //---------> 6
                }
              } catch(InterruptedException e) {
                  e.printStackTrace();
              }
           }//synchronized block
         }//while loop
      }//run()
    }//OddEvenNumberPrinterThread class ends



class Hotels3{
    
    public static void main(String args[]){  
    Hotel2 m1=new Hotel2();  
    Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
    t1.start();  

    Hotel t2=new Hotel();  
    t2.start();  

    //Setting Priorities for the threads
    t1.setPriority(5);
    t2.setPriority(2);
    System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority()); 
    // Main thread priority is set to 10
    Thread.currentThread().setPriority(10);
    System.out.println("Main thread priority : "+ Thread.currentThread().getPriority()); 

    Thread t3 = new Thread(new OddEvenNumberPrinterThread());
    Thread t4 = new Thread(new OddEvenNumberPrinterThread());
    t3.start(); //------> 1
    t4.start(); //------> 1
    }
}