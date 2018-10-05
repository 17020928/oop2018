package week4.task1;

public class CamSanh extends Cam {
    private float cost;
    CamSanh(){};
    CamSanh(String x,float y ) {
        this.setName(x);
        this.cost=y;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public float getCost(){
        return cost;
    }

//    @Override
//    public void setTaste(String taste) {
//        super.setTaste(taste);
//    }

    public String getInfo(){
        return this.getName()+" "+super.getTaste()+" co gia tien la: "+cost;
    }
}
