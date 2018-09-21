package week2.task2;
import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        if(denominator==0){
            System.out.println("Mau bang 0 loi!!");
            this.numerator=numerator;
            return;
        }
        else {
            this.numerator = numerator / Task1.gcd(numerator,denominator);
            this.denominator = denominator / Task1.gcd(numerator,denominator);
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            System.out.println("Mau bang 0 loi!!");
            this.denominator=0;
            return;
        }
        else
            this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        if(other.getDenominator()==0||denominator==0) {
            System.out.println("Loi mau = 0 khong cong duoc");
            Fraction s = new Fraction(0,0);
            return s;
        }
        else {
            int tuso, mauso;
            tuso = numerator * other.getDenominator() + other.getNumerator() * denominator;
            mauso = denominator * other.getDenominator();
            Fraction n = new Fraction(tuso / Task1.gcd(tuso, mauso), denominator / Task1.gcd(tuso, mauso));
            return n;
        }
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int tuso, mauso;
        tuso = numerator * other.getDenominator() - other.getNumerator() * denominator;
        mauso = denominator * other.getDenominator();
        Fraction n = new Fraction(tuso / Task1.gcd(tuso,mauso), denominator / Task1.gcd(tuso,mauso));
        return n;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int tuso, mauso;
        tuso = numerator * other.getNumerator();
        mauso = denominator * other.getDenominator();
        Fraction n = new Fraction(tuso / Task1.gcd(tuso,mauso), denominator / Task1.gcd(tuso,mauso));
        return n;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int tuso, mauso;
        tuso = numerator * other.getDenominator();
        mauso = denominator * other.getNumerator();
        Fraction n = new Fraction(tuso / Task1.gcd(tuso,mauso), denominator / Task1.gcd(tuso,mauso));
        return n;
    }

    public static void main(String[] argv) {
        Fraction s = new Fraction(12,0);
        Fraction s1= new Fraction(7,0);
        System.out.println("Phan so 1 la: " + s.getNumerator() + "/" + s.getDenominator());
        System.out.println("Phan so 2 la: " + s1.getNumerator() + "/" + s1.getDenominator());
        System.out.println("Tong 2 phan so: "+ s.add(s1).getNumerator() +"/"+ s.add(s1).getDenominator());
//        System.out.println("Hieu 2 phan so: "+ s.divide(s1).getNumerator() +"/"+s.divide(s1).getDenominator());
//        System.out.println("Tich 2 phan so: "+ s.multiply(s1).getNumerator()+"/"+s.multiply(s1).getDenominator());
//        System.out.println("Thuong 2 phan so: "+ s.subtract(s1).getNumerator()+"/"+s.subtract(s1).getDenominator());
    }
}
