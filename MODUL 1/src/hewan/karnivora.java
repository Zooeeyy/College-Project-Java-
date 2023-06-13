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
public class karnivora extends animal {
    String type = "Karnivora";
    String keterangan = "Makhluk hidup pemakan daging";

    public karnivora(String nama) {
        super(nama);
    }
    @Override
    void display(){
        super.display();
        System.out.println("Jenis\t\t\t:\t"+this.type);
        System.out.println("Keterangan\t\t:\t"+this.keterangan);
    }
    
}
