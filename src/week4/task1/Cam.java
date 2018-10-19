/**
 * khai báo lớp cam kế thừa hoa quả có thuộc tính name
 */
package week4.task1;

public class Cam extends HoaQua {
    private String name;
    // Constructor
    Cam(){
    }
    Cam(String x){
        this.name=x;
    }
    Cam(String name,String taste){
        this.setTaste(taste);
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
