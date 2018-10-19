/**
 * Lớp rectangle kế thừa shape
 */
package week4.task2;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){}
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.setColor(color);
        this.setFilled(filled);
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
        return "chiều dài: "+length+" chiều rộng: "+width+" có màu: "+getColor()+" có diện tích: "+getArea()+" có chu vi: "+getPerimeter();
    }
}
