package phone;

public class oppo implements phone {

    private int volume;
    private boolean isPowerOn;

    public oppo() {
        //set volume awal
        this.volume = 50;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala....");
        System.out.println("Welcome to Oppo");
        System.out.println("Android version 10");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume Full !");
                System.out.println("sudah" + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Hp terlebih dahulu!");
        }
    }
    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Voulme sekarang = "+this.getVolume());
            }

        }else{
            System.out.println("Nyalakan Hp terlebih dahulu!");
        }
    }
    
}

