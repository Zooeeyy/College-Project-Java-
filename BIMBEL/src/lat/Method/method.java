package lat.Method;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
public class method {
  //function yg tidak mengembalikan nilai
  void pembuka(){
    System.out.println("Halloo");
  }
  
  void salam(){
      System.out.println("Assalamualaikum");
  }
    public static void main(String[] args) {
       
        method hal = new method();
        
        hal.pembuka();
        hal.salam();
    }
}
