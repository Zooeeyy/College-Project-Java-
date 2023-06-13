package mobil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        
        mobil aksi = new mobil() {};
        
        System.out.println("===== Kontrol Pada Mobil =====");
        System.out.println("\nKondisi mobil saat ini   : Mati");
        System.out.println("");
        
        aksi.hidupkan();
        aksi.gas();
        aksi.belokKanan();
        aksi.belokKiri();
        aksi.rem();
        aksi.matikan();
        
    }
    
}
