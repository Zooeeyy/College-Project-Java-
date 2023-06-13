package dog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class dog {
    String breed;
    String size;
    int age;
    String color;
    
    dog(String breed, String size, int age, String color){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    void eat(){
        System.out.println("Anjing berjenis "+this.breed+" adalah anjing pemakan daging cincang,");
    }
    void sleep(){
        System.out.println("anjing ini berukuran "+this.size+" dan sangat suka tidur,");
    }
    void sit(){
        System.out.println("pada umur "+this.age+" tahun anjing ini dapat duduk dengan tegap,");
    }
    void run(){
        System.out.println("selain suka tidur anjing berwarna "+this.color+" ini suka berlari dimalam hari.");
    }
}
class main{
    public static void main(String[] args) {
        System.out.println("\n< Mari mengenal lebih dalam tentang jenis-jenis anjing > :D");
        System.out.println("...................................................");
        
        System.out.println("\n\n*Jenis anjing yang pertama");
        System.out.println("");
        dog ajg = new dog("Neapolitan Mastiff", "large", 5, "black");
        dog ajg2 = new dog("Maltese", "small", 2, "white");
        dog ajg3 = new dog("Chow Chow", "medium", 3, "brown");

        ajg.eat();
        ajg.sleep();
        ajg.sit();
        ajg.run();
        System.out.println("\n*Jenis anjing yang kedua");
        System.out.println("");
        ajg2.eat();
        ajg2.sleep();
        ajg2.sit();
        ajg2.run();
        System.out.println("\n*Jenis anjing yang ketiga");
        System.out.println("");
        ajg3.eat();
        ajg3.sleep();
        ajg3.sit();
        ajg3.run();
    }
}