package week4.task2;

public class Point {
    private double x,y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=50;
        this.y=50;
    };
    public void setX(double x){
        this.x=x;
    }
    public double getX(){
        return x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getY(){
        return y;
    }
}
