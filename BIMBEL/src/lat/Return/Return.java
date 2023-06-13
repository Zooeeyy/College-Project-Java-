package lat.Return;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
public class Return {
   //function yg mengembalikan nilai
   int kuadrat (int a, int b){
       int hasil ;
       hasil = a+b;
       return hasil;
   }
   int kuadrat (int c, int d, int e){
       int hasil ;
       hasil = c-d-e;
       return hasil;
   }
    public static void main(String[] args) {
        
        Return angka = new Return();
        System.out.println(angka.kuadrat(3,5));
        System.out.println(angka.kuadrat(10, 2, 3));
        
    }
      
}
