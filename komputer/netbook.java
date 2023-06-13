package komputer;

public class netbook extends komputer {

    private final String jenis = "Netbook";
    private final String uk = "7 inch";
    private final String uk2 = "10 inch";
    private final double berat = 1;
    private final int ram = 2;
    private final String cd = "Desaign khusus hanya untuk mengakses internet dan penggunaan office";
    private final String bt = "5 jam";
    
    @Override
    String jenis() {
        System.out.println("\n==========================================================");
        System.out.println("Jenis perangkat komputer\t: "+jenis);
        return null;   
    }

    @Override
    String lihat_spec() {
        System.out.println("\t//Spesifikasi yang dimiliki Netbook//");
        System.out.println("Ukuran layar\t\t\t: "+uk+" sampai "+uk2);
        System.out.println("Berat perangkat\t\t\t: "+berat+" kg");
        System.out.println("Ram minimat\t\t\t: "+ram+" GB");
        System.out.println("Kelengkapan\t\t\t: "+cd);
        System.out.println("Ketahanan batrai saat digunakan\t: "+bt);
        return null;
    }
}

