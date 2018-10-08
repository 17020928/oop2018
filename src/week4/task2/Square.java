package week4.task2;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side,String color,boolean filled){
            super(side,side,color,filled);
    }
    public Square(double side){
        new Rectangle(side,side);
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return getSide()+" "+getColor()+" "+getFilled();
    }
}
