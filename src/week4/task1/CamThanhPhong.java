package week4.task1;

public class CamThanhPhong extends Cam {
    private float cost;
    CamThanhPhong(){};
    CamThanhPhong(String x,float y ) {
        this.setName(x);
        this.cost=y;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public float getCost(){
        return cost;
    }
    public String getInfo(){
        return this.getName()+" "+super.getTaste()+" co gia tien la: "+cost;
    }
}
