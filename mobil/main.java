package mobil;

public class main {
    public static void main(String[] args) {
        
        registration regis = new registration();
        garage gas = new garage();
        owner oow = new owner();
        
        regis.display();
        regis.vehicleIN();
        System.out.println(regis.LicensePlate("W 2812 HN "));
        regis.currentOwn();
        regis.taxDue();
        
        gas.display();
        System.out.println(regis.LicensePlate("W 2812 HN "));
        gas.WorkDes();
        gas.billing();
        gas.owner();
        
        oow.display();
        oow.carDesc();
        oow.serivce();
        oow.petrolMil();
        
    }
}


