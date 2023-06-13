package persegi;

public class persegi {

    String nama;

    public persegi(String nama) {
        this.nama = nama;
    }

    void display() {
        System.out.println("Menghitung " + nama + " persegi");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        keliling hitung = new keliling("Keliling");
        luas hitung2 = new luas("Luas");
        hitung.display(2, 3);
        hitung2.display(2, 3);
    }
}
