package week4.task1;

public class Tao extends HoaQua {
    private String name;
    private float cost;
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

    @Override
    public void setTaste(String taste) {
        super.setTaste(taste);
    }

    public String getInfo(){
        return this.getName()+" "+super.getTaste()+" co gia tien la: "+cost;
    }
}
