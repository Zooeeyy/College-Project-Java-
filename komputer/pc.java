package komputer;

 public class pc extends komputer {

    private final String jenis = "Personal Computer/PC";
    private final String uk = "15 inch";
    private final String uk2 = "32 inch";
    private final int berat = 15;
    private final int ram = 4;
    private final String cd = "Monitor, CPU, Speaker, Mouse";
    private final String bt = "Tidak memiliki baterai, menggunakan listrik";
    
    @Override
    String jenis() {
        System.out.println("\n==========================================================");
        System.out.println("Jenis perangkat komputer\t: "+jenis);
        return null;   
    }

    @Override
    String lihat_spec() {
        System.out.println("\t//Spesifikasi yang dimiliki PC//");
        System.out.println("Ukuran layar\t\t\t: "+uk+" sampai "+uk2);
        System.out.println("Berat minimal perangkat\t\t: "+berat+" kg");
        System.out.println("Ram minimal\t\t\t: "+ram+" GB");
        System.out.println("Kelengkapan tambahan\t\t: "+cd);
        System.out.println("Ketahanan batrai saat digunakan\t: "+bt);
        return null;
    }
}

