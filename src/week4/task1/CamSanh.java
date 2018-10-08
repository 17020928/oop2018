package week4.task1;

public class CamSanh extends Cam {
    private float cost;
    CamSanh(){};
    CamSanh(String name,float cost ) {
        this.setName(name);
        this.setType("Tươi ngon");
        this.cost=cost;
        this.setType("Cam");
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public float getCost(){
        return cost;
    }

    public String toString(){
        return this.getName()+" "+this.getTaste()+" co gia tien la: "+cost+" 1kg ";
    }
}
