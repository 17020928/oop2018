/**
 * KHai báo lớp Táo là lớp con của Hoa Quả
 */
package week4.task1;

public class Tao extends HoaQua {
    private String name;
    private float cost;
    Tao(String type,String taste){
        this.setType(type);
        this.setTaste(taste);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public float getCost(){
        return cost;
    }

    public String toString(){
        return this.getName()+" "+this.getTaste()+" co gia tien la: "+cost+" 1kg";
    }
}
