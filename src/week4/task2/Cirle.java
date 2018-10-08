package week4.task2;

public class Cirle extends Shape {
    private double radius = 1.0;
    public Cirle(){};
    public Cirle(double radius){
        this.radius=radius;
    }
    public Cirle(double radius,String color,boolean filled){
        this.radius=radius;
        this.setColor(color);
        this.setFilled(filled);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return PI*2*radius;
    }
    public String toString(){
        return radius+" "+getArea()+" "+getPerimeter();
    }
}
