package hitungLuas;

import java.util.Scanner;

public class hitungLuas{

    static void salam() {
        System.out.println("Program Hitung Luas Plus:");
        System.out.println("==========================");
        System.out.println("1. Hitung Luas Segitiga");
        System.out.println("2. Hitung Luas Lingkaran");
        System.out.println("3. Hitung Luas Persegi Panjang");
        System.out.println("4. faktorial");
        System.out.println("");
        System.out.println("===========================");
        System.out.print("Masukkan Pilihan: ");

    }

    static double luasSegitiga(int alas, int tinggi) {
        double luas;
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    static double luasLingkaran(int jari) {
        double luasL;
        luasL = 3.14 * jari * jari;
        return luasL;
    }

    static int luasPersegi(int panjang, int lebar) {
        int luasP;
        luasP = panjang * lebar;
        return luasP;
    }

    static int faktorial(int angka) {
        int hasil = 1;
        
        for (int a = 1; a <= angka; a++) {
        hasil = hasil*a;
        if(a<angka){
            System.out.print(a+" x ");
        }else{
            System.out.print(angka +" = ");
        }

        }
        System.out.println(hasil);
 
        return hasil;
    }

    public static void main(String[] args) {

        hitungLuas nama = new hitungLuas ();

        nama.salam();

        Scanner hitung = new Scanner(System.in);
        int user;
        user = hitung.nextInt();
        System.out.println("===========================");

        if (user == 1) {
            System.out.print("Masukkan alas: ");
            int alas = hitung.nextInt();
            System.out.print("Masukkan tinggi ");
            int tinggi = hitung.nextInt();
            System.out.println("===========================");
            System.out.println("Luas Segitiga anda = " + nama.luasSegitiga(alas,tinggi));
            
        } else if (user == 2) {
            System.out.print("Masukkan panjang jari-jari: ");
            int jari = hitung.nextInt();
            System.out.println("===========================");
            System.out.println("Luas Lingkaran anda = " + nama.luasLingkaran(jari));
            
        } else if (user == 3) {
            System.out.print("Masukkan panjang: ");
            int panjang = hitung.nextInt();
            System.out.print("Masukkan lebar: ");
            int lebar = hitung.nextInt();
            System.out.println("===========================");
            System.out.println("Luas Persegi anda = "+nama.luasPersegi(panjang, lebar));
        } else if (user == 4) {
            System.out.print("Masukan angka: ");
            int angka = hitung.nextInt();
            System.out.println("===========================");
            System.out.println("Hasil Faktorial = "+nama.faktorial(angka));
        }else{
            System.out.println("Maaf Tidak ada di menu");
        }

    }
}

