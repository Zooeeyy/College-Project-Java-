package bangunDatar;

public class main {
    public static void main(String[] args) {
        
        //membuat objek dari class triangle
        shape segitiga = new triangle(7,5);
        
        //membuat objek dari class cricle
        shape lingkaran = new circle(10);
        
        System.out.println("Luas Segitiga: "+segitiga.getArea());
        System.out.println("Luas Lingkaran: "+lingkaran.getColor("biru"));
    }
}
