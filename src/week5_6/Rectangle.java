package week5_6;

import week4.task2.Point;

public class Rectangle extends Shape{
    private double width;
    private double length;
    private Point point;

    public Rectangle(double width,double length,double x,double y){
        super("RED",true);
        this.length=length;
        this.width=width;
        point = new Point(x,y);
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
        point = new Point();
    }
    public void setPoint(double x,double y) {
        point.setX(x);
        point.setY(y);
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return "Hình chữ nhật có: chiều dài: "+length+" chiều rộng: "+width+" có màu: "+this.getColor()+" có diện tích: "+getArea()+" có chu vi: "+getPerimeter();
    }
    public String position(){
        return "Vị trí tâm : ( "+point.getX()+";"+point.getY()+" )";
    }
}
