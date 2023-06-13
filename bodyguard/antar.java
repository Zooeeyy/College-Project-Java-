package bodyguard;

public class antar extends security{
    
    public antar(String sapaan, String perlakuan) {
        super(sapaan, perlakuan);
    }
    
    void satpam(){
        super.satpam();
        System.out.println("//Hal yang dilakukan satpam setelah pengendara turun dari mobi//");
        System.out.println("1. Menerima kunci kendaraan dari pengendara");
        System.out.println("2. Menyalakan kendaraan dan mulai menjalankan kendaraan");
        System.out.println("3. Memarkirkan kendaraan sesuai dengan tempatnya");
        System.out.println("4. Mengembalikan kunci kendaraan kepada pengendara");
        System.out.println("\n=================================================================");
    }
    
}


