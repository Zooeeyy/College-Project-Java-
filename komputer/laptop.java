package komputer;

public class laptop extends komputer {

    private final String jenis = "Laptop";
    private final String uk = "13.3 inch";
    private final String uk2 = "15 inch";
    private final double berat = 1.5;
    private final int ram = 4;
    private final String cd = "Memiliki DVD room";
    private final String bt = "3 - 5 jam";
    
    @Override
    String jenis() {
        System.out.println("\n==========================================================");
        System.out.println("Jenis perangkat komputer\t: "+jenis);
        return null;   
    }

    @Override
    String lihat_spec() {
        System.out.println("\t//Spesifikasi yang dimiliki laptop//");
        System.out.println("Ukuran layar\t\t\t: "+uk+" sampai "+uk2);
        System.out.println("Berat minimal perangkat\t\t: "+berat+" kg");
        System.out.println("Ram minimal\t\t\t: "+ram+" GB");
        System.out.println("Kelengkapan tambahan\t\t: "+cd);
        System.out.println("Ketahanan batrai saat digunakan\t: "+bt);
        return null;
    }
}

