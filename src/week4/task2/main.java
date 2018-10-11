package week4.task2;

public class main {
    public static void main(String[] argv){
        //Tạo các hình vuông
        Square sq1 = new Square();
        Square sq2 = new Square(5,"Đỏ",true);
        Square sq3 = new Square(5);
        sq3.setSide(10);
        System.out.println("Hình vuông 1: "+sq1);
        System.out.println("Hình vuông 2: "+sq2);
        System.out.println("Hình vuông 3: "+sq3);
        //Tạo các hình chữ nhật
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,30);
        r2.setColor("yellow");
        r2.setFilled(false);
        Rectangle r3 = new Rectangle(10,20,"red",true);
        System.out.println("Hình chữ nhật 1: "+r1);
        System.out.println("Hình chữ nhật 2: "+r2);
        System.out.println("Hình chữ nhật 3: "+r3);
        //Tạo các hình tròn
        Cirle c1 = new Cirle();
        Cirle c2 = new Cirle(17);
        Cirle c3 = new Cirle(20,"Blue",true);
        System.out.println("Hình tròn 1: "+c1);
        System.out.println("Hình tròn 2: "+c2);
        System.out.println("Hình tròn 3: "+c3);
    }
}
