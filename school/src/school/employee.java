/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school;

/**
 *
 * @author سارة
 */
public class employee extends person{
    
    double salary;
    employee(String name,int age,double salary)

    {super(name,age);
    this.salary=salary;}
    
    public void setsalary(double salary)
    {this.salary=salary;}
            
            public double getsalary()
            {return salary;}
            
            public String toString()
            {return super.toString()+ ", the salary is :" +salary;}
            
            
            
            
            
            
            
            
            
            
            }
