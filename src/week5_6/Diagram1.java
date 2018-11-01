package week5_6;

import java.util.ArrayList;

public class Diagram1 {
    public Diagram1(){}
    public ArrayList<Layer> layers = new ArrayList<>();
    public void delCircle(){
        for(int i=0;i<layers.size();i++){
            for(int j=0;j<layers.get(i).shapes.size();j++){
                if(layers.get(i).shapes.get(j) instanceof Circle)
                {
                    layers.get(i).shapes.remove(j);
                    j--;
                }
            }
        }
    }

    public static void main(String[] argv ){
        Diagram1 diagram = new Diagram1();
        Layer layer ;
        // khai báo layer 1
        diagram.layers.add(new Layer());
        layer = diagram.layers.get(0);
        layer.shapes.add(new Circle(18,7,99));
        layer.shapes.add(new Rectangle(5,6,"BLUE",true));
        layer.shapes.add(new Square(7,8,12));
        System.out.println("Layer 1: ");
        for (int i=0;i<layer.shapes.size();i++){
            System.out.println(layer.shapes.get(i).toString());
        }
        //khai báo layer 2
        diagram.layers.add(new Layer());
        layer = diagram.layers.get(1);
        layer.shapes.add(new Circle(18,"GREEN",true));
        layer.shapes.add(new Circle(34,"GREEN",true));
        layer.shapes.add(new Rectangle(5,6,26,54));
        layer.shapes.add(new Triangle(3,4,5,"BLACK",true));
        System.out.println("Layer 2: ");
        for (int i=0;i<layer.shapes.size();i++){
            System.out.println(layer.shapes.get(i).toString());
        }
        //Xóa
        System.out.println("Xoa hinh tron:");
        diagram.delCircle();
        System.out.println("Layer 1: ");
        layer = diagram.layers.get(0);
        for (int i=0;i<layer.shapes.size();i++){
            System.out.println(layer.shapes.get(i).toString());
        }
        layer = diagram.layers.get(1);
        System.out.println("Layer 2: ");
        for (int i=0;i<layer.shapes.size();i++){
            System.out.println(layer.shapes.get(i).toString());
        }
        System.out.println("Xoa hinh tam giac:");
        layer.delTriangle();
        System.out.println("Layer 1: ");
        layer = diagram.layers.get(0);
        for (int i=0;i<layer.shapes.size();i++){
            System.out.println(layer.shapes.get(i).toString());
        }
        layer = diagram.layers.get(1);
        System.out.println("Layer 2: ");
        for (int i=0;i<layer.shapes.size();i++){
            System.out.println(layer.shapes.get(i).toString());
        }
    }
}
