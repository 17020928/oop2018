/**
 * TODO: khai báo lớp Hoa quả là lớp cha có thuộc tính type( loại quả);
 */
package week4.task1;

public class HoaQua {
    private String type;
    //Constructor
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
    //TODO:kiểm tra cả 2 cùng 1 loại quả
    public String sameType(String type1,String type2){
        if(type1.equals(type2)) return"và 2 thứ cùng một họ "+ type;
        else return"2 thứ khác họ";
    }
}
