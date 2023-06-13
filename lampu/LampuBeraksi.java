package lampu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
public class LampuBeraksi {
    public static void main(String[] args){

		Lampu lampu = new Lampu();

		System.out.println("Status Lampu Saat Ini: Mati");
                
                lampu.hidupkan();
                lampu.matikan();
	}

    
}
