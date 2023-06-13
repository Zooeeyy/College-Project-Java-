package polimorfisme;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class sub_class extends super_class {
    int num = 10;
    
    //display method of sub class
    public void display(){
        System.out.println("This is the display method of subclass");
    }
    public void my_method(){
        //instantiating subclass
        sub_class sub = new sub_class();
        
        //invoking the display()method of sub class
        sub.display();
        
        //invoking the display()method of superclass
        super.display();
        
        //printing the value of variabel num of subclass
        System.out.println("Value of the variable named num in sub class:"+sub.num);
        
        //printing the value of variabel num of superclass
        System.out.println("Value of the variable named num in super class:"+super.num);
    }
    public static void main (String []args){
        sub_class obj = new sub_class();
        obj.my_method();
    }
}

