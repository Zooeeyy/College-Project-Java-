package hewan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class animal {
    String nama;
    public animal(String nama){
        this.nama = nama;
    }
    void display(){
        System.out.println("Contoh makhluk hidup\t:\t"+this.nama);
    }
    
    public static void main(String[] args) {
        herbivora hewan1 = new herbivora("Kelinci");
        karnivora hewan2 = new karnivora ("Singa dan Hyena");
        omnivora hewan3 = new omnivora("Man");
        
        System.out.println("");
        System.out.println("Makhluk hidup di klasifikasikan berdasarkan jenis makanannya");
        System.out.println("---------------------**********************------------------");
        System.out.println("");
        hewan1.display();
        System.out.println("");
        hewan2.display();
        System.out.println("");
        hewan3.display();
       
    }
}
