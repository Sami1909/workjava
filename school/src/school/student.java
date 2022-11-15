/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school;

/**
 *
 * @author سارة
 */
public class student extends person{
    double gpa;
    student(String name,int age,double gpa)
    {super(name,age);
    this.gpa=gpa;}
    
    public void setgpa(double gpa)
    {this.gpa=gpa;}
    
    public double getgpa()
    {return gpa;}


public String toString()
{return super.toString()+ ", the gpa is:" +gpa;}


}
