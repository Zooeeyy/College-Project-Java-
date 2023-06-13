package bangunDatar;

public class circle extends shape {
    
    private float radius;
    
    public circle(float radius){
        this.radius = radius;
    }
    
    @Override
    float getArea(){
        return(float) (Math.PI * radius * radius);
    }
}
