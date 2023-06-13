package ac;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
public class AcBeraksi {
    public static void main(String[] args){

		Ac ac = new Ac();

		System.out.println("Status AC Saat Ini: Mati");
                System.out.println("");
                
                ac.hidupkan();
                ac.matikan();
                ac.dinginkan();
                ac.panaskan();
	}
}
