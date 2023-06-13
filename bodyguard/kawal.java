package bodyguard;

public class kawal extends security{
    
    String nama = "Bapak Suga";
    String tujuan = "Bank Indonesia";
    String perlu = "Menyetorkan dana perusahaan";
    public kawal(String sapaan, String perlakuan) {
        super(sapaan, perlakuan);
    }
    
    void satpam(){
        super.satpam();
        System.out.println("//Mengecek keperluan untuk mengawal//");
        System.out.println("Nama\t\t:\t"+nama);
        System.out.println("Tujuan\t\t:\t"+tujuan);
        System.out.println("Keperluan\t:\t"+perlu);
        System.out.println("Pengawalan siap dilakukan sekarang");
        System.out.println("\n=================================================================");
    }
}

