package week5_6;


abstract class Shape {
    private String color;
    private boolean fill;
    public Shape(){
        color="YELLOW";
        fill=true;
    }
    public Shape(String color,boolean fill){
        this.color=color;
        this.fill=fill;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setFill(boolean fill){
        this.fill=fill;
    }
    abstract public String toString();
    abstract public String position();
}
