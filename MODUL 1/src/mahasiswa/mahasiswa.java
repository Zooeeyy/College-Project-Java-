/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Acer
 */
public class mahasiswa {
    private String nama;
    private int uang;
    private int beli;
    
    private int sisa;
    private int diskon;
    
    private int sisa2;
    
    private int ongkir;
    private int tbeli;
    private int sisauang;
    
    //method setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setUang(int uang){
        this.uang = uang;
    }
    public void setBeli(int beli){
        this.beli = beli;
    }
    public void setSisa(int sisa){
        this.sisa = sisa;
    }
    public void setDiskon(int diskon){
        this.diskon = diskon;
    }
    public void setSisa2(int sisa2){
        this.sisa2 = sisa2;
    }
    public void setOngkir(int ongkir){
        this.ongkir = ongkir;
    }
    public void setTBeli(int tbeli){
        this.tbeli = tbeli;
    }
    public void setSisaUang(int sisaUang){
        this.sisauang = sisaUang;
    }
    //method getter
    public String getNama(String nama){
        return nama;
    }
    public int getUang(){
        return uang;
    }
    public int getBeli(){
        return beli;
    }
    public int getSisa(){
        return sisa;
    }
    public int getDiskon(){
        return diskon;
    }
    public int getSisa2(){
        return sisa2;
    }
    public int getOngkir(){
        return ongkir;
    }
    public int getTBeli(){
        return tbeli;
    }
    public int getSisaUang(){
        return sisauang;
    }
    
    public void beli(){
        System.out.println("Uang awal yang dimiliki "+this.nama+"\t\t\t:"+this.uang);
        System.out.println(this.nama+" membeli makanan sebesar\t\t\t:"+this.beli);
        System.out.println("______________________________________________________-");
        this.sisa = this.uang - this.beli;
        System.out.println("Sisa uang sementara\t\t\t\t:"+this.sisa);
        System.out.println("");
        
        if(this.beli >= 200000){
            this.diskon = 35000;
            this.sisa2 = this.sisa+this.diskon;
            System.out.println(this.nama+" mendapat diskon 50%\t\t\t:"+this.diskon);

        }else{
            this.sisa2 = this.sisa + this.diskon;
            System.out.println(this.nama+" tidak mendapat diskon apapun");
            System.out.println("Sisa uang "+this.nama+"\t\t\t\t:"+this.sisa2);
        }
        
    }
    public void totalharga(){
        if (this.beli >= 200000){
            this.ongkir = this.ongkir - 7000;
            this.tbeli = this.beli - this.diskon + this.ongkir;
            this.sisauang = this.sisa2 - this.ongkir;
            System.out.println("Ongkir "+this.nama+" seharga\t\t\t\t:"+this.ongkir);
            System.out.println("Total yang dibeli "+this.nama+"\t\t\t:"+this.tbeli);
            System.out.println("______________________________________________________+");
            System.out.println("Sisa uang sekarang yang dimiliki "+this.nama+"\t\t:"+this.sisauang);
        }else{
            this.tbeli = this.beli;
            this.sisauang = this.uang - (this.tbeli+this.ongkir);
            System.out.println(this.nama+" terkena biaya ongkir\t\t\t:"+this.ongkir);
            System.out.println("______________________________________________________-");
            System.out.println("Sisa uang sekarang yang dimiliki "+this.nama+"\t\t:"+this.sisauang);
            
        }
        }
    }

class main{
    public static void main(String[] args) {
        mahasiswa nisa = new mahasiswa();
        mahasiswa nisa2 = new mahasiswa();
        
        System.out.println("\n < < < < Aplikasi GoMakyam > > > >");
        System.out.println("Ketika Annisa mendapatkan diskon");
        System.out.println("");
        nisa.setNama("Annisa");
        nisa.setUang(500000);
        nisa.setBeli(250000);
        nisa.setDiskon(35000);
        nisa.setOngkir(20000);
        nisa.getSisa();
        nisa.getSisa2();
        nisa.getSisaUang();
        nisa.getTBeli();
        nisa.beli();
        nisa.totalharga();
        

        System.out.println("\n*************************************************");
        System.out.println("\nKetika Annisa tidak mendapatkan diskon");
        System.out.println("");
        nisa2.setNama("Annisa");
        nisa2.setUang(500000);
        nisa2.setBeli(250000);
        nisa2.setDiskon(35000);
        nisa2.setOngkir(20000);
        nisa2.getSisa();
        nisa2.getSisa2();
        nisa2.getSisaUang();
        nisa2.getTBeli();
        nisa2.beli();
        nisa2.totalharga();       
    }
    
}
