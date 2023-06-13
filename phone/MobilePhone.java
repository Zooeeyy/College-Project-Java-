package phone;

/**
 *
 * @author zuyyinahawani
 */
public class MobilePhone extends phone {
    public void call(String callNumber){
        System.out.println("Mobile Phone melakukan panggilan ke: " + callNumber);
    }
    public void endCall(){
        System.out.println("Mobile Phone mengakhri panggilan");
    }
    public void doCharge(){
        System.out.println("Mobile Phone sedang mengecas.");
    }
}

