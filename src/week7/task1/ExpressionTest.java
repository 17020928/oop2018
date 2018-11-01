package week7.task1;

public class ExpressionTest {
    public static void main (String[] argv) throws ArithmeticException{
        Numeral muoi = new Numeral(10);
        Numeral mot = new Numeral(1);
        Numeral hai = new Numeral(2);
        Numeral ba = new Numeral(3);
        Square muoimu2 = new Square(muoi);
        Numeral tong = new Numeral(muoimu2.evaluate()-mot.evaluate()+hai.evaluate()*ba.evaluate());
        Square tongmu2 = new Square(tong);
        System.out.println("Lần 1 :"+tongmu2.evaluate());
        Sub muoimu2tru = new Sub(muoimu2,mot);
        MultiPlication hainhanba = new MultiPlication(hai,ba);
        Addition cong = new Addition(muoimu2tru,hainhanba);
        Square ketqua = new Square(cong);
        System.out.println("Lần 2: "+ketqua.evaluate());
        Division chia = new Division(muoi,hai);
        System.out.println("Lần 3: "+chia.evaluate());
        Numeral khong = new Numeral(0);
        try{
            Division test = new Division(muoi,khong);
            System.out.println(test.evaluate());
        } catch (ArithmeticException e){
            System.out.println("Loi~ chia cho 0");
        }
    }
}
