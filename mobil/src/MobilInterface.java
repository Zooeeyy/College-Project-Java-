/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
interface MobilInterface{
    public static final int KENDARAAN_HIDUP=1;
    public static final int KENDARAAN_MATI=0;
    public static final int LAJU_STABIL_KENDARAAN=0;
    public static final int REM_KENDARAAN = 1;
    public static final int GAS_KENDARAAN = 1;
    
    public abstract void hidupkan();
    public abstract void matikan();
    public abstract void rem();
    public abstract void gas();
    public abstract void belokKanan();
    public abstract void belokKiri();
}
