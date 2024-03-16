package com.assignment4;
import java.util.*;
public class Student {
            String Name;
            int RollNum;
            int Age;

      
	public static void main(String[] args) {
		
		Student obj=new Student();
		obj.scanDetails();
		obj.printDetails();
	
	}
	 public void printDetails(){
			System.out.println(" Name : "+this.Name);
		    System.out.println(" Roll Number : "+this.RollNum); 
		    System.out.println(" Age:"+this.Age);   

 	   
    }
    
    public void scanDetails(){
 	   Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Name of Student : ");

 	    this.Name=sc.next();
		    System.out.print("Enter the Roll Number : "); 

		    this.RollNum=sc.nextInt();
		    
		    System.out.print("Enter the Age of student :");   

		    this.Age=sc.nextInt();
		    sc.close();
 	   
    }
         
}
