package person2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class person {
   protected String fname = "John";
   protected String lname = "Doe";
   protected String email = "john@doe.com";
   protected int age = 24;
}
class student extends person{
    private int graduationYear = 2018;
    public static void main(String[] args) {
        student myObj = new student();
        System.out.println("Name: "+myObj.fname+""+myObj.lname);
        System.out.println("Email: "+myObj.email);
        System.out.println("Age: "+myObj.age);
        System.out.println("Graduation Year: "+myObj.graduationYear);
    }
}
