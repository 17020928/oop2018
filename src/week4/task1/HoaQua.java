package week4.task1;

public class HoaQua {
    private String type;

    HoaQua() {
    }

    HoaQua(String x) {
        taste = x;
    }
    HoaQua(String x, String y) {
        taste = x;
        type = y;
    }
    private String taste;

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
    public String sameType(String type1,String type2){
        if(type1.equals(type2)) return"và 2 thứ cùng một họ "+ type;
        else return"2 thứ khác họ";
    }
}
