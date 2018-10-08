package week4.task1;

public class CamThanhPhong extends Cam {
    private float cost;
    CamThanhPhong(){this.setType("Cam");};
    CamThanhPhong(String name,float cost ) {
        new Cam(name,"Tươi");
        this.cost=cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public float getCost(){
        return cost;
    }
    public String toString(){
        return this.getName()+" "+super.getTaste()+" co gia tien la: "+cost+" 1kg";
    }
}
