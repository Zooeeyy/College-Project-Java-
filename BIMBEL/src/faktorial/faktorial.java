package faktorial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
import java.util.Scanner;

public class faktorial {

    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int angka = bil.nextInt();
        int a;
        int hasil = 1;
        
        for(a = 1; a <= angka; a++){
           hasil = hasil*a;
           if(a<angka){
               System.out.print(a + " x ");
           }else{
               System.out.print(angka+ " = ");
           }
        }
        System.out.println(hasil);

    }

}
