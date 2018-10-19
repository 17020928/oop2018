package week5_6;

import week4.task2.Point;

public class Triangle extends Shape{
    private double side1,side2,side3;
    private Point point;
    public Triangle(double side1,double side2,double side3,double x,double y){
        super("RED",true);
        point = new Point(x,y);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public Triangle(double side1,double side2,double side3,String color,boolean fill){
        super(color,fill);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        point = new Point();
    }
    public void setSide(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setPoint(double x,double y) {
        point.setX(x);
        point.setY(y);
    }
    public String toString(){
        return "Hình tam giác có 3 cạnh: ( "+side1+";"+side2+";"+side3+" )";
    }
    public String position(){
        return "Vị trí tâm: "+point.getX()+" "+point.getY();
    }
}
