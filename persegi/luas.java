package persegi;

public class luas extends persegi {
    
    public luas(String nama) {
        super(nama);
    }
    
    void display(){
        super.display();
    }
    void display(int d, int e){
        super.display();
        System.out.println("Panjang persegi:\t"+d);
        System.out.println("Lebar persegi\t:\t"+e);
        int X;
        X = (d*e);
        System.out.println("Hasilnya = "+X);
        System.out.println("===============================");
    }
   
}


