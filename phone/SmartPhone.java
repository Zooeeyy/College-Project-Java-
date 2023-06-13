package phone;

/**
 *
 * @author zuyyinahawani
 */
public class SmartPhone extends phone{
    public String ipAddress;
    public void call(String callNumber){
        System.out.println("Smartphone melakukan panggilan ke: " + callNumber);
    }
    public void endCall(){
        System.out.println("Smartphone mengakhiri panggilan");
    }
    public void connectToNetwork(){
        System.out.println("Smartphone melakukan koneksi ke jaringan");
    }
    public void doCharge(){
        System.out.println("Smartphone sedang mengecas.");
    }
}


