package week4.task2;

import week4.task2.*;
public class main {
    public static void main(String[] argv){
        Square sq1 = new Square();
        Square sq2 = new Square(5,"Đỏ",true);
        Square sq3 = new Square(5);
        sq3.setSide(10);
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq3);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,20);
        r2.setColor("yellow");
        r2.setFilled(false);
        Rectangle r3 = new Rectangle(10,20,"red",true);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        Cirle c1 = new Cirle();
        Cirle c2 = new Cirle(17);
        Cirle c3 = new Cirle(20,"Blue",true);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
