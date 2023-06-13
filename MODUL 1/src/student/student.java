package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class student {

    private String name;
    private String color;
    private String sex;
    int age;
    String kata;

    //method setter
    public void setName(String Name) {
        name = Name;
    }

    public void setColor(String Color) {
        color = Color;
    }

    public void setSex(String Sex) {
        sex = Sex;
    }

    public void setAge(int Age) {
        age = Age;
    }

    //method getter
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    //method
    void eating(String kata) {

        System.out.println("-----" + this.name + " can eat " + kata);
    }

    void drinking(String kata) {
        System.out.println("-----" + this.name + " can drink " + kata);
    }

    void running(String kata) {
        System.out.println("-----" + this.name + " can run " + kata);
    }

    void start() {
        System.out.println("Name\t:\t" + this.getName());
        System.out.println("Color\t:\t" + this.getColor());
        System.out.println("Sex\t:\t" + this.getSex());
        System.out.println("Age\t:\t" + this.getAge());
    }
}

class main {

    public static void main(String[] args) {
        student murid1 = new student();
        student murid2 = new student();
        student murid3 = new student();


        murid1.setName("John");
        murid1.setColor("Fair");
        murid1.setAge(12);
        murid1.setSex("Male");
        murid1.start();
        murid1.eating("more");
        murid1.drinking("more");
        murid1.running("fast");
        
        System.out.println("");
        
        murid2.setName("Sophia");
        murid2.setColor("Fair");
        murid2.setAge(10);
        murid2.setSex("Female");
        murid2.start();
        murid2.eating("less");
        murid2.drinking("less");
        murid2.running("slow");
        
        System.out.println("");
        
        murid3.setName("Lily");
        murid3.setColor("Dark");
        murid3.setAge(11);
        murid3.setSex("Female");
        murid3.start();
        murid3.eating("more");
        murid3.drinking("more");
        murid3.running("fast");
    }
}
