package komputer;

public class notebook extends komputer {

    private final String jenis = "Notebook";
    private final String uk = "10 inch";
    private final String uk2 = "12 inch";
    private final int berat = 1;
    private final int ram = 2;
    private final String cd = "Hanya memiliki spek ringan dan dalam bentuk buku elektronik";
    private final String bt = "1 - 3 jam";
    
    @Override
    String jenis() {
        System.out.println("\n==========================================================");
        System.out.println("Jenis perangkat komputer\t: "+jenis);
        return null;   
    }

    @Override
    String lihat_spec() {
        System.out.println("\t//Spesifikasi yang dimiliki notebook//");
        System.out.println("Ukuran layar\t\t\t: "+uk+" sampai "+uk2);
        System.out.println("Berat minimal perangkat\t\t: "+berat+" kg");
        System.out.println("Ram minimat\t\t\t: "+ram+" GB");
        System.out.println("Kelengkapan \t\t\t: "+cd);
        System.out.println("Ketahanan batrai saat digunakan\t: "+bt);
        return null;
    }
}


