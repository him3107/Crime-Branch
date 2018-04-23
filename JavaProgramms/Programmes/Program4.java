package com.classesobjects;
/* 4. Program for explaining application of classes and objects. */
class EmployeeBluePrint{
  String name;
  int age;
  String designation;
  double salary;
  
  //Constructor of class Employee 
  EmployeeBluePrint(String name){
    this.name = name;
  }
  
  //assigning age of Employee
  public void empAge(int age){
    this.age = age;
  }
  
  //assigning designation
  public void empDesignation(String desig){
    this.designation = desig;
  }
  
  public void empSalary(double sal){
    this.salary = sal;
  }
  
  public void printEmployee(){
    System.out.println("Name : "+this.name);
    System.out.println("Age : "+this.age);
    System.out.println("Designation : "+this.designation);
    System.out.println("Salary : "+this.salary);
  }
}
public class Employee {

  public static void main(String[] args) {
    EmployeeBluePrint emp1 = new EmployeeBluePrint("Himanshu Rawat");
    EmployeeBluePrint emp2 = new EmployeeBluePrint("Kishore Dutt");
    
    emp1.empAge(20);
    emp2.empAge(21);
    
    emp1.empDesignation("HOD of Maths Department");
    emp2.empDesignation("HOD of Computer Department");
    
    emp1.empSalary(100000);
    emp2.empSalary(120000);
    
    System.out.println("Employee 1 :\n");
    emp1.printEmployee();
    
    System.out.println("");
    
    System.out.println("Employee 2:\n");
    emp2.printEmployee();
  }
}
