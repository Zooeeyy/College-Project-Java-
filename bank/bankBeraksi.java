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
public class bankBeraksi {

    String kata;
    private int saldo1;
    private int simpan;
    private int saldo2;
    int hasil;
    int hasil2;

    bankBeraksi(String ucapan) {
        kata = ucapan;
    }
    void saldo(String a){
        System.out.println("" +kata);
        System.out.println("----------**********---------");
        System.out.println("Saldo anda saat ini: "+a);
    }
    public int getSaldo1(){
        return saldo1;
    }
    public int getsimpan(){
        return simpan;
    }
    public int getsaldo2(){
        return saldo2;
    }
    void setSaldo1(int newSaldo1){
        saldo1 = newSaldo1;
    }
    void setsimpan(int newsimpan){
        simpan = newsimpan;
    }
    void setsaldo2 (int newsaldo2){
        saldo2 = newsaldo2;
    }
    
    //proses perhitungan
    void hasil1 (){
        hasil = saldo1 + simpan;
        System.out.println("Saldo Anda Saat Ini : Rp. "+ hasil);
    }
    void hasil2 (){
        hasil2 = hasil - saldo2;
        System.out.println("Saldo Anda Saat Ini : Rp. "+hasil2);
    }
}
