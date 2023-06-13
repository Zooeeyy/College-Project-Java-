package mobil;

public class garage extends mobil {
    
    private String kerja = "Perbaikan mesin";
    private String bill = "Rp 657.000";
    private String Owner = "Pemilik pertama";

    @Override
    void display() {
        System.out.println("// Garage //");
    }
    void WorkDes(){
        System.out.println("Deskripsi kerja\t\t\t:\t"+kerja);
    }
    void billing(){
        System.out.println("Biaya perbaikan\t\t\t:\t"+bill);
    }
    void owner(){
        System.out.println("Pemilik\t\t\t\t:\t"+Owner);
        System.out.println("========================================================================\n");
    }
}

