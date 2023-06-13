package bangunDatar;

abstract class shape {
    String color;
    
    void setColor(String color){
        this.color = color;
    }
    String getColor(String color){
        return this.color;
    }
    abstract float getArea();
}
