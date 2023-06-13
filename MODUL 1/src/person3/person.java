package person3;

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
    private String name; //restric access
    
    //getter
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    

    void display(String name){
        this.name = name;
        
        System.out.println("Nama : "+this.name);
    }
}

