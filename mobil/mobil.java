package mobil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zuyyinahawani
 */
public abstract class mobil implements MobilInterface {

    int statusMobil;

    @Override
    public void hidupkan() {
        if (statusMobil == KENDARAAN_MATI) {
            statusMobil = KENDARAAN_HIDUP;
            System.out.println("Hidupkan Mobil !            --->    Mobil hidup dan siap digunakan");
        } else {
            System.out.println("Hidupkan Mobil !            --->    Mobil sudah hidup daritadi!");
        }
    }

    @Override
    public void matikan() {
        if (statusMobil == KENDARAAN_HIDUP) {
            statusMobil = KENDARAAN_MATI;
            System.out.println("Matikan Mobil !             --->    Mobil dimatikan");
        } else {
            System.out.println("Matikan Mobil !          --->    Mobil sudah mati daritadi!");
        }
    }
    
    @Override
    public void rem() {
        if (statusMobil == LAJU_STABIL_KENDARAAN) {
            statusMobil = REM_KENDARAAN;
            System.out.println("Kurangi kecepatan Mobil !    --->    Rem dalam mobil siap digunakan");
        } else {
            System.out.println("Kurangi kecepatan Mobil !   --->    Rem mobil sudah digunakan daritadi!");
        }
    }
    
    @Override
    public void gas() {
        if (statusMobil == LAJU_STABIL_KENDARAAN) {
            statusMobil = GAS_KENDARAAN;
            System.out.println("Tambah kecepatan Mobil !    --->    Mobil hidup dan siap digunakan");
        } else {
            System.out.println("Tambah kecepatan Mobil !    --->    Mobil ngebut dan telah mencapai batas maximal!");
        }
    }
    
    @Override
    public void belokKanan() {
       System.out.println("Belok kanan !               --->    Mobil belok ke arah kanan");
    }
    
    @Override
    public void belokKiri() {
        System.out.println("Belok kiri !                --->    Mobil belok ke arah kiri");
    }
}