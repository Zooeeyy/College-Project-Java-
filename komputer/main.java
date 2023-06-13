package komputer;

public class main {
    public static void main(String[] args) {
        komputer lap = new laptop();
        komputer pece = new pc();
        komputer nb = new notebook();
        komputer net = new netbook();
 
        
        lap.jenis();
        lap.lihat_spec();
        System.out.println("");
        pece.jenis();
        pece.lihat_spec();
        System.out.println("");
        nb.jenis();
        nb.lihat_spec();
        System.out.println("");
        net.jenis();
        net.lihat_spec();
    }
}


