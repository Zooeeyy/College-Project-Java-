
package pemilu;

import java.util.Scanner;

public class pemilu {
    
    int apaa (int angka1, int angka2, int angka3, int angka4){
        int max = 0;
        if(angka1 > angka2 && angka1 > angka3 && angka1 > angka4){
            max = angka1;
        }else if(angka2 > angka3 && angka2 > angka4){
            max = angka2;
        }else if (angka3 > angka4){
            max = angka3;
        }else{
            max = angka4;
        }
        return max;
    }
    public static void main(String[] args) {
        
        pemilu awal = new pemilu();
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan suara kandidat pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukan suara kandidat kedua : ");
        int angka2 = input.nextInt();
        System.out.print("Masukan suara kandidat ketiga : ");
        int angka3 = input.nextInt();
        System.out.print("Masukan suara kandidat keempat : ");
        int angka4 = input.nextInt();
        System.out.println("Kandidat yang baling banyak adalah " + awal.apaa(angka1, angka2, angka3, angka4));
        
    }
}

