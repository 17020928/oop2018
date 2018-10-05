package week4.task1;

public class HoaQua {
    HoaQua(){}
    HoaQua(String x){
        taste=x;
    }
    private String taste;
    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String getTaste(){
        return taste;
    }
}
