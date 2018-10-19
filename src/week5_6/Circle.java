package week5_6;

import week4.task2.Point;

public class Circle extends Shape {
    private final double PI = 3.14;
    private double radius;
    private Point point;
    // constructor
    public Circle(double radius,double x,double y){
        super("RED",true);
        point = new Point(x,y);
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        point = new Point();
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public String toString(){
        return "Hình tròn có: bán kính = "+radius+" tông màu "+this.getColor()+" chu vi là: "+PI*2*radius+" diện tích là: "+PI*radius*radius;
    }
    public String position(){
        return "vị trí tâm hình tròn: "+"( "+point.getX()+";"+point.getY()+" )";
    }
}
