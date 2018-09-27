package week2.task2;

import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;
    // Hàm kiểm tra mẫu =0?
    public boolean kiemtramau(int a){
        if(a==0) return true;
        return false;
    }
    // Các hàm get set
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
            this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }
    // Các constructor
    public Fraction(int numerator, int denominator) {
        if(kiemtramau(denominator)) {
            this.numerator = numerator;
            System.out.println("Loi! Phan so co mau = 0");
        }
        else{
            this.numerator = numerator ;
            this.denominator = denominator ;
        }
    }
    //Ham xuat ra man hinh
    public void screen(Fraction other){
        if(other.numerator<0 && other.denominator<0) {
            other.numerator=-other.numerator;
            other.denominator=-other.denominator;
        } else
        if(other.numerator>0 && other.denominator<0) {
            other.denominator=-other.denominator;
            other.numerator=-other.numerator;
        }
        if(other.getDenominator()==0){
            System.out.println("Loi~ co mau phan so bang 0");
            System.out.println(other.getNumerator()+"/"+other.getDenominator());
        }else
        {
            System.out.println(other.getNumerator()+"/"+other.getDenominator());
        }
    }
    // Các hàm tính toán
    public Fraction add(Fraction other) {
       //  TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        if(!kiemtramau(other.getDenominator()) && !kiemtramau(denominator))
        {
            int tuso, mauso;
            tuso = numerator * other.getDenominator() + other.getNumerator() * denominator;
            mauso = denominator * other.getDenominator();
            Fraction n = new Fraction(tuso / Task1.gcd(tuso, mauso), mauso / Task1.gcd(tuso, mauso));
            return n;
        } else {
            Fraction n = new Fraction(numerator,denominator);
            if(kiemtramau(other.getDenominator())) {
                n.setNumerator(other.getNumerator());
                n.setDenominator(other.getDenominator());
            }
            if(kiemtramau(denominator)) {
                n.setNumerator(numerator);
                n.setDenominator(denominator);
            }
            return n;
        }
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        if(!kiemtramau(other.getDenominator()) && !kiemtramau(denominator)){
            int tuso, mauso;
            tuso = numerator * other.getDenominator() - other.getNumerator() * denominator;
            mauso = denominator * other.getDenominator();
            Fraction n = new Fraction(tuso / Task1.gcd(tuso,mauso), mauso / Task1.gcd(tuso,mauso));
            return n;
        } else {
            Fraction n = new Fraction(numerator,denominator);
            if(kiemtramau(other.getDenominator())) {
                n.setNumerator(other.getNumerator());
                n.setDenominator(other.getDenominator());
            }
            if(kiemtramau(denominator)) {
                n.setNumerator(numerator);
                n.setDenominator(denominator);
            }
            return n;
        }
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        if(!kiemtramau(other.getDenominator()) && !kiemtramau(denominator)){
            int tuso, mauso;
            tuso = numerator * other.getNumerator();
            mauso = denominator * other.getDenominator();
            Fraction n = new Fraction(tuso / Task1.gcd(tuso,mauso), mauso / Task1.gcd(tuso,mauso));
            return n;
        } else {
            Fraction n = new Fraction(numerator,denominator);
            if(kiemtramau(other.getDenominator())) {
                n.setNumerator(other.getNumerator());
                n.setDenominator(other.getDenominator());
            }
            if(kiemtramau(denominator)) {
                n.setNumerator(numerator);
                n.setDenominator(denominator);
            }
            return n;
        }
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        if(!kiemtramau(other.getDenominator()) && !kiemtramau(denominator) && !kiemtramau(other.getNumerator())){
            int tuso, mauso;
            tuso = numerator * other.getDenominator();
            mauso = denominator * other.getNumerator();
            Fraction n = new Fraction(tuso / Task1.gcd(tuso,mauso), mauso / Task1.gcd(tuso,mauso));
            return n;
        } else {
            Fraction n = new Fraction(numerator,denominator);
            if(kiemtramau(other.getDenominator())) {
                n.setNumerator(other.getNumerator());
                n.setDenominator(other.getDenominator());
            }
            if(kiemtramau(denominator)) {
                n.setNumerator(numerator);
                n.setDenominator(denominator);
            }
            return n;
        }
    }

    public boolean equals(Object obj){
        Fraction fraction = (Fraction) obj;
        if(this.subtract(fraction).getNumerator()==0)
            return true;
        return false;
    }
}
