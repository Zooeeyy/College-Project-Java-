package vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class vehicle {
    String brand;
    int roda;    
    String color;
    double price;
    int gir;
    
    //Konstruktor
    vehicle(String brand, int roda, String color, double price){
        this.brand = brand;
        this.roda = roda;
        this.color = color;
        this.price = price; 
    }
    
    //Enkapsulasi
    void setGir(int ubahGir){
        gir = gir+ubahGir;
    }
    int getGir(){
        return gir;
    }
    
    //Method
    void start(){
        System.out.println("\tKendaraan dengan jenis "+this.brand+" memang banyak "
                + "digunakan pada saat ini, ");
        System.out.println("kendaraan ini memiliki jumlah roda sebanyak "+this.roda+
                " sehingga cukup nyaman untuk berkendara,");
        System.out.println("kendaraan ini berwarna "+this.color+","
                + " sehingga menjadi sangat cantik untuk dilihat.");
        System.out.println("Harga yang dibutuhkan untuk memiliki "
                + "kendaraan ini sebesar "+this.price+" juta rupiah.");
    }
    
    public static void main(String[] args) {
        vehicle car = new vehicle("mobil", 4, "merah", 250.5);
        vehicle bike = new vehicle("motor", 2, "putih garis hitam", 73.5);
        vehicle truck = new vehicle("truk", 10, "kuning", 345.5);
        
        System.out.println("\n\n< Beberapa informasi tentang kendaraan darat >");
        System.out.println("---------------^^^^^^^^^^^^^^^^^^--------------");
        
        System.out.println("\n@ kendaraan yang pertama");
        car.start();
        car.setGir(2+1);
        System.out.println("Gir yang digunakan pada kendaraan ini sebanyak "+car.getGir());
        
        System.out.println("\n@ kendaraan yang kedua");
        bike.start();
        bike.setGir(2);
        System.out.println("Gir yang digunakan pada kendaraan ini sebanyak "+bike.getGir());
        
        System.out.println("\n@ kendaraan yang ketiga");
        truck.start();
        truck.setGir(4);
        System.out.println("Gir yang digunakan pada kendaraan ini sebanyak "+truck.getGir());
    }
}