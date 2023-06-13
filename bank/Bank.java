package bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Bank {
    public static void main(String[] args) {
       bankBeraksi coba = new bankBeraksi("Selamat Datang di Bank ABC");
       coba.setSaldo1(100000);
       coba.setsimpan(500000);
       coba.setsaldo2(150000);
       
       coba.saldo("Rp 100.000");
        System.out.println("Simpan Uang Anda Sebesar : Rp. "+coba.getsimpan());
       coba.hasil1();
        System.out.println("Ambil Uang Anda Sebesar : Rp. "+coba.getsaldo2());
       coba.hasil2();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
}
