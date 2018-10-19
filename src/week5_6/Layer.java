package week5_6;

import java.util.ArrayList;

public class Layer {
    public ArrayList<Shape> shapes = new ArrayList<>();
    public void delTriangle(){
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i) instanceof Triangle){
                shapes.remove(i);
                i--;
            }
        }
    }
    public void delCir(){
        for(int i=0;i<shapes.size();i++){
            if(shapes.get(i) instanceof Circle){
                shapes.remove(i);
                i--;
            }
        }
    }
}
