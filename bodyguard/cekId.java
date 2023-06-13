package bodyguard;

public class cekId extends security{
    
    String nama = "Rudi";
    String asal = "Semarang";
    String perlu = "Melamar pekerjaan";
    
    public cekId(String sapaan, String perlakuan) {
        super(sapaan, perlakuan);
    }
    
    void satpam(){
        super.satpam();
        System.out.println("//Satpam mengecek identitas pengunjung//");
        System.out.println("Nama\t\t:\t"+nama);
        System.out.println("Asal\t\t:\t"+asal);
        System.out.println("Keperluan\t:\t"+perlu);
        System.out.println("Pengunjung dipersilahkan masuk");
        System.out.println("\n=================================================================");
    }
}


