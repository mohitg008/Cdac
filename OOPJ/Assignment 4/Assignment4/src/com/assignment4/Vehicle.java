package com.assignment4;

import java.util.*;

public class Vehicle {
	String Name;
	int Wheels;
	int Doors;
	int SeatCapacity;
	static Scanner sc = new Scanner(System.in);

  
	    void Vtypes(String n ,int w,int d) {
		System.out.print("Enter the Vehicle Name:");
		this.Name = sc.next();
		
		System.out.print("Enter the number of Wheels:");
		this.Wheels = sc.nextInt();
		
		System.out.print("Enter the number of Doors");
		this.Doors = sc.nextInt();
        
		
	}
	
	
	    void Vtypes(String n,int w,int d,int seat) {
		System.out.print("Enter the Vehicle Name:");
		this.Name = sc.next();
		
		System.out.print("Enter the number of Wheels:");
		this.Wheels = sc.nextInt();
		
		System.out.print("Enter the number of Doors:");
		this.Doors = sc.nextInt();
		
		System.out.print("Enter the Seat Capacity:");
		this.SeatCapacity = sc.nextInt();
		
		
	}
	
	     void Vtypes(String n,int wheel) {
		System.out.print("Enter the Vehicle Name:");
		this.Name = sc.next();
		
		System.out.print("Enter the number of Wheels:");
		this.Wheels = sc.nextInt();
		
		
	}
	
	void printv1(){

		System.out.println("Name: "+this.Name);
		System.out.println("Wheels: "+this.Wheels);
		System.out.println("Doors: "+this.Doors);
		System.out.println("Seat Capacity: "+this.SeatCapacity);
		}




		void printv2(){

		System.out.println("Name: "+this.Name);
		System.out.println("Wheels: "+this.Wheels);
		System.out.println("Doors: "+this.Doors);
		System.out.println("Seat Capacity: "+this.SeatCapacity);
		}


		void printv3(){

		System.out.println("Name: "+this.Name);
		System.out.println("Wheels: "+this.Wheels);

		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Vehicle();
            obj.Vtypes("car",4,4);
            obj.printv1();
            obj.Vtypes("bus",6,3,50);
            obj.printv2();
            obj.Vtypes("cycle",1);
            obj.printv3();
            
	}

}
