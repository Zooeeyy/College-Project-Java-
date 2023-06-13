package mobil;

public class owner extends mobil{
    
    private String car = "Hatchback, tidak memiliki bagasi";
    private String servis = "Mobil tidak mau menyala";
    private String jarak = "15.000 mil";
    

    @Override
    void display() {
        System.out.println("// Owner //");
    }
    void carDesc(){
        System.out.println("Deskripsi mobil\t\t\t:\t"+car);
    }
    void serivce(){
        System.out.println("Riwayat servis terakhir\t\t:\t"+servis);
    }
    void petrolMil(){
        System.out.println("Riwayat odometer\t\t:\t"+jarak);
        System.out.println("========================================================================\n");
    }   
}

