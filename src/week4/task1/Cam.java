package week4.task1;

public class Cam extends HoaQua {
    Cam(){}
    Cam(String x){
        this.name=x;
    }
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
//    @Override
//    public void setTaste(String taste) {
//        super.setTaste(taste);
//    }
}
