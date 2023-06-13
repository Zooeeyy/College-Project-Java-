package persegi;

public class keliling extends persegi{

    public keliling(String nama) {
        super(nama);
    }

    void display(int a, int b){
        super.display();
        System.out.println("Panjang persegi\t:\t"+a);
        System.out.println("Lebar persegi\t:\t"+b);
        int C;
        C = (2*(a+b));
        System.out.println("Hasilnya = "+C);
        System.out.println("===============================");
    }
    
}
