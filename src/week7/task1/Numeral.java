package week7.task1;

public class Numeral extends Expression{
    private int value;
    public Numeral(){};
    public Numeral(int i){
        value=i;
    }
    public String toString(){
        return "";
    }
    public int evaluate(){
        return value;
    };
}
