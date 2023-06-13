package bodyguard;

public class security {
    
    String nama, hal;
    
    public security (String sapaan, String perlakuan){
        nama = sapaan;
        hal = perlakuan;
    }
    
    void satpam(){
        System.out.println("Selamat siang "+ nama+ ", saya joko selaku penjaga keamanan disini");
        System.out.println("Saya juga bertugas untuk "+ hal+ " anda");
        System.out.println("--------------------------------------------------------");
    }
    
    public static void main(String[] args) {
        cekId cek = new cekId("Tuan","memeriksa identitas");
        antar antr = new antar("Nyonya", "memarkirkan kendaraan");
        kawal kwl = new kawal ("Tuan", "mengawal");
        
        cek.satpam();
        antr.satpam();
        kwl.satpam();
    }   
}

