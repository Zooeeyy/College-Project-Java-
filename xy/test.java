package xy;

public class test {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        y.m2();
        x.m1();
        y.m1();
        x = y; //parent pointing to object of child
        x.m1();
        System.out.println(y.setA(10));
    }  
}

