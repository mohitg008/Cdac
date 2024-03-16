package com.assignment4;
// 3)Create a class Employee with multiple overloaded methods that have different parameter types (e.g., int, double, String). Demonstrate calling each overloaded method with appropriate arguments.
import java.util.*;
public class Employee {
	
    String Name;
    int EmpNo;
    double salary;
  Scanner sc =new Scanner(System.in);
  void scanemp(String n,int n1,double s){
    System.out.print("Enter Name of Employee:");
     this.Name=sc.next();
    System.out.print("Enter Employee number:");
      this.EmpNo=sc.nextInt();
    System.out.print("Enter Salary:");
      this.salary=sc.nextDouble();
}
      void scanemp(double s,String n,int n2){
    System.out.print("Enter Name of Employee:");
     this.Name=sc.next();
    System.out.print("Enter Employee number:");
      this.EmpNo=sc.nextInt();
    System.out.print("Enter Salary:");
      this.salary=sc.nextDouble();
}     
      
void scanemp(int n,double s,String N){
    System.out.print("Enter Name of Employee:");
     this.Name=sc.next();
    System.out.print("Enter Employee number:");
      this.EmpNo=sc.nextInt();
    System.out.print("Enter Salary:");
      this.salary=sc.nextDouble();
}
 
    void PrtEmp(){
System.out.println("Name:"+this.Name);
System.out.println("Employee Number:"+this.EmpNo);
System.out.println("Salary:"+this.salary);

       }

    
  
    
public static void main(String[] args) {
	// TODO Auto-generated method stub
      Employee obj = new Employee();
        
      obj.scanemp("mohit",45,90000.00);
      obj.PrtEmp();
      obj.scanemp(50000.00,"mohit",45);
      obj.PrtEmp();
      obj.scanemp(45,50000.00,"mohit");
      obj.PrtEmp();

	

}

}