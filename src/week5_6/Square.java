package week5_6;

public class Square extends Rectangle{
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public Square(double side,double x,double y){
        super(side,side,x,y);
    }
    // TODO:
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setPoint(double x,double y){
        super.setPoint(x,y);
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
        return "Hình vuông: độ dài cạnh: "+this.getSide()+" ,có màu: "+this.getColor()+" ,có diện tích: "+this.getArea()+" ,có chu vi: "+this.getPerimeter();
    }
    public String position(){
        return super.position();
    }
}
