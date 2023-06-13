package mobil;

public class registration extends mobil{
    
    private String IN = "28129986738272890";
    private String current = "Zuyyina Hawani";
    private String tax = "Rp 493.990";
    

    @Override
    void display() {
        System.out.println("// Registration //");
    }
    void vehicleIN(){
        System.out.println("Nomor identifikasi kendaraan\t:\t"+IN);
    }
    void currentOwn(){
        System.out.println("Pemilik kendaraan saat ini\t:\t"+current);
    }
    void taxDue(){
        System.out.println("Harga pajak pertahun\t\t:\t"+tax);
        System.out.println("========================================================================\n");
    }
}


